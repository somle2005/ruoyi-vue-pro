package com.jd.open.api.sdk.domain.hudong.PresaleWriteService.request.create;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Map;

public class ClientInfo implements Serializable {
   private Map<String, String> extension;

   @JsonProperty("extension")
   public void setExtension(Map<String, String> extension) {
      this.extension = extension;
   }

   @JsonProperty("extension")
   public Map<String, String> getExtension() {
      return this.extension;
   }
}
