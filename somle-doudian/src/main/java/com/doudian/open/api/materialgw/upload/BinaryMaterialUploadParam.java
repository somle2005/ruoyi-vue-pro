package com.doudian.open.api.materialgw.upload;

public class BinaryMaterialUploadParam {
    public static final int MaterialBizType = 1;
    public static final int LightBizType = 2;

    private String extension;

    private byte[] binaryBytes;

    private int bizType;

    private String storeKeys;

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public byte[] getBinaryBytes() {
        return binaryBytes;
    }

    public void setBinaryBytes(byte[] binaryBytes) {
        this.binaryBytes = binaryBytes;
    }

    public int getBizType() {
        return bizType;
    }

    public void setBizType(int bizType) {
        this.bizType = bizType;
    }

    public String getStoreKeys() {
        return storeKeys;
    }

    public void setStoreKeys(String storeKeys) {
        this.storeKeys = storeKeys;
    }
}
