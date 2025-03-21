package com.somle.walmart.domain;

import lombok.Data;

/**
 * @description:
 * @author: LaoSan
 * @create: 2025-03-21 10:45
 **/
@Data
public class GetAllItemsDto {

    private String nextCursor;

    private Long limit;

    private String shopName;

    private Integer successCode;

}
