package com.somle.jingdong.model.resp;

import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@Data
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class JingDongShopProductResp {


    private JingDongSkuSearchResult jingdongSkuReadSearchSkuListResponce;

    // 静态嵌套类：JingDongSkuSearchResult
    @Data
    @NoArgsConstructor
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class JingDongSkuSearchResult {
        private String code;
        private String requestId;
        private SkuPage page;
    }

    // 静态嵌套类：SkuPage
    @Data
    @NoArgsConstructor
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class SkuPage {
        private Integer pageSize;
        private List<SkuItem> data;
        private Integer totalItem;
        private Integer pageNo;
    }

    // 静态嵌套类：SkuItem
    @Data
    @NoArgsConstructor
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class SkuItem {
        private String skuName;
        private Integer stockNum;
        private Long skuId;
        private Long wareId;
        private Double jdPrice;
        private String outerId;
        private Integer status;
    }
}