package com.jd.open.api.sdk.domain.etms.OrderInfoJosService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class GetResultInfoDTO implements Serializable {
   private String code;
   private String message;
   private List<String> deliveryIdList;

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
      return this.code;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("deliveryIdList")
   public void setDeliveryIdList(List<String> deliveryIdList) {
      this.deliveryIdList = deliveryIdList;
   }

   @JsonProperty("deliveryIdList")
   public List<String> getDeliveryIdList() {
      return this.deliveryIdList;
   }
}
