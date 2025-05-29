package com.somle.manomano.model.reps;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class OffersInfoRespVO {
    @JsonProperty("content")
    private List<ContentDTO> content;
    @JsonProperty("pagination")
    private PaginationDTO pagination;

    @NoArgsConstructor
    @Data
    public static class PaginationDTO {
        @JsonProperty("page")
        private Integer page;
        @JsonProperty("pages")
        private Integer pages;
        @JsonProperty("items")
        private Integer items;
        @JsonProperty("limit")
        private Integer limit;
        @JsonProperty("links")
        private LinksDTO links;

        @NoArgsConstructor
        @Data
        public static class LinksDTO {
            @JsonProperty("previous")
            private String previous;
            @JsonProperty("next")
            private String next;
            @JsonProperty("first")
            private String first;
            @JsonProperty("last")
            private String last;
            @JsonProperty("goto")
            private String gotoX;
        }
    }

    @NoArgsConstructor
    @Data
    public static class ContentDTO {
        @JsonProperty("sku")
        private String sku;
        @JsonProperty("price")
        private Double price;
        @JsonProperty("retail_price")
        private Double retailPrice;
        @JsonProperty("stock")
        private Integer stock;
        @JsonProperty("id_me")
        private Integer idMe;
        @JsonProperty("id_me_link")
        private String idMeLink;
        @JsonProperty("carrier")
        private String carrier;
        @JsonProperty("shipping_time")
        private String shippingTime;
        @JsonProperty("offer_is_online")
        private Boolean offerIsOnline;
        @JsonProperty("frozen_price")
        private Boolean frozenPrice;
        @JsonProperty("frozen_retail_price")
        private Boolean frozenRetailPrice;
        @JsonProperty("frozen_stock")
        private Boolean frozenStock;
        @JsonProperty("status")
        private String status;
        @JsonProperty("errors")
        private List<?> errors;
    }
}
