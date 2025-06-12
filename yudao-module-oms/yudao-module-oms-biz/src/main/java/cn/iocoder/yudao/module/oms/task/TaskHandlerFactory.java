package cn.iocoder.yudao.module.oms.task;

import cn.hutool.core.util.ObjectUtil;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author gumaomao
 * @since 2025/06/10
 */
@Component
public class TaskHandlerFactory {
    @Autowired(required = false)
    private List<TaskHandler> handlers;

    private final static Map<String, TaskHandler> orderEventPusherMap = new HashMap<>();

    public static TaskHandler getOrderEventHandler(String handlerKey) {
        TaskHandler eventHandler = orderEventPusherMap.get(handlerKey);
        if (ObjectUtil.isEmpty(eventHandler)) {
            throw new RuntimeException("订单事件处理器没有找到");
        }
        return eventHandler;
    }

    @PostConstruct
    private void init() {
        if (Objects.isNull(handlers)) {
            return;
        }
        handlers.forEach(bean -> {
            String[] handlerKeyArray = bean.handlerKey();
            for (String handlerKey : handlerKeyArray) {
                orderEventPusherMap.put(handlerKey, bean);
            }
        });
    }

}