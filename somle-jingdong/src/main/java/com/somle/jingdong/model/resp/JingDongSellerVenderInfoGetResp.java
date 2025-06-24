package com.somle.jingdong.model.resp;

import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@Data
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class JingDongSellerVenderInfoGetResp {

    private String code;
    private String requestId;
    private VenderInfoResult venderInfoResult;

    @Data
    @NoArgsConstructor
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class VenderInfoResult {
        private Integer colType;
        private Long venderId;
        private String shopName;
        private Long shopId;
        private Integer cateMain;
    }
}