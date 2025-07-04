package cn.iocoder.yudao.module.wms.controller.admin.warehouse.vo;

import cn.iocoder.yudao.framework.common.validation.InEnum;
import cn.iocoder.yudao.module.system.api.utils.Validation;
import cn.iocoder.yudao.module.wms.enums.common.WmsValidStatus;
import cn.iocoder.yudao.module.wms.enums.warehouse.WmsWarehouseMode;
import com.alibaba.excel.annotation.ExcelProperty;
import com.mzt.logapi.starter.annotation.DiffLogAllFields;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import lombok.Data;

/**
 * @author jisencai
 * @table-fields : country,code,contact_phone,city,contact_person,postcode,is_sync,mode,external_storage_id,address_line2,province,address_line1,address_line3,name,id,status
 */
@Schema(description = "管理后台 - 仓库新增/修改 Request VO")
@Data
@DiffLogAllFields
public class WmsWarehouseSaveReqVO {

    @Schema(description = "主键", requiredMode = Schema.RequiredMode.REQUIRED, example = "30946")
    @Null(groups = Validation.OnCreate.class, message = "创建时，id必须为空")
    @NotNull(groups = Validation.OnUpdate.class, message = "更新时，id不能为空")
    private Long id;

    @Schema(description = "仓库经营方式 ; WarehouseMode : 0-自营 , 1-三方仓 , 2-平台仓", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "仓库经营方式不能为空")
    @InEnum(WmsWarehouseMode.class)
    private Integer mode;

    @Schema(description = "代码", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotEmpty(message = "代码不能为空")
    private String code;

    @Schema(description = "名称", requiredMode = Schema.RequiredMode.REQUIRED, example = "李四")
    @NotEmpty(message = "名称不能为空")
    private String name;

    @Schema(description = "外部存储ID", example = "22814")
    private Long externalStorageId;

    @Schema(description = "详细地址3", example = "张三")
    private String addressLine3;

    @Schema(description = "国家")
    private String country;

    @Schema(description = "省/州")
    private String province;

    @Schema(description = "市")
    private String city;

    @Schema(description = "详细地址1")
    private String addressLine1;

    @Schema(description = "详细地址2")
    private String addressLine2;

    @Schema(description = "邮编")
    private String postcode;

    @Schema(description = "联系人")
    private String contactPerson;

    @Schema(description = "联系电话")
    private String contactPhone;

    @Schema(description = "库存同步：0-关闭；1-开启；")
    private Integer isSync;

    @Schema(description = "状态，WMS通用的对象有效状态 ; ValidStatus : 0-不可用 , 1-可用")
    @InEnum(WmsValidStatus.class)
    private Integer status;

    @Schema(description = "上架模式1标准模式2自动上架", example = "1")
    @ExcelProperty("上架模式")
    private Integer shelfMode;

    @Schema(description = "出货模式1先进先出2库位优先", example = "1")
    @ExcelProperty("出货模式")
    private Integer outboundMode;
}
