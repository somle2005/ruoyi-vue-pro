package cn.iocoder.yudao.module.oms.task;

public interface TaskHandler<T> {

    void handleEvent(T event);

    String[] handlerKey();
}