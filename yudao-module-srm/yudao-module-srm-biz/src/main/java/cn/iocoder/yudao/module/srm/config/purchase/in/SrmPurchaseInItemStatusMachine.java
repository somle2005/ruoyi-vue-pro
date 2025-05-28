package cn.iocoder.yudao.module.srm.config.purchase.in;

import cn.iocoder.yudao.framework.cola.statemachine.Action;
import cn.iocoder.yudao.framework.cola.statemachine.StateMachine;
import cn.iocoder.yudao.framework.cola.statemachine.builder.StateMachineBuilder;
import cn.iocoder.yudao.framework.cola.statemachine.builder.StateMachineBuilderFactory;
import cn.iocoder.yudao.module.srm.api.purchase.machine.inItem.SrmPurchaseInItemCountDTO;
import cn.iocoder.yudao.module.srm.config.BaseFailCallbackImpl;
import cn.iocoder.yudao.module.srm.dal.dataobject.purchase.SrmPurchaseInItemDO;
import cn.iocoder.yudao.module.srm.enums.SrmEventEnum;
import cn.iocoder.yudao.module.srm.enums.SrmStateMachines;
import cn.iocoder.yudao.module.srm.enums.status.SrmPaymentStatus;
import cn.iocoder.yudao.module.srm.enums.status.SrmStorageStatus;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static cn.iocoder.yudao.module.srm.enums.status.SrmPaymentStatus.*;
import static cn.iocoder.yudao.module.srm.enums.status.SrmStorageStatus.*;

//采购入库单主表状态机
@Slf4j
@Configuration
@SuppressWarnings({"rawtypes", "unchecked"})
public class SrmPurchaseInItemStatusMachine {

    @Autowired
    private BaseFailCallbackImpl baseFailCallbackImpl;

    @Autowired
    Action<SrmPaymentStatus, SrmEventEnum, SrmPurchaseInItemDO> inPayItemActionImpl;

    @Bean(SrmStateMachines.PURCHASE_IN_ITEM_PAYMENT_STATE_MACHINE)
    public StateMachine<SrmPaymentStatus, SrmEventEnum, SrmPurchaseInItemDO> getPurchaseRequestPaymentStateMachine() {
        StateMachineBuilder<SrmPaymentStatus, SrmEventEnum, SrmPurchaseInItemDO> builder = StateMachineBuilderFactory.create();
        //初始化
        builder.internalTransition().within(NONE_PAYMENT).on(SrmEventEnum.PAYMENT_INIT).perform(inPayItemActionImpl);
        //付款金额调整
        builder.externalTransitions().fromAmong(NONE_PAYMENT, PARTIALLY_PAYMENT, ALL_PAYMENT, PAYMENT_EXCEPTION).to(PARTIALLY_PAYMENT).on(SrmEventEnum.PAYMENT_ADJUSTMENT).perform(inPayItemActionImpl);
        //付款失败事件
        builder.externalTransitions().fromAmong(NONE_PAYMENT, PARTIALLY_PAYMENT).to(PAYMENT_EXCEPTION).on(SrmEventEnum.PAYMENT_EXCEPTION).perform(inPayItemActionImpl);
        //完成付款
        builder.externalTransition().from(NONE_PAYMENT).to(ALL_PAYMENT).on(SrmEventEnum.COMPLETE_PAYMENT).perform(inPayItemActionImpl);

        //取消付款
        builder.externalTransition().from(ALL_PAYMENT).to(NONE_PAYMENT).on(SrmEventEnum.CANCEL_PAYMENT).perform(inPayItemActionImpl);
        builder.setFailCallback(baseFailCallbackImpl);
        return builder.build(SrmStateMachines.PURCHASE_IN_ITEM_PAYMENT_STATE_MACHINE);
    }

    @Autowired
    Action<SrmStorageStatus, SrmEventEnum, SrmPurchaseInItemCountDTO> itemStorageActionImpl;

    @Bean(SrmStateMachines.PURCHASE_IN_ITEM_STORAGE_STATE_MACHINE)
    public StateMachine<SrmStorageStatus, SrmEventEnum, SrmPurchaseInItemCountDTO> getPurchaseRequestStorageStateMachine() {
        StateMachineBuilder<SrmStorageStatus, SrmEventEnum, SrmPurchaseInItemCountDTO> builder = StateMachineBuilderFactory.create();
        //初始化
        builder.internalTransition().within(NONE_IN_STORAGE).on(SrmEventEnum.STORAGE_INIT).perform(itemStorageActionImpl);
        //库存调整,不管终点，在 Action 里面调整终点
        builder.externalTransitions().fromAmong(NONE_IN_STORAGE, PARTIALLY_IN_STORAGE, ALL_IN_STORAGE).to(PARTIALLY_IN_STORAGE)
            .on(SrmEventEnum.STOCK_ADJUSTMENT).perform(itemStorageActionImpl);
        //
        builder.setFailCallback(baseFailCallbackImpl);
        return builder.build(SrmStateMachines.PURCHASE_IN_ITEM_STORAGE_STATE_MACHINE);
    }
}
