package com.doudian.open.api.materialgw.auth;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;

public class BinaryMaterialUploadAddressAuthRequest extends DoudianOpRequest<BinaryMaterialUploadAddressAuthParam> {

    public BinaryMaterialUploadAddressAuthRequest() {
    }

    @Override
    public String getUrlPath() {
        return "open/materialToken";
    }

    @Override
    public Class<? extends DoudianOpResponse<?>> getResponseClass() {
        return BinaryMaterialUploadAddressAuthResponse.class;
    }

    public String toString() {
        return JsonUtil.toJson(this);
    }
}
