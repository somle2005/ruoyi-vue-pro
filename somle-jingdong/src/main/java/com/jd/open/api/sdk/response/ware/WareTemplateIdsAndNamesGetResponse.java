package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.WareTemplate;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class WareTemplateIdsAndNamesGetResponse extends AbstractResponse {
   private List<WareTemplate> wareTemplateList;

   @JsonProperty("ware_templates")
   public List<WareTemplate> getWareTemplateList() {
      return this.wareTemplateList;
   }

   @JsonProperty("ware_templates")
   public void setWareTemplateList(List<WareTemplate> wareTemplateList) {
      this.wareTemplateList = wareTemplateList;
   }
}
