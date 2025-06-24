package com.jd.open.api.sdk.domain.order.fbpsearch.OrderQueryJsfService.response.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class FbpApiResult implements Serializable {
   private boolean isSuccess;
   private String EnglishErrCode;
   private String ChineseErrCode;
   private int numberCode;

   @JsonProperty("isSuccess")
   public void setIsSuccess(boolean isSuccess) {
      this.isSuccess = isSuccess;
   }

   @JsonProperty("isSuccess")
   public boolean getIsSuccess() {
      return this.isSuccess;
   }

   @JsonProperty("EnglishErrCode")
   public void setEnglishErrCode(String EnglishErrCode) {
      this.EnglishErrCode = EnglishErrCode;
   }

   @JsonProperty("EnglishErrCode")
   public String getEnglishErrCode() {
      return this.EnglishErrCode;
   }

   @JsonProperty("ChineseErrCode")
   public void setChineseErrCode(String ChineseErrCode) {
      this.ChineseErrCode = ChineseErrCode;
   }

   @JsonProperty("ChineseErrCode")
   public String getChineseErrCode() {
      return this.ChineseErrCode;
   }

   @JsonProperty("numberCode")
   public void setNumberCode(int numberCode) {
      this.numberCode = numberCode;
   }

   @JsonProperty("numberCode")
   public int getNumberCode() {
      return this.numberCode;
   }
}
