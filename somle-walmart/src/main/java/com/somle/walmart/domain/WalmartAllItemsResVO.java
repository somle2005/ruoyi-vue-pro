package com.somle.walmart.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @description:
 * @author: LaoSan
 * @create: 2025-03-19 09:43
 **/
@NoArgsConstructor
@Data
public class WalmartAllItemsResVO {


    private List<ItemResponseDTO> itemResponse;
    private Integer totalItems;
    private String nextCursor;

    @NoArgsConstructor
    @Data
    public static class ItemResponseDTO {
        private String mart;
        private String sku;
        private String condition;
        private String availability;
        private String wpid;
        private String upc;
        private String gtin;
        private String productName;
        private String shelf;
        private String productType;
        private PriceDTO price;
        private String publishedStatus;
        private String lifecycleStatus;
        private Boolean isDuplicate;
        private String variantGroupId;
        private VariantGroupInfoDTO variantGroupInfo;

        @NoArgsConstructor
        @Data
        public static class PriceDTO {
            private String currency;
            private Double amount;
        }

        @NoArgsConstructor
        @Data
        public static class VariantGroupInfoDTO {
            private Boolean isPrimary;
            private List<GroupingAttributesDTO> groupingAttributes;

            @NoArgsConstructor
            @Data
            public static class GroupingAttributesDTO {
                private String name;
                private String value;
            }
        }
    }
}
