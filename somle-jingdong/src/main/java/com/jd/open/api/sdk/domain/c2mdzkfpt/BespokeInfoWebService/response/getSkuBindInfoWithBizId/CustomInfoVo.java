package com.jd.open.api.sdk.domain.c2mdzkfpt.BespokeInfoWebService.response.getSkuBindInfoWithBizId;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CustomInfoVo implements Serializable {
   private CustomServiceVo customServiceInfo;
   private TransparencyVo transparency;

   @JsonProperty("customServiceInfo")
   public void setCustomServiceInfo(CustomServiceVo customServiceInfo) {
      this.customServiceInfo = customServiceInfo;
   }

   @JsonProperty("customServiceInfo")
   public CustomServiceVo getCustomServiceInfo() {
      return this.customServiceInfo;
   }

   @JsonProperty("transparency")
   public void setTransparency(TransparencyVo transparency) {
      this.transparency = transparency;
   }

   @JsonProperty("transparency")
   public TransparencyVo getTransparency() {
      return this.transparency;
   }
}
