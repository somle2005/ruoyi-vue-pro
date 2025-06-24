package com.jd.open.api.sdk.domain.seller.VenderShopCategoryJosService.response.getShopCategoryByCid;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class JosResult implements Serializable {
   private Boolean isSuccess;
   private String errorCode;
   private String errorMsg;
   private String errorMsgCn;
   private VenderShopCategory venderShopCategory;

   @JsonProperty("is_success")
   public void setIsSuccess(Boolean isSuccess) {
      this.isSuccess = isSuccess;
   }

   @JsonProperty("is_success")
   public Boolean getIsSuccess() {
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

   @JsonProperty("error_msg_cn")
   public void setErrorMsgCn(String errorMsgCn) {
      this.errorMsgCn = errorMsgCn;
   }

   @JsonProperty("error_msg_cn")
   public String getErrorMsgCn() {
      return this.errorMsgCn;
   }

   @JsonProperty("vender_shop_category")
   public void setVenderShopCategory(VenderShopCategory venderShopCategory) {
      this.venderShopCategory = venderShopCategory;
   }

   @JsonProperty("vender_shop_category")
   public VenderShopCategory getVenderShopCategory() {
      return this.venderShopCategory;
   }
}
