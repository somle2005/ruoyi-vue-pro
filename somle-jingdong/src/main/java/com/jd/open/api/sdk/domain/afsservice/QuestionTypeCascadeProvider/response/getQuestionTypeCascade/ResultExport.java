package com.jd.open.api.sdk.domain.afsservice.QuestionTypeCascadeProvider.response.getQuestionTypeCascade;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ResultExport implements Serializable {
   private int resultCode;
   private List<ComponentExport> data;
   private String errMsg;

   @JsonProperty("resultCode")
   public void setResultCode(int resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public int getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("data")
   public void setData(List<ComponentExport> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<ComponentExport> getData() {
      return this.data;
   }

   @JsonProperty("errMsg")
   public void setErrMsg(String errMsg) {
      this.errMsg = errMsg;
   }

   @JsonProperty("errMsg")
   public String getErrMsg() {
      return this.errMsg;
   }
}
