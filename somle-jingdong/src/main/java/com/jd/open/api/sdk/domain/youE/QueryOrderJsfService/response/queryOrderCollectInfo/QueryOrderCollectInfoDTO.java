package com.jd.open.api.sdk.domain.youE.QueryOrderJsfService.response.queryOrderCollectInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class QueryOrderCollectInfoDTO implements Serializable {
   private Integer stat;
   private String orderNo;
   private Integer tmsRedeliver;
   private String logisticsNo;
   private String collectRemark;

   @JsonProperty("stat")
   public void setStat(Integer stat) {
      this.stat = stat;
   }

   @JsonProperty("stat")
   public Integer getStat() {
      return this.stat;
   }

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("tmsRedeliver")
   public void setTmsRedeliver(Integer tmsRedeliver) {
      this.tmsRedeliver = tmsRedeliver;
   }

   @JsonProperty("tmsRedeliver")
   public Integer getTmsRedeliver() {
      return this.tmsRedeliver;
   }

   @JsonProperty("logisticsNo")
   public void setLogisticsNo(String logisticsNo) {
      this.logisticsNo = logisticsNo;
   }

   @JsonProperty("logisticsNo")
   public String getLogisticsNo() {
      return this.logisticsNo;
   }

   @JsonProperty("collectRemark")
   public void setCollectRemark(String collectRemark) {
      this.collectRemark = collectRemark;
   }

   @JsonProperty("collectRemark")
   public String getCollectRemark() {
      return this.collectRemark;
   }
}
