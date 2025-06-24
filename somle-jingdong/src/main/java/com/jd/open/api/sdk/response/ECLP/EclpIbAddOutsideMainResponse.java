package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpIbAddOutsideMainResponse extends AbstractResponse {
   private String outsideMainNo;

   @JsonProperty("outsideMainNo")
   public void setOutsideMainNo(String outsideMainNo) {
      this.outsideMainNo = outsideMainNo;
   }

   @JsonProperty("outsideMainNo")
   public String getOutsideMainNo() {
      return this.outsideMainNo;
   }
}
