package cn.iocoder.yudao.module.wms.api.outbound.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jisencai
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WmsOutboundValidateReqDTO {

    /**
     * 产品ID
     **/
    @NotNull
    private Long productId;

    /**
     * 产品名称
     **/
    @NotBlank
    private String productName;

    /**
     * 数量
     **/
    @NotNull
    private Integer quantity;
}
