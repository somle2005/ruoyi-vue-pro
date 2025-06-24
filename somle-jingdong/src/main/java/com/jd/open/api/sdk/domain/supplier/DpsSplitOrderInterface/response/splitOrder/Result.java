package com.jd.open.api.sdk.domain.supplier.DpsSplitOrderInterface.response.splitOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class Result implements Serializable {
   private Long customOrderId;
   private Integer status;
   private String message;
   private String errorCode;
   private List<SplitOrderResultDto> dpsChildOrderInfoList;

   @JsonProperty("customOrderId")
   public void setCustomOrderId(Long customOrderId) {
      this.customOrderId = customOrderId;
   }

   @JsonProperty("customOrderId")
   public Long getCustomOrderId() {
      return this.customOrderId;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("errorCode")
   public void setErrorCode(String errorCode) {
      this.errorCode = errorCode;
   }

   @JsonProperty("errorCode")
   public String getErrorCode() {
      return this.errorCode;
   }

   @JsonProperty("dpsChildOrderInfoList")
   public void setDpsChildOrderInfoList(List<SplitOrderResultDto> dpsChildOrderInfoList) {
      this.dpsChildOrderInfoList = dpsChildOrderInfoList;
   }

   @JsonProperty("dpsChildOrderInfoList")
   public List<SplitOrderResultDto> getDpsChildOrderInfoList() {
      return this.dpsChildOrderInfoList;
   }
}
