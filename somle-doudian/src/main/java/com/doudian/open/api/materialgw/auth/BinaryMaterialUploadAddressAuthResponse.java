package com.doudian.open.api.materialgw.auth;

import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;

public class BinaryMaterialUploadAddressAuthResponse extends DoudianOpResponse<BinaryMaterialUploadAddressAuthData>  {

    public BinaryMaterialUploadAddressAuthResponse() {
    }

    public String toString() {
        return JsonUtil.toJson(this);
    }
}
