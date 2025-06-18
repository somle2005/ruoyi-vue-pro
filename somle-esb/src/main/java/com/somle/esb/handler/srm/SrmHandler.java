package com.somle.esb.handler.srm;

import cn.iocoder.yudao.module.srm.api.purchase.SrmPurchaseInApi;
import cn.iocoder.yudao.module.srm.api.purchase.SrmPurchaseOrderApi;
import cn.iocoder.yudao.module.srm.api.purchase.SrmPurchaseReturnApi;
import cn.iocoder.yudao.module.srm.api.purchase.dto.SrmPurchaseOrderDTO;
import cn.iocoder.yudao.module.srm.api.supplier.SrmSupplierApi;
import cn.iocoder.yudao.module.srm.enums.SrmChannelEnum;
import com.somle.esb.aspect.SyncLog;
import com.somle.esb.converter.ErpToKingdeeConverter;
import com.somle.esb.util.SyncUtils;
import com.somle.kingdee.model.KingdeePurInboundSaveReqVO;
import com.somle.kingdee.model.KingdeePurOrderSaveReqVO;
import com.somle.kingdee.model.KingdeePurReturnSaveReqVO;
import com.somle.kingdee.model.KingdeeResponse;
import com.somle.kingdee.model.supplier.KingdeeSupplierSaveVO;
import com.somle.kingdee.service.KingdeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * srm 消费端
 */
@Slf4j
@Component
@RequiredArgsConstructor
@SuppressWarnings("all")
public class SrmHandler {
    private final KingdeeService kingdeeService;
    private final SrmSupplierApi srmSupplierApi;
    private final SrmPurchaseOrderApi srmPurchaseOrderApi;
    private final SrmPurchaseInApi srmPurchaseInApi;
    private final SrmPurchaseReturnApi srmPurchaseReturnApi;
    private final ErpToKingdeeConverter erpToKingdeeConverter;

    @SyncLog("供应商 -> 金蝶")
    @ServiceActivator(inputChannel = SrmChannelEnum.SUPPLIER)
    public void syncSuppliersToKingdee(@Payload List<Long> supplierIds) {
        List<List<KingdeeResponse>> results = SyncUtils.syncToKingdeeWithResult(
            supplierIds,
            ids -> srmSupplierApi.validateSupplierIds(new HashSet<>(ids)),
            erpToKingdeeConverter::convertSupplierDTOList,
            kingdeeService::addSupplier,
            "供应商创建",
            KingdeeSupplierSaveVO::getNumber
        );
    }

    @SyncLog("采购订单 -> 金蝶")
    @ServiceActivator(inputChannel = SrmChannelEnum.PURCHASE_ORDER_AUDIT)
    public void syncPurchaseOrdersToKingdee(@Payload List<Long> orderIds) {
        List<List<KingdeeResponse>> results = SyncUtils.syncToKingdeeWithResult(
            orderIds,
            ids -> srmPurchaseOrderApi.validatePurchaseOrderIds(new HashSet<>(ids)),
            erpToKingdeeConverter::convertOrderDTOList,
            kingdeeService::savePurchaseOrder,
            "采购订单创建审核",
            KingdeePurOrderSaveReqVO::getBillNo
        );

    }

    @SyncLog("采购订单 -> 金蝶")
    @ServiceActivator(inputChannel = SrmChannelEnum.PURCHASE_ORDER_REVERSE)
    public void syncPurchaseOrdersReverseToKingdee(@Payload List<Long> orderIds) {
        List<List<KingdeeResponse>> results = SyncUtils.syncToKingdeeWithResult(
            orderIds,
            ids -> srmPurchaseOrderApi.validatePurchaseOrderIds(new HashSet<>(ids)),
            dtos -> dtos.stream().map(SrmPurchaseOrderDTO::getCode).collect(Collectors.toList()),
            kingdeeService::unAuditPurchaseOrder,
            "采购订单反审核删除",
            String::toString
        );

    }

    @SyncLog("采购入库单 -> 金蝶")
    @ServiceActivator(inputChannel = SrmChannelEnum.PURCHASE_IN)
    public void syncPurchaseInToKingdee(@Payload List<Long> inIds) {
        List<List<KingdeeResponse>> results = SyncUtils.syncToKingdeeWithResult(
            inIds,
            srmPurchaseInApi::getPurchaseInList,
            erpToKingdeeConverter::convertInDTOList,
            kingdeeService::savePurInbound,
            "采购入库单",
            KingdeePurInboundSaveReqVO::getBillNo
        );


    }

    @SyncLog("采购退货单 -> 金蝶")
    @ServiceActivator(inputChannel = SrmChannelEnum.PURCHASE_RETURN)
    public void syncPurchaseReturnToKingdee(@Payload List<Long> returnIds) {
        List<List<KingdeeResponse>> results = SyncUtils.syncToKingdeeWithResult(
            returnIds,
            srmPurchaseReturnApi::getPurchaseReturnList,
            erpToKingdeeConverter::convertReturnDTOList,
            kingdeeService::savePurOutbound,
            "采购退货单",
            KingdeePurReturnSaveReqVO::getBillNo
        );

    }
}
