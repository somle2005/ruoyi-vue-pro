package cn.iocoder.yudao.module.erp.api.product;

import cn.iocoder.yudao.module.erp.api.product.dto.ErpProductCategoryFieldDTO;

import java.util.List;

public interface ProductCategoryFieldApi {
    /**
    * @Author Wqh
    * @Description 根据字段id获取字段列表
    * @Date 16:54 2024/10/18
    * @Param [fieldId]
    * @return java.util.List<cn.iocoder.yudao.module.erp.api.product.dto.ErpProductCategoryFieldDTO>
    **/
    List<ErpProductCategoryFieldDTO> getProductCategoryFieldList(Long fieldId);
}
