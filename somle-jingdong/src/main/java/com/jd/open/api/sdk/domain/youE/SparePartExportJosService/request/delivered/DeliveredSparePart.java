package com.jd.open.api.sdk.domain.youE.SparePartExportJosService.request.delivered;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class DeliveredSparePart implements Serializable {
   private String partsOrderNo;
   private Integer partsState;

   @JsonProperty("partsOrderNo")
   public void setPartsOrderNo(String partsOrderNo) {
      this.partsOrderNo = partsOrderNo;
   }

   @JsonProperty("partsOrderNo")
   public String getPartsOrderNo() {
      return this.partsOrderNo;
   }

   @JsonProperty("partsState")
   public void setPartsState(Integer partsState) {
      this.partsState = partsState;
   }

   @JsonProperty("partsState")
   public Integer getPartsState() {
      return this.partsState;
   }
}
