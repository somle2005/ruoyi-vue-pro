package cn.iocoder.yudao.module.wms.enums.api.inbound;

import cn.iocoder.yudao.module.wms.enums.api.inbound.dto.WmsInboundSaveReqDTO;

/**
 * @author: LeeFJ
 * @date: 2025/4/28 17:03
 * @description: 入库单 API
 */
public interface WmsInboundApi {

    /**
     * 创建入库单
     *
     * @param createReqDTO 入库单创建请求
     * @return 入库单ID
     */
    Long createInbound(WmsInboundSaveReqDTO createReqDTO);

}
