package cn.iocoder.yudao.module.erp.controller.admin.logistic.category.vo;

import cn.iocoder.yudao.module.erp.dal.dataobject.logistic.category.item.ErpCustomRuleCategoryItemDO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Schema(description = "管理后台 - 海关品类新增/修改 Request VO")
@Data
public class ErpCustomRuleCategorySaveReqVO {

    @Schema(description = "编号", example = "7348")
    private Long id;

    @Schema(description = "材质-字典")
    private Integer material;

    @Schema(description = "报关品名", example = "2")
    private String declaredType;

    @Schema(description = "英文品名")
    private String declaredTypeEn;

    @Schema(description = "材质对应string+报关品名")
    private String combinedValue;

    @Schema(description = "海关品类子表列表")
    private List<ErpCustomRuleCategoryItemDO> customRuleCategoryItems;

}