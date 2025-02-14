package com.somle.esb.controller;



import cn.iocoder.yudao.framework.common.exception.enums.GlobalErrorCodeConstants;
import cn.iocoder.yudao.framework.common.pojo.CommonResult;
import com.somle.esb.job.SyncShopProfileJob;
import com.somle.esb.platform.shop.ShopifyShopProfileClient;
import com.somle.framework.common.util.json.JSONObject;
import com.somle.shopify.service.ShopifyClient;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ShopController {

    @Autowired
    private ShopifyClient shopProfileClient;

    @Resource
    private SyncShopProfileJob shopProfileJob;

    @GetMapping("/shop/sync")
    public CommonResult<String> syncShopProfile() {
        try {
            shopProfileJob.execute(null);
        } catch (Exception e) {
            return CommonResult.error(GlobalErrorCodeConstants.INTERNAL_SERVER_ERROR);
        }
        return  CommonResult.success("suc");
    }

    @GetMapping("/shopify/products")
    public JSONObject getShopifyProducts() {
        return shopProfileClient.getRawProducts();
    }
}