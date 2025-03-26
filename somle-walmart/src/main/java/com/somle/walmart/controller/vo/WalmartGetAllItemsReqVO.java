package com.somle.walmart.controller.vo;

import lombok.Data;

/**
 * @description:
 * @author: LaoSan
 * @create: 2025-03-21 10:45
 **/
@Data
public class WalmartGetAllItemsReqVO {

    private String nextCursor;

    private Long limit;

    private Integer successCode;

    private Long sleepTime;

}
