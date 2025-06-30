package com.somle.lingxing.model.reps;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 产品查询API实体类
 */
@Data
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
public class LingXingGetProductReps {
    private Integer code;
    private ResponseData data;
    private String msg;

    @Data
    @NoArgsConstructor
    @JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
    public static class ResponseData {
        private Integer total;
        private Integer page;
        private Integer pageSize;
        private Integer pages;
        private List<Product> records;

        @Data
        @NoArgsConstructor
        @JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
        public static class Product {
            private String sku;
            private String productName;
            private String productAliasName;
            private String approveStatus;
            private String productDescription;
            private String mainCode;
            private String otherCode;
            private String fnsku;
            private Double length;
            private Double lengthBs;
            private Double width;
            private Double widthBs;
            private Double height;
            private Double heightBs;
            private Double weight;
            private Double weightBs;
            private Double wmsLength;
            private Double wmsLengthBs;
            private Double wmsWidth;
            private Double wmsWidthBs;
            private Double wmsHeight;
            private Double wmsHeightBs;
            private Double wmsWeight;
            private Double wmsWeightBs;
            private String declareNameCn;
            private String declareNameEn;
            private String customhouseCode;
            private String currencyCode;
            private Double declarePrice;
            private String countryOfOriginName;
            private Integer dangerousCargo;
        }
    }

}