package cn.iocoder.yudao.module.erp.service.purchase;


import cn.iocoder.yudao.module.erp.controller.admin.purchase.vo.paymentterms.ErpPaymentTermsPageReqVO;
import cn.iocoder.yudao.module.erp.controller.admin.purchase.vo.paymentterms.ErpPaymentTermsRespVO;
import cn.iocoder.yudao.module.erp.controller.admin.purchase.vo.paymentterms.ErpPaymentTermsSaveReqVO;
import cn.iocoder.yudao.module.erp.dal.dataobject.purchase.ErpPaymentTermsDO;
import jakarta.validation.*;
import cn.iocoder.yudao.framework.common.pojo.PageResult;

import java.util.List;


/**
 * 付款条款管理 Service 接口
 *
 * @author 王奇辉
 */
public interface ErpPaymentTermsService {

    /**
     * 创建付款条款管理
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createPaymentTerms(@Valid ErpPaymentTermsSaveReqVO createReqVO);

    /**
     * 更新付款条款管理
     *
     * @param updateReqVO 更新信息
     */
    void updatePaymentTerms(@Valid ErpPaymentTermsSaveReqVO updateReqVO);

    /**
     * 删除付款条款管理
     *
     * @param id 编号
     */
    void deletePaymentTerms(Long id);

    /**
     * 获得付款条款管理
     *
     * @param id 编号
     * @return 付款条款管理
     */
    ErpPaymentTermsDO getPaymentTerms(Long id);

    /**
     * 获得付款条款管理分页
     *
     * @param pageReqVO 分页查询
     * @return 付款条款管理分页
     */
    PageResult<ErpPaymentTermsDO> getPaymentTermsPage(ErpPaymentTermsPageReqVO pageReqVO);

    /**
    * @Author Wqh
    * @Description 获得产品精简列表
    * @Date 11:07 2024/11/12
    * @return java.util.List<cn.iocoder.yudao.module.erp.controller.admin.purchase.vo.paymentterms.ErpPaymentTermsRespVO>
    **/
    List<ErpPaymentTermsRespVO> getPaymentTermsVOListByStatus();
}