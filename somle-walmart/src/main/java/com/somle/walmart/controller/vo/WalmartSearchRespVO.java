package com.somle.walmart.controller.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @description:
 * @author: LaoSan
 * @create: 2025-03-24 10:27
 **/
@NoArgsConstructor
@Data
public class WalmartSearchRespVO {

    private List<ItemsDTO> items;

    @NoArgsConstructor
    @Data
    public static class ItemsDTO {
        private String itemId;
        private String condition;
        private String availability;
        private Boolean isMarketPlaceItem;
        private List<ImagesDTO> images;
        private String customerRating;
        private PriceDTO price;
        private String description;
        private String title;
        private String brand;
        private String productType;
        private PropertiesDTO properties;

        @NoArgsConstructor
        @Data
        public static class PriceDTO {
            private String amount;
            private String currency;
        }

        @NoArgsConstructor
        @Data
        public static class PropertiesDTO {
            private String numReviews;
            private List<String> categories;
        }

        @NoArgsConstructor
        @Data
        public static class ImagesDTO {
            private String url;
        }
    }
}
