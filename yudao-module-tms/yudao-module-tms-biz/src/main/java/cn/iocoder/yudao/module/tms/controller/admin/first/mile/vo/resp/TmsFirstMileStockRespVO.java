package cn.iocoder.yudao.module.tms.controller.admin.first.mile.vo.resp;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 头程单 - 库存查询 Response VO
 *
 * @author wdy
 */
@Schema(description = "管理后台 - 头程单库存查询 Response VO")
@Data
public class TmsFirstMileStockRespVO {

    // ========== 产品信息 ==========

    @Schema(description = "产品编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "1024")
    private Long productId;

    // ========== 仓库信息 ==========

    @Schema(description = "仓库编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "1024")
    private Long warehouseId;

    // ========== 公司信息 ==========

    @Schema(description = "公司编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "1024")
    private Long companyId;

    // ========== 入库信息 ==========

    @Schema(description = "入库部门编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "1024")
    private Long inboundDeptId;

    @Schema(description = "入库公司编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "1024")
    private Long inboundCompanyId;

    @Schema(description = "入库状态", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    private Integer inboundStatus;

    @Schema(description = "实际入库量", requiredMode = Schema.RequiredMode.REQUIRED, example = "100")
    private Integer actualQty;

    @Schema(description = "计划入库量", requiredMode = Schema.RequiredMode.REQUIRED, example = "100")
    private Integer planQty;

    @Schema(description = "已上架量", requiredMode = Schema.RequiredMode.REQUIRED, example = "100")
    private Integer shelveClosedQty;

    @Schema(description = "批次号", requiredMode = Schema.RequiredMode.REQUIRED, example = "BATCH001")
    private String batchNo;

    @Schema(description = "入库时间", requiredMode = Schema.RequiredMode.REQUIRED)
    private LocalDateTime inboundTime;

    @Schema(description = "入库单号", requiredMode = Schema.RequiredMode.REQUIRED, example = "IN001")
    private String inboundCode;

    // ========== 库位信息 ==========

    @Schema(description = "库位编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "1024")
    private Long binId;

//    @Schema(description = "库位编码", requiredMode = Schema.RequiredMode.REQUIRED, example = "BIN001")
//    private String binCode;

    @Schema(description = "仓位可用库存", requiredMode = Schema.RequiredMode.REQUIRED, example = "100")
    private Integer binAvailableQty;

    @Schema(description = "仓位可售库存", requiredMode = Schema.RequiredMode.REQUIRED, example = "90")
    private Integer binSellableQty;

    @Schema(description = "仓位待出库库存", requiredMode = Schema.RequiredMode.REQUIRED, example = "10")
    private Integer binOutboundPendingQty;

    // ========== 上架信息 ==========

    @Schema(description = "上架单ID", example = "PICK001")
    private String pickupId;

    @Schema(description = "上架数量", example = "100")
    private Integer pickupQty;

    @Schema(description = "上架单号", example = "PICK001")
    private String pickupCode;

    // ========== 其他信息 ==========

    @Schema(description = "库龄", example = "30")
    private Integer age;

    @Schema(description = "备注", example = "测试备注")
    private String remark;
} 