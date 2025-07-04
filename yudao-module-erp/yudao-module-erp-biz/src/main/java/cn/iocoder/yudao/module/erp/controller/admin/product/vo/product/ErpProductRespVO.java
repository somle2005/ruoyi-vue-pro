package cn.iocoder.yudao.module.erp.controller.admin.product.vo.product;

import cn.iocoder.yudao.framework.excel.core.convert.ImageListConverter;
import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;
import cn.iocoder.yudao.module.erp.controller.admin.product.vo.product.json.GuidePriceJson;
import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.converters.bytearray.ByteArrayImageConverter;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Schema(description = "管理后台 - ERP 产品 Response VO")
@Data
@ExcelIgnoreUnannotated
public class ErpProductRespVO extends BaseDO {

    @Schema(description = "产品编号")
    @ExcelProperty("产品编号")
    @ExcelIgnore
    private Long id;

    @Schema(description = "产品名称")
    @ExcelProperty("产品名称")
    private String name;

    @Schema(description = "产品分类编号")
    @ExcelProperty("产品分类编号")
    @ExcelIgnore
    private Long categoryId;

    @Schema(description = "产品分类名称")
    @ExcelProperty("产品分类名称")
    private String categoryName;

    @Schema(description = "部门id")
    @ExcelProperty("部门id")
    @ExcelIgnore
    private Long deptId;

    @Schema(description = "部门名称")
    @ExcelProperty("部门名称")
    private String deptName;

    @Schema(description = "SKU（编码）")
    @ExcelProperty("SKU（编码）")
    private String code;

    @Schema(description = "单位编号")
    @ExcelProperty("单位编号")
    @ExcelIgnore
    private Long unitId;

    @Schema(description = "单位名称")
    @ExcelProperty("单位名称")
    private String unitName;

    @Schema(description = "品牌")
    @ExcelProperty("品牌")
    private String brand;

    @Schema(description = "材料（中文）")
    @ExcelProperty("材料（中文）")
    private String material;

    @Schema(description = "产品材质-关联海关分类")
    @ExcelIgnore
    private Long customCategoryId;

    @Schema(description = "产品状态（1启用，0禁用）")
    @ExcelProperty(value = "产品状态（1启用，0禁用）")
    private Boolean status;

    @Schema(description = "备注")
    @ExcelProperty("备注")
    private String remark;

    @Schema(description = "基础重量（kg）")
    @ExcelProperty("基础重量（kg）")
    private BigDecimal weight;

    @Schema(description = "系列")
    @ExcelProperty("系列")
    private String series;

    @Schema(description = "颜色")
    @ExcelProperty("颜色")
    private String color;

    @Schema(description = "型号")
    @ExcelProperty("型号")
    private String model;

    @Schema(description = "流水号")
    @ExcelProperty("流水号")
    private Integer serial;

    @Schema(description = "生产编号")
    @ExcelProperty("生产编号")
    private String productionNo;

    @Schema(description = "基础宽度（mm）")
    @ExcelProperty("基础宽度（mm）")
    private Integer width;

    @Schema(description = "基础长度（mm）")
    @ExcelProperty("基础长度（mm）")
    private Integer length;

    @Schema(description = "基础高度（mm）")
    @ExcelProperty("基础高度（mm）")
    private Integer height;

    @Schema(description = "主图链接")
    @ExcelProperty(value = "主图链接")
    private String primaryImageUrl;

    @Schema(description = "副图")
    private List<String> secondaryImageUrlList;

    @Schema(hidden = true)
    @ExcelProperty(value = "主图", converter = ByteArrayImageConverter.class)
    private byte[] primaryImage;

    @Schema(hidden = true)
    @ExcelProperty(value = "副图", converter = ImageListConverter.class)
    private List<byte[]> secondaryImageList;

    @Schema(description = "指导价，json格式")
    @ExcelProperty("指导价，json格式")
    private List<GuidePriceJson> guidePriceList;

    @Schema(description = "专利类型")
    @ExcelProperty("专利类型")
    private Integer patentType;

    @Schema(description = "专利国别代码")
    @ExcelProperty("专利国别代码")
    private List<Integer> patentCountryCodeList;

    @Schema(description = "PO产品经理id")
    @ExcelProperty("PO产品经理id")
    @ExcelIgnore
    private Long productOwnerId;

    @Schema(description = "PO产品经理名称")
    @ExcelProperty("PO产品经理名称")
    private String productOwnerName;

