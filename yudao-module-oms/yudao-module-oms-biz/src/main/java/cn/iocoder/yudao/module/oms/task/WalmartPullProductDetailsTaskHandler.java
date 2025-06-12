package cn.iocoder.yudao.module.oms.task;

import cn.iocoder.yudao.module.oms.dal.dataobject.TaskHandleRecordDO;
import org.springframework.stereotype.Component;

@Component
public class WalmartPullProductDetailsTaskHandler implements TaskHandler<TaskHandleRecordDO> {
    @Override
    public void handleEvent(TaskHandleRecordDO event) {
        try {
            long startTime=System.currentTimeMillis();
            //1、获取参数
            String sku = event.getHandleParam();
            //2、调用walmart接口获取商品详情

            //3、保存商品详情

            //4、更新TaskHandleRecordDO处理状态 和 completeHandleTime

        } catch (Exception e) {
            //更新TaskHandleRecordDO 处理次数+1
            //更新TaskHandleRecordDO 下一次的处理时间 requireHandleTime + 6分钟
        }
    }

    @Override
    public String[] handlerKey() {
        return new String[]{TaskMapping.WALMART_PULL_PRODUCT_DETAILS.name()};
    }

}
