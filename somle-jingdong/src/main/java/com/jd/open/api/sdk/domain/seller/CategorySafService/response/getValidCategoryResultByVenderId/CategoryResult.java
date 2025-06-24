package com.jd.open.api.sdk.domain.seller.CategorySafService.response.getValidCategoryResultByVenderId;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class CategoryResult implements Serializable {
   private boolean success;
   private String errorCode;
   private String errorMsg;
   private List<Category> list;

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("errorCode")
   public void setErrorCode(String errorCode) {
      this.errorCode = errorCode;
   }

   @JsonProperty("errorCode")
   public String getErrorCode() {
      return this.errorCode;
   }

   @JsonProperty("errorMsg")
   public void setErrorMsg(String errorMsg) {
      this.errorMsg = errorMsg;
   }

   @JsonProperty("errorMsg")
   public String getErrorMsg() {
      return this.errorMsg;
   }

   @JsonProperty("list")
   public void setList(List<Category> list) {
      this.list = list;
   }

   @JsonProperty("list")
   public List<Category> getList() {
      return this.list;
   }
}
