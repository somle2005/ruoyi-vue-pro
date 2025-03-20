package com.somle.shopify.domain;

import lombok.Data;

/**
 * @description:
 * @author: LaoSan
 * @create: 2025-03-20 14:26
 **/
@Data
public class TokenInfo {
    private String name;

    private String accessToken;

    private String domain;
}
