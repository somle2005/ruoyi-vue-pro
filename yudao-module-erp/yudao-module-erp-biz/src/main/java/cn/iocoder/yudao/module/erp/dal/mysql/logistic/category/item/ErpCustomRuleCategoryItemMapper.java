package cn.iocoder.yudao.module.erp.dal.mysql.logistic.category.item;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.module.erp.controller.admin.logistic.category.item.vo.ErpCustomRuleCategoryItemPageReqVO;
import cn.iocoder.yudao.module.erp.dal.dataobject.logistic.category.item.ErpCustomRuleCategoryItemDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.Collection;
import java.util.List;

/**
 * 海关品类子表 Mapper
 *
 * @author 王岽宇
 */
@Mapper
public interface ErpCustomRuleCategoryItemMapper extends BaseMapperX<ErpCustomRuleCategoryItemDO> {

    default PageResult<ErpCustomRuleCategoryItemDO> selectPage(ErpCustomRuleCategoryItemPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<ErpCustomRuleCategoryItemDO>()
//            .eqIfPresent(ErpCustomRuleCategoryItemDO::getCategoryId, reqVO.getCategoryId())
            .eqIfPresent(ErpCustomRuleCategoryItemDO::getCountryCode, reqVO.getCountryCode())
            .eqIfPresent(ErpCustomRuleCategoryItemDO::getHsCode, reqVO.getHsCode())
            .eqIfPresent(ErpCustomRuleCategoryItemDO::getTaxRate, reqVO.getTaxRate())
            .betweenIfPresent(ErpCustomRuleCategoryItemDO::getCreateTime, reqVO.getCreateTime())
            .orderByDesc(ErpCustomRuleCategoryItemDO::getId));
    }

    default List<ErpCustomRuleCategoryItemDO> selectListByCategoryId(Integer categoryId) {
        return selectList(new LambdaQueryWrapperX<ErpCustomRuleCategoryItemDO>()
            .eq(ErpCustomRuleCategoryItemDO::getCategoryId, categoryId));
    }

    default List<ErpCustomRuleCategoryItemDO> selectListByCategoryId(Collection<Long> categoryIds) {
        return selectList(new LambdaQueryWrapperX<ErpCustomRuleCategoryItemDO>()
            .in(ErpCustomRuleCategoryItemDO::getCategoryId, categoryIds));
    }

    default void deleteByCategoryId(Long categoryId) {
        delete(new LambdaQueryWrapperX<ErpCustomRuleCategoryItemDO>()
            .eq(ErpCustomRuleCategoryItemDO::getCategoryId, categoryId));
    }
}