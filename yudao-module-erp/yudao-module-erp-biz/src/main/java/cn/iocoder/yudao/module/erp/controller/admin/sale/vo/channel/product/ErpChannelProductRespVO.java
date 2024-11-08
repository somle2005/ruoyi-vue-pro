package cn.iocoder.yudao.module.erp.controller.admin.sale.vo.channel.product;

import cn.iocoder.yudao.module.erp.dal.dataobject.product.ErpProductDO;
import cn.iocoder.yudao.module.erp.dal.dataobject.sale.ErpChannelDO;
import com.fhs.core.trans.anno.Trans;
import com.fhs.core.trans.constant.TransType;
import com.fhs.core.trans.vo.VO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.math.BigDecimal;
import java.util.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;
import com.alibaba.excel.annotation.*;

@Schema(description = "管理后台 - ERP 渠道平台产品 Response VO")
@Data
@ExcelIgnoreUnannotated
public class ErpChannelProductRespVO implements VO {

    @Schema(description = "渠道产品编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "22047")
    @ExcelProperty("渠道产品编号")
    private Long id;

    @Schema(description = "渠道产品编码", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("渠道产品编码")
    private String code;

    @Schema(description = "渠道产品名称", example = "李四")
    @ExcelProperty("渠道产品名称")
    private String name;

    @Schema(description = "渠道产品状态（1启用，0禁用）", requiredMode = Schema.RequiredMode.REQUIRED, example = "2")
    @ExcelProperty("渠道产品状态（1启用，0禁用）")
    private Boolean status;

    @Schema(description = "渠道编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "14526")
    @ExcelProperty("渠道编号")
    @Trans(type = TransType.SIMPLE,target = ErpChannelDO.class,fields = "name",ref = "channelName")
    private Integer channelId;

    @Schema(description = "渠道名称", example = "王五")
    @ExcelProperty("渠道名称")
    private String channelName;

    @Schema(description = "产品编号", example = "28174")
    @ExcelProperty("产品编号")
    @Trans(type = TransType.SIMPLE,target = ErpProductDO.class,fields = "name",ref = "productName")
    private Integer productId;

    @Schema(description = "产品名称", example = "王五")
    @ExcelProperty("产品名称")
    private String productName;

    @Schema(description = "备注", example = "你说的对")
    @ExcelProperty("备注")
    private String remark;

    @Schema(description = "链接地址", example = "https://www.iocoder.cn")
    @ExcelProperty("链接地址")
    private String url;

    @Schema(description = "底价", requiredMode = Schema.RequiredMode.REQUIRED, example = "3897")
    @ExcelProperty("底价")
    private BigDecimal bottomPrice;

    @Schema(description = "负责人id", example = "16580")
    @ExcelProperty("负责人id")
    @Trans(type = TransType.SIMPLE,targetClassName = "cn.iocoder.yudao.module.system.dal.dataobject.user.AdminUserDO",fields = "nickname",ref = "ownerName")
    private String ownerId;

    @Schema(description = "负责人名称", example = "王五")
    @ExcelProperty("负责人名称")
    private String ownerName;

    @Schema(description = "创建时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("创建时间")
    private LocalDateTime createTime;

}