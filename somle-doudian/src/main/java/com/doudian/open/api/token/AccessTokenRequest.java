package com.doudian.open.api.token;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;

public class AccessTokenRequest extends DoudianOpRequest<AccessTokenParam> {
    @Override
    public String getUrlPath() {
        return "token/create";
    }

    @Override
    public Class<? extends DoudianOpResponse<?>> getResponseClass() {
        return AccessTokenResponse.class;
    }
}
