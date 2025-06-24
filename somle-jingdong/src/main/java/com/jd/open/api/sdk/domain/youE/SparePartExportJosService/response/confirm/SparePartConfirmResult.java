package com.jd.open.api.sdk.domain.youE.SparePartExportJosService.response.confirm;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SparePartConfirmResult implements Serializable {
   private String confirmResultMsg;
   private String sparePartNo;
   private Integer confirmResultCode;

   @JsonProperty("confirmResultMsg")
   public void setConfirmResultMsg(String confirmResultMsg) {
      this.confirmResultMsg = confirmResultMsg;
   }

   @JsonProperty("confirmResultMsg")
   public String getConfirmResultMsg() {
      return this.confirmResultMsg;
   }

   @JsonProperty("sparePartNo")
   public void setSparePartNo(String sparePartNo) {
      this.sparePartNo = sparePartNo;
   }

   @JsonProperty("sparePartNo")
   public String getSparePartNo() {
      return this.sparePartNo;
   }

   @JsonProperty("confirmResultCode")
   public void setConfirmResultCode(Integer confirmResultCode) {
      this.confirmResultCode = confirmResultCode;
   }

   @JsonProperty("confirmResultCode")
   public Integer getConfirmResultCode() {
      return this.confirmResultCode;
   }
}
