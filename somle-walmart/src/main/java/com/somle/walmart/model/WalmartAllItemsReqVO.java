package com.somle.walmart.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WalmartAllItemsReqVO {
    private String nextCursor; // Pagination cursor for retrieving more than 200 items
    private String sku; // Stock Keeping Unit, unique ID specified by the seller
    private String gtin; // Global Trade Item Number, 14-digit unique identifier
    private String offset; // Starting point for the response, defaults to 0
    private String limit; // Number of entities to return, defaults to 20, max 50
    private String lifecycleStatus; // Status of the item in the lifecycle
    private String publishedStatus; // Status of the item in the submission process
    private String variantGroupId; // Identifies items in a variant group
    private String condition; // Condition of the product
    private String availability; // Availability of the product
    private boolean showDuplicateItemInfo; // Whether to include duplicate item details
}
