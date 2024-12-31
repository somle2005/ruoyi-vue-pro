package com.somle.esb.job;

import com.somle.framework.common.util.json.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *  eccang的getProductInventory，获取所有库存信息，存入本地数据库。
 *  实现断点续传。1次/小时?
 */
@Component
@Slf4j
public class EccangProductInventoryDataJob extends EccangDataJob {
    @Override
    public String execute(String param) throws Exception {
        setDate(param);
        AtomicInteger syncCount = new AtomicInteger();
        AtomicInteger total = new AtomicInteger();
        eccangService.getAllPageWithResume(new JSONObject(), "getProductInventory")
            .forEach(
                eccangPage -> {
                    syncCount.addAndGet(eccangPage.getData().size());
                    total.set(eccangPage.getTotal());
                    log.debug("eccang库存信息同步进度{}/{}", syncCount, total);
                }
            );
        return "同步完成，进度" + syncCount + "/" + total;
    }
}
