package com.somle.jingdong.model.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class JingDongShopInfoResp {
    @JsonProperty("jingdong_seller_vender_info_get_responce")
    private JingDongSellerVenderInfoGetResp jingdongSellerVenderInfoGetResponce;
}
