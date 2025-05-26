package cn.iocoder.yudao.module.srm.config.purchase.order;

import cn.iocoder.yudao.framework.cola.statemachine.Action;
import cn.iocoder.yudao.framework.cola.statemachine.StateMachine;
import cn.iocoder.yudao.framework.cola.statemachine.builder.StateMachineBuilder;
import cn.iocoder.yudao.framework.cola.statemachine.builder.StateMachineBuilderFactory;
import cn.iocoder.yudao.module.srm.api.purchase.machine.SrmOrderInCountDTO;
import cn.iocoder.yudao.module.srm.api.purchase.machine.SrmPayCountDTO;
import cn.iocoder.yudao.module.srm.config.BaseFailCallbackImpl;
import cn.iocoder.yudao.module.srm.dal.dataobject.purchase.SrmPurchaseOrderItemDO;
import cn.iocoder.yudao.module.srm.enums.SrmEventEnum;
import cn.iocoder.yudao.module.srm.enums.status.SrmExecutionStatus;
import cn.iocoder.yudao.module.srm.enums.status.SrmOffStatus;
import cn.iocoder.yudao.module.srm.enums.status.SrmPaymentStatus;
import cn.iocoder.yudao.module.srm.enums.status.SrmStorageStatus;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static cn.iocoder.yudao.module.srm.enums.SrmStateMachines.*;
import static cn.iocoder.yudao.module.srm.enums.status.SrmExecutionStatus.*;
import static cn.iocoder.yudao.module.srm.enums.status.SrmOffStatus.*;
import static cn.iocoder.yudao.module.srm.enums.status.SrmPaymentStatus.*;
import static cn.iocoder.yudao.module.srm.enums.status.SrmStorageStatus.*;

@Slf4j
@Configuration
@SuppressWarnings({"rawtypes", "unchecked"})
public class SrmPurchaseOrderItemStatusMachine {


    @Autowired
    private BaseFailCallbackImpl baseFailCallbackImpl;


    @Autowired
    Action<SrmExecutionStatus, SrmEventEnum, SrmPurchaseOrderItemDO> orderItemExecuteActionImpl;
    @Autowired
    Action<SrmStorageStatus, SrmEventEnum, SrmOrderInCountDTO> orderItemInActionImpl;
    @Autowired
    Action<SrmPaymentStatus, SrmEventEnum, SrmPayCountDTO> orderItemPayActionImpl;

    @Bean(PURCHASE_ORDER_ITEM_EXECUTION_STATE_MACHINE_NAME)
    public StateMachine<SrmExecutionStatus, SrmEventEnum, SrmPurchaseOrderItemDO> getPurchaseOrderItemExecutionStateMachine() {
        StateMachineBuilder<SrmExecutionStatus, SrmEventEnum, SrmPurchaseOrderItemDO> builder = StateMachineBuilderFactory.create();

        // 初始化待执行状态
        builder.internalTransition().within(PENDING).on(SrmEventEnum.EXECUTION_INIT).perform(orderItemExecuteActionImpl);

        // 开始执行
        builder.externalTransitions().fromAmong(PENDING, IN_PROGRESS).to(IN_PROGRESS).on(SrmEventEnum.START_EXECUTION).perform(orderItemExecuteActionImpl);

        // 执行完成
        builder.externalTransitions().fromAmong(PENDING, IN_PROGRESS, COMPLETED).to(COMPLETED).on(SrmEventEnum.COMPLETE_EXECUTION).perform(orderItemExecuteActionImpl);

        // 暂停执行
        builder.externalTransition().from(IN_PROGRESS).to(PAUSED).on(SrmEventEnum.PAUSE_EXECUTION).perform(orderItemExecuteActionImpl);

        // 恢复执行
        builder.externalTransition().from(PAUSED).to(IN_PROGRESS).on(SrmEventEnum.RESUME_EXECUTION).perform(orderItemExecuteActionImpl);

        // 取消执行
        builder.externalTransitions().fromAmong(PENDING, IN_PROGRESS, PAUSED).to(CANCELLED).on(SrmEventEnum.CANCEL_EXECUTION).perform(orderItemExecuteActionImpl);

        // 执行失败
        builder.externalTransition().from(IN_PROGRESS).to(FAILED).on(SrmEventEnum.EXECUTION_FAILED).perform(orderItemExecuteActionImpl);

        // 设置错误回调
        builder.setFailCallback(baseFailCallbackImpl);

        return builder.build(PURCHASE_ORDER_ITEM_EXECUTION_STATE_MACHINE_NAME);
    }

    @Autowired
    private Action<SrmOffStatus, SrmEventEnum, SrmPurchaseOrderItemDO> itemOffActionImpl;

