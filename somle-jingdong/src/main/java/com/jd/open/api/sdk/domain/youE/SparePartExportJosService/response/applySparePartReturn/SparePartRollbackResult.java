package com.jd.open.api.sdk.domain.youE.SparePartExportJosService.response.applySparePartReturn;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SparePartRollbackResult implements Serializable {
   private String sparePartNo;

   @JsonProperty("sparePartNo")
   public void setSparePartNo(String sparePartNo) {
      this.sparePartNo = sparePartNo;
   }

   @JsonProperty("sparePartNo")
   public String getSparePartNo() {
      return this.sparePartNo;
   }
}
