package cn.iocoder.yudao.module.wms.service.inbound.transition;


import cn.iocoder.yudao.framework.cola.statemachine.builder.TransitionContext;
import cn.iocoder.yudao.module.wms.dal.dataobject.inbound.WmsInboundDO;
import cn.iocoder.yudao.module.wms.enums.inbound.WmsInboundStatus;
import cn.iocoder.yudao.module.wms.service.quantity.InboundExecutor;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.wms.enums.WmsErrorCodeConstants.INBOUND_FORCE_FINISH_NOT_ALLOWED;


/**
 * @author: LeeFJ
 * @date: 2025/3/31 16:14
 * @description: 强制完成
 */

@Component
public class InboundForceFinishTransitionHandler extends BaseInboundTransitionHandler {

    @Resource
    private InboundExecutor inboundExecutor;
    @Override
    public boolean when(TransitionContext<WmsInboundDO> context) {
        WmsInboundStatus inboundStatus = WmsInboundStatus.parse(context.data().getInboundStatus());
        assert inboundStatus != null;
        if(inboundStatus.matchAny(WmsInboundStatus.PART)) {
            throw exception(INBOUND_FORCE_FINISH_NOT_ALLOWED);
        }
        //更新【仓库库存】在途数: 在途数 = 0
        inboundExecutor.updateTransitQty(inbound);
        return super.when(context);
    }
}