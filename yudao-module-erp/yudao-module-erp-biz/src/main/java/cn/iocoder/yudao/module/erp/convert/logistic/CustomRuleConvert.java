package cn.iocoder.yudao.module.erp.convert.logistic;

import cn.iocoder.yudao.module.erp.api.product.dto.ErpCustomRuleDTO;
import cn.iocoder.yudao.module.erp.dal.dataobject.logistic.customrule.ErpCustomRuleDO;
import cn.iocoder.yudao.module.erp.dal.dataobject.product.ErpProductDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

@Mapper
public interface CustomRuleConvert {


    CustomRuleConvert INSTANCE = Mappers.getMapper(CustomRuleConvert.class);

    @Mapping(target = "productWidth", source = "erpProductDO.width")
    @Mapping(target = "productWeight", source = "erpProductDO.weight")
    @Mapping(target = "productName", source = "erpProductDO.name")
    @Mapping(target = "productMaterial", source = "erpProductDO.material")
    @Mapping(target = "productLength", source = "erpProductDO.length")
    @Mapping(target = "productImageUrl", source = "erpProductDO.primaryImageUrl")
    @Mapping(target = "productHeight", source = "erpProductDO.height")
    @Mapping(target = "productDeptId", source = "erpProductDO.deptId")
    @Mapping(target = "productCreatorId", source = "erpProductDO.creator")
    @Mapping(target = "productId", source = "erpProductDO.id")
    @Mapping(target = "fbaBarCode", source = "erpProductDO.barCode")
    @Mapping(target = "id", source = "customRuleDO.id")
    ErpCustomRuleDTO convert(ErpCustomRuleDO customRuleDO, ErpProductDO erpProductDO);


    // 将外部服务获取的产品信息（Map<Long, ErpProductDO>）传递给转换方法
    default List<ErpCustomRuleDTO> convertToDTOList(List<ErpCustomRuleDO> customRuleDOList, Map<Long, ErpProductDO> productMap) {
        return customRuleDOList.stream()
            .filter(Objects::nonNull)
            .map(erpCustomRuleDO -> {
                ErpProductDO product = productMap.get(erpCustomRuleDO.getProductId());
                return CustomRuleConvert.INSTANCE.convert(erpCustomRuleDO, product);
            })
            .collect(Collectors.toList());
    }


    ErpCustomRuleDO convert(ErpCustomRuleDTO dto);

    List<ErpCustomRuleDO> convertList(List<ErpCustomRuleDTO> list);
}


