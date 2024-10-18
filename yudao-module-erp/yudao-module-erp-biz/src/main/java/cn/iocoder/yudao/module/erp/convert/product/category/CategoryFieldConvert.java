package cn.iocoder.yudao.module.erp.convert.product.category;


import cn.iocoder.yudao.module.erp.api.product.dto.ErpProductCategoryFieldDTO;
import cn.iocoder.yudao.module.erp.controller.admin.product.vo.category.ErpProductCategoryFieldSaveReqVO;
import cn.iocoder.yudao.module.erp.dal.dataobject.product.ErpProductCategoryFieldDO;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Administrator
 */
@Mapper
public interface CategoryFieldConvert {
    CategoryFieldConvert INSTANCE = org.mapstruct.factory.Mappers.getMapper(CategoryFieldConvert.class);

    /**
    * @Author Wqh
    * @Description List属性拷贝
    * @Date 16:11 2024/10/18
    * @Param [reqVos]
    * @return java.util.List<cn.iocoder.yudao.module.erp.dal.dataobject.product.ErpProductCategoryFieldDO>
    **/
    List<ErpProductCategoryFieldDO> convertList(List<ErpProductCategoryFieldSaveReqVO> reqVos);


    List<ErpProductCategoryFieldDTO> convertList0(List<ErpProductCategoryFieldDO> reqVos);
}
