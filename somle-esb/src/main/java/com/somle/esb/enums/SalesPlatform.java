package com.somle.esb.enums;

import lombok.Getter;

@Getter
public enum SalesPlatform {

    AMAZON(false,null),
    JINGDONG(false,null),
    SHOPIFY(true,"https://fitueyes.com"),
    BESTBUY(false,null),
    MANOMANO(false,null),
    MATOMO(false,null),
    OTTO(false,null),
    RAKUTEN(false,null),
    WALMART(false,null),
    WANGDIAN(false,null),
    WAYFAIR(false,null);

    private String siteURL;
    private boolean isSyncProfile;

    private SalesPlatform(boolean isSyncProfile,String siteURL) {
        this.isSyncProfile=isSyncProfile;
        this.siteURL=siteURL;
    }

}
