package com.somle.esb.controller;

import cn.iocoder.yudao.module.erp.api.product.ErpProductApi;
import cn.iocoder.yudao.module.erp.api.product.dto.ErpProductDTO;
import cn.iocoder.yudao.module.erp.api.product.dto.ErpSyncProductDTO;
import cn.iocoder.yudao.module.srm.api.purchase.SrmPurchaseOrderApi;
import cn.iocoder.yudao.module.srm.api.supplier.SrmSupplierApi;
import cn.iocoder.yudao.module.srm.api.supplier.dto.SrmSupplierDTO;
import cn.iocoder.yudao.module.srm.enums.SrmChannelEnum;
import com.somle.esb.service.EsbService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/api/esb")
public class EsbController {

    @Autowired
    private EsbService service;
    @Resource(name = SrmChannelEnum.SUPPLIER)
    MessageChannel tmsSupplierChannel;

    @Resource(name = SrmChannelEnum.PURCHASE_ORDER)
    MessageChannel purchaseOrderChannel;
    @Autowired
    private SrmSupplierApi srmSupplierApi;
    @Resource
    MessageChannel erpProductChannel;
    @Autowired
    private SrmPurchaseOrderApi srmPurchaseOrderApi;
    @Autowired
    private ErpProductApi erpProductApi;

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
        srmPurchaseOrderApi.validatePurchaseOrderIds(Collections.singleton(orderId));
        // 发送消息
        purchaseOrderChannel.send(MessageBuilder.withPayload(Collections.singletonList(orderId)).build());
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