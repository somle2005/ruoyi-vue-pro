package com.jd.open.api.sdk.domain.order.OrderQueryJsfService.response.enSearch;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ApiResult implements Serializable {
   private boolean success;
   private String englishErrCode;
   private String chineseErrCode;
   private int numberCode;

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("englishErrCode")
   public void setEnglishErrCode(String englishErrCode) {
      this.englishErrCode = englishErrCode;
   }

   @JsonProperty("englishErrCode")
   public String getEnglishErrCode() {
      return this.englishErrCode;
   }

   @JsonProperty("chineseErrCode")
   public void setChineseErrCode(String chineseErrCode) {
      this.chineseErrCode = chineseErrCode;
   }

   @JsonProperty("chineseErrCode")
   public String getChineseErrCode() {
      return this.chineseErrCode;
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
