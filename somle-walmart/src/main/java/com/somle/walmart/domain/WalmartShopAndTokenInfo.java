package com.somle.walmart.domain;

import lombok.Data;

/**
 * @description:
 * @author: LaoSan
 * @create: 2025-03-20 14:26
 **/
@Data
public class WalmartShopAndTokenInfo {

    private Long tokenId;
    private String shopName;
    private String clientId;
    private String clientSecret;
    private String correlationId;
    private String svcName;
    private String domain;
    private String accessToken;

}
