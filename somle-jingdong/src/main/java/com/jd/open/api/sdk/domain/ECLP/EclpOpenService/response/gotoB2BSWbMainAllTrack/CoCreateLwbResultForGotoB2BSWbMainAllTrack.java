package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.gotoB2BSWbMainAllTrack;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class CoCreateLwbResultForGotoB2BSWbMainAllTrack implements Serializable {
   private int resultCode;
   private String resultMsg;
   private List<B2bLwbTrack> b2bLwbTrack;

   @JsonProperty("resultCode")
   public void setResultCode(int resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public int getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("resultMsg")
   public void setResultMsg(String resultMsg) {
      this.resultMsg = resultMsg;
   }

   @JsonProperty("resultMsg")
   public String getResultMsg() {
      return this.resultMsg;
   }

   @JsonProperty("b2bLwbTrack")
   public void setB2bLwbTrack(List<B2bLwbTrack> b2bLwbTrack) {
      this.b2bLwbTrack = b2bLwbTrack;
   }

   @JsonProperty("b2bLwbTrack")
   public List<B2bLwbTrack> getB2bLwbTrack() {
      return this.b2bLwbTrack;
   }
}
