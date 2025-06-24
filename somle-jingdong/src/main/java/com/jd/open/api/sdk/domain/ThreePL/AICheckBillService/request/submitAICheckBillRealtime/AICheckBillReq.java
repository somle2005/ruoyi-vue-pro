package com.jd.open.api.sdk.domain.ThreePL.AICheckBillService.request.submitAICheckBillRealtime;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class AICheckBillReq implements Serializable {
   private List<OrderInfo> orderInfoList;
   private AppInfo appInfo;
   private String bizType;
   private String bizCode;

   @JsonProperty("orderInfoList")
   public void setOrderInfoList(List<OrderInfo> orderInfoList) {
      this.orderInfoList = orderInfoList;
   }

   @JsonProperty("orderInfoList")
   public List<OrderInfo> getOrderInfoList() {
      return this.orderInfoList;
   }

   @JsonProperty("appInfo")
   public void setAppInfo(AppInfo appInfo) {
      this.appInfo = appInfo;
   }

   @JsonProperty("appInfo")
   public AppInfo getAppInfo() {
      return this.appInfo;
   }

   @JsonProperty("bizType")
   public void setBizType(String bizType) {
      this.bizType = bizType;
   }

   @JsonProperty("bizType")
   public String getBizType() {
      return this.bizType;
   }

   @JsonProperty("bizCode")
   public void setBizCode(String bizCode) {
      this.bizCode = bizCode;
   }

   @JsonProperty("bizCode")
   public String getBizCode() {
      return this.bizCode;
   }
}
