package cn.iocoder.yudao.module.tms.api.transfer;

import cn.iocoder.yudao.module.tms.api.transfer.dto.TmsOutboundReqDTO;
import org.springframework.validation.annotation.Validated;

/**
 * 调拨单API
 */
@Validated
public interface TmsTransferApi {

    /**
     * 1.0 出库单审核后回调
     * <p>
     * 1:1:1 调拨单:出库单:入库单
     *
     * @param reqDTO 出库单信息
     */
    void afterOutboundAudit(TmsOutboundReqDTO reqDTO);

    /**
     * 2.0 入库单审核后回调
     *
     */
//    void afterInboundAudit(TmsInboundReqDTO reqDTO);
}
