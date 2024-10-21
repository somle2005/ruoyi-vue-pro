package cn.iocoder.yudao.module.erp.dal.mysql.product;

import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.module.erp.controller.admin.product.vo.category.ErpProductCategoryFieldRespVO;
import cn.iocoder.yudao.module.erp.dal.dataobject.product.ErpProductCategoryFieldDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 产品分类自定义字段中间 Mapper
 *
 * @author 索迈管理员
 */
@Mapper
public interface ErpProductCategoryFieldMapper extends BaseMapperX<ErpProductCategoryFieldDO> {

    /**
    * @Author Wqh
    * @Description 根据分类id查询产品分类自定义字段列表
    * @Date 9:29 2024/10/21
    * @Param [categoryId]
    * @return java.util.List<cn.iocoder.yudao.module.erp.dal.dataobject.product.ErpProductCategoryFieldDO>
    **/
    default List<ErpProductCategoryFieldDO> selectListByCategoryId(Long categoryId){
        return selectList(new LambdaQueryWrapperX<ErpProductCategoryFieldDO>()
                .eq(ErpProductCategoryFieldDO::getCategoryId, categoryId));
    }

    /**
    * @Author Wqh
    * @Description 根据自定义字段id查询产品分类自定义字段列表
    * @Date 9:29 2024/10/21
    * @Param [filedId]
    * @return java.util.List<cn.iocoder.yudao.module.erp.dal.dataobject.product.ErpProductCategoryFieldDO>
    **/
    default List<ErpProductCategoryFieldDO> selectListByFieldId(Long filedId){
        return selectList(new LambdaQueryWrapperX<ErpProductCategoryFieldDO>()
                .eq(ErpProductCategoryFieldDO::getFieldId, filedId));
    }

}