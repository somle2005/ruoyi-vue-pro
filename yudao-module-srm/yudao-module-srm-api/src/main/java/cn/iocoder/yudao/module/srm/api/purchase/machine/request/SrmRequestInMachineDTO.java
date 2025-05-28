package cn.iocoder.yudao.module.srm.api.purchase.machine.request;


import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class SrmRequestInMachineDTO {

    //入库差额
    private BigDecimal inCount;

    //申请项->申请单下的子项
    private Long applyItemId;
}
