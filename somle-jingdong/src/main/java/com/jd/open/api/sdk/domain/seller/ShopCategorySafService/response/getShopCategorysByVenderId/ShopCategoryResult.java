package com.jd.open.api.sdk.domain.seller.ShopCategorySafService.response.getShopCategorysByVenderId;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ShopCategoryResult implements Serializable {
   private boolean success;
   private String errorCode;
   private String errorMsg;
   private List<ShopCategory> list;

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
   public void setList(List<ShopCategory> list) {
      this.list = list;
   }

   @JsonProperty("list")
   public List<ShopCategory> getList() {
      return this.list;
   }
}
