package com.somle.lingxing.model.reps;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
public class LingXingOutboundOrderListReps {
    private Integer code;
    private ResponseData data;
    private String msg;

    @Data
    @NoArgsConstructor
    @JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
    public static class ResponseData {
        private Integer total;
        private Integer page;
        private Integer pageSize;
        private Integer pages;
        private List<OutboundRecord> records;

        @Data
        @NoArgsConstructor
        @JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
        public static class OutboundRecord {
            private String whCode;
            private String outboundOrderNo;
            private String thirdOrderNo;
            private Integer status;
            private String logisticsChannel;
            private String logisticsTrackNo;
            private List<String> logisticsTrackNos;
            private String referOrderNo;
            private String platformOrderNo;
            private String salesPlatform;
            private Integer needRelabel;
            private String orderCreateTime;
            private String outboundTime;
            private String canceledTime;
            private String exceptionTime;
            private String interceptTime;
        }
    }
}