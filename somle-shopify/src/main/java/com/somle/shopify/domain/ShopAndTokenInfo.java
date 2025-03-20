package com.somle.shopify.domain;

import lombok.Data;

/**
 * @description:
 * @author: LaoSan
 * @create: 2025-03-20 14:26
 **/
@Data
public class ShopAndTokenInfo {

    private String shopName;

    private String accessToken;

    private String domain;

}
