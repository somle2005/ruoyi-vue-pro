package cn.iocoder.yudao.module.erp.service.sale;

import java.util.*;

import cn.iocoder.yudao.module.erp.controller.admin.sale.vo.channel.ErpChannelListReqVO;
import cn.iocoder.yudao.module.erp.controller.admin.sale.vo.channel.ErpChannelPageReqVO;
import cn.iocoder.yudao.module.erp.controller.admin.sale.vo.channel.ErpChannelSaveReqVO;
import cn.iocoder.yudao.module.erp.dal.dataobject.sale.ErpChannelDO;
import jakarta.validation.*;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;

/**
 * ERP 渠道 Service 接口
 *
 * @author 王奇辉
 */
public interface ErpChannelService {

    /**
     * 创建ERP 渠道
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createChannel(@Valid ErpChannelSaveReqVO createReqVO);

    /**
     * 更新ERP 渠道
     *
     * @param updateReqVO 更新信息
     */
    void updateChannel(@Valid ErpChannelSaveReqVO updateReqVO);

    /**
     * 删除ERP 渠道
     *
     * @param id 编号
     */
    void deleteChannel(Long id);

    /**
     * 获得ERP 渠道
     *
     * @param id 编号
     * @return ERP 渠道
     */
    ErpChannelDO getChannel(Long id);


    /**
    * @Author Wqh
    * @Description 获取渠道精简信息列表
    * @Date 14:07 2024/11/6
    * @Param [erpChannelListReqVO]
    * @return java.util.List<cn.iocoder.yudao.module.erp.dal.dataobject.sale.ErpChannelDO>
    **/
    List<ErpChannelDO> getChannelList(ErpChannelListReqVO erpChannelListReqVO);
}