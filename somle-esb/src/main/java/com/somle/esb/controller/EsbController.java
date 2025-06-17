package com.somle.esb.controller;

import cn.hutool.json.JSONUtil;
import cn.iocoder.yudao.module.erp.api.product.ErpProductApi;
import cn.iocoder.yudao.module.erp.api.product.dto.ErpProductDTO;
import cn.iocoder.yudao.module.erp.api.product.dto.ErpSyncProductDTO;
import cn.iocoder.yudao.module.srm.api.purchase.SrmPurchaseOrderApi;
import cn.iocoder.yudao.module.srm.api.purchase.dto.SrmPurchaseOrderDTO;
import cn.iocoder.yudao.module.srm.api.supplier.SrmSupplierApi;
import cn.iocoder.yudao.module.srm.api.supplier.dto.SrmSupplierDTO;
import cn.iocoder.yudao.module.srm.enums.SrmChannelEnum;
import cn.iocoder.yudao.module.srm.enums.status.SrmAuditStatus;
import com.somle.esb.converter.ErpToKingdeeConverter;
import com.somle.esb.service.EsbService;
import com.somle.kingdee.model.KingdeePurOrderSaveReqVO;
import com.somle.kingdee.service.KingdeeService;
import jakarta.annotation.Resource;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;


@Slf4j
@RestController
@RequestMapping("/api/esb")
@RequiredArgsConstructor
public class EsbController {
    @Resource(name = SrmChannelEnum.SUPPLIER)
    MessageChannel tmsSupplierChannel;
    @Resource(name = SrmChannelEnum.PURCHASE_ORDER)
    MessageChannel purchaseOrderChannel;
    @Resource
    MessageChannel erpProductChannel;
    private final SrmSupplierApi srmSupplierApi;
    private final SrmPurchaseOrderApi srmPurchaseOrderApi;
    private final ErpProductApi erpProductApi;
    private final EsbService service;
    private final ErpToKingdeeConverter erpToKingdeeConverter;
    private final KingdeeService kingdeeService;

    @PostMapping("/getBeans")
    public void printAllBeans() {
        service.printAllBeans();
    }


//    @PostMapping("/dataCollect")
//    public String dataCollect(LocalDate scheduleDate, String database) {
//        if (database == null) {
//            service.dataCollect(scheduleDate);
//        } else {
//            service.dataCollect(scheduleDate, Domain.fromString(database));
//        }
//        return "success";
//    }


    @PostMapping("/syncUsers")
    public String syncUsers() {
        /*ErpProductDTO a = new ErpProductDTO();
        a.setProductDeptId(50007L);
        service.handleProductsToKingdee(MessageBuilder.withPayload(List.of(a)).build());*/
        return "success";
    }

    /**
     * 同步所有供应商->金蝶
     */
    @PostMapping("/syncSuppliers")
    public String syncSuppliers() {
        List<Long> list = srmSupplierApi.getSupplierList().stream().map(SrmSupplierDTO::getId).distinct().toList();
        tmsSupplierChannel.send(MessageBuilder.withPayload(list).build());
        return "success";
    }

    /**
     * 根据订单ID同步采购订单到金蝶
     */
    @PostMapping("/syncPurchaseOrder")
    public String syncPurchaseOrder(@RequestParam("orderId") Long orderId) {
        // 校验订单是否存在
        List<Long> set = List.of(orderId);
        syncToKingdee(
            set,
            ids -> srmPurchaseOrderApi.validatePurchaseOrderIds(new HashSet<>(ids)),
            erpToKingdeeConverter::convertOrderDTOList,
            kingdeeService::savePurchaseOrder,
            "采购订单保存",
            KingdeePurOrderSaveReqVO::getBillNo
        );
        return "success";
    }

