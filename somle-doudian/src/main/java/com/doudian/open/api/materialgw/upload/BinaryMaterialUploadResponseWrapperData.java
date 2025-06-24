package com.doudian.open.api.materialgw.upload;

import com.doudian.open.gson.annotations.SerializedName;

public class BinaryMaterialUploadResponseWrapperData {

    @SerializedName("uri")
    private String uri;

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
