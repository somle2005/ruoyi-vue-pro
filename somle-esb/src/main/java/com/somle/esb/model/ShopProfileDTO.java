package com.somle.esb.model;


import com.somle.esb.enums.SalesPlatform;
import com.somle.esb.enums.ShopProfileType;
import lombok.Data;

/**
 * @className: ShopInfoMessage
 * @author: LeeFJ
 * @date: 2025/2/7 11:27
 * @Version: 1.0
 * @description:
 */
@Data
public class ShopProfileDTO<T> {
    private SalesPlatform salesPlatform;
    private ShopProfileType shopProfileType;
    private T payload;

    public ShopProfileDTO(SalesPlatform salesPlatform, ShopProfileType shopInfoType, T payload) {
        this.salesPlatform = salesPlatform;
        this.shopProfileType = shopInfoType;
        this.payload = payload;
    }
}
