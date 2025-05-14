package cn.iocoder.yudao.module.srm.api.purchase.in;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class SrmPuchaseInCountDTO {

    //入库项ID
    private Long inItemId;

    //入库项差额
    private BigDecimal inCount;
}
