package com.somle.eccang.model;

import com.alibaba.fastjson2.PropertyNamingStrategy;
import com.alibaba.fastjson2.annotation.JSONType;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
@JSONType(naming = PropertyNamingStrategy.SnakeCase)
public class EccangCategory {
    private String actionType;
    private Integer pcId;
    private String pcName;
    private String pcNameEn;
    private Integer pcPid;
    private Integer pcLevel;
    private String pcReferenceCode;
    private String pcHsCode;
    private String pcUpdateTime;
    private String userOrganizationId;
    private String pcSortId;
    private String warehouseId;
    private String pcShortname;
}
