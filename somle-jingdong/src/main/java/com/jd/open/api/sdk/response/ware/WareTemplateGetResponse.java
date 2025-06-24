package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.WareTemplate;
import com.jd.open.api.sdk.response.AbstractResponse;

public class WareTemplateGetResponse extends AbstractResponse {
   private WareTemplate wareTemplate;

   @JsonProperty("ware_template")
   public WareTemplate getWareTemplate() {
      return this.wareTemplate;
   }

   @JsonProperty("ware_template")
   public void setWareTemplate(WareTemplate wareTemplate) {
      this.wareTemplate = wareTemplate;
   }
}
