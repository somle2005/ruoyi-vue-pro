package cn.iocoder.yudao.module.erp.controller.admin.product.vo.product;

import lombok.*;
import java.util.*;
import io.swagger.v3.oas.annotations.media.Schema;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import java.math.BigDecimal;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

import static cn.iocoder.yudao.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

/**
 * @author Administrator
 */
@Schema(description = "管理后台 - ERP 产品分页 Request VO")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ErpProductPageReqVO extends PageParam {

    @Schema(description = "产品名称", example = "张三")
    private String name;

    @Schema(description = "产品分类编号", example = "30796")
    private Long categoryId;

    @Schema(description = "采购价格，单位：元", example = "29130")
    private BigDecimal purchasePrice;

    @Schema(description = "创建时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] createTime;

    @Schema(description = "部门id", example = "3419")
    private Long deptId;

    @Schema(description = "SKU（编码）")
    private String barCode;

    @Schema(description = "单位编号", example = "9042")
    private Long unitId;

    @Schema(description = "材料（中文）")
    private String material;

    @Schema(description = "产品状态（1启用，0禁用）", example = "2")
    private Boolean status;

    @Schema(description = "基础重量（kg）")
    private BigDecimal weight;

    @Schema(description = "系列")
    private String series;

    @Schema(description = "型号")
    private String model;

    @Schema(description = "流水号")
    private Integer serial;

    @Schema(description = "生产编号")
    private String productionNo;

    @Schema(description = "基础宽度（mm）")
    private BigDecimal width;

    @Schema(description = "基础长度（mm）")
    private BigDecimal length;

    @Schema(description = "基础高度（mm）")
    private BigDecimal height;

    @Schema(description = "图片url", example = "https://www.iocoder.cn")
    private String imageUrl;

    @Schema(description = "指导价，json格式", example = "4771")
    private String guidePrice;

    @Schema(description = "专利")
    private String patent;

    @Schema(description = "PO产品经理id", example = "18303")
    private Long poId;

    @Schema(description = "ID工业设计id", example = "14564")
    private Long idId;

    @Schema(description = "RD研发工程师id", example = "13409")
    private Long rdId;

    @Schema(description = "维护工程师id", example = "11519")
    private Long meId;

    @Schema(description = "备注", example = "随便")
    private String remark;

}