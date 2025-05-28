package cn.iocoder.yudao.module.tms.api.transfer;

import cn.hutool.core.util.StrUtil;
import cn.iocoder.yudao.module.system.enums.somle.BillType;
import cn.iocoder.yudao.module.tms.api.transfer.dto.TmsOutboundItemReqDTO;
import cn.iocoder.yudao.module.tms.api.transfer.dto.TmsOutboundReqDTO;
import cn.iocoder.yudao.module.tms.dal.dataobject.transfer.TmsTransferDO;
import cn.iocoder.yudao.module.tms.dal.dataobject.transfer.item.TmsTransferItemDO;
import cn.iocoder.yudao.module.tms.dal.mysql.transfer.TmsTransferMapper;
import cn.iocoder.yudao.module.tms.service.transfer.TmsTransferService;
import cn.iocoder.yudao.module.tms.service.transfer.item.TmsTransferItemService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

/**
 * 调拨单 API 实现类
 */
@Service
public class TmsTransferApiImpl implements TmsTransferApi {

    @Resource
    private TmsTransferService transferService;

    @Autowired
    private TmsTransferMapper transferMapper;

    @Resource
    private TmsTransferItemService transferItemService;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void afterOutboundAudit(TmsOutboundReqDTO reqDTO) {
        // 1.0 校验上游类型是否是调拨出库
        if (!Objects.equals(reqDTO.getUpstreamBillType(), BillType.TMS_TRANSFER.getValue())) {
            throw new IllegalArgumentException(StrUtil.format("出库单审核回调TmsOutboundReqDTO，上游类型({})不是调拨单", Objects.requireNonNull(BillType.parse(reqDTO.getUpstreamBillType())).getLabel()));
        }

        // 2.0 校验reqDTO的items的upstreamItemId是否存在
        List<Long> itemIds = reqDTO.getItems().stream()
            .map(TmsOutboundItemReqDTO::getUpstreamItemId)
            .toList();
        List<TmsTransferItemDO> items = transferItemService.validateTransferItemExists(itemIds);

        // 3.0 获取主单并更新出库时间、出库状态、出库单ID、出库单编码
        TmsTransferDO transfer = transferService.getTransfer(items.get(0).getTransferId());
        transfer.setOutboundTime(reqDTO.getOutboundTime());
        transfer.setOutboundStatus(reqDTO.getOutboundStatus());
        transfer.setOutboundId(reqDTO.getId());
        transfer.setOutboundCode(reqDTO.getCode());
        transferMapper.updateById(transfer);
    }
} 