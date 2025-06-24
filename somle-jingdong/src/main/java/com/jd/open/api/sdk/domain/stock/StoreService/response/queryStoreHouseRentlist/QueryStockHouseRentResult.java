package com.jd.open.api.sdk.domain.stock.StoreService.response.queryStoreHouseRentlist;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class QueryStockHouseRentResult implements Serializable {
   private Boolean success;
   private String errorCode;
   private String errorMsg;
   private List<RentStoreInfo> rentstoreinfoList;

   @JsonProperty("success")
   public void setSuccess(Boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public Boolean getSuccess() {
      return this.success;
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

   @JsonProperty("rentstoreinfo_list")
   public void setRentstoreinfoList(List<RentStoreInfo> rentstoreinfoList) {
      this.rentstoreinfoList = rentstoreinfoList;
   }

   @JsonProperty("rentstoreinfo_list")
   public List<RentStoreInfo> getRentstoreinfoList() {
      return this.rentstoreinfoList;
   }
}
