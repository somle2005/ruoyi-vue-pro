package com.jd.open.api.sdk.domain.youE.SparePartExportJosService.response.change;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SparePartChangeDeliveryStateResult implements Serializable {
   private Integer resultCode;
   private String sparePartNo;
   private String resultMsg;

   @JsonProperty("resultCode")
   public void setResultCode(Integer resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public Integer getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("sparePartNo")
   public void setSparePartNo(String sparePartNo) {
      this.sparePartNo = sparePartNo;
   }

   @JsonProperty("sparePartNo")
   public String getSparePartNo() {
      return this.sparePartNo;
   }

   @JsonProperty("resultMsg")
   public void setResultMsg(String resultMsg) {
      this.resultMsg = resultMsg;
   }

   @JsonProperty("resultMsg")
   public String getResultMsg() {
      return this.resultMsg;
   }
}
