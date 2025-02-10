package cn.iocoder.yudao.module.erp.convert.logistic.category.item;

import cn.iocoder.yudao.module.erp.controller.admin.logistic.category.item.vo.ErpCustomRuleCategoryItemSaveReqVO;
import cn.iocoder.yudao.module.erp.dal.dataobject.logistic.category.item.ErpCustomRuleCategoryItemDO;
import org.mapstruct.Mapper;

@Mapper
public interface ErpCustomRuleCategoryItemConvert {
    //instance
    ErpCustomRuleCategoryItemConvert INSTANCE = org.mapstruct.factory.Mappers.getMapper(ErpCustomRuleCategoryItemConvert.class);

    //VO->DO
    ErpCustomRuleCategoryItemDO convert(ErpCustomRuleCategoryItemSaveReqVO bean);

    //listVO->listDO
    default java.util.List<ErpCustomRuleCategoryItemDO> convert(java.util.List<ErpCustomRuleCategoryItemSaveReqVO> list) {
        if (list == null) {
            return null;
        }
        java.util.List<ErpCustomRuleCategoryItemDO> result = new java.util.ArrayList<>(list.size());
        for (ErpCustomRuleCategoryItemSaveReqVO item : list) {
            result.add(convert(item));
        }
        return result;
    }
}
