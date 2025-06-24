package com.jd.open.api.sdk.domain.seller.VenderContactSafService.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ShipAddressResult implements Serializable {
   private boolean isSuccess;
   private String errorCode;
   private String errorMsg;
   private int totalCount;
   private List<ShipAddressVO> shipAddressS;

   @JsonProperty("is_success")
   public void setIsSuccess(boolean isSuccess) {
      this.isSuccess = isSuccess;
   }

   @JsonProperty("is_success")
   public boolean getIsSuccess() {
      return this.isSuccess;
   }

   @JsonProperty("error_code")
   public void setErrorCode(String errorCode) {
      this.errorCode = errorCode;
   }

   @JsonProperty("error_code")
   public String getErrorCode() {
      return this.errorCode;
   }

   @JsonProperty("error_msg")
   public void setErrorMsg(String errorMsg) {
      this.errorMsg = errorMsg;
   }

   @JsonProperty("error_msg")
   public String getErrorMsg() {
      return this.errorMsg;
   }

   @JsonProperty("total_count")
   public void setTotalCount(int totalCount) {
      this.totalCount = totalCount;
   }

   @JsonProperty("total_count")
   public int getTotalCount() {
      return this.totalCount;
   }

   @JsonProperty("ship_address_s")
   public void setShipAddressS(List<ShipAddressVO> shipAddressS) {
      this.shipAddressS = shipAddressS;
   }

   @JsonProperty("ship_address_s")
   public List<ShipAddressVO> getShipAddressS() {
      return this.shipAddressS;
   }
}
