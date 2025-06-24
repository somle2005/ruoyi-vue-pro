package com.jd.open.api.sdk.domain.fangchan.HouseJosCustomerCluePublishService.response.getTelRecordDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class HouseJosClue400Response implements Serializable {
   private String sysMsg;
   private String sysCode;
   private HouseJos400ClueVO data;

   @JsonProperty("sysMsg")
   public void setSysMsg(String sysMsg) {
      this.sysMsg = sysMsg;
   }

   @JsonProperty("sysMsg")
   public String getSysMsg() {
      return this.sysMsg;
   }

   @JsonProperty("sysCode")
   public void setSysCode(String sysCode) {
      this.sysCode = sysCode;
   }

   @JsonProperty("sysCode")
   public String getSysCode() {
      return this.sysCode;
   }

   @JsonProperty("data")
   public void setData(HouseJos400ClueVO data) {
      this.data = data;
   }

   @JsonProperty("data")
   public HouseJos400ClueVO getData() {
      return this.data;
   }
}
