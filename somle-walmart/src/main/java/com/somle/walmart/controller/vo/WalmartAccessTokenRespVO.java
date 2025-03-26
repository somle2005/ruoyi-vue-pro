package com.somle.walmart.controller.vo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @description:
 * @author: LaoSan
 * @create: 2025-03-20 17:36
 **/
@Data
public class WalmartAccessTokenRespVO {

    @JSONField(name = "access_token")
    private String accessToken;
    @JSONField(name = "token_type")
    private String tokenType;
    @JSONField(name = "expires_in")
    private Integer expiresIn;
}
