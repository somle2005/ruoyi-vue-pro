package com.somle.eccang.model.req;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
//eccang-StpoListNew请求体
public class EccangStpoListNewReqVo {
    private String stpoCode; // 头程单号
    private String tpCode; // 下架单号
    private String serviceNumber; // 服务商单号
    private String orderCode; // 出货单号
    private Integer stpoStatus; // 单据状态
    private String dateFor; // 开始创建时间
    private String dateTo; // 截止创建时间
    private String updateFor; // 更新时间
    private String updateTo; // 更新时间
    private String page; // 页码
    private String pageSize; // 每页数量
    private Integer isStraight; // 是否直发
}