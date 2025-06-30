package com.somle.lingxing.model.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;
import java.util.List;

/**
 * 接口请求参数实体类
 */
@Data
@JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
@Builder
public class LingXingGetProductReq {

    /**
     * app key (32位长度)
     */
    private String appKey;

    /**
     * 时间戳 (10位长度)
     */
    private String reqTime;

    /**
     * 请求数据
     */
    private RequestData data;

    /**
     * 请求数据内部类
     */
    @Data
    @JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
    @Builder
    public static class RequestData {
        /**
         * 页码 (最小值为1)
         */
        @JsonProperty("page")
        private Integer page;

        /**
         * 每页条数 (默认50，最大100)
         */
        @JsonProperty("pageSize")
        private Integer pageSize;

        /**
         * 产品SKU集合 (最多50个)
         */
        private List<String> skuList;

        /**
         * 审核状态 (0-新建 1-审核中 2-已审核 3-已驳回 4-废弃)
         */
        private Integer approveStatus;
    }
}