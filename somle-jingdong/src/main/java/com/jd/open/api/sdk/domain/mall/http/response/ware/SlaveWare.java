package com.jd.open.api.sdk.domain.mall.http.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SlaveWare implements Serializable {
   private Content SlaveContent;
   private String Slavewareid;

   @JsonProperty("SlaveContent")
   public void setSlaveContent(Content SlaveContent) {
      this.SlaveContent = SlaveContent;
   }

   @JsonProperty("SlaveContent")
   public Content getSlaveContent() {
      return this.SlaveContent;
   }

   @JsonProperty("Slavewareid")
   public void setSlavewareid(String Slavewareid) {
      this.Slavewareid = Slavewareid;
   }

   @JsonProperty("Slavewareid")
   public String getSlavewareid() {
      return this.Slavewareid;
   }
}
