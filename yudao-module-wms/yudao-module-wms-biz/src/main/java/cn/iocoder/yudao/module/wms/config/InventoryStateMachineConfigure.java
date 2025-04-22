package cn.iocoder.yudao.module.wms.config;

import cn.iocoder.yudao.framework.cola.statemachine.StateMachine;
import cn.iocoder.yudao.framework.cola.statemachine.builder.StateMachineBuilder;
import cn.iocoder.yudao.framework.cola.statemachine.builder.StateMachineBuilderFactory;
import cn.iocoder.yudao.framework.cola.statemachine.builder.TransitionContext;
import cn.iocoder.yudao.module.wms.dal.dataobject.inventory.WmsInventoryDO;
import cn.iocoder.yudao.module.wms.enums.inventory.WmsInventoryAuditStatus;
import cn.iocoder.yudao.module.wms.service.inventory.transition.InventoryAbandonTransitionHandler;
import cn.iocoder.yudao.module.wms.service.inventory.transition.InventoryAgreeTransitionHandler;
import cn.iocoder.yudao.module.wms.service.inventory.transition.InventoryRejectTransitionHandler;
import cn.iocoder.yudao.module.wms.service.inventory.transition.InventorySubmitTransitionHandler;
import cn.iocoder.yudao.module.wms.service.inventory.transition.InventoryTransitionFailCallback;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author: LeeFJ
 * @date: 2025/3/19 10:00
 * @description: 盘点单状态机与动作配置
 */
@Slf4j
@Configuration
public class InventoryStateMachineConfigure {

    /**
     * 状态机名称
     **/
    public static final String STATE_MACHINE_NAME = "inventoryStateMachine";

    /**
     * 创建与配置状态机
     **/
    @Bean(InventoryStateMachineConfigure.STATE_MACHINE_NAME)
    public StateMachine<Integer, WmsInventoryAuditStatus.Event, TransitionContext<WmsInventoryDO>> inventoryStateMachine() {

        StateMachineBuilder<Integer, WmsInventoryAuditStatus.Event, TransitionContext<WmsInventoryDO>> builder = StateMachineBuilderFactory.create();

        // 提交
        builder.externalTransitions()
            .fromAmong(WmsInventoryAuditStatus.DRAFT.getValue(), WmsInventoryAuditStatus.REJECT.getValue())
            .to(WmsInventoryAuditStatus.AUDITING.getValue())
            .on(WmsInventoryAuditStatus.Event.SUBMIT)
            .handle(InventorySubmitTransitionHandler.class);

        // 同意
        builder.externalTransition()
            .from(WmsInventoryAuditStatus.AUDITING.getValue())
            .to(WmsInventoryAuditStatus.PASS.getValue())
            .on(WmsInventoryAuditStatus.Event.AGREE)
            .handle(InventoryAgreeTransitionHandler.class);

        // 拒绝
        builder.externalTransition()
            .from(WmsInventoryAuditStatus.AUDITING.getValue())
            .to(WmsInventoryAuditStatus.REJECT.getValue())
            .on(WmsInventoryAuditStatus.Event.REJECT)
            .handle(InventoryRejectTransitionHandler.class);

        // 废弃
        builder.externalTransitions()
            .fromAmong(WmsInventoryAuditStatus.DRAFT.getValue(),WmsInventoryAuditStatus.REJECT.getValue(),WmsInventoryAuditStatus.AUDITING.getValue())
            .to( WmsInventoryAuditStatus.ABANDONED.getValue())
            .on(WmsInventoryAuditStatus.Event.ABANDON)
            .handle(InventoryAbandonTransitionHandler.class);

        // 失败处理
        builder.setFailCallback(InventoryTransitionFailCallback.class);

        return builder.build(InventoryStateMachineConfigure.STATE_MACHINE_NAME,ctx -> ctx.data().getAuditStatus());


    }




}