    private <T, R> void syncToKingdee(
        List<Long> ids,
        Function<List<Long>, List<T>> validator,
        Function<List<T>, List<R>> converter,
        Consumer<R> syncer,
        String logType,
        Function<R, Object> numberGetter
    ) {
        List<T> dtos = validator.apply(ids);
        if (dtos.isEmpty()) {
            log.warn("[{}] 未找到需要同步的信息,入参:{}", logType, JSONUtil.parse(ids));
            return;
        }
        List<R> kingdeeObjs = converter.apply(dtos);
        int total = kingdeeObjs.size();
        int successCount = 0;
        int failCount = 0;
        // 收集失败的标识符
        Set<Object> failedIdentifiers = new HashSet<>();

        for (int i = 0; i < total; i++) {
            R obj = kingdeeObjs.get(i);
            try {
                syncer.accept(obj);
                successCount++;
                log.info("[{}] 同步进度：{}/{}，唯一标识(ID)：{} - 成功", logType, i + 1, total, numberGetter.apply(obj));
            } catch (Exception e) {
                failCount++;
                Object identifier = numberGetter.apply(obj);
                failedIdentifiers.add(identifier);
                log.error("[{}] 同步失败：{}/{}，唯一标识(ID)：{}，错误信息：{}", logType, i + 1, total, identifier, e.getMessage(), e);
            }
        }
        log.info("[{}] 同步完成，共处理：{}个，成功：{}个，失败：{}个", logType, total, successCount, failCount);
        if (failCount > 0) {
            log.warn("[{}] 存在{}个同步失败的数据，失败的唯一标识符：{}", logType, failCount, JSONUtil.parse(failedIdentifiers));
        }
    }


    /**
     * 同步采购订单 -> 金蝶
     * <p>
     * 已审核就覆盖+审核
     * @param orderCodes 采购订单code集合，可选参数，如果不传则全量同步
     */
    @PostMapping("/syncAllPurchaseOrder")
    public String syncAllPurchaseOrder(@RequestParam(value = "orderCodes", required = false) List<String> orderCodes) {
        List<Long> orderIds;
        List<SrmPurchaseOrderDTO> purchaseOrderDTOS;

        if (orderCodes != null && !orderCodes.isEmpty()) {
            // 根据code集合获取订单ID
            orderIds = srmPurchaseOrderApi.listPurchaseOrderIdsByCodes(orderCodes);
            if (orderIds.isEmpty()) {
                log.warn("[采购订单] 未找到指定code的采购订单，入参:{}", JSONUtil.parse(orderCodes));
                return "success";
            }
            purchaseOrderDTOS = srmPurchaseOrderApi.validatePurchaseOrderIds(new HashSet<>(orderIds));
        } else {
            // 全量同步
            orderIds = srmPurchaseOrderApi.listPurchaseOrderIds();
            purchaseOrderDTOS = srmPurchaseOrderApi.validatePurchaseOrderIds(new HashSet<>(orderIds));
        }

        //采购单编号map
        Map<String, SrmPurchaseOrderDTO> purchaseOrderMap = purchaseOrderDTOS.stream().collect(Collectors.toMap(SrmPurchaseOrderDTO::getCode, v -> v));
        syncToKingdee(
            orderIds,
            ids -> srmPurchaseOrderApi.validatePurchaseOrderIds(new HashSet<>(ids)),
            erpToKingdeeConverter::convertOrderDTOList,
            kingdeePurOrderSaveReqVO -> {
                if (purchaseOrderMap.containsKey(kingdeePurOrderSaveReqVO.getBillNo())) {
                    SrmPurchaseOrderDTO purchaseOrder = purchaseOrderMap.get(kingdeePurOrderSaveReqVO.getBillNo());
                    // 判断是否已审核
                    if (Objects.equals(purchaseOrder.getAuditStatus(), SrmAuditStatus.APPROVED.getCode())) {
                        kingdeeService.saveAndAuditPurchaseOrder(kingdeePurOrderSaveReqVO);
                    }
                }
            },
            "采购订单保存&审核",
            KingdeePurOrderSaveReqVO::getBillNo
        );
        return "success";
    }

    /**
     * 同步所有erp产品
     */
    @PostMapping("/syncErpProducts")
    public String syncErpProducts() {
        // 获取所有启用的产品
        List<ErpProductDTO> products = erpProductApi.listProductDTOs(null);
        Set<Long> set = products.stream().map(ErpProductDTO::getId).collect(Collectors.toSet());
        ErpSyncProductDTO syncProductDTO = new ErpSyncProductDTO(set, null);
        // 发送消息
        erpProductChannel.send(MessageBuilder.withPayload(syncProductDTO).build());
        return "success";
    }

}