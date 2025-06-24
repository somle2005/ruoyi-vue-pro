package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.getTrackMessagePlusByOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class BaseResult implements Serializable {
   private Integer resultCode;
   private String resultMessage;
   private List<TrackMessagePlusOut> resultData;

   @JsonProperty("resultCode")
   public void setResultCode(Integer resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public Integer getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("resultMessage")
   public void setResultMessage(String resultMessage) {
      this.resultMessage = resultMessage;
   }

   @JsonProperty("resultMessage")
   public String getResultMessage() {
      return this.resultMessage;
   }

   @JsonProperty("resultData")
   public void setResultData(List<TrackMessagePlusOut> resultData) {
      this.resultData = resultData;
   }

   @JsonProperty("resultData")
   public List<TrackMessagePlusOut> getResultData() {
      return this.resultData;
   }
}
