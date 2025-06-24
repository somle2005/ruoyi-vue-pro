package com.jd.open.api.sdk.domain.jjfw.VirtualNumberService.response.virtualNumberService;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class VirtualNum implements Serializable {
   private String extension;
   private String secretNo;

   @JsonProperty("extension")
   public void setExtension(String extension) {
      this.extension = extension;
   }

   @JsonProperty("extension")
   public String getExtension() {
      return this.extension;
   }

   @JsonProperty("secretNo")
   public void setSecretNo(String secretNo) {
      this.secretNo = secretNo;
   }

   @JsonProperty("secretNo")
   public String getSecretNo() {
      return this.secretNo;
   }
}
