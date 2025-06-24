package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.Ware;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class WareDelistingGetResponse extends AbstractResponse {
   private List<Ware> wareInfos;
   private int total;

   public int getTotal() {
      return this.total;
   }

   public void setTotal(int total) {
      this.total = total;
   }

   @JsonProperty("ware_infos")
   public List<Ware> getWareInfos() {
      return this.wareInfos;
   }

   @JsonProperty("ware_infos")
   public void setWareInfos(List<Ware> wareInfos) {
      this.wareInfos = wareInfos;
   }
}
