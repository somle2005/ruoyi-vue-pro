package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryOrderListByStatus;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class OrderQueryResult implements Serializable {
   private String resultCode;
   private String errMsg;
   private List<String> soNoList;

   @JsonProperty("resultCode")
   public void setResultCode(String resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public String getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("errMsg")
   public void setErrMsg(String errMsg) {
      this.errMsg = errMsg;
   }

   @JsonProperty("errMsg")
   public String getErrMsg() {
      return this.errMsg;
   }

   @JsonProperty("soNoList")
   public void setSoNoList(List<String> soNoList) {
      this.soNoList = soNoList;
   }

   @JsonProperty("soNoList")
   public List<String> getSoNoList() {
      return this.soNoList;
   }
}
