package com.jd.open.api.sdk.domain.ThreePL.AICheckBillService.request.submitAICheckBillRealtime;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class OrderInfo implements Serializable {
   private String bizOrderId;
   private List<AICheckBillImageParam> imageUrls;
   private String bizOrderIdType;

   @JsonProperty("bizOrderId")
   public void setBizOrderId(String bizOrderId) {
      this.bizOrderId = bizOrderId;
   }

   @JsonProperty("bizOrderId")
   public String getBizOrderId() {
      return this.bizOrderId;
   }

   @JsonProperty("imageUrls")
   public void setImageUrls(List<AICheckBillImageParam> imageUrls) {
      this.imageUrls = imageUrls;
   }

   @JsonProperty("imageUrls")
   public List<AICheckBillImageParam> getImageUrls() {
      return this.imageUrls;
   }

   @JsonProperty("bizOrderIdType")
   public void setBizOrderIdType(String bizOrderIdType) {
      this.bizOrderIdType = bizOrderIdType;
   }

   @JsonProperty("bizOrderIdType")
   public String getBizOrderIdType() {
      return this.bizOrderIdType;
   }
}
