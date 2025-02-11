package com.somle.esb.controller;



import cn.iocoder.yudao.framework.common.exception.enums.GlobalErrorCodeConstants;
import cn.iocoder.yudao.framework.common.pojo.CommonResult;
import com.somle.esb.job.SyncShopProfileJob;
import com.somle.esb.platform.shop.ShopifyShopProfileClient;
import com.somle.framework.common.util.json.JSONObject;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/shopify")
public class ShopifyController {

    @Autowired
    private ShopifyShopProfileClient shopProfileClient;

    @Resource
    private SyncShopProfileJob shopProfileJob;

    @GetMapping("/sync")
    public CommonResult<String> sync() {
        try {
            shopProfileJob.execute(null);
        } catch (Exception e) {
            return CommonResult.error(GlobalErrorCodeConstants.INTERNAL_SERVER_ERROR);
        }
        return  CommonResult.success("suc");
    }

    @GetMapping("/products")
    public JSONObject products() {
        return shopProfileClient.getRawProducts();
    }
}