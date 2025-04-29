package cn.iocoder.yudao.module.wms.api.inbound;

import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.wms.enums.api.inbound.dto.WmsInboundSaveReqDTO;
import cn.iocoder.yudao.module.wms.controller.admin.inbound.vo.WmsInboundSaveReqVO;
import cn.iocoder.yudao.module.wms.dal.dataobject.inbound.WmsInboundDO;
import cn.iocoder.yudao.module.wms.enums.api.inbound.WmsInboundApi;
import cn.iocoder.yudao.module.wms.service.inbound.WmsInboundService;
import jakarta.annotation.Resource;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * @author: LeeFJ
 * @date: 2025/4/28 17:03
 * @description: 入库单 API 实现
 */
@Service
public class WmsInboundApiImpl implements WmsInboundApi {

    @Resource
    @Lazy
    private WmsInboundService inboundService;

    public Long createInbound(WmsInboundSaveReqDTO createReqDTO) {
        WmsInboundSaveReqVO createReqVO = BeanUtils.toBean(createReqDTO, WmsInboundSaveReqVO.class);
        WmsInboundDO inbound = inboundService.createInbound(createReqVO);
        return inbound.getId();
    }

}
