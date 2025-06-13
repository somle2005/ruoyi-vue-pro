package com.somle.shopify.enums;

public interface ShopifyGraphqlConst {

    // $fulfillmentOrderId: ID!
    String ORDER_PAGE_QUERY =
            """
                            query ($first: Int! , $cursor: String , $query:String  ){
                                orders(first: $first, after: $cursor, query: $query ,sortKey: CREATED_AT) {
                                    edges {
                                        node {
                                            id
                                            name
                                            poNumber
                                            displayFinancialStatus
                                            displayFulfillmentStatus
                                            currentTotalPriceSet {
                                                shopMoney {
                                                    amount
                                                    currencyCode
                                                }
                                            }
                                            fulfillments {
                                                id
                                            }
                                            updatedAt
                                            createdAt
                                            cancelledAt
                                            cancelReason
                                            risk {
                                                assessments {
                                                    riskLevel
                                                }
                                            }
                                            shippingAddress {
                                                name
                                                phone
                                                address1
                                                address2
                                                city
                                                provinceCode
                                                zip
                                                countryCodeV2
                                            }
                                            lineItems(first: 20) {
                                                edges {
                                                    node {
                                                        sku
                                                        quantity
                                                        originalUnitPriceSet {
                                                            shopMoney {
                                                                amount
                                                                currencyCode
                                                            }
                                                        }
                                                        discountAllocations{
                                                            allocatedAmountSet {
                                                              shopMoney {
                                                                amount
                                                                currencyCode
                                                              }
                                                            }
                                                        }
                                                        taxLines {
                                                            priceSet {
                                                                shopMoney {
                                                                    amount
                                                                    currencyCode
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    pageInfo {
                                        hasNextPage
                                        hasPreviousPage
                                        startCursor
                                        endCursor
                                    }
                                }
                            }
                    """;

    String ORDERS_ID_QUERY =
            """                    
                           query batchGetOrders($ids: [ID!]!) {
                               nodes(ids: $ids) {
                                   ... on Order {
                                       id
                                       name
                                       poNumber
                                       displayFinancialStatus
                                       displayFulfillmentStatus
                                       currentTotalPriceSet {
                                           shopMoney {
                                               amount
                                               currencyCode
                                           }
                                       }
                                       fulfillments {
                                               id
                                           }
                                           updatedAt
                                       createdAt
                                       cancelledAt
                                       cancelReason
                                       risk {
                                           assessments {
                                               riskLevel
                                           }
                                       }
                                       shippingAddress {
                                           name
                                           phone
                                           address1
                                           address2
                                           city
                                           provinceCode
                                           zip
                                           countryCodeV2
                                       }
                                       lineItems(first: 10) {
                                           edges {
                                               node {
                                                   sku
                                                   quantity
                                                   originalUnitPriceSet {
                                                       shopMoney {
                                                           amount
                                                           currencyCode
                                                       }
                                                   }
                                                   discountAllocations {
                                                       allocatedAmountSet {
                                                           shopMoney {
                                                               amount
                                                               currencyCode
                                                           }
                                                       }
                                                   }
                                                   taxLines {
                                                       priceSet {
                                                           shopMoney {
                                                               amount
                                                               currencyCode
                                                           }
                                                       }
                                                   }
                                               }
                                           }
                                       }
                                   }
                               }
                           }
                    """;

    String PRODUCT_PAGE_QUERY =
            """
                            query ($first: Int! , $cursor: String , $query:String  ){
                              products(first: $first, after: $cursor, query: $query ,sortKey: CREATED_AT) {
                                edges {
                                  node {
                                    id
                                    title
                                    vendor
                                    productType
                                    createdAt
                                    handle
                                    updatedAt
                                    publishedAt
                                    templateSuffix
                                    tags
                                    status
                                    variants(first: 100) {
                                      edges {
                                        node {
                                          id
                                          title
                                          price
                                          position
                                          inventoryPolicy
                                          compareAtPrice
                                          createdAt
                                          updatedAt
                                          taxable
                                          barcode
                                          sku
                                          inventoryQuantity
                                        }
                                      }
                                    }
                                    options {
                                      id
                                      name
                                      position
                                      values
                                    }
                                  }
                                }
                                pageInfo {
                                    hasNextPage
                                    hasPreviousPage
                                    startCursor
                                    endCursor
                                }
                              }
                            }
                    """;
    String SHOP_INFO_QUERY =
                    """
                        query {
                          shop {
                            id
                            name
                            email
                            myshopifyDomain
                            url
                            }
                        }
                    """;
}