    @Bean(PURCHASE_ORDER_ITEM_STORAGE_STATE_MACHINE_NAME)
    public StateMachine<SrmStorageStatus, SrmEventEnum, SrmOrderInCountDTO> buildPurchaseOrderItemStorageStateMachine() {
        StateMachineBuilder<SrmStorageStatus, SrmEventEnum, SrmOrderInCountDTO> builder = StateMachineBuilderFactory.create();

        // 初始化入库
        builder.externalTransition().from(NONE_IN_STORAGE).to(NONE_IN_STORAGE).on(SrmEventEnum.STORAGE_INIT).perform(orderItemInActionImpl);

        // 取消入库
        builder.externalTransitions().fromAmong(NONE_IN_STORAGE, PARTIALLY_IN_STORAGE).to(NONE_IN_STORAGE).on(SrmEventEnum.CANCEL_STORAGE).perform(orderItemInActionImpl);

        // 库存调整
        builder.externalTransitions().fromAmong(NONE_IN_STORAGE, PARTIALLY_IN_STORAGE, ALL_IN_STORAGE).to(NONE_IN_STORAGE).on(SrmEventEnum.STOCK_ADJUSTMENT).perform(orderItemInActionImpl);

        // 设置错误回调
        builder.setFailCallback(baseFailCallbackImpl);

        return builder.build(PURCHASE_ORDER_ITEM_STORAGE_STATE_MACHINE_NAME);
    }

    //采购订单子项状态机
    @Bean(PURCHASE_ORDER_ITEM_OFF_STATE_MACHINE_NAME)
    public StateMachine<SrmOffStatus, SrmEventEnum, SrmPurchaseOrderItemDO> getPurchaseOrderItemStateMachine() {
        StateMachineBuilder<SrmOffStatus, SrmEventEnum, SrmPurchaseOrderItemDO> builder = StateMachineBuilderFactory.create();
        // 初始化状态
        builder.internalTransition().within(OPEN).on(SrmEventEnum.OFF_INIT).perform(itemOffActionImpl);
        // 开启
        builder.externalTransition().from(MANUAL_CLOSED).to(OPEN).on(SrmEventEnum.ACTIVATE).perform(itemOffActionImpl);
        // 手动关闭
        builder.externalTransition().from(OPEN).to(MANUAL_CLOSED).on(SrmEventEnum.MANUAL_CLOSE).perform(itemOffActionImpl);
        //自动关闭
        builder.externalTransition().from(OPEN).to(CLOSED).on(SrmEventEnum.AUTO_CLOSE).perform(itemOffActionImpl);
        //关闭撤销
        builder.externalTransitions().fromAmong(MANUAL_CLOSED, CLOSED, OPEN).to(OPEN).on(SrmEventEnum.CANCEL_DELETE).perform(itemOffActionImpl);
        //错误回调函数
        builder.setFailCallback(baseFailCallbackImpl);
        return builder.build(PURCHASE_ORDER_ITEM_OFF_STATE_MACHINE_NAME);
    }

    @Bean(PURCHASE_ORDER_ITEM_PAYMENT_STATE_MACHINE_NAME)
    public StateMachine<SrmPaymentStatus, SrmEventEnum, SrmPayCountDTO> getPurchaseOrderItemPaymentStateMachine() {
        StateMachineBuilder<SrmPaymentStatus, SrmEventEnum, SrmPayCountDTO> builder = StateMachineBuilderFactory.create();

        // 初始化付款状态
        builder.internalTransition().within(NONE_PAYMENT).on(SrmEventEnum.PAYMENT_INIT).perform(orderItemPayActionImpl);

        // 取消付款
        builder.externalTransitions().fromAmong(NONE_PAYMENT, PARTIALLY_PAYMENT).to(NONE_PAYMENT).on(SrmEventEnum.CANCEL_PAYMENT).perform(orderItemPayActionImpl);

        // 付款异常
        builder.externalTransitions().fromAmong(NONE_PAYMENT, PARTIALLY_PAYMENT, ALL_PAYMENT).to(NONE_PAYMENT).on(SrmEventEnum.PAYMENT_EXCEPTION).perform(orderItemPayActionImpl);

        // 付款调整
        builder.externalTransitions().fromAmong(NONE_PAYMENT, PARTIALLY_PAYMENT, ALL_PAYMENT).to(NONE_PAYMENT).on(SrmEventEnum.PAYMENT_ADJUSTMENT).perform(orderItemPayActionImpl);

        // 设置错误回调
        builder.setFailCallback(baseFailCallbackImpl);

        return builder.build(PURCHASE_ORDER_ITEM_PAYMENT_STATE_MACHINE_NAME);
    }

}
