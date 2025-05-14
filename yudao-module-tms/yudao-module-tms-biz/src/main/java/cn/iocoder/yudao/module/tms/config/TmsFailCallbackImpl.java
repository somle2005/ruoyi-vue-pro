package cn.iocoder.yudao.module.tms.config;

import cn.iocoder.yudao.framework.cola.statemachine.builder.FailCallback;
import cn.iocoder.yudao.framework.common.core.StatusValue;
import cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.TmsFirstMileRequestDO;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.item.TmsFirstMileRequestItemDO;
import cn.iocoder.yudao.module.tms.enums.TmsEventEnum;
import cn.iocoder.yudao.module.tms.enums.status.TmsAuditStatus;
import cn.iocoder.yudao.module.tms.enums.status.TmsOffStatus;
import cn.iocoder.yudao.module.tms.enums.status.TmsOrderStatus;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

import static cn.iocoder.yudao.module.tms.enums.TmsErrorCodeConstants.FIRST_MILE_REQUEST_STATUS_MACHINE_ERROR;

/**
 * TMS 状态机统一失败回调实现类
 */
@Component
@Slf4j
public class TmsFailCallbackImpl<S, E, C> implements FailCallback<S, E, C> {
    // 状态机描述Map
    public static Map<Map<Class<?>, Class<?>>, String> STATE_MACHINE_MAP_CN = new HashMap<>();

    static {
        //头程单
        addStateMachine(TmsFirstMileRequestDO.class, TmsOffStatus.class, "头程申请单(开关)");
        addStateMachine(TmsFirstMileRequestDO.class, TmsOrderStatus.class, "头程申请单(订购)");
        addStateMachine(TmsFirstMileRequestDO.class, TmsAuditStatus.class, "头程申请单(审核)");

        // 头程申请项
        addStateMachine(TmsFirstMileRequestItemDO.class, TmsOffStatus.class, "头程申请明细(开关)");
        addStateMachine(TmsFirstMileRequestItemDO.class, TmsOrderStatus.class, "头程申请明细(订购)");
    }

    private static void addStateMachine(Class<?> contextClass, Class<?> stateClass, String description) {
        Map<Class<?>, Class<?>> key = new HashMap<>();
        key.put(contextClass, stateClass);
        STATE_MACHINE_MAP_CN.put(key, description);
    }
    @Override
    public void onFail(S sourceState, S targetState, E event, C context) {
        String stateMachineDesc = getStateMachineDescription(sourceState, targetState, event, context);
        String sourceDesc = convertToDescription(sourceState);
        String eventDesc = convertToDescription(event);

        String contextName = (context == null) ? "null" : context.getClass().getSimpleName();

        log.warn("【TMS状态机】{} 在状态 [{}] 下无法触发事件 [{}]，上下文类型 [{}]", stateMachineDesc, sourceDesc, eventDesc, contextName);

        throw ServiceExceptionUtil.exception(FIRST_MILE_REQUEST_STATUS_MACHINE_ERROR, stateMachineDesc, sourceDesc, eventDesc);
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

    private String getStateMachineDescription(S sourceState, S targetState, E event, C context) {
        if (context == null || sourceState == null) {
            return "";
        }

        Map<Class<?>, Class<?>> key = new HashMap<>();
        key.put(context.getClass(), sourceState.getClass());

        return STATE_MACHINE_MAP_CN.getOrDefault(key, "");
    }
}
