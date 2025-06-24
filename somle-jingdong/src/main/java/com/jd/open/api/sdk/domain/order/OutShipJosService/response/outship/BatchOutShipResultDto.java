package com.jd.open.api.sdk.domain.order.OutShipJosService.response.outship;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class BatchOutShipResultDto implements Serializable {
   private List<Long> successList;
   private List<OutShipFailDto> failList;

   @JsonProperty("successList")
   public void setSuccessList(List<Long> successList) {
      this.successList = successList;
   }

   @JsonProperty("successList")
   public List<Long> getSuccessList() {
      return this.successList;
   }

   @JsonProperty("failList")
   public void setFailList(List<OutShipFailDto> failList) {
      this.failList = failList;
   }

   @JsonProperty("failList")
   public List<OutShipFailDto> getFailList() {
      return this.failList;
   }
}
