package cn.iocoder.yudao.module.erp.convert.logistic;

import cn.iocoder.yudao.module.erp.api.product.dto.ErpCustomRuleDTO;
import cn.iocoder.yudao.module.erp.api.product.dto.ErpProductDetailDTO;
import cn.iocoder.yudao.module.erp.convert.product.ErpProductConvert;
import cn.iocoder.yudao.module.erp.dal.dataobject.logistic.customrule.ErpCustomRuleDO;
import cn.iocoder.yudao.module.erp.dal.dataobject.product.ErpProductDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Mapper
public interface CustomRuleConvert {


    CustomRuleConvert INSTANCE = Mappers.getMapper(CustomRuleConvert.class);


    ErpCustomRuleDTO convert(ErpCustomRuleDO erpCustomRuleDO);

    List<ErpCustomRuleDTO> convert(List<ErpCustomRuleDO> erpCustomRuleDOs);

    default ErpProductDetailDTO convert(ErpCustomRuleDO erpCustomRuleDO, ErpProductDO erpProductDO) {
        return ErpProductDetailDTO.builder()
            .erpCustomRuleDTO(CustomRuleConvert.INSTANCE.convert(erpCustomRuleDO))
            .erpProductDTO(ErpProductConvert.INSTANCE.convert(erpProductDO))
            .build();
    }


    default List<ErpProductDetailDTO> convert(List<ErpCustomRuleDO> erpCustomRuleDOs, Map<Long, ErpProductDO> productMap) {
        return erpCustomRuleDOs.stream()
            .filter(Objects::nonNull)
            .map(erpCustomRuleDO -> {
                ErpProductDO productDO = productMap.get(erpCustomRuleDO.getProductId());
                return CustomRuleConvert.INSTANCE.convert(erpCustomRuleDO, productDO);
            })
            .toList();
    }

}


