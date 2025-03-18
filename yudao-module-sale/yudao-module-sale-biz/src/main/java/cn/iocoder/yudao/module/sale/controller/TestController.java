package cn.iocoder.yudao.module.sale.controller;

import cn.iocoder.yudao.module.sale.job.ShopifyListingJob;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/shopifyListingJob")
    public String shopifyListingJob(String param){
        String execute = shopifyListingJob.execute(param);
        return "test";
    }

}
