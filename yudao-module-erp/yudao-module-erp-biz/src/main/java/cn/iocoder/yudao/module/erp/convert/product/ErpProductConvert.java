package cn.iocoder.yudao.module.erp.convert.product;

import cn.iocoder.yudao.module.erp.api.product.dto.ErpProductDTO;
import cn.iocoder.yudao.module.erp.api.product.dto.ErpProductDetailDTO;
import cn.iocoder.yudao.module.erp.convert.logistic.CustomRuleConvert;
import cn.iocoder.yudao.module.erp.dal.dataobject.logistic.customrule.ErpCustomRuleDO;
import cn.iocoder.yudao.module.erp.dal.dataobject.product.ErpProductDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ErpProductConvert {

    ErpProductConvert INSTANCE = Mappers.getMapper(ErpProductConvert.class);


    ErpProductDTO convert(ErpProductDO erpProductDO);

    default ErpProductDetailDTO convert(ErpProductDO erpProductDO, ErpCustomRuleDO erpCustomRuleDO) {
        return ErpProductDetailDTO.builder()
            .erpProductDTO(convert(erpProductDO))
            .erpCustomRuleDTO(CustomRuleConvert.INSTANCE.convert(erpCustomRuleDO))
            .build();
    }

}
