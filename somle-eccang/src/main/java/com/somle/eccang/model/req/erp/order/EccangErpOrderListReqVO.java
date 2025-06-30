package com.somle.eccang.model.req.erp.order;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class EccangErpOrderListReqVO {

    // 分页参数

    private Integer page;                 // 页码 [默认1]

    private Integer pageSize;           // 每页数量 [默认50，最大100]
    

    private Integer getDetail;           // 是否返回订单明细 [0否|1是]

    private Integer getAddress;           // 是否返回订单地址 [0否|1是]

    private Integer getCustomOrderType;  // 是否返回自定义订单类型 [0否|1是]
    
    private Integer year;                    // 查询年份(如2019)，不支持不要传

    private Condition condition;             // 查询条件对象
    
    // ================= 嵌套查询条件类 =================
    @Data
    @Builder
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class Condition {
        
        // 列表查询参数
        private List<String> referenceNoList;          // 参考号列表
        private List<String> orderCodeList;            // 销售单号列表
        private List<String> warehouseOrderCodeList;  // 仓库单号列表
        private List<String> productSkuList;           // 仓库SKU列表
        private List<String> userAccountList;         // 平台账号列表
        private List<String> shippingMethod;          // 运输方式代码列表
        private List<String> warehouseIdList;         // 仓库ID列表
        
        // 状态参数
        private String status;                       // 订单状态:0-8
        private List<String> processAgains;          // 待发货处理状态(1已处理/2未处理/3异常)
        
        // 时间范围参数
        private LocalDateTime createdDateStart;       // 最早创建时间
        private LocalDateTime createdDateEnd;         // 最晚创建时间
        private LocalDateTime updateDateStart;        // 最早更新时间
        private LocalDateTime updateDateEnd;           // 最晚更新时间
        private LocalDateTime shipDateStart;          // 最早发货时间
        private LocalDateTime shipDateEnd;            // 最晚发货时间
        private LocalDateTime platformShipDateStart;  // 平台发货开始时间
        private LocalDateTime platformShipDateEnd;     // 平台发货结束时间
        private LocalDateTime warehouseShipDateStart;  // 仓库发货开始时间
        private LocalDateTime warehouseShipDateEnd;     // 仓库发货结束时间
        private LocalDateTime platformPaidDateStart;   // 平台付款开始时间
        private LocalDateTime platformPaidDateEnd;      // 平台付款结束时间
        private LocalDateTime platformCreateDateStart; // 平台创建开始时间
        private LocalDateTime platformCreateDateEnd;   // 平台创建结束时间
        private LocalDateTime dateCreateSysStart;     // 易仓系统创建开始时间
        private LocalDateTime dateCreateSysEnd;       // 易仓系统创建结束时间
        private LocalDateTime trackDeliveredTimeStart; // 签收开始时间
        private LocalDateTime trackDeliveredTimeEnd;   // 签收结束时间
        
        // 其他查询条件
        private String buyerName;                    // 买家名称
        private String platform;                     // 平台代码(如aliexpresscn)

        private Integer idDesc;                 // 排序方式 [0升序|1降序]
        
        private String customOrderType;             // 自定义订单类型名称
        private String isMark;                      // 订单标记状态 [0未标记|1已标记]
        private String createType;                  // 创建类型(api/upload/hand)
        
        private Integer isCod;                       // 是否货到付款 [0否|1是]
        private Integer isTransferFbaDelivery;      // 是否转FBA配送 [0否|1是]
        
        private Integer fulfillmentType;            // 订单发货类型 [0自发货|1平台海外仓]
    }
}