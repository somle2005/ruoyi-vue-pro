package com.somle.shopify.controller.vo;

import lombok.Data;

/**
 * @description:
 * @author: LaoSan
 * @create: 2025-03-18 15:04
 **/
@Data
public class ShopifyRetrieveAListOfProductsReqVO {


    private Long since_id;

    private Long limit;

    private Integer successCode;

    private Long sleepTime;

}
