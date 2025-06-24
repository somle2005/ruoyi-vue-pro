package com.jd.open.api.sdk.domain.hudong.AppointmentReadOuterService.response.checkAppointmentSku;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class AppointmentSelectCheckInfo implements Serializable {
   private String msg;
   private String code;
   private int joinActivityType;
   private boolean checkResult;
   private Long skuId;

   @JsonProperty("msg")
   public void setMsg(String msg) {
      this.msg = msg;
   }

   @JsonProperty("msg")
   public String getMsg() {
      return this.msg;
   }

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
      return this.code;
   }

   @JsonProperty("joinActivityType")
   public void setJoinActivityType(int joinActivityType) {
      this.joinActivityType = joinActivityType;
   }

   @JsonProperty("joinActivityType")
   public int getJoinActivityType() {
      return this.joinActivityType;
   }

   @JsonProperty("checkResult")
   public void setCheckResult(boolean checkResult) {
      this.checkResult = checkResult;
   }

   @JsonProperty("checkResult")
   public boolean getCheckResult() {
      return this.checkResult;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }
}
