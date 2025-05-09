package cn.iocoder.yudao.module.srm.controller.admin.purchase.vo.in;

import cn.iocoder.yudao.module.srm.controller.admin.purchase.vo.base.SrmPurchaseBaseRespVO;
import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Schema(description = "管理后台 - ERP 采购入库 Response VO")
@Data
@ExcelIgnoreUnannotated
public class SrmPurchaseInBaseRespVO extends SrmPurchaseBaseRespVO {

    // ========== 主表字段 ==========

    @Schema(description = "编号")
    private Long id;

    @Schema(description = "入库单编号")
    @ExcelProperty("入库单编号")
    private String code;

    @Schema(description = "单据日期")
    private LocalDateTime billTime;

    @Schema(description = "结算日期")
    private LocalDateTime settlementDate;

    @Schema(description = "收获地址")
    private String address;

    @Schema(description = "付款状态")
    private Integer payStatus;

    @Schema(description = "对账状态(false:未对账 ，true:已对账)")
    private Boolean reconciliationStatus;

    @Schema(description = "入库时间")
    @ExcelProperty("入库时间")
    private LocalDateTime inTime;

    @Schema(description = "审核意见")
    private String reviewComment;

    @Schema(description = "商品总体积,单位：m^3 平米")
    private Double totalVolume;

    @Schema(description = "商品总毛量,单位：kg 千克")
    private Double totalWeight;

    @Schema(description = "版本号")
    private Integer version;

    @Schema(description = "入库项列表")
    private List<Item> items;

    // ========== 子项字段 ==========

    @Data
    public static class Item {

        // ========== 基本信息 ==========

        @Schema(description = "入库项id")
        private Long id;

        @Schema(description = "采购入库编号")
        private Long inId;

        @Schema(description = "仓库id")
        private Long warehouseId;

        @Schema(description = "仓库名称")
        private String warehouseName;

        @Schema(description = "产品id(冗余暂存)")
        private Long productId;

        @Schema(description = "产品单位")
        private Long productUnitId;

        @Schema(description = "产品单位名称")
        private String productUnitName;

        @Schema(description = "型号规格(产品带出)")
        private String model;

        // ========== 产品扩展字段 ==========

        @Schema(description = "报关品名")
        private String declaredType;

        @Schema(description = "报关品名英文")
        private String declaredTypeEn;

        @Schema(description = "条码(产品)")
        private String barCode;

        @Schema(description = "产品名称")
        private String productName;

        @Schema(description = "x码")
        private String xcode;

        @Schema(description = "箱率")
        private String containerRate;

        // ========== 数量金额相关 ==========

        @Schema(description = "产品单价")
        private BigDecimal productPrice;

        @Schema(description = "库存数量(WMS获得)")
        private BigDecimal stockCount;

        @Schema(description = "到货数量")
        private BigDecimal qty;

        @Schema(description = "实际入库数量")
        private BigDecimal actualQty;

        @Schema(description = "总价，单位：元")
        private BigDecimal totalPrice;

        @Schema(description = "税率，百分比")
        private BigDecimal taxPercent;

        @Schema(description = "税额，单位：元")
        private BigDecimal taxPrice;

        @Schema(description = "含税单价")
        private BigDecimal actTaxPrice;

        @Schema(description = "价税合计")
        private BigDecimal allAmount;

        @Schema(description = "合计产品价格，单位：元")
        private BigDecimal totalProductPrice;

        @Schema(description = "合计税价，单位：元")
        private BigDecimal totalTaxPrice;

        @Schema(description = "已付款金额")
        private BigDecimal payPrice;

        @Schema(description = "付款状态")
        private Integer payStatus;

        // ========== 来源及标识 ==========

        @Schema(description = "采购订单项id")
        private Long orderItemId;

        @Schema(description = "单据来源")
        private String source;

        // ========== 人员组织 ==========

        @Schema(description = "申请人id")
        private Long applicantId;

        @Schema(description = "申请人名称")
        private String applicantName;

        @Schema(description = "申请部门id")
        private Long applicationDeptId;

        @Schema(description = "申请部门名称")
        private String applicationDeptName;

        // ========== 扩展字段 ==========

        @Schema(description = "备注")
        private String remark;

        @Schema(description = "版本号")
        private Integer version;
    }
}
