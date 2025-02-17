package cn.iocoder.yudao.module.erp.controller.admin.shop.product.vo;

import cn.iocoder.yudao.framework.common.validation.InEnum;
import cn.iocoder.yudao.module.erp.controller.admin.shop.product.item.vo.ErpShopProductItemRespVO;
import cn.iocoder.yudao.module.erp.controller.admin.shop.product.item.vo.ErpShopProductItemSaveReqVO;
import cn.iocoder.yudao.module.erp.enums.ErpOffStatus;
import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.math.BigDecimal;
import java.util.*;
import jakarta.validation.constraints.*;

@Schema(description = "管理后台 - ERP 店铺产品新增/修改 Request VO")
@Data
public class ErpShopProductSaveReqVO {

    @Schema(description = "店铺产品编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "18131")
    private Long id;

    @Schema(description = "店铺编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "18131")
    private Long shopId;

    @Schema(description = "平台产品ID编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "18131")
    private String platformProductUid;

    @Schema(description = "价格")
    @ExcelProperty("价格")
    private BigDecimal price;

    @Schema(description = "币种")
    @ExcelProperty("币种")
    private String currency;

    @Schema(description = "店铺产品名称", requiredMode = Schema.RequiredMode.REQUIRED, example = "赵六")
    @NotEmpty(message = "店铺产品名称不能为空")
    private String name;

    @Schema(description = "店铺产品编码", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotEmpty(message = "店铺产品编码不能为空")
    private String code;

    @Schema(description = "备注", example = "你猜")
    private String remark;

    @Schema(description = "开启状态", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    @NotNull(message = "开启状态不能为空")
    @InEnum(ErpOffStatus.class)
    private Integer status;

    @Schema(description = "链接", example = "https://www.iocoder.cn")
    private String url;

    @Schema(description = "店铺产品项目", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private List<ErpShopProductItemSaveReqVO> items;

}