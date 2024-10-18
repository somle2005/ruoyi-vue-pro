package cn.iocoder.yudao.module.erp.api.product;

import cn.iocoder.yudao.module.erp.api.product.dto.ErpProductCategoryFieldDTO;
import cn.iocoder.yudao.module.erp.convert.product.category.CategoryFieldConvert;
import cn.iocoder.yudao.module.erp.dal.dataobject.product.ErpProductCategoryFieldDO;
import cn.iocoder.yudao.module.erp.dal.mysql.product.ErpProductCategoryFieldMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @className: ProductCategoryFieldImpl
 * @author: Wqh
 * @date: 2024/10/18 16:57
 * @Version: 1.0
 * @description:
 */
@Service
@RequiredArgsConstructor
public class ProductCategoryFieldImpl implements ProductCategoryFieldApi{
    private final ErpProductCategoryFieldMapper productCategoryFieldMapper;
    @Override
    public List<ErpProductCategoryFieldDTO> getProductCategoryFieldList(Long fieldId) {
        List<ErpProductCategoryFieldDO> erpProductCategoryFieldDos = productCategoryFieldMapper.selectListByFieldId(fieldId);
        return CategoryFieldConvert.INSTANCE.convertList0(erpProductCategoryFieldDos);
    }
}
