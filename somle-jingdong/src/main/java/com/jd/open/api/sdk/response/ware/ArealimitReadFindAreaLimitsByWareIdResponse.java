package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.AreaLimitReadService.response.findAreaLimitsByWareId.WareAreaLimit;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class ArealimitReadFindAreaLimitsByWareIdResponse extends AbstractResponse {
   private List<WareAreaLimit> wareAreaLimitList;

   @JsonProperty("wareAreaLimitList")
   public void setWareAreaLimitList(List<WareAreaLimit> wareAreaLimitList) {
      this.wareAreaLimitList = wareAreaLimitList;
   }

   @JsonProperty("wareAreaLimitList")
   public List<WareAreaLimit> getWareAreaLimitList() {
      return this.wareAreaLimitList;
   }
}