    @Schema(description = "ID工业设计id")
    @ExcelProperty("ID工业设计id")
    @ExcelIgnore
    private Long industrialDesignerId;

    @Schema(description = "ID工业设计名称")
    @ExcelProperty("ID工业设计名称")
    private String industrialDesignerName;

    @Schema(description = "RD研发工程师id")
    @ExcelProperty("RD研发工程师id")
    @ExcelIgnore
    private Long researchDeveloperId;

    @Schema(description = "RD研发工程师名称")
    @ExcelProperty("RD研发工程师名称")
    private String researchDeveloperName;

    @Schema(description = "维护工程师id")
    @ExcelProperty("维护工程师id")
    @ExcelIgnore
    private Long maintenanceEngineerId;

    @Schema(description = "维护工程师名称")
    @ExcelProperty("维护工程师名称")
    private String maintenanceEngineerName;

    @Schema(description = "设计说明")
    @ExcelProperty("设计说明")
    private String description;

    @Schema(description = "VESA孔距最小宽度")
    @ExcelProperty("VESA孔距最小宽度")
    private Integer vesaWidthMin;

    @Schema(description = "VESA孔距最大宽度")
    @ExcelProperty("VESA孔距最大宽度")
    private Integer vesaWidthMax;

    @Schema(description = "VESA孔距最大长度")
    @ExcelProperty("VESA孔距最大长度")
    private Integer vesaLengthMax;

    @Schema(description = "VESA孔距最小长度")
    @ExcelProperty("VESA孔距最小长度")
    private Integer vesaLengthMin;

    @Schema(description = "电视尺寸最小值")
    @ExcelProperty("电视尺寸最小值")
    private Integer tvSizeMin;

    @Schema(description = "电视尺寸最大值")
    @ExcelProperty("电视尺寸最大值")
    private Integer tvSizeMax;

    @Schema(description = "承重")
    @ExcelProperty("承重")
    private Integer loadCapacity;

    @Schema(description = "中心高度最小值（最低高度）")
    @ExcelProperty("中心高度最小值（最低高度）")
    private Integer centerHeightMin;

    @Schema(description = "中心高度最大值（最高高度）")
    @ExcelProperty("中心高度最大值（最高高度）")
    private Integer centerHeightMax;

    @Schema(description = "电视旋转")
    @ExcelProperty("电视旋转")
    private String tvRotation;

    @Schema(description = "电视俯仰")
    @ExcelProperty("电视俯仰")
    private String tvTilt;

    @Schema(description = "高度调节")
    @ExcelProperty("高度调节")
    private String heightAdjustment;

    @Schema(description = "横竖屏旋转")
    @ExcelProperty("横竖屏旋转")
    private String horizontalScreenRotation;

    @Schema(description = "电缆管理")
    @ExcelProperty("电缆管理")
    private String cableManagement;

    @Schema(description = "收纳管理")
    @ExcelProperty("收纳管理")
    private String storageManagement;

    @Schema(description = "调节脚垫")
    @ExcelProperty("调节脚垫")
    private String adjustableFootPad;

    @Schema(description = "移动功能")
    @ExcelProperty("移动功能")
    private String mobileFunction;

    @Schema(description = "其他")
    @ExcelProperty("其他")
    private String otherFeatures;

    @Schema(description = "适配尺寸")
    @ExcelProperty("适配尺寸")
    private String adaptiveSize;

    @Schema(description = "兼容方式")
    @ExcelProperty("兼容方式")
    private String compatibilityMode;

    @Schema(description = "脚轮")
    @ExcelProperty("脚轮")
    private Boolean casters;

    @Schema(description = "电子集成模块")
    @ExcelProperty("电子集成模块")
    private Boolean electronicIntegrationModules;

    @Schema(description = "功能配件")
    @ExcelProperty("功能配件")
    private String functionalAccessories;

    @Schema(description = "包装长度（整数，没有小数点，单位mm）")
    @ExcelProperty("包装长度")
    private Integer packageLength;

    @Schema(description = "包装宽度（整数，没有小数点，单位mm）")
    @ExcelProperty("包装宽度")
    private Integer packageWidth;

    @Schema(description = "包装高度（整数，没有小数点，单位mm）")
    @ExcelProperty("包装高度")
    private Integer packageHeight;

    @Schema(description = "包装重量（保留至小数点后两位，单位kg）")
    @ExcelProperty("包装重量")
    private BigDecimal packageWeight;
}