package cn.iocoder.yudao.module.srm.api.supplier.dto;

import cn.iocoder.yudao.module.system.api.utils.Validation;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author wdy
 */
@Data
public class SrmSupplierProductDTO {

    /**
     * 供应商产品编号
     */
    private Long id;
    /**
     * 供应商产品编码
     */
    private String code;
    /**
     * 供应商编号
     */
    @NotNull(message = "供应商编号不能为空", groups = {Validation.OnUpdate.class})
    private Long supplierId;
    /**
     * 产品编号
     */
    @NotNull(message = "产品编号不能为空", groups = {Validation.OnUpdate.class})
    private Long productId;
    /**
     * 采购价格
     */
    private Double purchasePrice;
    /**
     * 采购货币代码
     */
    @NotNull(message = "采购货币代码不能为空", groups = {Validation.OnUpdate.class})
    private Integer purchasePriceCurrencyCode;

    /**
     * 上次采购价格
     */
    @NotNull(message = "上次采购价格不能为空", groups = {Validation.OnUpdate.class})
    private BigDecimal lastPurchasePrice;
    /**
     * 税率
     */
    private BigDecimal taxRate;
    /**
     * 默认供应商
     */
    private Boolean defaultSupplier;

    private Integer version;
}
