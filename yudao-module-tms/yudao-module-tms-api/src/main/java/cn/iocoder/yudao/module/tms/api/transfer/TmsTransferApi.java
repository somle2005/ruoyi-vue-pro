package cn.iocoder.yudao.module.tms.api.transfer;

import cn.iocoder.yudao.module.tms.api.transfer.dto.TmsOutboundReqDTO;
import org.springframework.validation.annotation.Validated;

/**
 * 调拨单API
 */
@Validated
public interface TmsTransferApi {

    /**
     * 出库单审核后回调
     * <p>
     * 1:1:1 调拨单:出库单:入库单 , 忽略子项数量差异
     *
     * @param reqDTO 出库单信息
     */
    void afterOutboundAudit(TmsOutboundReqDTO reqDTO);
}
