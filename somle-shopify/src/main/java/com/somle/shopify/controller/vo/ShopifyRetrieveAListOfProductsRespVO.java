package com.somle.shopify.controller.vo;

import cn.iocoder.yudao.framework.common.util.custom.MyHtmlEscapeUtil;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.List;

/**
 * @description:
 * @author: LaoSan
 * @create: 2025-03-18 15:44
 **/
@NoArgsConstructor
@Data
public class ShopifyRetrieveAListOfProductsRespVO {

    private List<ProductsDTO> products;

    @NoArgsConstructor
    @Data
    public static class ProductsDTO {
        private Long id;
        private String sku;
        private String title;
        private String bodyHtml;
        private String vendor;
        private String productType;
        private String createdAt;
        private String handle;
        private String updatedAt;
        private String publishedAt;
        private String templateSuffix;
        private String publishedScope;
        private String tags;
        private String status;
        private String adminGraphqlApiId;
        private List<VariantsDTO> variants;
        private List<OptionsDTO> options;
        private List<ImagesDTO> images;
        private ImageDTO image;

        public String getBodyHtml() {
            return MyHtmlEscapeUtil.escapeHtmlInTags(bodyHtml);
        }

        public String getSku() {
            return id.toString();
        }

        @NoArgsConstructor
        @Data
        public static class ImageDTO {
            private Long id;
            private Object alt;
            private Integer position;
            private Long productId;
            private String createdAt;
            private String updatedAt;
            private String adminGraphqlApiId;
            private Integer width;
            private Integer height;
            private String src;
            private List<?> variantIds;
        }

        @NoArgsConstructor
        @Data
        public static class VariantsDTO {
            private Long id;
            private Long productId;
            private String title;
            private String price;
            private Integer position;
            private String inventoryPolicy;
            private String compareAtPrice;
            private String option1;
            private Object option2;
            private Object option3;
            private String createdAt;
            private String updatedAt;
            private Boolean taxable;
            private String barcode;
            private String fulfillmentService;
            private Integer grams;
            private String inventoryManagement;
            private Boolean requiresShipping;
            private String sku;
            private BigDecimal weight;
            private String weightUnit;
            private Long inventoryItemId;
            private Integer inventoryQuantity;
            private Integer oldInventoryQuantity;
            private String adminGraphqlApiId;
            private Long imageId;

            public String getSku() {
                String finalSku = sku;
                if (!StringUtils.hasText(sku)) {
                    finalSku = id.toString();
                }
                return finalSku;
            }
        }

        @NoArgsConstructor
        @Data
        public static class OptionsDTO {
            private Long id;
            private Long productId;
            private String name;
            private Integer position;
            private List<String> values;
        }

        @NoArgsConstructor
        @Data
        public static class ImagesDTO {
            private Long id;
            private Object alt;
            private Integer position;
            private Long productId;
            private String createdAt;
            private String updatedAt;
            private String adminGraphqlApiId;
            private Integer width;
            private Integer height;
            private String src;
            private List<?> variantIds;
        }
    }
}
