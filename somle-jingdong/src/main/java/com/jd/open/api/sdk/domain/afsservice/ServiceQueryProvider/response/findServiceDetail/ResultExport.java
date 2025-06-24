package com.jd.open.api.sdk.domain.afsservice.ServiceQueryProvider.response.findServiceDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ResultExport implements Serializable {
   private int resultCode;
   private ServiceDetaiExport data;
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
   public void setData(ServiceDetaiExport data) {
      this.data = data;
   }

   @JsonProperty("data")
   public ServiceDetaiExport getData() {
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
