package cn.iocoder.yudao.module.erp.dal.mysql.product;

import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.module.erp.dal.dataobject.product.ErpProductCategoryFieldDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 产品分类自定义字段中间 Mapper
 *
 * @author 索迈管理员
 */
@Mapper
public interface ErpProductCategoryFieldMapper extends BaseMapperX<ErpProductCategoryFieldDO> {

    default List<ErpProductCategoryFieldDO> selectListByCategoryId(Long id){
        return selectList(new LambdaQueryWrapperX<ErpProductCategoryFieldDO>()
                .eq(ErpProductCategoryFieldDO::getCategoryId, id));
    }
    default List<ErpProductCategoryFieldDO> selectListByFieldId(Long id){
        return selectList(new LambdaQueryWrapperX<ErpProductCategoryFieldDO>()
                .eq(ErpProductCategoryFieldDO::getFieldId, id));
    }
}