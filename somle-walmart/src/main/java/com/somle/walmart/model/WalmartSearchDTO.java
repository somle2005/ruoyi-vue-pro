package com.somle.walmart.model;

import lombok.Data;

/**
 * @description:
 * @author: LaoSan
 * @create: 2025-03-24 10:26
 **/
@Data
public class WalmartSearchDTO {

    private String gtin;

    private String shopName;

    private Integer successCode;

    private Long sleepTime;

}
