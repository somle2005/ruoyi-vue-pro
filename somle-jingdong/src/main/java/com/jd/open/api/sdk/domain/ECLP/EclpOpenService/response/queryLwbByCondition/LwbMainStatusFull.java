package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryLwbByCondition;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class LwbMainStatusFull implements Serializable {
   private String orderNo;
   private String lwbNo;
   private List<LwbStatusInfo> lwbStatusInfo;

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("lwbNo")
   public void setLwbNo(String lwbNo) {
      this.lwbNo = lwbNo;
   }

   @JsonProperty("lwbNo")
   public String getLwbNo() {
      return this.lwbNo;
   }

   @JsonProperty("lwbStatusInfo")
   public void setLwbStatusInfo(List<LwbStatusInfo> lwbStatusInfo) {
      this.lwbStatusInfo = lwbStatusInfo;
   }

   @JsonProperty("lwbStatusInfo")
   public List<LwbStatusInfo> getLwbStatusInfo() {
      return this.lwbStatusInfo;
   }
}
