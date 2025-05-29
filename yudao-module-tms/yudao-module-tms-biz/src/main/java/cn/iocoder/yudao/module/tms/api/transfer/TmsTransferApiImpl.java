package cn.iocoder.yudao.module.tms.api.transfer;

import cn.hutool.core.util.StrUtil;
import cn.iocoder.yudao.module.system.enums.somle.BillType;
import cn.iocoder.yudao.module.tms.api.transfer.dto.TmsOutboundItemReqDTO;
import cn.iocoder.yudao.module.tms.api.transfer.dto.TmsOutboundReqDTO;
import cn.iocoder.yudao.module.tms.api.transfer.dto.TmsTransferStatusUpdateDTO;
import cn.iocoder.yudao.module.tms.dal.dataobject.transfer.item.TmsTransferItemDO;
import cn.iocoder.yudao.module.tms.dal.mysql.transfer.TmsTransferMapper;
import cn.iocoder.yudao.module.tms.service.bo.transfer.TmsTransferBO;
import cn.iocoder.yudao.module.tms.service.transfer.TmsTransferService;
import cn.iocoder.yudao.module.tms.service.transfer.item.TmsTransferItemService;
import cn.iocoder.yudao.module.wms.api.inbound.WmsInboundApi;
import cn.iocoder.yudao.module.wms.api.inbound.dto.WmsInboundItemSaveReqDTO;
import cn.iocoder.yudao.module.wms.api.inbound.dto.WmsInboundSaveReqDTO;
import cn.iocoder.yudao.module.wms.enums.inbound.WmsInboundType;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 调拨单 API 实现类
 */
@Service
@Slf4j
public class TmsTransferApiImpl implements TmsTransferApi {

    @Resource
    private TmsTransferService transferService;

    @Autowired
    private TmsTransferMapper transferMapper;

    @Resource
    private TmsTransferItemService transferItemService;

    @Resource
    private WmsInboundApi wmsInboundApi;

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
        transferService.updateTransferStatus(new TmsTransferStatusUpdateDTO()
            .setId(items.get(0).getTransferId())
            .setOutboundTime(reqDTO.getOutboundTime())
            .setOutboundStatus(reqDTO.getOutboundStatus())
            .setOutboundId(reqDTO.getId())
            .setOutboundCode(reqDTO.getCode())
        );
        //3.1 填充子项的出库明细数值
        for (TmsOutboundItemReqDTO outboundItem : reqDTO.getItems()) {
            transferItemService.updateTransferItemOutbound(
                outboundItem.getUpstreamItemId(),
                outboundItem.getActualQty().intValue()
            );
        }

        //4.0 创建对应入库单
        createInbound(reqDTO);
    }

    /**
     * 创建入库单
     *
     * @param reqDTO 出库单请求DTO
     */
    private void createInbound(TmsOutboundReqDTO reqDTO) {
        TmsTransferBO transferBO = transferService.getTransferBO(reqDTO.getId());
        //仓库to ,提交过去->入库单待审核,等待回调
        Long inbound = wmsInboundApi.createInbound(
            WmsInboundSaveReqDTO.builder()
                .type(WmsInboundType.TRANSFER.getValue())
                .upstreamBillType(BillType.TMS_TRANSFER.getValue())
                .upstreamBillId(transferBO.getId())
                .upstreamBillCode(transferBO.getCode())
                .warehouseId(transferBO.getToWarehouseId())
                //TODO 主单是否有库存公司
//                .companyId(transferBO.getCompanyId())
//                .deptId(transferBO.getDeptId())
                .arrivalPlanTime(reqDTO.getOutboundTime())
                .itemList(transferBO.getTmsTransferItemDOList().stream()
                    .map(item -> WmsInboundItemSaveReqDTO.builder()
                        .productId(item.getProductId())
                        .planQty(item.getQty())
//                        .deptId(item.getDeptId())
                        .companyId(item.getStockCompanyId())
                        .remark(item.getRemark())
                        .upstreamItemId(item.getId())
                        .build())
                    .collect(Collectors.toList()))
                .build()
        );
        log.info("调拨单[{}]出库审核通过，创建入库单，ID: {}", transferBO.getCode(), inbound);
    }
} 