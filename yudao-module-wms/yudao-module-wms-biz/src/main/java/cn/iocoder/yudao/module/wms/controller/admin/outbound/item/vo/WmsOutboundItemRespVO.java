package cn.iocoder.yudao.module.wms.controller.admin.outbound.item.vo;

import cn.iocoder.yudao.module.wms.controller.admin.company.FmsCompanySimpleRespVO;
import cn.iocoder.yudao.module.wms.controller.admin.dept.DeptSimpleRespVO;
import cn.iocoder.yudao.module.wms.controller.admin.inbound.vo.WmsInboundRespVO;
import cn.iocoder.yudao.module.wms.controller.admin.product.WmsProductRespSimpleVO;
import cn.iocoder.yudao.module.wms.controller.admin.warehouse.bin.vo.WmsWarehouseBinRespVO;
import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

import static cn.iocoder.yudao.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

/**
 * @author jisencai
 * @table-fields : tenant_id,creator,company_id,create_time,bin_id,plan_qty,upstream_id,remark,outbound_id,updater,update_time,outbound_status,actual_qty,product_id,id,dept_id
 */
@Schema(description = "管理后台 - 出库单详情 Response VO")
@Data
@ExcelIgnoreUnannotated
public class WmsOutboundItemRespVO {

    @Schema(description = "主键", requiredMode = Schema.RequiredMode.REQUIRED, example = "27153")
    @ExcelProperty("主键")
    private Long id;

    @Schema(description = "入库单ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "6602")
    @ExcelProperty("出库单ID")
    private Long outboundId;

    @Schema(description = "标准产品ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "20572")
    @ExcelProperty("标准产品ID")
    private Long productId;

    @Schema(description = "创建时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("创建时间")
    private LocalDateTime createTime;

    @Schema(description = "创建人姓名", example = "张三")
    @ExcelProperty("创建人姓名")
    private String creatorName;

    @Schema(description = "更新人姓名", example = "李四")
    @ExcelProperty("更新人姓名")
    private String updaterName;

    @Schema(description = "产品")
    @ExcelProperty("产品")
    private WmsProductRespSimpleVO product;

    @Schema(description = "出库单")
    @ExcelProperty("出库单")
    private WmsInboundRespVO outbound;

    @Schema(description = "WMS出库状态 ; WmsOutboundStatus : 0-未出库 , 1-部分出库 , 2-已出库")
    @ExcelProperty("WMS出库状态")
    private Integer outboundStatus;

    @Schema(description = "创建者")
    @ExcelProperty("创建者")
    private String creator;

    @Schema(description = "更新者")
    @ExcelProperty("更新者")
    private String updater;

    @Schema(description = "更新时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    @ExcelProperty("更新时间")
    private LocalDateTime updateTime;

    @Schema(description = "租户编号")
    @ExcelProperty("租户编号")
    private Long tenantId;

    @Schema(description = "出库库位ID，在创建时指定；bin_id 和 inbount_item_id 需要指定其中一个，优先使用 inbount_item_id")
    @ExcelProperty("出库库位ID")
    private Long binId;

    @Schema(description = "实际出库量")
    @ExcelProperty("实际出库量")
    private Integer actualQty;

    @Schema(description = "计划出库量")
    @ExcelProperty("计划出库量")
    private Integer planQty;

    @Schema(description = "库存财务公司ID")
    @ExcelProperty("库存财务公司ID")
    private Long companyId;

    @Schema(description = "库存归属部门ID")
    @ExcelProperty("库存归属部门ID")
    private Long deptId;

    @Schema(description = "库位")
    @ExcelProperty("库位")
    private WmsWarehouseBinRespVO bin;

    @Schema(description = "备注")
    @ExcelProperty("备注")
    private String remark;

    @Schema(description = "来源明细行ID")
    @ExcelProperty("来源明细行ID")
    private Long upstreamId;

    @Schema(description = "部门")
    private DeptSimpleRespVO dept;

    @Schema(description = "财务公司")
    @ExcelProperty("财务公司")
    private FmsCompanySimpleRespVO company;

    @Schema(description = "箱率")
    @ExcelProperty("箱率")
    private String containerRate;

    @Schema(description = "箱数")
    @ExcelProperty("箱数")
    private Integer boxQty;
}
