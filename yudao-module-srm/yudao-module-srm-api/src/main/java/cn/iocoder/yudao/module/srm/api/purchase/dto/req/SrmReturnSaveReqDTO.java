package cn.iocoder.yudao.module.srm.api.purchase.dto.req;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Data
@Validated
public class SrmReturnSaveReqDTO {

    @NotNull(message = "ID不能为null")
    private Long id;

    /**
     * 来源单据ID
     */
    @NotNull(message = "来源单据ID不能为空")
    private Long upstreamBillId;

    /**
     * 来源单据号
     */
    private String upstreamBillCode;

    /**
     * 上游单据类型 ;
     */
    private Integer upstreamBillType;

    /**
     * 出库单明细
     */
    @Size(min = 1, message = "明细不能为空")
    private List<SrmReturnSaveItemReqDTO> items;
}
