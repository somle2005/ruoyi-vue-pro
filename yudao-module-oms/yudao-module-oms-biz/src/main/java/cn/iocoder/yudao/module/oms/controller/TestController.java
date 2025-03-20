package cn.iocoder.yudao.module.oms.controller;

import cn.iocoder.yudao.module.oms.job.ShopifyListingJob;
import cn.iocoder.yudao.module.oms.job.WalmartListingJob;
import cn.iocoder.yudao.module.oms.mapper.ErpSkuVariantBridgeMapper;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description:
 * @author: LaoSan
 * @create: 2025-03-18 17:16
 **/
@RestController
@RequestMapping("/test/")
public class TestController {

    @Resource
    private ShopifyListingJob shopifyListingJob;
    @Resource
    private WalmartListingJob walmartListingJob;

    @Resource
    ErpSkuVariantBridgeMapper erpSkuVariantBridgeMapper;

    @GetMapping("/shopifyListingJob")
    public String shopifyListingJob(String param){
        String execute = shopifyListingJob.execute(param);
        return "test";
    }

    @GetMapping("/walmartListingJob")
    public String walmartListingJob(String param) throws Exception {
        String execute = walmartListingJob.execute(param);
        return "test";
    }

    @Operation(summary = "无脑循环执行sql,别乱搞！！！！")
    @PostMapping("/testSql")
    public String testSql(@RequestBody List<String> sqlS) {
        for (String sql : sqlS) {
            erpSkuVariantBridgeMapper.testSql(sql);
        }
        return "操作成功";
    }


}
