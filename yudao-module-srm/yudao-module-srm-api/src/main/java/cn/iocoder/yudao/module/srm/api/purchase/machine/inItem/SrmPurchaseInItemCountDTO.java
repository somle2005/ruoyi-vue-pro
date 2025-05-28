package cn.iocoder.yudao.module.srm.api.purchase.machine.inItem;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class SrmPurchaseInItemCountDTO {

    //到货项ID
    private Long inItemId;

    //到货项差额
    private BigDecimal inCount;

    //退货项差额
    private BigDecimal outCount;
}
