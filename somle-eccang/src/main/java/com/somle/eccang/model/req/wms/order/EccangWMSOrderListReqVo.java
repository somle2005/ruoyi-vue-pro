package com.somle.eccang.model.req.wms.order;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Builder
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class EccangWMSOrderListReqVo {

    private Integer pageSize;          // 每页数据长度，最大值100
    
    private Integer page;              // 当前页
    
    // 订单标识
    private String orderCode;          // 订单号
    private String swOrderNumber;      // 公共平台订单号(32字符)
    
    // 状态与方式
    private String orderStatus;        // 订单状态: C-待审核 W-待发货 D-已发货 H-暂存 N-异常订单 P-问题件 X-废弃
    private List<String> orderCodeArr; // 多个订单号(数组格式)
    private String shippingMethod;     // 运输方式代码
    
    // 时间范围参数 (格式: YYYY-MM-DD HH:MM:SS)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createDateFrom;       // 订单创建开始时间
    
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createDateTo;         // 订单创建结束时间
    
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date modifyDateFrom;      // 订单修改开始时间
    
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date modifyDateTo;         // 订单修改结束时间
    
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date shipDateFrom;         // 订单出库开始时间
    
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date shipDateTo;           // 订单出库结束时间
}