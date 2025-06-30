package com.somle.eccang.model.req.wms.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class EccangWMSProductListReqVo {
    @JsonProperty("pageSize")
    private Integer pageSize;          // 每页记录数
    private Integer page;              // 当前页码
    private String productSku;         // 单个产品SKU
    private List<String> productSkuArr; // 多个产品SKU数组
    private String startTime;          // 开始时间（格式：yyyy-MM-dd HH:mm:ss）
    private String endTime;            // 结束时间
    private String updateStartTime;    // 更新开始时间
    private String updateEndTime;      // 更新结束时间
}