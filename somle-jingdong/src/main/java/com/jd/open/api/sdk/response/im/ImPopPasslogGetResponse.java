package com.jd.open.api.sdk.response.im;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class ImPopPasslogGetResponse extends AbstractResponse {
   private List<PassLog> PassLog;

   @JsonProperty("PassLog")
   public void setPassLog(List<PassLog> PassLog) {
      this.PassLog = PassLog;
   }

   @JsonProperty("PassLog")
   public List<PassLog> getPassLog() {
      return this.PassLog;
   }
}
