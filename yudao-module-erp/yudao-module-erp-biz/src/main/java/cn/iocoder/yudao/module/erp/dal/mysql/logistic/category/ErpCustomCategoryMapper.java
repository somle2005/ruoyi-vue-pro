package cn.iocoder.yudao.module.erp.dal.mysql.logistic.category;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.module.erp.controller.admin.logistic.category.vo.ErpCustomCategoryPageReqVO;
import cn.iocoder.yudao.module.erp.dal.dataobject.logistic.category.ErpCustomCategoryDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * 海关分类 Mapper
 *
 * @author 王岽宇
 */
@Mapper
public interface ErpCustomCategoryMapper extends BaseMapperX<ErpCustomCategoryDO> {

    default LambdaQueryWrapperX<ErpCustomCategoryDO> buildQueryWrapper(ErpCustomCategoryPageReqVO reqVO) {
        return new LambdaQueryWrapperX<ErpCustomCategoryDO>()
            .betweenIfPresent(ErpCustomCategoryDO::getCreateTime, reqVO.getCreateTime())
            .eqIfPresent(ErpCustomCategoryDO::getMaterial, reqVO.getMaterial())
            .likeIfPresent(ErpCustomCategoryDO::getDeclaredType, reqVO.getDeclaredType())
            .likeIfPresent(ErpCustomCategoryDO::getDeclaredTypeEn, reqVO.getDeclaredTypeEn())
            .orderByDesc(ErpCustomCategoryDO::getId);
    }

    default PageResult<ErpCustomCategoryDO> selectPage(ErpCustomCategoryPageReqVO reqVO) {
        return selectPage(reqVO, buildQueryWrapper(reqVO));
    }

    //获得海关分类列表的list
    default List<ErpCustomCategoryDO> getCustomRuleCategoryList(ErpCustomCategoryPageReqVO reqVO) {
        return selectList(buildQueryWrapper(reqVO));
    }
}