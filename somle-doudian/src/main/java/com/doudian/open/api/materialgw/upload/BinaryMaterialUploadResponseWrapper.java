package com.doudian.open.api.materialgw.upload;

import com.doudian.open.api.materialgw.auth.BinaryMaterialUploadAddressAuthData;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;

public class BinaryMaterialUploadResponseWrapper extends DoudianOpResponse<BinaryMaterialUploadResponseWrapperData> {

    public BinaryMaterialUploadResponseWrapper() {
    }

    public String toString() {
        return JsonUtil.toJson(this);
    }
}
