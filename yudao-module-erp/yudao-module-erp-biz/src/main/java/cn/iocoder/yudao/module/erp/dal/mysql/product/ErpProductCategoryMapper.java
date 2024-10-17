package cn.iocoder.yudao.module.erp.dal.mysql.product;

import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.module.erp.controller.admin.product.vo.category.ErpProductCategoryListReqVO;
import cn.iocoder.yudao.module.erp.dal.dataobject.product.ErpProductCategoryDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ERP 产品分类 Mapper
 *
 * @author 芋道源码
 */
@Mapper
public interface ErpProductCategoryMapper extends BaseMapperX<ErpProductCategoryDO> {

    default List<ErpProductCategoryDO> selectList(ErpProductCategoryListReqVO reqVO) {
        return selectList(new LambdaQueryWrapperX<ErpProductCategoryDO>()
                .likeIfPresent(ErpProductCategoryDO::getName, reqVO.getName())
                .eqIfPresent(ErpProductCategoryDO::getStatus, reqVO.getStatus())
                .orderByDesc(ErpProductCategoryDO::getId));
    }

	default ErpProductCategoryDO selectByParentIdAndName(Long parentId, String name) {
	    return selectOne(ErpProductCategoryDO::getParentId, parentId, ErpProductCategoryDO::getName, name);
	}

    default Long selectCountByParentId(Long parentId) {
        return selectCount(ErpProductCategoryDO::getParentId, parentId);
    }

    /**
    * @Author Wqh
    * @Description 获取该父id下的所有子分类
    * @Date 16:32 2024/10/17
    * @Param [id]
    * @return java.util.List<cn.iocoder.yudao.module.erp.dal.dataobject.product.ErpProductCategoryDO>
    **/
    default List<ErpProductCategoryDO> selectChildrenList(Long parentId){
        return selectList(new LambdaQueryWrapperX<ErpProductCategoryDO>()
                .eq(ErpProductCategoryDO::getParentId, parentId));
    }

    /**
    * @Author Wqh
    * @Description 获取父分类的状态
    * @Date 16:44 2024/10/17
    * @Param [parentId]
    * @return java.lang.Integer
    **/
    default Integer selectParentStatus(Long parentId){
        return selectOne(ErpProductCategoryDO::getId, parentId).getStatus();
    }
}