package cn.iocoder.yudao.module.wms.controller.admin.warehouse.bin.vo;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author jisencai
 */
@Schema(description = "仓库信息 - 库位管理 Import VO")
@Data
@ExcelIgnoreUnannotated
@Accessors(chain = false)
public class WmsWarehouseBinImportVO {
    @Schema(description = "Excel 文件", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "Excel 文件不能为空")
    private MultipartFile file;

    @Schema(description = "是否更新已经存在的库位")
    private Boolean overwrite;
}
