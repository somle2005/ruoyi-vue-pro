package cn.iocoder.yudao.module.oms.task;



import org.springframework.stereotype.Component;

@Component
public class TaskHandlerImpl implements TaskHandler<String> {

    public void handleEvent(String event){

    }

    public String[] handlerKey(){
        return new String[]{"task"};
    }
}
