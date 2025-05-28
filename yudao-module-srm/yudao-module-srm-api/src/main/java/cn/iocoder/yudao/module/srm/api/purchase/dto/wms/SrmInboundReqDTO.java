package cn.iocoder.yudao.module.srm.api.purchase.dto.wms;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Data
@Validated
public class SrmInboundReqDTO {

    /**
     * 主键
     */
    @NotNull(message = "SRM至WMS的入库单主键ID不能为空")
    private Long id;

    /**
     * 单据号
     */
    private String code;

    /**
     * 来源单据ID
     */
    private Long upstreamBillId;

    /**
     * 来源单据号
     */
    private String upstreamBillCode;

    /**
     * WMS来源单据类型 ; WmsBillType : 0-入库单 , 1-出库单 , 2-盘点单
     */
    private Integer upstreamBillType;

    /**
     * 上架状态
     */
    private Integer shelvingStatus;

    @Size(min = 1, message = "SRM至WMS的入库单明细列表至少有一个")
    private List<SrmInboundItemReqDTO> itemList;
}
