package com.jd.open.api.sdk.domain.mall.SubsidyOutUploadJsfService.request.insert;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SubsidySkuAuthParam implements Serializable {
   private Integer selfSupport;

   @JsonProperty("selfSupport")
   public void setSelfSupport(Integer selfSupport) {
      this.selfSupport = selfSupport;
   }

   @JsonProperty("selfSupport")
   public Integer getSelfSupport() {
      return this.selfSupport;
   }
}
