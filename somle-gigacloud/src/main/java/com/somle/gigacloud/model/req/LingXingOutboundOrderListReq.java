package com.somle.lingxing.model.req;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LingXingOutboundOrderListReq {
    private Integer page;
    private Integer pageSize;
    private String outboundOrderNos;
    private String timeType;
    private String startTime;
    private String endTime;

}