package cn.iocoder.yudao.module.erp.service.logistic.category.product;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.erp.controller.admin.logistic.category.product.vo.ErpCustomProductPageReqVO;
import cn.iocoder.yudao.module.erp.controller.admin.logistic.category.product.vo.ErpCustomProductSaveReqVO;
import cn.iocoder.yudao.module.erp.dal.dataobject.logistic.category.product.ErpCustomProductDO;
import cn.iocoder.yudao.module.erp.dal.mysql.logistic.category.product.ErpCustomProductMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.erp.enums.ErrorCodeConstants.CUSTOM_PRODUCT_NOT_EXISTS;

/**
 * 海关产品分类表 Service 实现类
 *
 * @author 王岽宇
 */
@Service
@Validated
public class ErpCustomProductServiceImpl implements ErpCustomProductService {

    @Resource
    private ErpCustomProductMapper customProductMapper;

    @Override
    public Long createCustomProduct(ErpCustomProductSaveReqVO createReqVO) {
        // 插入
        ErpCustomProductDO customProduct = BeanUtils.toBean(createReqVO, ErpCustomProductDO.class);
        customProductMapper.insert(customProduct);
        // 返回
        return customProduct.getId();
    }

    @Override
    public void updateCustomProduct(ErpCustomProductSaveReqVO updateReqVO) {
        // 校验存在
        validateCustomProductExists(updateReqVO.getId());
        // 更新
        ErpCustomProductDO updateObj = BeanUtils.toBean(updateReqVO, ErpCustomProductDO.class);
        customProductMapper.updateById(updateObj);
    }

    @Override
    public void deleteCustomProduct(Long id) {
        // 校验存在
        validateCustomProductExists(id);
        // 删除
        customProductMapper.deleteById(id);
    }

    private void validateCustomProductExists(Long id) {
        if (customProductMapper.selectById(id) == null) {
            throw exception(CUSTOM_PRODUCT_NOT_EXISTS);
        }
    }

    @Override
    public ErpCustomProductDO getCustomProduct(Long id) {
        return customProductMapper.selectById(id);
    }

    @Override
    public PageResult<ErpCustomProductDO> getCustomProductPage(ErpCustomProductPageReqVO pageReqVO) {
        return customProductMapper.selectPage(pageReqVO);
    }

}