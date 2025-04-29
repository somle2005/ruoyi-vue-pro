package cn.iocoder.yudao.module.tms.config;

import cn.iocoder.yudao.framework.cola.statemachine.builder.FailCallback;
import cn.iocoder.yudao.framework.common.core.StatusValue;
import cn.iocoder.yudao.module.tms.enums.TmsEventEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Component;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.tms.enums.ErrorCodeConstants.FIRST_MILE_REQUEST_STATUS_MACHINE_ERROR;

@Component
@ConditionalOnMissingBean(FailCallback.class)
@Slf4j
public class TmsBaseFailCallbackImpl<S, E, C> implements FailCallback<S, E, C> {

    @Override
    public void onFail(S sourceState, S targetState, E event, C context) {
        String statusDesc = convertEventToDescription(sourceState);
        String eventDesc = TmsEventEnum.valueOf(event.toString()).getDesc();
        log.warn("无法在({})状态下触发({})事件，上下文：{}", statusDesc, eventDesc, context.getClass().getName());
        throw exception(FIRST_MILE_REQUEST_STATUS_MACHINE_ERROR, statusDesc, eventDesc);
    }

    public String convertEventToDescription(Object event) {
        try{
            if (event instanceof StatusValue) {
                return ((StatusValue) event).getDesc();
            } else {
                log.warn("Unknown event type: {}", event.getClass());
            }
        } catch(Exception e){
            log.warn("Error while converting event to description", e);
        }
        return null;
    }
}
