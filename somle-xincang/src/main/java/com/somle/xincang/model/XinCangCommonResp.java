package com.somle.xincang.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
public class XinCangCommonResp {
    /**
     * 业务结果数据（通常为 JSON 字符串或空）
     */
    private String rst;

    /**
     * 错误码（0 表示成功，非 0 表示失败）
     */
    private int errno;

    /**
     * 错误描述信息
     */
    private String err;
}