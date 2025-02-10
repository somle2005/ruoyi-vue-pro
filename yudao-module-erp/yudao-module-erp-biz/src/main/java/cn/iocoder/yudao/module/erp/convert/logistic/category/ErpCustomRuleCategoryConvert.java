package cn.iocoder.yudao.module.erp.convert.logistic.category;

import cn.iocoder.yudao.module.erp.controller.admin.logistic.category.vo.ErpCustomRuleCategorySaveReqVO;
import cn.iocoder.yudao.module.erp.dal.dataobject.logistic.category.ErpCustomRuleCategoryDO;
import org.mapstruct.Mapper;

@Mapper
public interface ErpCustomRuleCategoryConvert {
    //instance
    ErpCustomRuleCategoryConvert INSTANCE = org.mapstruct.factory.Mappers.getMapper(ErpCustomRuleCategoryConvert.class);

    //VO->DO
    ErpCustomRuleCategoryDO convert(ErpCustomRuleCategorySaveReqVO bean);
    default java.util.List<ErpCustomRuleCategoryDO> convert(java.util.List<ErpCustomRuleCategorySaveReqVO> list) {
        if (list == null) {
            return null;
        }
        java.util.List<ErpCustomRuleCategoryDO> result = new java.util.ArrayList<>(list.size());
        for (ErpCustomRuleCategorySaveReqVO bean : list) {
            result.add(convert(bean));
        }
        return result;
    }
}
