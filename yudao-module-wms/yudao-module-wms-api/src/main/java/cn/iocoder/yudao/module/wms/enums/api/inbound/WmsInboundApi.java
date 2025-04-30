package cn.iocoder.yudao.module.wms.enums.api.inbound;

import cn.iocoder.yudao.module.wms.enums.api.inbound.dto.WmsInboundDTO;
import cn.iocoder.yudao.module.wms.enums.api.inbound.dto.WmsInboundSaveReqDTO;

import java.util.List;

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

    /**
     * 按 ID 查询入库单
     *
     * @param id 入库单更新请求
     * @return WmsInboundDTO
     */
    WmsInboundDTO getInbound(Long id);

    /**
     * 按 上游单据类型 和 上游单据ID 查询入库单
     *
     * @param upstreamBillType 入库单类型
     * @param upstreamBillId 上游单号
     * @return WmsInboundDTO
     */
    List<WmsInboundDTO> getInboundList(Integer upstreamBillType, Long upstreamBillId);

}
