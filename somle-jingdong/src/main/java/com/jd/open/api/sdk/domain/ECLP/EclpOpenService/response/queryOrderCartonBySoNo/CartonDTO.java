package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryOrderCartonBySoNo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class CartonDTO implements Serializable {
   private String cartonNo;
   private List<CartonItemDTO> cartonItemList;

   @JsonProperty("cartonNo")
   public void setCartonNo(String cartonNo) {
      this.cartonNo = cartonNo;
   }

   @JsonProperty("cartonNo")
   public String getCartonNo() {
      return this.cartonNo;
   }

   @JsonProperty("cartonItemList")
   public void setCartonItemList(List<CartonItemDTO> cartonItemList) {
      this.cartonItemList = cartonItemList;
   }

   @JsonProperty("cartonItemList")
   public List<CartonItemDTO> getCartonItemList() {
      return this.cartonItemList;
   }
}
