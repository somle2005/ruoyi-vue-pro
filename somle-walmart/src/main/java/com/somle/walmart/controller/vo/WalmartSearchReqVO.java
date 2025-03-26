package com.somle.walmart.controller.vo;

import lombok.Data;

/**
 * @description:
 * @author: LaoSan
 * @create: 2025-03-24 10:26
 **/
@Data
public class WalmartSearchReqVO {

    private String gtin;

    private Integer successCode;

    private Long sleepTime;

}
