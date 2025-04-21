package cn.iocoder.yudao.module.tms.config.first.mile.request;

import cn.iocoder.yudao.framework.cola.statemachine.StateMachine;
import cn.iocoder.yudao.framework.cola.statemachine.builder.StateMachineBuilder;
import cn.iocoder.yudao.framework.cola.statemachine.builder.StateMachineBuilderFactory;
import cn.iocoder.yudao.module.srm.enums.SrmEventEnum;
import cn.iocoder.yudao.module.srm.enums.status.SrmOffStatus;
import cn.iocoder.yudao.module.tms.config.TmsBaseFailCallbackImpl;
import cn.iocoder.yudao.module.tms.config.first.mile.request.impl.action.RequestAuditActionImpl;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.vo.TmsFirstMileRequestAuditReqVO;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.TmsFirstMileRequestDO;
import cn.iocoder.yudao.module.tms.enums.TmsEventEnum;
import cn.iocoder.yudao.module.tms.enums.status.TmsAuditStatus;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static cn.iocoder.yudao.module.srm.enums.SrmStateMachines.PURCHASE_REQUEST_ITEM_OFF_STATE_MACHINE_NAME;
import static cn.iocoder.yudao.module.tms.enums.TmsStateMachines.FIRST_MILE_REQUEST_AUDIT_STATE_MACHINE;

@Slf4j
@Configuration
@SuppressWarnings({"rawtypes", "unchecked"})
public class TmsFirstMileRequestStatusMachine {

    @Resource
    TmsBaseFailCallbackImpl TmsBaseFailCallbackImpl;
    @Resource
    RequestAuditActionImpl requestAuditActionImpl;
    @Bean(FIRST_MILE_REQUEST_AUDIT_STATE_MACHINE)
    public StateMachine<TmsAuditStatus, TmsEventEnum, TmsFirstMileRequestAuditReqVO> getFirstMileRequestStateMachine() {
        StateMachineBuilder<TmsAuditStatus, TmsEventEnum, TmsFirstMileRequestAuditReqVO> builder = StateMachineBuilderFactory.create();

        // 初始化状态
        builder.internalTransition().within(TmsAuditStatus.DRAFT).on(TmsEventEnum.AUDIT_INIT).perform(requestAuditActionImpl);

        // 提交审核
        builder.externalTransitions().fromAmong(TmsAuditStatus.DRAFT, TmsAuditStatus.REVOKED, TmsAuditStatus.REJECTED).to(TmsAuditStatus.PENDING_REVIEW).on(TmsEventEnum.SUBMIT_FOR_REVIEW).perform(requestAuditActionImpl);

        // 审核通过
        builder.externalTransition().from(TmsAuditStatus.PENDING_REVIEW).to(TmsAuditStatus.APPROVED).on(TmsEventEnum.AGREE).perform(requestAuditActionImpl);

        // 审核不通过
        builder.externalTransition().from(TmsAuditStatus.PENDING_REVIEW).to(TmsAuditStatus.REJECTED).on(TmsEventEnum.REJECT).perform(requestAuditActionImpl);

        // 反审核
        builder.externalTransition().from(TmsAuditStatus.APPROVED).to(TmsAuditStatus.REVOKED).on(TmsEventEnum.WITHDRAW_REVIEW).perform(requestAuditActionImpl);

        builder.setFailCallback(TmsBaseFailCallbackImpl);

        return builder.build(FIRST_MILE_REQUEST_AUDIT_STATE_MACHINE);
    }

    @Bean(PURCHASE_REQUEST_ITEM_OFF_STATE_MACHINE_NAME)
    public StateMachine<SrmOffStatus, SrmEventEnum, TmsFirstMileRequestDO> getPurchaseRequestStateMachine() {
        StateMachineBuilder<SrmOffStatus, SrmEventEnum, TmsFirstMileRequestDO> builder = StateMachineBuilderFactory.create();
        // 初始化状态
        builder.internalTransition().within(SrmOffStatus.OPEN).on(SrmEventEnum.OFF_INIT).perform(itemOffActionImpl);
        // 开启
        builder.externalTransitions().fromAmong(SrmOffStatus.CLOSED, SrmOffStatus.MANUAL_CLOSED).to(SrmOffStatus.OPEN).on(SrmEventEnum.ACTIVATE).perform(itemOffActionImpl);
        // 手动关闭
        builder.externalTransition().from(SrmOffStatus.OPEN).to(SrmOffStatus.MANUAL_CLOSED).on(SrmEventEnum.MANUAL_CLOSE).perform(itemOffActionImpl);
        //自动关闭
        builder.externalTransition().from(SrmOffStatus.OPEN).to(SrmOffStatus.CLOSED).on(SrmEventEnum.AUTO_CLOSE).perform(itemOffActionImpl);
        //撤销关闭
        builder.externalTransitions().fromAmong(SrmOffStatus.MANUAL_CLOSED, SrmOffStatus.CLOSED).to(SrmOffStatus.OPEN).on(SrmEventEnum.CANCEL_DELETE).perform(itemOffActionImpl);

        builder.setFailCallback(baseFailCallbackImpl);
        return builder.build(PURCHASE_REQUEST_ITEM_OFF_STATE_MACHINE_NAME);
    }
}
