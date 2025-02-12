package com.somle.amazon.controller.vo;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author LeeFJ
 * Amazon SP Catalog API Request Object
 */
@Data
@Builder
public class AmazonSpCatalogReqVO {

    private List<String> identifiers; // Optional: A comma-delimited list of product identifiers.
    private IdentifiersType identifiersType; // Optional: Type of product identifiers.
    private List<String> marketplaceIds; // Required: A comma-delimited list of Amazon marketplace identifiers.
    private List<IncludedData> includedData = List.of(IncludedData.ATTRIBUTES); // Optional: Default: summaries.

    private String locale; // Optional: Locale for retrieving localized summaries. Defaults to the primary locale of the marketplace.
    // Path Parameter
    private String sellerId; // Required: A selling partner identifier.

    private String keywords; // Optional: A comma-delimited list of words to search the Amazon catalog for. Note: Cannot be used with identifiers.




    private String brandNames; // Optional: A comma-delimited list of brand names to limit the search for keywords-based queries. Note: Cannot be used with identifiers.

    private String classificationIds; // Optional: A comma-delimited list of classification identifiers to limit the search for keywords-based queries. Note: Cannot be used with identifiers.


    private Integer pageSize = 10; // Optional: Default: 10. Maximum: 20.

    private String pageToken; // Optional: Token for pagination.

    private String keywordsLocale; // Optional: The language of the keywords provided for keywords-based queries. Defaults to the primary locale of the marketplace. Note: Cannot be used with identifiers.


    // Enums for specific fields
    public enum IncludedData {
        ATTRIBUTES,// A JSON object containing structured item attribute data keyed by attribute name. Catalog item attributes conform to the related Amazon product type definitions available in the Selling Partner API for Product Type Definitions.
        CLASSIFICATIONS,// Classifications (browse nodes) for an item in the Amazon catalog.
        DIMENSIONS,// Dimensions for an item in the Amazon catalog.
        IDENTIFIERS,// Identifiers associated with the item in the Amazon catalog, such as UPC and EAN identifiers.
        IMAGES,// Images for an item in the Amazon catalog.
        PRODUCTTYPES,// Product types associated with the Amazon catalog item.
        RELATIONSHIPS,// Relationship details of an Amazon catalog item (for example, variations).
        SALESRANKS,// Sales ranks of an Amazon catalog item.
        SUMMARIES,// Summary details of an Amazon catalog item. Refer to the "attributes" of an Amazon catalog item for more details.
        VENDORDETAILS// Vendor details associated with an Amazon catalog item. Vendor details are available to vendors only.
    }

    public enum IdentifiersType {
        ASIN, // Amazon Standard Identification Number.
        EAN, // European Article Number.
        GTIN, // Global Trade Item Number.
        ISBN, // International Standard Book Number.
        JAN, // Japanese Article Number.
        MINSAN, // Minsan Code.
        SKU, // Stock Keeping Unit, a seller-specified identifier for an Amazon listing. Note: Must be accompanied by sellerId.
        UPC // Universal Product Code.
    }

}

