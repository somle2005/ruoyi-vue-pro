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
public class EccangErpOrdersReqVO {

    // 基本参数
    private List<String> orderCodeArr; // 订单号数组 [必填]

    // 发货相关参数
    private String verifyType;                 // 发货方式 [默认0]
    private String warehouseCode;                   // 仓库代码
    private String shippingMethod;                 // 配送方式
    private String warehouseVerifyShippingMethod; // 需仓库确认配送方式 [默认0]
    private String warehouseHoldInventory;      // 锁定库存 [默认0]
    private String notPlatformShipped;          // 不标记订单发货 [默认0]
    private String markCombinationOrder;        // 标记为组装产品订单 [默认0]

    // 筛选条件参数
    private List<String> platformArr;              // 平台 ["ebay","b2c"]
    private List<String> sellerIdArr;              // 账号
    private List<Integer> warehouseIdArr;          // 仓库ID [10,11,12,13]
    private List<Integer> category;                 // 品类ID [36,30]
    private List<String> productBarcodeArr;         // SKU ["HL605","HHHH"]
    private List<String> smCodeArr;                 // 运输方式 ["DEHYDHL","DEDHLNORMAL-PARCELS"]
    private List<String> countryCodeIn;             // 国家 ["DE","US"]
    private List<String> code;                      // 单号 ["188444436012","SO311507140050"]
    private String orderStatus;                   // 订单状态 [0-8]
    
    // 买家信息
    private String addressee;                     // 收件人(模糊)
    private List<String> buyerId;                 // 买家ID
    private String buyerName;                     // 买家姓名(模糊)
    private String buyerMail;                     // 买家邮箱(模糊)
    
    // 负责人信息
    private List<Integer> buyerResponsibleId;     // 采购负责人
    private List<Integer> developResponsibleId;    // 开发负责人
    private List<Integer> sellerResponsibleId;      // 销售负责人

    // 时间范围参数
    private LocalDateTime payDateFor;                      // 付款时间(起始)
    private LocalDateTime payDateTo;                        // 付款时间(截止)
    private LocalDateTime addDateFor;                       // 审核时间(起始)
    private LocalDateTime addDateTo;                        // 审核时间(截止)
    private LocalDateTime shipDateFor;                      // 发货时间(起始)
    private LocalDateTime shipDateTo;                        // 发货时间(截止)
    private LocalDateTime printDateFor;                     // 打印时间(起始)
    private LocalDateTime printDateTo;                       // 打印时间(截止)
    private LocalDateTime packDateFor;                       // 打包时间(起始)
    private LocalDateTime packDateTo;                        // 打包时间(截止)
    private LocalDateTime updateDateFor;                    // 更新开始时间
    private LocalDateTime updateDateTo;                      // 更新结束时间

    // 其他参数
    private Integer orderYear;                     // 订单年份 2018
    private List<String> orderBy;                  // 排序方式 ["order_id desc"]
    private Integer page;                         // 页码 [默认1]
    private Integer pageSize;                    // 每页数量 [默认10]
}