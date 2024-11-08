package cn.iocoder.yudao.module.erp.service.sale;

import cn.iocoder.yudao.module.erp.controller.admin.sale.vo.channel.product.ErpChannelProductSaveReqVO;
import jakarta.validation.*;
import cn.iocoder.yudao.module.erp.controller.admin.sale.vo.channel.product.ErpChannelProductPageReqVO;
import cn.iocoder.yudao.module.erp.dal.dataobject.sale.ErpChannelProductDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;

/**
 * ERP 渠道平台产品 Service 接口
 *
 * @author 王奇辉
 */
public interface ErpChannelProductService {

    /**
     * 创建ERP 渠道平台产品
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createChannelProduct(@Valid ErpChannelProductSaveReqVO createReqVO);

    /**
     * 更新ERP 渠道平台产品
     *
     * @param updateReqVO 更新信息
     */
    void updateChannelProduct(@Valid ErpChannelProductSaveReqVO updateReqVO);

    /**
     * 删除ERP 渠道平台产品
     *
     * @param id 编号
     */
    void deleteChannelProduct(Long id);

    /**
     * 获得ERP 渠道平台产品
     *
     * @param id 编号
     * @return ERP 渠道平台产品
     */
    ErpChannelProductDO getChannelProduct(Long id);

    /**
     * 获得ERP 渠道平台产品分页
     *
     * @param pageReqVO 分页查询
     * @return ERP 渠道平台产品分页
     */
    PageResult<ErpChannelProductDO> getChannelProductPage(ErpChannelProductPageReqVO pageReqVO);

}