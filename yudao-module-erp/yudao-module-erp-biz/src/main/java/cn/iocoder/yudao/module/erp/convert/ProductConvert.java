package cn.iocoder.yudao.module.erp.convert;

import cn.iocoder.yudao.module.erp.api.product.dto.ErpCustomRuleDTO;
import cn.iocoder.yudao.module.erp.dal.dataobject.product.ErpProductDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author: Wqh
 * @date: 2025/1/2 9:19
 */
@Mapper
public interface ProductConvert {
    ProductConvert INSTANCE = Mappers.getMapper(ProductConvert.class);

    default ErpCustomRuleDTO convert(ErpProductDO productDO) {
        ErpCustomRuleDTO erpCustomRuleDTO = new ErpCustomRuleDTO();
        erpCustomRuleDTO.setProductName(productDO.getName());
        erpCustomRuleDTO.setProductImageUrl(productDO.getPrimaryImageUrl());
        erpCustomRuleDTO.setProductWeight(Float.valueOf(productDO.getWeight()));
        erpCustomRuleDTO.setProductLength(Float.valueOf(productDO.getLength()));
        erpCustomRuleDTO.setProductWidth(Float.valueOf(productDO.getWidth()));
        erpCustomRuleDTO.setProductHeight(Float.valueOf(productDO.getHeight()));
        erpCustomRuleDTO.setProductMaterial(productDO.getMaterial());
        erpCustomRuleDTO.setBarCode(productDO.getBarCode());
        erpCustomRuleDTO.setProductDeptId(productDO.getDeptId());
        return erpCustomRuleDTO;
    }
}
