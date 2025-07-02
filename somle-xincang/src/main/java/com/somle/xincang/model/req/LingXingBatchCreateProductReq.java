package com.somle.xincang.model.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
@Builder
public class LingXingBatchCreateProductReq {

    private String appKey;
    @JsonProperty("reqTime")
    private String reqTime;
    private List<ProductData> data;

    @Data
    @JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
    @Builder
    public static class ProductData {
        private String sku;
        private String productCode;
        private String productAliasName;
        private String productName;
        private String productDescription;
        private String imageUrl;
        private BigDecimal length;
        private BigDecimal width;
        private BigDecimal height;
        private String sizeUnit = "cm";
        private BigDecimal weight;
        private String weightUnit = "kg";
        private List<OtherCode> otherCodeList;
        private List<Fnsku> fnskuList;
        private String declareNameCn;
        private String declareNameEn;
        private String customhouseCode;
        private BigDecimal declarePrice;
        private String countryOfOriginName;
        private Integer dangerousCargo;

        @Data
        @JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
        @Builder
        public static class OtherCode {
            private String otherCode;
        }

        @Data
        @JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
        @Builder
        public static class Fnsku {
            private String fnsku;
        }
    }
}