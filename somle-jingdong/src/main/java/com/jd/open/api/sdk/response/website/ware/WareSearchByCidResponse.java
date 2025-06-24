package com.jd.open.api.sdk.response.website.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.website.ware.Ware;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class WareSearchByCidResponse extends AbstractResponse {
   private List<Ware> wareInfos;

   @JsonProperty("ware_infos")
   public List<Ware> getWareInfos() {
      return this.wareInfos;
   }

   @JsonProperty("ware_infos")
   public void setWareInfos(List<Ware> wareInfos) {
      this.wareInfos = wareInfos;
   }
}
