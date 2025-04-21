package cn.iocoder.yudao.module.tms.config;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.tms.enums.ErrorCodeConstants.FIRST_MILE_REQUEST_STATUS_MACHINE_ERROR;

import cn.iocoder.yudao.framework.cola.statemachine.builder.FailCallback;
import cn.iocoder.yudao.framework.common.core.ArrayValuable;
import cn.iocoder.yudao.module.tms.enums.TmsEventEnum;
import java.lang.reflect.Method;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TmsBaseFailCallbackImpl<S, E, C> implements FailCallback<S, E, C> {

    @Override
    public void onFail(S sourceState, E event, C context) {
        String statusDesc = convertEventToDescription(sourceState);

        String eventDesc = TmsEventEnum.valueOf(event.toString()).getDesc();
        log.warn("无法在({})状态下触发({})事件，上下文：{}", statusDesc, eventDesc, context.getClass().getName());
        throw exception(FIRST_MILE_REQUEST_STATUS_MACHINE_ERROR, statusDesc, eventDesc);
    }


    public String convertEventToDescription(Object event) {
        try{
            // 判断event是否为ArrayValuable的实例
            if(event instanceof ArrayValuable) {
                Method method = event.getClass().getMethod("getDesc");
                return (String) method.invoke(event);
            } else {
                log.warn("Unknown event type: " + event.getClass());
            }
        } catch(Exception e){
            log.warn("Error while converting event to description", e);
        }
        return null;
    }
}
