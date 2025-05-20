package com.somle.esb.handler.srm;

import cn.iocoder.yudao.framework.common.enums.ChannelEnum;
import cn.iocoder.yudao.module.srm.api.supplier.SrmSupplierApi;
import cn.iocoder.yudao.module.srm.api.supplier.dto.SrmSupplierDTO;
import com.somle.esb.convert.KingdeeSupplierConvert;
import com.somle.kingdee.model.supplier.KingdeeSupplier;
import com.somle.kingdee.service.KingdeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * srm 消费端
 */
@Slf4j
@Component
@Profile("prod")
@RequiredArgsConstructor
public class SrmHandler {
    private final KingdeeService kingdeeService;
    private final SrmSupplierApi srmSupplierApi;

    //消费供应商
    @ServiceActivator(inputChannel = ChannelEnum.SUPPLIER)
    public void syncSuppliersToKingdee(@Payload List<Long> supplierIds) {
        log.info("[syncSuppliersToKingdee] 开始同步供应商到金蝶，数量：{}", supplierIds.size());
        try {
            // 通过API获取供应商信息
            List<SrmSupplierDTO> suppliers = srmSupplierApi.getSupplierList(supplierIds);
            if (suppliers.isEmpty()) {
                log.warn("[syncSuppliersToKingdee] 未找到需要同步的供应商信息");
                return;
            }

            // 转换为金蝶供应商
            List<KingdeeSupplier> kingdeeSuppliers = KingdeeSupplierConvert.INSTANCE.convertList(suppliers);
            // 同步到金蝶
            kingdeeSuppliers.forEach(supplier -> {
                try {
                    kingdeeService.addSupplier(supplier);
                    log.info("[syncSuppliersToKingdee] 同步成功：{}", supplier.getNumber());
                } catch (Exception e) {
                    log.error("[syncSuppliersToKingdee] 同步失败：{}，原因：{}", supplier.getNumber(), e.getMessage());
                }
            });
        } catch (Exception e) {
            log.error("[syncSuppliersToKingdee] 同步异常：{}", e.getMessage());
            throw e;
        }
    }
}
