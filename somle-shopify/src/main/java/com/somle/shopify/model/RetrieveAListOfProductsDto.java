package com.somle.shopify.model;

import lombok.Data;

/**
 * @description:
 * @author: LaoSan
 * @create: 2025-03-18 15:04
 **/
@Data
public class RetrieveAListOfProductsDto {


    private Long since_id;

    private Long limit;

    private String shopName;

    private Integer successCode;

}
