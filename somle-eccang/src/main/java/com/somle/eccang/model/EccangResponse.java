package com.somle.eccang.model;

import com.fasterxml.jackson.databind.JsonNode;
import com.somle.framework.common.util.json.JSONArray;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.somle.framework.common.util.json.JsonUtils;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Objects;


@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class EccangResponse {
    private String code;
    private String message;
    private long timestamp;
    private String version;
    private String nonceStr;
    private String signType;
    private String sign;
    private String bizContent;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class EccangError {
        private String errorMsg;
        private String errorCode;
    }

    public BizContent getBizContent() {
        return JsonUtils.parseObject(bizContent, BizContent.class);
    }

    public List<EccangError> getErrors() {
        return JsonUtils.parseArray(bizContent, EccangError.class);
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class BizContent {
        private Integer total;
        private Integer totalCount;
        private JsonNode data;
        private Integer page;
        private Integer pageSize;

        public <T> List<T> getData(Class<T> objectClass) {
            return JsonUtils.parseArray(data,objectClass);
        }

        public int getTotal() {
            Integer rowCount = 1;
            rowCount = Objects.requireNonNullElse(total, rowCount);
            rowCount = Objects.requireNonNullElse(totalCount, rowCount);
            return rowCount;
        }

        public boolean isLastPage() {
            return page == null || (page * pageSize) >= total;
        }

        public boolean hasNext() {
            return page != null && (page * pageSize) < total;
        }

        // public int getPage() {
        //     return Integer.valueOf(page);
        // }

        // public int getPageSize() {
        //     return Integer.valueOf(pageSize);
        // }
        
        //custom
        // private JSONObject headers;
    }
}