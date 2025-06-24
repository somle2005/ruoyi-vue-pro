package com.jd.open.api.sdk.domain.jialilue.IsvCouponWriteService.response.sendCoupon;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class IsvSendCouponRespDTO implements Serializable {
   private String resultMsg;
   private int resultCode;
   private Map<String, String> actMsg;
   private List<IsvCouponInfoDTO> couponInfoList;

   @JsonProperty("resultMsg")
   public void setResultMsg(String resultMsg) {
      this.resultMsg = resultMsg;
   }

   @JsonProperty("resultMsg")
   public String getResultMsg() {
      return this.resultMsg;
   }

   @JsonProperty("resultCode")
   public void setResultCode(int resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public int getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("actMsg")
   public void setActMsg(Map<String, String> actMsg) {
      this.actMsg = actMsg;
   }

   @JsonProperty("actMsg")
   public Map<String, String> getActMsg() {
      return this.actMsg;
   }

   @JsonProperty("couponInfoList")
   public void setCouponInfoList(List<IsvCouponInfoDTO> couponInfoList) {
      this.couponInfoList = couponInfoList;
   }

   @JsonProperty("couponInfoList")
   public List<IsvCouponInfoDTO> getCouponInfoList() {
      return this.couponInfoList;
   }
}
