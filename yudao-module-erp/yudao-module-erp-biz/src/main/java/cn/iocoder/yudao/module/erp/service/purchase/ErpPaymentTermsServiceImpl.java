package cn.iocoder.yudao.module.erp.service.purchase;

import cn.iocoder.yudao.module.erp.controller.admin.purchase.vo.paymentterms.ErpPaymentTermsPageReqVO;
import cn.iocoder.yudao.module.erp.controller.admin.purchase.vo.paymentterms.ErpPaymentTermsRespVO;
import cn.iocoder.yudao.module.erp.controller.admin.purchase.vo.paymentterms.ErpPaymentTermsSaveReqVO;
import cn.iocoder.yudao.module.erp.dal.dataobject.purchase.ErpPaymentTermsDO;
import cn.iocoder.yudao.module.erp.dal.mysql.purchase.ErpPaymentTermsMapper;
import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;

import java.util.List;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
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

    @Override
    public Long createPaymentTerms(ErpPaymentTermsSaveReqVO createReqVO) {
        // 插入
        ErpPaymentTermsDO paymentTerms = BeanUtils.toBean(createReqVO, ErpPaymentTermsDO.class);
        paymentTermsMapper.insert(paymentTerms);
        // 返回
        return paymentTerms.getId();
    }

    @Override
    public void updatePaymentTerms(ErpPaymentTermsSaveReqVO updateReqVO) {
        // 校验存在
        validatePaymentTermsExists(updateReqVO.getId());
        // 更新
        ErpPaymentTermsDO updateObj = BeanUtils.toBean(updateReqVO, ErpPaymentTermsDO.class);
        paymentTermsMapper.updateById(updateObj);
    }

    @Override
    public void deletePaymentTerms(Long id) {
        // 校验存在
        validatePaymentTermsExists(id);
        // 删除
        paymentTermsMapper.deleteById(id);
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