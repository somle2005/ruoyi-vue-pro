package cn.iocoder.yudao.module.wms.controller.admin.stock.logic.vo;

import cn.iocoder.yudao.module.wms.controller.admin.company.FmsCompanySimpleRespVO;
import cn.iocoder.yudao.module.wms.controller.admin.dept.DeptSimpleRespVO;
import cn.iocoder.yudao.module.wms.controller.admin.product.WmsProductRespSimpleVO;
import cn.iocoder.yudao.module.wms.controller.admin.warehouse.vo.WmsWarehouseSimpleRespVO;
import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

import static cn.iocoder.yudao.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

/**
 * @author jisencai
 * @table-fields : tenant_id,creator,company_id,outbound_pending_qty,create_time,available_qty,updater,update_time,product_id,shelving_pending_qty,id,dept_id,warehouse_id
 */
@Schema(description = "管理后台 - 逻辑库存 Response VO")
@Data
@ExcelIgnoreUnannotated
public class WmsStockLogicRespVO {

    @Schema(description = "主键", requiredMode = Schema.RequiredMode.REQUIRED, example = "17082")
    @ExcelProperty("主键")
    private Long id;

    @Schema(description = "仓库ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "14322")
    @ExcelProperty("仓库ID")
    private Long warehouseId;

    @Schema(description = "仓库")
    private WmsWarehouseSimpleRespVO warehouse;

    @Schema(description = "产品ID", example = "1919")
    @ExcelProperty("产品ID")
    private Long productId;

    @Schema(description = "产品")
    private WmsProductRespSimpleVO product;

    @Schema(description = "创建时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("创建时间")
    private LocalDateTime createTime;

    @Schema(description = "库存财务主体公司ID")
    @ExcelProperty("库存财务主体公司ID")
    private Long companyId;

    @Schema(description = "财务公司")
    @ExcelProperty("财务公司")
    private FmsCompanySimpleRespVO company;

    @Schema(description = "库存归属部门ID")
    @ExcelProperty("库存归属部门ID")
    private Long deptId;

    @Schema(description = "部门")
    @ExcelProperty("部门")
    private DeptSimpleRespVO dept;

    @Schema(description = "创建者")
    @ExcelProperty("创建者")
    private String creator;

    @Schema(description = "创建者名称")
    @ExcelProperty("创建者名称")
    private String creatorName;

    @Schema(description = "更新者")
    @ExcelProperty("更新者")
    private String updater;

    @Schema(description = "更新者名称")
    @ExcelProperty("更新者名称")
    private String updaterName;

    @Schema(description = "更新时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    @ExcelProperty("更新时间")
    private LocalDateTime updateTime;

    @Schema(description = "租户编号")
    @ExcelProperty("租户编号")
    private Long tenantId;

    @Schema(description = "可用库存")
    @ExcelProperty("可用库存")
    private Integer availableQty;

    @Schema(description = "待出库库存")
    @ExcelProperty("待出库库存")
    private Integer outboundPendingQty;

    @Schema(description = "待上架数量，上架是指从拣货区上架到货架")
    @ExcelProperty("待上架数量")
    private Integer shelvePendingQty;
}
