package com.jd.open.api.sdk.domain.sku.OrderListOpenService.request.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class OrderListOpenQuery implements Serializable {
   private String receiverName;
   private String receiverMobile;
   private Date startDate;
   private Date endDate;
   private String sceneId;

   @JsonProperty("receiverName")
   public void setReceiverName(String receiverName) {
      this.receiverName = receiverName;
   }

   @JsonProperty("receiverName")
   public String getReceiverName() {
      return this.receiverName;
   }

   @JsonProperty("receiverMobile")
   public void setReceiverMobile(String receiverMobile) {
      this.receiverMobile = receiverMobile;
   }

   @JsonProperty("receiverMobile")
   public String getReceiverMobile() {
      return this.receiverMobile;
   }

   @JsonProperty("startDate")
   public void setStartDate(Date startDate) {
      this.startDate = startDate;
   }

   @JsonProperty("startDate")
   public Date getStartDate() {
      return this.startDate;
   }

   @JsonProperty("endDate")
   public void setEndDate(Date endDate) {
      this.endDate = endDate;
   }

   @JsonProperty("endDate")
   public Date getEndDate() {
      return this.endDate;
   }

   @JsonProperty("sceneId")
   public void setSceneId(String sceneId) {
      this.sceneId = sceneId;
   }

   @JsonProperty("sceneId")
   public String getSceneId() {
      return this.sceneId;
   }
}
