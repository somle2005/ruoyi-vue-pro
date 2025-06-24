package com.jd.open.api.sdk.domain.fangchan.HouseJosCustomerCluePublishService.response.getHouseXjkDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class HouseJosXjkClueResponse implements Serializable {
   private String sysMsg;
   private String sysCode;
   private HouseJosXjkClueVO data;

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
   public void setData(HouseJosXjkClueVO data) {
      this.data = data;
   }

   @JsonProperty("data")
   public HouseJosXjkClueVO getData() {
      return this.data;
   }
}
