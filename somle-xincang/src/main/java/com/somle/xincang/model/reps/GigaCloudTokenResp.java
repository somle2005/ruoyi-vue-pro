package com.somle.xincang.model.reps;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
public class GigaCloudTokenResp {
    /**
     * 操作结果消息（例如："操作成功"）
     */
    private String msg;

    /**
     * 状态码（例如：200）
     */
    private Integer code;

    /**
     * 身份验证令牌（JWT 格式）
     */
    private String token;
}