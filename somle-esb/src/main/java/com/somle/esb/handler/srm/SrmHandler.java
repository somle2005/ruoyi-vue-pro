package com.somle.esb.handler.srm;

import cn.hutool.json.JSONUtil;
import cn.iocoder.yudao.module.srm.api.purchase.SrmPurchaseInApi;
import cn.iocoder.yudao.module.srm.api.purchase.SrmPurchaseOrderApi;
import cn.iocoder.yudao.module.srm.api.purchase.SrmPurchaseReturnApi;
import cn.iocoder.yudao.module.srm.api.supplier.SrmSupplierApi;
import cn.iocoder.yudao.module.srm.enums.SrmChannelEnum;
import com.somle.esb.aspect.SyncLog;
import com.somle.esb.converter.ErpToKingdeeConverter;
import com.somle.kingdee.model.KingdeePurInboundSaveReqVO;
import com.somle.kingdee.model.KingdeePurOrderSaveReqVO;
import com.somle.kingdee.model.KingdeePurReturnSaveReqVO;
import com.somle.kingdee.model.supplier.KingdeeSupplierSaveVO;
import com.somle.kingdee.service.KingdeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

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

    @SyncLog("同步供应商到金蝶")
    @ServiceActivator(inputChannel = SrmChannelEnum.SUPPLIER)
    public void syncSuppliersToKingdee(@Payload List<Long> supplierIds) {
        syncToKingdee(
            supplierIds,
            ids -> srmSupplierApi.validateSupplierIds(new HashSet<>(ids)),
            erpToKingdeeConverter::convertSupplierDTOList,
            kingdeeService::addSupplier,
            "供应商",
            KingdeeSupplierSaveVO::getNumber
        );
    }

    @SyncLog("同步采购订单到金蝶")
    @ServiceActivator(inputChannel = SrmChannelEnum.PURCHASE_ORDER)
    public void syncPurchaseOrdersToKingdee(@Payload List<Long> orderIds) {
        syncToKingdee(
            orderIds,
            ids -> srmPurchaseOrderApi.validatePurchaseOrderIds(new HashSet<>(ids)),
            erpToKingdeeConverter::convertOrderDTOList,
            kingdeeService::savePurchaseOrder,
            "采购订单",
            KingdeePurOrderSaveReqVO::getBillNo
        );
    }

    @SyncLog("同步采购入库单到金蝶")
    @ServiceActivator(inputChannel = SrmChannelEnum.PURCHASE_IN)
    public void syncPurchaseInToKingdee(@Payload List<Long> inIds) {
        syncToKingdee(
            inIds,
            srmPurchaseInApi::getPurchaseInList,
            erpToKingdeeConverter::convertInDTOList,
            kingdeeService::savePurInbound,
            "采购入库单",
            KingdeePurInboundSaveReqVO::getBillNo
        );
    }

    @SyncLog("同步采购退货单到金蝶")
    @ServiceActivator(inputChannel = SrmChannelEnum.PURCHASE_RETURN)
    public void syncPurchaseReturnToKingdee(@Payload List<Long> returnIds) {
        syncToKingdee(
            returnIds,
            srmPurchaseReturnApi::getPurchaseReturnList,
            erpToKingdeeConverter::convertReturnDTOList,
            kingdeeService::savePurOutbound,
            "采购退货单",
            KingdeePurReturnSaveReqVO::getBillNo
        );
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
        for (int i = 0; i < total; i++) {
            R obj = kingdeeObjs.get(i);
            syncer.accept(obj);
            log.info("[{}] 同步进度：{}/{}，标识(ID)：{}", logType, i + 1, total, numberGetter.apply(obj));
        }
        log.info("[{}] 同步完成，共处理：{}个", logType, total);
    }

}
