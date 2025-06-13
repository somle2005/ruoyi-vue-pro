package com.somle.shopify.model.graphql;

import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
public class ShopifyGraphqlShopInfo {

    private String id;

    private String name;

    private String email;

    private String myshopifyDomain;

    private String url;

}
