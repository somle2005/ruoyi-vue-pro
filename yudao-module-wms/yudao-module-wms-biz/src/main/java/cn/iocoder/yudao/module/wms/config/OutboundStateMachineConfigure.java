package cn.iocoder.yudao.module.wms.config;

import cn.iocoder.yudao.framework.cola.statemachine.StateMachine;
import cn.iocoder.yudao.framework.cola.statemachine.builder.StateMachineBuilder;
import cn.iocoder.yudao.framework.cola.statemachine.builder.StateMachineBuilderFactory;
import cn.iocoder.yudao.framework.cola.statemachine.builder.TransitionContext;
import cn.iocoder.yudao.module.wms.dal.dataobject.outbound.WmsOutboundDO;
import cn.iocoder.yudao.module.wms.enums.outbound.WmsOutboundAuditStatus;
import cn.iocoder.yudao.module.wms.service.outbound.transition.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author: LeeFJ
 * @date: 2025/3/19 10:00
 * @description: 出库单状态机与动作配置
 */
@Slf4j
@Configuration
public class OutboundStateMachineConfigure {

    /**
     * 状态机名称
     **/
    public static final String STATE_MACHINE_NAME = "outboundActionStateMachine";
    /**
     * 创建与配置状态机
     **/
    @Bean(OutboundStateMachineConfigure.STATE_MACHINE_NAME)
    public StateMachine<Integer, WmsOutboundAuditStatus.Event, TransitionContext<WmsOutboundDO>> inboundActionStateMachine() {

        StateMachineBuilder<Integer, WmsOutboundAuditStatus.Event, TransitionContext<WmsOutboundDO>> builder = StateMachineBuilderFactory.create();

        // 提交
        builder.externalTransitions()
            .fromAmong(WmsOutboundAuditStatus.DRAFT.getValue(), WmsOutboundAuditStatus.REJECT.getValue())
            .to(WmsOutboundAuditStatus.AUDITING.getValue())
            .on(WmsOutboundAuditStatus.Event.SUBMIT)
            .handle(OutboundSubmitTransitionHandler.class);

        // 同意
        builder.externalTransition()
            .from(WmsOutboundAuditStatus.AUDITING.getValue())
            .to(WmsOutboundAuditStatus.PASS.getValue())
            .on(WmsOutboundAuditStatus.Event.AGREE)
            .handle(OutboundAgreeTransitionHandler.class);

        // 拒绝
        builder.externalTransition()
            .from(WmsOutboundAuditStatus.AUDITING.getValue())
            .to(WmsOutboundAuditStatus.REJECT.getValue())
            .on(WmsOutboundAuditStatus.Event.REJECT)
            .handle(OutboundRejectTransitionHandler.class);

        // 执行
        builder.externalTransition()
            .from(WmsOutboundAuditStatus.PASS.getValue())
            .to(WmsOutboundAuditStatus.FINISHED.getValue())
            .on(WmsOutboundAuditStatus.Event.FINISH)
            .handle(OutboundExecuteTransitionHandler.class);


        // 失败处理
        builder.setFailCallback(OutboundTransitionFailCallback.class);

        return builder.build(OutboundStateMachineConfigure.STATE_MACHINE_NAME);


    }



}
