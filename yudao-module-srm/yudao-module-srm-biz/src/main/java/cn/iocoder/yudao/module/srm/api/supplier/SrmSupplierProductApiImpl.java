package cn.iocoder.yudao.module.srm.api.supplier;

import cn.iocoder.yudao.module.srm.api.supplier.dto.SrmSupplierProductDTO;
import cn.iocoder.yudao.module.srm.dal.dataobject.purchase.SrmPurchaseOrderItemDO;
import cn.iocoder.yudao.module.srm.service.purchase.SrmSupplierProductService;
import cn.iocoder.yudao.module.system.api.utils.Validation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.math.BigDecimal;

/**
 * 供应商产品 API 实现类
 *
 * @author wdy
 */
@Service
@Slf4j
public class SrmSupplierProductApiImpl implements SrmSupplierProductApi {

    @Autowired
    SrmSupplierProductService srmSupplierProductService;

    //更新DTO
    public void updateSupplierProduct(@Validated(Validation.OnUpdate.class) SrmSupplierProductDTO dto) {
        srmSupplierProductService.saveOrUpdateSupplierProduct(dto);
    }

    public void updateSupplierProductPrice(Long supplierId, SrmPurchaseOrderItemDO orderItem) {
        try {
            // 参数校验
            if (supplierId == null) {
                log.debug("供应商ID为空，跳过更新供应商产品价格");
                return;
            }
            if (orderItem.getProductId() == null) {
                log.debug("产品ID为空，跳过更新供应商产品价格 - 供应商ID: {}", supplierId);
                return;
            }

            // 构建更新DTO
            SrmSupplierProductDTO dto = new SrmSupplierProductDTO();
            dto.setSupplierId(supplierId);
            dto.setProductId(orderItem.getProductId());

            // 更新采购价格 - 使用含税单价作为最新采购价格
            if (orderItem.getGrossPrice() != null && orderItem.getGrossPrice().compareTo(BigDecimal.ZERO) > 0) {
                dto.setLastPurchasePrice(orderItem.getGrossPrice());
            } else if (orderItem.getProductPrice() != null && orderItem.getProductPrice().compareTo(BigDecimal.ZERO) > 0) {
                // 如果没有含税单价，使用产品单价
                dto.setLastPurchasePrice(orderItem.getProductPrice());
            } else {
                log.warn("采购订单明细行没有有效价格信息，跳过更新 - 供应商ID: {}, 产品ID: {}, 含税单价: {}, 产品单价: {}", supplierId, orderItem.getProductId(), orderItem.getGrossPrice(), orderItem.getProductPrice());
                return;
            }

            // 更新税率
            if (orderItem.getTaxRate() != null && orderItem.getTaxRate().compareTo(BigDecimal.ZERO) >= 0) {
                dto.setTaxRate(orderItem.getTaxRate());
            }

            // 更新货币代码 - 使用订单明细行中的货币代码
            if (orderItem.getCurrencyId() != null) {
                dto.setPurchasePriceCurrencyCode(orderItem.getCurrencyId().intValue());
            }

            srmSupplierProductService.saveOrUpdateSupplierProduct(dto);

            log.info("已更新供应商产品价格 - 供应商ID: {}, 产品ID: {}, 新价格: {}",
                supplierId, orderItem.getProductId(), dto.getPurchasePrice());

        } catch (Exception e) {
            log.error("更新供应商产品价格失败 - 供应商ID: {}, 产品ID: {}",
                supplierId, orderItem.getProductId(), e);
        }
    }
}
