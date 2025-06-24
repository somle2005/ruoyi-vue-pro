package com.doudian.open.api.token;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;


public class RefreshTokenRequest extends DoudianOpRequest<RefreshTokenParam> {
    @Override
    public String getUrlPath() {
        return "/token/refresh";
    }

    @Override
    public Class<? extends DoudianOpResponse<?>> getResponseClass() {
        return RefreshTokenResponse.class;
    }
}
