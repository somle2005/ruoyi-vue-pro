package cn.iocoder.yudao.module.wms.enums.api.outbound;

import cn.iocoder.yudao.module.wms.enums.api.outbound.dto.WmsOutboundSaveReqDTO;

/**
 * @author: LeeFJ
 * @date: 2025/4/28 17:03
 * @description: 出库单 API
 */
public interface WmsOutboundApi {

    /**
     * 创建出库单
     *
     * @param createReqDTO 出库单创建请求
     * @return 出库单ID
     */
    Long createOutbound(WmsOutboundSaveReqDTO createReqDTO);

    /**
     * 根据原单类型+ID查询对应出库单
     */
}
