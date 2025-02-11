package cn.iocoder.yudao.module.erp.convert.logistic.category;

import cn.iocoder.yudao.module.erp.controller.admin.logistic.category.vo.ErpCustomRuleCategorySaveReqVO;
import cn.iocoder.yudao.module.erp.dal.dataobject.logistic.category.ErpCustomCategoryDO;
import org.mapstruct.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface ErpCustomRuleCategoryConvert {
    //instance
    ErpCustomRuleCategoryConvert INSTANCE = org.mapstruct.factory.Mappers.getMapper(ErpCustomRuleCategoryConvert.class);

    //VO->DO
    ErpCustomCategoryDO convert(ErpCustomRuleCategorySaveReqVO bean);

    default List<ErpCustomCategoryDO> convert(List<ErpCustomRuleCategorySaveReqVO> list) {
        if (list == null) {
            return null;
        }
        List<ErpCustomCategoryDO> result = new ArrayList<>(list.size());
        for (ErpCustomRuleCategorySaveReqVO bean : list) {
            result.add(convert(bean));
        }
        return result;
    }
}
