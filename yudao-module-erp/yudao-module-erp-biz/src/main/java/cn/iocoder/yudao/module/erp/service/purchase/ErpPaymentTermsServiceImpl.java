package cn.iocoder.yudao.module.erp.service.purchase;

import cn.hutool.core.collection.CollUtil;
import cn.iocoder.yudao.framework.common.exception.util.ThrowUtil;
import cn.iocoder.yudao.module.erp.controller.admin.purchase.vo.paymentterms.ErpPaymentTermsPageReqVO;
import cn.iocoder.yudao.module.erp.controller.admin.purchase.vo.paymentterms.ErpPaymentTermsRespVO;
import cn.iocoder.yudao.module.erp.controller.admin.purchase.vo.paymentterms.ErpPaymentTermsSaveReqVO;
import cn.iocoder.yudao.module.erp.dal.dataobject.purchase.ErpPaymentTermsDO;
import cn.iocoder.yudao.module.erp.dal.dataobject.purchase.ErpSupplierDO;
import cn.iocoder.yudao.module.erp.dal.mysql.purchase.ErpPaymentTermsMapper;
import cn.iocoder.yudao.module.erp.dal.mysql.purchase.ErpSupplierMapper;
import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;

import java.util.List;

import static cn.iocoder.yudao.framework.common.exception.enums.GlobalErrorCodeConstants.*;
import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.erp.enums.ErrorCodeConstants.PAYMENT_TERMS_DELETE_FAIL_EXISTS_RELATION;
import static cn.iocoder.yudao.module.erp.enums.ErrorCodeConstants.PAYMENT_TERMS_NOT_EXISTS;

/**
 * 付款条款管理 Service 实现类
 *
 * @author 王奇辉
 */
@Service
@Validated
public class ErpPaymentTermsServiceImpl implements ErpPaymentTermsService {

    @Resource
    private ErpPaymentTermsMapper paymentTermsMapper;
    @Resource
    private ErpSupplierMapper supplierMapper;

    @Override
    public Long createPaymentTerms(ErpPaymentTermsSaveReqVO createReqVO) {
        // 插入
        ErpPaymentTermsDO paymentTerms = BeanUtils.toBean(createReqVO, ErpPaymentTermsDO.class);
        ThrowUtil.ifSqlThrow(paymentTermsMapper.insert(paymentTerms),DB_INSERT_ERROR);
        // 返回
        return paymentTerms.getId();
    }

    @Override
    public void updatePaymentTerms(ErpPaymentTermsSaveReqVO updateReqVO) {
        // 校验存在
        validatePaymentTermsExists(updateReqVO.getId());
        // 更新
        ErpPaymentTermsDO updateObj = BeanUtils.toBean(updateReqVO, ErpPaymentTermsDO.class);
        ThrowUtil.ifSqlThrow(paymentTermsMapper.updateById(updateObj),DB_UPDATE_ERROR);
    }

    @Override
    public void deletePaymentTerms(Long id) {
        // 校验存在
        validatePaymentTermsExists(id);
        //判断是否存在关联
        List<ErpSupplierDO> erpSuppliers = supplierMapper.selectByPaymentTermsId(id);
        ThrowUtil.ifThrow(CollUtil.isNotEmpty(erpSuppliers),PAYMENT_TERMS_DELETE_FAIL_EXISTS_RELATION);
        // 删除
        ThrowUtil.ifSqlThrow(paymentTermsMapper.deleteById(id),DB_DELETE_ERROR);
    }

    private void validatePaymentTermsExists(Long id) {
        if (paymentTermsMapper.selectById(id) == null) {
            throw exception(PAYMENT_TERMS_NOT_EXISTS);
        }
    }

    @Override
    public ErpPaymentTermsDO getPaymentTerms(Long id) {
        return paymentTermsMapper.selectById(id);
    }

    @Override
    public PageResult<ErpPaymentTermsDO> getPaymentTermsPage(ErpPaymentTermsPageReqVO pageReqVO) {
        return paymentTermsMapper.selectPage(pageReqVO);
    }

    @Override
    public List<ErpPaymentTermsRespVO> getPaymentTermsVOListByStatus() {
        return BeanUtils.toBean(paymentTermsMapper.selectList(), ErpPaymentTermsRespVO.class);
    }

}