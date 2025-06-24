package com.jd.open.api.sdk.domain.etms.Waybill2CTraceApi.response.Waybill2CTraceApi;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class ExtTraceDto implements Serializable {
   private String waybillCode;
   private String operateDesc;
   private String operateMessage;
   private String operateName;
   private Date operateTime;

   @JsonProperty("waybillCode")
   public void setWaybillCode(String waybillCode) {
      this.waybillCode = waybillCode;
   }

   @JsonProperty("waybillCode")
   public String getWaybillCode() {
      return this.waybillCode;
   }

   @JsonProperty("operateDesc")
   public void setOperateDesc(String operateDesc) {
      this.operateDesc = operateDesc;
   }

   @JsonProperty("operateDesc")
   public String getOperateDesc() {
      return this.operateDesc;
   }

   @JsonProperty("operateMessage")
   public void setOperateMessage(String operateMessage) {
      this.operateMessage = operateMessage;
   }

   @JsonProperty("operateMessage")
   public String getOperateMessage() {
      return this.operateMessage;
   }

   @JsonProperty("operateName")
   public void setOperateName(String operateName) {
      this.operateName = operateName;
   }

   @JsonProperty("operateName")
   public String getOperateName() {
      return this.operateName;
   }

   @JsonProperty("operateTime")
   public void setOperateTime(Date operateTime) {
      this.operateTime = operateTime;
   }

   @JsonProperty("operateTime")
   public Date getOperateTime() {
      return this.operateTime;
   }
}
