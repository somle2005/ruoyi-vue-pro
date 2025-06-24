package com.jd.open.api.sdk.domain.fangchan.HouseJosDsjProductPublishService.response.handleDsjInfo2JDForInsert;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class HouseJosDsjProductesponse implements Serializable {
   private HouseDsjRetVO retVO;
   private String sysCode;
   private String sysMsg;

   @JsonProperty("retVO")
   public void setRetVO(HouseDsjRetVO retVO) {
      this.retVO = retVO;
   }

   @JsonProperty("retVO")
   public HouseDsjRetVO getRetVO() {
      return this.retVO;
   }

   @JsonProperty("sysCode")
   public void setSysCode(String sysCode) {
      this.sysCode = sysCode;
   }

   @JsonProperty("sysCode")
   public String getSysCode() {
      return this.sysCode;
   }

   @JsonProperty("sysMsg")
   public void setSysMsg(String sysMsg) {
      this.sysMsg = sysMsg;
   }

   @JsonProperty("sysMsg")
   public String getSysMsg() {
      return this.sysMsg;
   }
}
