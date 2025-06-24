package com.jd.open.api.sdk.domain.c2mdzkfpt.BespokeInfoWebService.response.getSkuBindInfoWithBizId;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class TransparencyVo implements Serializable {
   private Long configId;
   private Long customServiceVersion;

   @JsonProperty("configId")
   public void setConfigId(Long configId) {
      this.configId = configId;
   }

   @JsonProperty("configId")
   public Long getConfigId() {
      return this.configId;
   }

   @JsonProperty("customServiceVersion")
   public void setCustomServiceVersion(Long customServiceVersion) {
      this.customServiceVersion = customServiceVersion;
   }

   @JsonProperty("customServiceVersion")
   public Long getCustomServiceVersion() {
      return this.customServiceVersion;
   }
}
