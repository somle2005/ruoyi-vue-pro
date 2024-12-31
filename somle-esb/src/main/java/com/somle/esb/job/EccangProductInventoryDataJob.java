package com.somle.esb.job;

import com.somle.framework.common.util.json.JSONObject;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *  eccang的getProductInventory，获取所有库存信息，存入本地数据库。
 *  实现断点续传。1次/小时?
 */
@Component
public class EccangProductInventoryDataJob extends EccangDataJob {
    @Override
    public String execute(String param) throws Exception {
        setDate(param);
        AtomicInteger syncCount = new AtomicInteger();
        AtomicInteger totalCount = new AtomicInteger();
        eccangService.getAllPageWithResume(new JSONObject(), "getProductInventory")
            .forEach(
                eccangPage -> {
                    syncCount.addAndGet(eccangPage.getPageSize());
                    totalCount.set(eccangPage.getTotalCount());
                }
            );
        return "同步完成，进度" + syncCount + "/" + totalCount;
    }
}
