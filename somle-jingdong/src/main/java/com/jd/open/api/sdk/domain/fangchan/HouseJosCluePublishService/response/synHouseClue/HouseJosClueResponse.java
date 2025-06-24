package com.jd.open.api.sdk.domain.fangchan.HouseJosCluePublishService.response.synHouseClue;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class HouseJosClueResponse implements Serializable {
   private String sysCode;
   private String sysMsg;
   private List<HouseJosClueResVO> data;

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

   @JsonProperty("data")
   public void setData(List<HouseJosClueResVO> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<HouseJosClueResVO> getData() {
      return this.data;
   }
}
