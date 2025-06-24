package com.jd.open.api.sdk.domain.yjs.StoreOrderJosService.response.batchUpdateStock;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class FailPopSiteStockDTO implements Serializable {
   private String errorCode;
   private List<JosPopSiteStockNumParam> errorUpdateList;
   private String errorMsg;

   @JsonProperty("errorCode")
   public void setErrorCode(String errorCode) {
      this.errorCode = errorCode;
   }

   @JsonProperty("errorCode")
   public String getErrorCode() {
      return this.errorCode;
   }

   @JsonProperty("errorUpdateList")
   public void setErrorUpdateList(List<JosPopSiteStockNumParam> errorUpdateList) {
      this.errorUpdateList = errorUpdateList;
   }

   @JsonProperty("errorUpdateList")
   public List<JosPopSiteStockNumParam> getErrorUpdateList() {
      return this.errorUpdateList;
   }

   @JsonProperty("errorMsg")
   public void setErrorMsg(String errorMsg) {
      this.errorMsg = errorMsg;
   }

   @JsonProperty("errorMsg")
   public String getErrorMsg() {
      return this.errorMsg;
   }
}
