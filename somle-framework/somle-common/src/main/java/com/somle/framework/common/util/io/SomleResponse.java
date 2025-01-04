package com.somle.framework.common.util.io;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@Data
public class SomleResponse<T> {
    private final int code;
    private final T bodyData;
    private final Map<String, List<String>> headers; // 加入响应头部信息

    public SomleResponse(int code, T bodyData, Map<String, List<String>> headers) {
        this.code = code;
        this.bodyData = bodyData;
        this.headers = headers != null ? headers : Collections.emptyMap();  // 确保 headers 非 null
    }
    @Getter
    @AllArgsConstructor
    public enum ResponseType {
        //如果响应体非常大，读取为一个字符串可能会导致内存消耗过多，甚至 OutOfMemoryError
        STRING("String"),
        BYTES("Bytes"),
        BYTE_STRING("ByteString");

        private final String description;
    }
}
