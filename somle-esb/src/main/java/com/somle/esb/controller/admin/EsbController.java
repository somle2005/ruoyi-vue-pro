package com.somle.esb.controller.admin;

import cn.hutool.json.JSONUtil;
import cn.iocoder.yudao.framework.common.pojo.CommonResult;
import cn.iocoder.yudao.module.erp.api.product.ErpProductApi;
import cn.iocoder.yudao.module.erp.api.product.dto.ErpProductDTO;
import cn.iocoder.yudao.module.srm.api.purchase.SrmPurchaseOrderApi;
import cn.iocoder.yudao.module.srm.api.purchase.dto.SrmPurchaseOrderDTO;
import cn.iocoder.yudao.module.srm.api.supplier.SrmSupplierApi;
import cn.iocoder.yudao.module.srm.api.supplier.dto.SrmSupplierDTO;
import cn.iocoder.yudao.module.srm.enums.SrmChannelEnum;
import com.somle.esb.converter.ErpToKingdeeConverter;
import com.somle.esb.service.EsbService;
import com.somle.esb.util.SyncUtils;
import com.somle.kingdee.model.KingdeePurOrderSaveReqVO;
import com.somle.kingdee.model.KingdeeResponse;
import com.somle.kingdee.service.KingdeeService;
import jakarta.annotation.Resource;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * ESB 控制器
 * 提供数据同步相关的接口
 */
@Slf4j
@RestController
@RequestMapping("/api/esb")
@RequiredArgsConstructor
public class EsbController {

    @Resource(name = SrmChannelEnum.SUPPLIER)
    private MessageChannel tmsSupplierChannel;

    @Resource
    private MessageChannel erpProductChannel;

    private final SrmSupplierApi srmSupplierApi;
    private final SrmPurchaseOrderApi srmPurchaseOrderApi;
    private final ErpProductApi erpProductApi;
    private final EsbService service;
    private final ErpToKingdeeConverter erpToKingdeeConverter;
    private final KingdeeService kingdeeService;

    /**
     * 打印所有 Spring Bean
     * 用于系统调试
     */
    @PostMapping("/getBeans")
    public void printAllBeans() {
        service.printAllBeans();
    }

    // ========== 数据同步接口 ==========

    /**
     * 同步用户数据
     */
    @PostMapping("/syncUsers")
    public String syncUsers() {
        return "success";
    }

    /**
     * 同步供应商数据到金蝶系统
     * 支持全量同步或指定供应商名称同步
     *
     * @param supplierNames 供应商名称列表，可选参数，不传则全量同步
     * @return 同步结果
     */
    @PostMapping("/syncSuppliers")
    public String syncSuppliers(@RequestParam(value = "supplierNames", required = false) List<String> supplierNames) {
        List<Long> supplierIds;
        
        if (supplierNames != null && !supplierNames.isEmpty()) {
            // 根据供应商名称获取供应商ID
            List<SrmSupplierDTO> suppliers = srmSupplierApi.getSupplierList();
            supplierIds = suppliers.stream()
                .filter(supplier -> supplierNames.contains(supplier.getName()))
                .map(SrmSupplierDTO::getId)
                .distinct()
                .toList();

            if (supplierIds.isEmpty()) {
                log.warn("[供应商] 未找到指定名称的供应商，入参:{}", JSONUtil.parse(supplierNames));
                return "未找到指定名称的供应商";
            }
        } else {
            // 全量同步
            supplierIds = srmSupplierApi.getSupplierList()
                .stream()
                .map(SrmSupplierDTO::getId)
                .distinct()
                .toList();
        }
        
        tmsSupplierChannel.send(MessageBuilder.withPayload(supplierIds).build());
        return "success";
    }

