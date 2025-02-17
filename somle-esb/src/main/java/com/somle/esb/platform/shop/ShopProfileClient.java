package com.somle.esb.platform.shop;

import com.somle.esb.enums.SalesPlatform;
import com.somle.framework.common.util.json.JSONArray;
import com.somle.framework.common.util.json.JSONObject;

import java.util.List;

/**
 * @className: IShopProfileClient
 * @author: Wqh
 * @date: 2025/2/7 17:45
 * @Version: 1.0
 * @description:
 */
public abstract class ShopProfileClient<S,P> {

    private final SalesPlatform salesPlatform;

    public ShopProfileClient(SalesPlatform salesPlatform) {
        this.salesPlatform = salesPlatform;
    }

    public SalesPlatform getSalesPlatform() {
        return salesPlatform;
    }

    public abstract List<S> getShops();
    public abstract List<P> getProducts(String shopPlatformUid,String regionCode,String domainName);

}
