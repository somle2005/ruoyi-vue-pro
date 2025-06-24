package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.WareAreaLimit;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class WareAreaLimitSearchResponse extends AbstractResponse {
   private List<WareAreaLimit> wareAreaLimits;
   private int total;

   @JsonProperty("ware_area_limits")
   public List<WareAreaLimit> getWareAreaLimits() {
      return this.wareAreaLimits;
   }

   @JsonProperty("ware_area_limits")
   public void setWareAreaLimits(List<WareAreaLimit> wareAreaLimits) {
      this.wareAreaLimits = wareAreaLimits;
   }

   public int getTotal() {
      return this.total;
   }

   public void setTotal(int total) {
      this.total = total;
   }
}
