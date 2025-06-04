package cn.iocoder.yudao.module.wms.service.outbound.transition;


import cn.iocoder.yudao.framework.cola.statemachine.builder.TransitionContext;
import cn.iocoder.yudao.module.system.enums.somle.BillType;
import cn.iocoder.yudao.module.wms.controller.admin.inbound.item.vo.WmsInboundItemSaveReqVO;
import cn.iocoder.yudao.module.wms.controller.admin.inbound.vo.WmsInboundSaveReqVO;
import cn.iocoder.yudao.module.wms.dal.dataobject.outbound.WmsOutboundDO;
import cn.iocoder.yudao.module.wms.dal.dataobject.outbound.item.WmsOutboundItemDO;
import cn.iocoder.yudao.module.wms.enums.inbound.WmsInboundType;
import cn.iocoder.yudao.module.wms.enums.outbound.WmsOutboundAuditStatus;
import cn.iocoder.yudao.module.wms.service.inbound.WmsInboundService;
import cn.iocoder.yudao.module.wms.service.outbound.item.WmsOutboundItemService;
import cn.iocoder.yudao.module.wms.service.quantity.OutboundFinishExecutor;
import cn.iocoder.yudao.module.wms.service.quantity.context.OutboundContext;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


/**
 * @author: LeeFJ
 * @date: 2025/3/31 16:26
 * @description: 执行出库
 */
@Component
public class OutboundFinishTransitionHandler extends BaseOutboundTransitionHandler {

    @Resource
    private OutboundFinishExecutor outboundFinishExecutor;

    @Resource
    private WmsInboundService inboundService;

    @Resource
    private WmsOutboundItemService outboundItemService;


    @Override
    public void perform(Integer from, Integer to, WmsOutboundAuditStatus.Event event, TransitionContext<WmsOutboundDO> context) {
        super.perform(from, to, event, context);
        // 调整库存
        OutboundContext outboundContext = new OutboundContext();
        outboundContext.setOutboundId(context.data().getId());
        outboundFinishExecutor.execute(outboundContext);


        WmsOutboundDO outboundDO = context.data();
        List<WmsOutboundItemDO> outboundItemDOS = outboundItemService.selectByOutboundId(outboundDO.getId());

        BillType billType = BillType.parse(context.data().getUpstreamType());
        // 如果源单是调拨单，生成目标仓库的入库单
         if(billType==BillType.TMS_TRANSFER) {

            WmsInboundSaveReqVO inboundSaveReqVO = new WmsInboundSaveReqVO();

            List<WmsInboundItemSaveReqVO> inboundItemSaveReqVOList = new ArrayList<>();
            for (WmsOutboundItemDO outboundItemDO : outboundItemDOS) {
                WmsInboundItemSaveReqVO inboundItemSaveReqVO = new WmsInboundItemSaveReqVO();
                inboundItemSaveReqVO.setProductId(outboundItemDO.getProductId());
                inboundItemSaveReqVO.setPlanQty(outboundItemDO.getActualQty());
                inboundItemSaveReqVO.setActualQty(outboundItemDO.getActualQty());
                inboundItemSaveReqVO.setUpstreamId(outboundItemDO.getId());
                inboundItemSaveReqVOList.add(inboundItemSaveReqVO);

            }

            // 设置出库单的目标仓库
            inboundSaveReqVO.setWarehouseId(43L);

            inboundSaveReqVO.setItemList(inboundItemSaveReqVOList);
             inboundSaveReqVO.setUpstreamId(outboundDO.getId());
             inboundSaveReqVO.setUpstreamCode(outboundDO.getCode());
             inboundSaveReqVO.setUpstreamType(BillType.WMS_OUTBOUND.getValue());

            inboundSaveReqVO.setType(WmsInboundType.TRANSFER.getValue());

            inboundService.createForTransfer(inboundSaveReqVO);
        }

     }
}
