package cn.iocoder.yudao.module.tms.config;

import cn.iocoder.yudao.framework.cola.statemachine.builder.FailCallback;
import cn.iocoder.yudao.framework.common.core.StatusValue;
import cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil;
import cn.iocoder.yudao.module.srm.config.StateMachineDescriptorRegistrar;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.TmsFirstMileRequestDO;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.item.TmsFirstMileRequestItemDO;
import cn.iocoder.yudao.module.tms.enums.TmsEventEnum;
import cn.iocoder.yudao.module.tms.enums.status.TmsAuditStatus;
import cn.iocoder.yudao.module.tms.enums.status.TmsOffStatus;
import cn.iocoder.yudao.module.tms.enums.status.TmsOrderStatus;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import static cn.iocoder.yudao.module.tms.enums.ErrorCodeConstants.FIRST_MILE_REQUEST_STATUS_MACHINE_ERROR;

/**
 * TMS 状态机统一失败回调实现类
 * 用于在状态机事件无法触发时，记录异常信息并抛出业务异常。
 */
@Component
@ConditionalOnMissingBean(FailCallback.class)
@Slf4j
public class TmsFailCallbackImpl<S, E, C> implements FailCallback<S, E, C> {

    @Override
    public void onFail(S sourceState, S targetState, E event, C context) {
        String sourceDesc = convertToDescription(sourceState);
        String eventDesc = convertToDescription(event);

        String contextName = (context == null) ? "null" : context.getClass().getSimpleName();

        log.warn("【TMS状态机】在状态 [{}] 下无法触发事件 [{}]，上下文类型 [{}]", sourceDesc, eventDesc, contextName);

        throw ServiceExceptionUtil.exception(FIRST_MILE_REQUEST_STATUS_MACHINE_ERROR, sourceDesc, eventDesc);
    }

    private String convertToDescription(Object obj) {
        if (obj instanceof StatusValue statusValue) {
            return statusValue.getDesc();
        }
        try {
            return TmsEventEnum.valueOf(obj.toString()).getDesc();
        } catch (Exception e) {
            log.warn("【TMS状态机】无法识别的状态或事件类型: {}", obj, e);
            return obj != null ? obj.toString() : "null";
        }
    }

    /**
     * 自动注册状态机描述信息：用于代码生成或流程展示。
     */
    @Configuration
    @ConditionalOnBean(FailCallback.class)
    @RequiredArgsConstructor
    public static class TmsStateMachineDescAutoConfig implements StateMachineDescriptorRegistrar {

        @Override
        public void register(StateMachineDescriptorRegistry registry) {
            // 头程申请单
            registry.add(TmsFirstMileRequestDO.class, TmsOffStatus.class, "头程申请单(开关)");
            registry.add(TmsFirstMileRequestDO.class, TmsOrderStatus.class, "头程申请单(订购)");
            registry.add(TmsFirstMileRequestDO.class, TmsAuditStatus.class, "头程申请单(审核)");

            // 头程申请项
            registry.add(TmsFirstMileRequestItemDO.class, TmsOffStatus.class, "头程申请明细(开关)");
            registry.add(TmsFirstMileRequestItemDO.class, TmsOrderStatus.class, "头程申请明细(订购)");
        }
    }
}
