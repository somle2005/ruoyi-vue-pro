package cn.iocoder.yudao.module.oms.task;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TaskMapping {

    WALMART_PULL_PRODUCT_DETAILS("Walmart拉取商品详情", WalmartPullProductDetailsTaskHandler.class);
    //任务详情
    private String taskDetail;
    //任务处理器
    private Class taskHandlerClass;
}
