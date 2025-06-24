package com.jd.open.api.sdk.domain.fangchan.ImgSoaService.response.batchSynHouseResourceImg;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ImgSynResult implements Serializable {
   private List<String[]> checkData;
   private boolean success;
   private int code;
   private String errorMsg;

   @JsonProperty("checkData")
   public void setCheckData(List<String[]> checkData) {
      this.checkData = checkData;
   }

   @JsonProperty("checkData")
   public List<String[]> getCheckData() {
      return this.checkData;
   }

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("code")
   public void setCode(int code) {
      this.code = code;
   }

   @JsonProperty("code")
   public int getCode() {
      return this.code;
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
