package cn.iocoder.yudao.module.erp.dal.mysql.logistic.category;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.module.erp.controller.admin.logistic.category.vo.ErpCustomRuleCategoryPageReqVO;
import cn.iocoder.yudao.module.erp.dal.dataobject.logistic.category.ErpCustomRuleCategoryDO;
import cn.iocoder.yudao.module.erp.dal.dataobject.logistic.category.item.ErpCustomRuleCategoryItemDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 海关品类 Mapper
 *
 * @author 王岽宇
 */
@Mapper
public interface ErpCustomRuleCategoryMapper extends BaseMapperX<ErpCustomRuleCategoryDO> {

    default PageResult<ErpCustomRuleCategoryDO> selectPage(ErpCustomRuleCategoryPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<ErpCustomRuleCategoryDO>()
            .betweenIfPresent(ErpCustomRuleCategoryDO::getCreateTime, reqVO.getCreateTime())
            .eqIfPresent(ErpCustomRuleCategoryDO::getMaterial, reqVO.getMaterial())
            .eqIfPresent(ErpCustomRuleCategoryDO::getDeclaredType, reqVO.getDeclaredType())
            .eqIfPresent(ErpCustomRuleCategoryDO::getDeclaredTypeEn, reqVO.getDeclaredTypeEn())
            .eqIfPresent(ErpCustomRuleCategoryDO::getCombinedValue, reqVO.getCombinedValue())
            .orderByDesc(ErpCustomRuleCategoryDO::getId));
    }

}