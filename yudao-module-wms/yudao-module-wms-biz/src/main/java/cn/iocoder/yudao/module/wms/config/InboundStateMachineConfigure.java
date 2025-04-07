package cn.iocoder.yudao.module.wms.config;

import cn.iocoder.yudao.framework.cola.statemachine.StateMachine;
import cn.iocoder.yudao.framework.cola.statemachine.builder.StateMachineBuilder;
import cn.iocoder.yudao.framework.cola.statemachine.builder.StateMachineBuilderFactory;
import cn.iocoder.yudao.framework.cola.statemachine.builder.TransitionContext;
import cn.iocoder.yudao.module.wms.dal.dataobject.inbound.WmsInboundDO;
import cn.iocoder.yudao.module.wms.enums.inbound.WmsInboundAuditStatus;
import cn.iocoder.yudao.module.wms.service.inbound.transition.InboundAbandonTransitionHandler;
import cn.iocoder.yudao.module.wms.service.inbound.transition.InboundAgreeTransitionHandler;
import cn.iocoder.yudao.module.wms.service.inbound.transition.InboundForceFinishTransitionHandler;
import cn.iocoder.yudao.module.wms.service.inbound.transition.InboundRejectTransitionHandler;
import cn.iocoder.yudao.module.wms.service.inbound.transition.InboundSubmitTransitionHandler;
import cn.iocoder.yudao.module.wms.service.inbound.transition.InboundTransitionFailCallback;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: LeeFJ
 * @date: 2025/3/19 10:00
 * @description: 入库单状态机与动作配置
 */
@Slf4j
@Configuration
public class InboundStateMachineConfigure {

    /**
     * 状态机名称
     **/
    public static final String STATE_MACHINE_NAME = "inboundActionStateMachine";

    /**
     * 创建与配置状态机
     **/
    @Bean(InboundStateMachineConfigure.STATE_MACHINE_NAME)
    public StateMachine<Integer, WmsInboundAuditStatus.Event, TransitionContext<WmsInboundDO>> inboundActionStateMachine() {

        StateMachineBuilder<Integer, WmsInboundAuditStatus.Event, TransitionContext<WmsInboundDO>> builder = StateMachineBuilderFactory.create();

        // 提交
        builder.externalTransitions()
            .fromAmong(WmsInboundAuditStatus.DRAFT.getValue(),WmsInboundAuditStatus.REJECT.getValue())
            .to( WmsInboundAuditStatus.AUDITING.getValue())
            .on(WmsInboundAuditStatus.Event.SUBMIT)
            .handle(InboundSubmitTransitionHandler.class);

        // 废弃
        builder.externalTransitions()
            .fromAmong(WmsInboundAuditStatus.DRAFT.getValue(),WmsInboundAuditStatus.REJECT.getValue(),WmsInboundAuditStatus.AUDITING.getValue())
            .to( WmsInboundAuditStatus.ABANDONED.getValue())
            .on(WmsInboundAuditStatus.Event.REJECT)
            .handle(InboundAbandonTransitionHandler.class);

        // 同意
        builder.externalTransitions()
            .fromAmong(WmsInboundAuditStatus.AUDITING.getValue())
            .to(WmsInboundAuditStatus.PASS.getValue())
            .on(WmsInboundAuditStatus.Event.AGREE)
            .handle(InboundAgreeTransitionHandler.class);

        // 强制结束
        builder.externalTransitions()
            .fromAmong(WmsInboundAuditStatus.AUDITING.getValue())
            .to(WmsInboundAuditStatus.FORCE_FINISHED.getValue())
            .on(WmsInboundAuditStatus.Event.FORCE_FINISH)
            .handle(InboundForceFinishTransitionHandler.class);

        // 拒绝
        builder.externalTransitions()
            .fromAmong(WmsInboundAuditStatus.AUDITING.getValue())
            .to(WmsInboundAuditStatus.REJECT.getValue())
            .on(WmsInboundAuditStatus.Event.REJECT)
            .handle(InboundRejectTransitionHandler.class);

        // 错误处理
        builder.setFailCallback(InboundTransitionFailCallback.class);

        // 返回
        return builder.build(InboundStateMachineConfigure.STATE_MACHINE_NAME);

    }


}
