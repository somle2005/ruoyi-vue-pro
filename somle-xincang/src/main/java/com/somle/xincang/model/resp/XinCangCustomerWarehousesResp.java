package com.somle.xincang.model.resp;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
public class XinCangCustomerWarehousesResp {

    private Rst rst;
    private Integer errno;
    private String err;

    @Data
    @NoArgsConstructor
    @JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
    public static class Rst {
        private String code;
        private String msg;
        private List<Warehouse> data;
        private Integer count;
    }

    @Data
    @NoArgsConstructor
    @JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
    public static class Warehouse {
        private String id;
        private String warehouseCode;  // 映射JSON的"warehouse_code"
        private String country;
        private String province;
        private String city;
        private String street;
        private String postcode;
    }
}