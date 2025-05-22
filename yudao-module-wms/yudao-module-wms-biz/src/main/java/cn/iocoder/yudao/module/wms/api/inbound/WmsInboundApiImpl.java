package cn.iocoder.yudao.module.wms.api.inbound;

import cn.iocoder.yudao.framework.cola.statemachine.StateMachine;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.srm.api.purchase.machine.inItem.SrmPurchaseInItemCountDTO;
import cn.iocoder.yudao.module.srm.enums.SrmEventEnum;
import cn.iocoder.yudao.module.srm.enums.SrmStateMachines;
import cn.iocoder.yudao.module.srm.enums.status.SrmStorageStatus;
import cn.iocoder.yudao.module.system.enums.somle.BillType;
import cn.iocoder.yudao.module.wms.api.inbound.dto.WmsInboundDTO;
import cn.iocoder.yudao.module.wms.api.inbound.dto.WmsInboundSaveReqDTO;
import cn.iocoder.yudao.module.wms.controller.admin.approval.history.vo.WmsApprovalReqVO;
import cn.iocoder.yudao.module.wms.controller.admin.inbound.vo.WmsInboundSaveReqVO;
import cn.iocoder.yudao.module.wms.dal.dataobject.inbound.WmsInboundDO;
import cn.iocoder.yudao.module.wms.dal.dataobject.inbound.item.WmsInboundItemDO;
import cn.iocoder.yudao.module.wms.enums.inbound.WmsInboundAuditStatus;
import cn.iocoder.yudao.module.wms.service.inbound.WmsInboundService;
import cn.iocoder.yudao.module.wms.service.inbound.item.WmsInboundItemService;
import jakarta.annotation.Resource;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

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
    @Resource(name = SrmStateMachines.PURCHASE_IN_ITEM_STORAGE_STATE_MACHINE)
    StateMachine<SrmStorageStatus, SrmEventEnum, SrmPurchaseInItemCountDTO> purchaseInCountDTOStateMachine;
    @Resource
    @Lazy
    WmsInboundItemService wmsInboundItemService;

    public Long createInbound(WmsInboundSaveReqDTO createReqDTO) {
        WmsInboundSaveReqVO createReqVO = BeanUtils.toBean(createReqDTO, WmsInboundSaveReqVO.class);
        WmsInboundDO inbound = inboundService.createInbound(createReqVO);
        //处理到货单逻辑
        if (createReqDTO.getUpstreamBillType() != null && createReqDTO.getUpstreamBillType().equals(BillType.SRM_PURCHASE_IN.getValue())) {
            //触发到货单明细行 状态机
            //如果成功创建入库单-触发SRM入库数量联动
            createReqDTO.getItemList().forEach(inItem -> purchaseInCountDTOStateMachine.fireEvent(SrmStorageStatus.NONE_IN_STORAGE
                    , SrmEventEnum.STOCK_ADJUSTMENT
                    , SrmPurchaseInItemCountDTO.builder().inItemId(inItem.getUpstreamItemId()).inCount(BigDecimal.valueOf(inItem.getPlanQty())).build()));

        }
        //处理xx单逻辑
        return inbound.getId();
    }

    public WmsInboundDTO getInbound(Long id) {
        WmsInboundDO inbound = inboundService.getInbound(id);
        return BeanUtils.toBean(inbound, WmsInboundDTO.class);
    }

    public List<WmsInboundDTO> getInboundList(Integer upstreamBillType, Long upstreamBillId) {
        List<WmsInboundDO> inboundList = inboundService.getInboundList(upstreamBillType, upstreamBillId);
        return BeanUtils.toBean(inboundList, WmsInboundDTO.class);
    }

    /**
     * 作废入库单
     * @param id 入库单ID
     * @param comment 作废原因
     * @param billType 单据类型
     **/
    public void abandonInbound(Long id, String comment, Integer billType) {
        WmsApprovalReqVO approvalReqVO = new WmsApprovalReqVO();
        approvalReqVO.setBillId(id);
        approvalReqVO.setComment(comment);
        inboundService.approve(WmsInboundAuditStatus.Event.ABANDON, approvalReqVO);
        //处理到货单逻辑
        if (billType != null && billType.equals(BillType.SRM_PURCHASE_IN.getValue())) {
            //触发到货单明细行-入库-状态机
            this.getInboundList(billType, id).forEach(inbound -> {
                WmsInboundItemDO inboundItem = wmsInboundItemService.getInboundItem(inbound.getId());
                purchaseInCountDTOStateMachine.fireEvent(
                        SrmStorageStatus.PARTIALLY_IN_STORAGE,
                        SrmEventEnum.STOCK_ADJUSTMENT,
                        SrmPurchaseInItemCountDTO.builder().inItemId(inbound.getUpstreamBillId()).inCount(BigDecimal.valueOf(inboundItem.getPlanQty())).build()
                );
            });

        }

    }

}
