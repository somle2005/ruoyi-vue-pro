package com.somle.framework.domain.shop;

import com.somle.framework.common.util.json.JSONArray;
import com.somle.framework.common.util.json.JSONObject;
import com.somle.framework.domain.sales.SalesPlatform;

/**
 * @className: IShopProfileClient
 * @author: Wqh
 * @date: 2025/2/7 17:45
 * @Version: 1.0
 * @description:
 */
public abstract class ShopProfileClient {

    private final SalesPlatform salesPlatform;

    public ShopProfileClient(SalesPlatform salesPlatform) {
        this.salesPlatform = salesPlatform;
    }

    public SalesPlatform getSalesPlatform() {
        return salesPlatform;
    }

    public abstract JSONObject getShop();
    public abstract JSONArray getProducts();

}
