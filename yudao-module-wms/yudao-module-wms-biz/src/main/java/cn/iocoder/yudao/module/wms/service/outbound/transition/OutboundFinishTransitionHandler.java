package cn.iocoder.yudao.module.wms.service.outbound.transition;


import cn.iocoder.yudao.framework.cola.statemachine.builder.TransitionContext;
import cn.iocoder.yudao.module.system.enums.somle.BillType;
import cn.iocoder.yudao.module.wms.controller.admin.inbound.vo.WmsInboundSaveReqVO;
import cn.iocoder.yudao.module.wms.dal.dataobject.outbound.WmsOutboundDO;
import cn.iocoder.yudao.module.wms.enums.outbound.WmsOutboundAuditStatus;
import cn.iocoder.yudao.module.wms.service.inbound.WmsInboundService;
import cn.iocoder.yudao.module.wms.service.quantity.OutboundFinishExecutor;
import cn.iocoder.yudao.module.wms.service.quantity.context.OutboundContext;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;


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


    @Override
    public void perform(Integer from, Integer to, WmsOutboundAuditStatus.Event event, TransitionContext<WmsOutboundDO> context) {
        super.perform(from, to, event, context);
        // 调整库存
        OutboundContext outboundContext = new OutboundContext();
        outboundContext.setOutboundId(context.data().getId());
        outboundFinishExecutor.execute(outboundContext);



        BillType billType = BillType.parse(context.data().getUpstreamBillType());
        // 如果源单是调拨单，生成目标仓库的入库单
        if(billType==BillType.TMS_TRANSFER) {

            WmsInboundSaveReqVO inboundSaveReqVO = new WmsInboundSaveReqVO();

            // TODO


            inboundService.createForTransfer(inboundSaveReqVO);
        }

    }
}