    /**
     * 根据订单ID删除金蝶采购订单
     *
     * @param orderId 采购订单ID
     * @return 删除结果
     */
    @PostMapping("/unAuditPurchaseOrder")
    public CommonResult<Object> unAuditPurchaseOrder(@RequestParam("orderId") Long orderId) {
        List<Long> orderIds = List.of(orderId);
        List<List<KingdeeResponse>> results = SyncUtils.syncToKingdeeWithResult(
            orderIds,
            ids -> srmPurchaseOrderApi.validatePurchaseOrderIds(new HashSet<>(ids)),
            dtos -> dtos.stream().map(SrmPurchaseOrderDTO::getCode).collect(Collectors.toList()),
            kingdeeService::unAuditPurchaseOrder,
            "采购订单反审核删除",
            String::toString
        );
        return CommonResult.success(results);
    }

    /**
     * 同步采购订单到金蝶系统
     * 支持全量同步或指定订单编码同步
     *
     * @param orderCodes 采购订单编码列表，可选参数，不传则全量同步
     * @return 同步结果
     */
    @PostMapping("/syncAllPurchaseOrder")
    public CommonResult<Object> syncAllPurchaseOrder(@RequestParam(value = "orderCodes", required = false) List<String> orderCodes) {
        List<Long> orderIds;
        List<SrmPurchaseOrderDTO> purchaseOrderDTOS;

        if (orderCodes != null && !orderCodes.isEmpty()) {
            // 根据编码获取订单ID
            orderIds = srmPurchaseOrderApi.listPurchaseOrderIdsByCodes(orderCodes);
            if (orderIds.isEmpty()) {
                log.warn("[采购订单] 未找到指定code的采购订单，入参:{}", JSONUtil.parse(orderCodes));
                return CommonResult.success("未找到指定code的采购订单");
            }
            purchaseOrderDTOS = srmPurchaseOrderApi.validatePurchaseOrderIds(new HashSet<>(orderIds));
        } else {
            // 全量同步
            orderIds = srmPurchaseOrderApi.listPurchaseOrderIds();
            purchaseOrderDTOS = srmPurchaseOrderApi.validatePurchaseOrderIds(new HashSet<>(orderIds));
        }

        // 构建采购单编号映射
        Map<String, SrmPurchaseOrderDTO> purchaseOrderMap = purchaseOrderDTOS.stream()
            .collect(Collectors.toMap(SrmPurchaseOrderDTO::getCode, v -> v));

        List<List<KingdeeResponse>> results = SyncUtils.syncToKingdeeWithResult(
            orderIds,
            ids -> srmPurchaseOrderApi.validatePurchaseOrderIds(new HashSet<>(ids)),
            erpToKingdeeConverter::convertOrderDTOList,
            kingdeePurOrderSaveReqVO -> {
                if (purchaseOrderMap.containsKey(kingdeePurOrderSaveReqVO.getBillNo())) {
                    SrmPurchaseOrderDTO purchaseOrder = purchaseOrderMap.get(kingdeePurOrderSaveReqVO.getBillNo());
                    // 判断是否已审核
                    if (Objects.equals(purchaseOrder.getAuditStatus(), cn.iocoder.yudao.module.srm.enums.status.SrmAuditStatus.APPROVED.getCode())) {
                        return kingdeeService.saveAndAuditPurchaseOrder(kingdeePurOrderSaveReqVO);
                    } else {
                        return kingdeeService.savePurchaseOrder(kingdeePurOrderSaveReqVO);
                    }
                }
                return null;
            },
            "采购订单保存&审核",
            KingdeePurOrderSaveReqVO::getBillNo
        );
        Map<String, Object> map = Map.of("size", results.size(), "results", results);
        return CommonResult.success(map);
    }

    /**
     * 同步所有ERP产品数据
     *
     * @return 同步结果
     */
    @PostMapping("/syncErpProducts")
    public String syncErpProducts() {
        List<ErpProductDTO> listed = erpProductApi.listProductDTOs(null);
        // 发送消息
        erpProductChannel.send(MessageBuilder.withPayload(listed).build());
        return "success";
    }
}