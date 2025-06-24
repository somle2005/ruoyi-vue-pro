package com.jd.open.api.sdk.response.im;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class ImPopGroupinfoGetResponse extends AbstractResponse {
   private POPGroup popgroup;

   @JsonProperty("popgroup")
   public void setPopgroup(POPGroup popgroup) {
      this.popgroup = popgroup;
   }

   @JsonProperty("popgroup")
   public POPGroup getPopgroup() {
      return this.popgroup;
   }
}
