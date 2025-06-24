package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.Ware;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class WareListResponse extends AbstractResponse {
   private List<Ware> wareList;
   private int total;

   @JsonProperty("wares")
   public List<Ware> getWareList() {
      return this.wareList;
   }

   @JsonProperty("wares")
   public void setWareList(List<Ware> wareList) {
      this.wareList = wareList;
   }

   public int getTotal() {
      return this.total;
   }

   public void setTotal(int total) {
      this.total = total;
   }
}
