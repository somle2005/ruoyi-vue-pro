package com.jd.open.api.sdk.domain.youE.SparePartExportJosService.request.confirm;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SparePartResultConfirmParam implements Serializable {
   private String sparePartNo;
   private Integer confirmType;

   @JsonProperty("sparePartNo")
   public void setSparePartNo(String sparePartNo) {
      this.sparePartNo = sparePartNo;
   }

   @JsonProperty("sparePartNo")
   public String getSparePartNo() {
      return this.sparePartNo;
   }

   @JsonProperty("confirmType")
   public void setConfirmType(Integer confirmType) {
      this.confirmType = confirmType;
   }

   @JsonProperty("confirmType")
   public Integer getConfirmType() {
      return this.confirmType;
   }
}
