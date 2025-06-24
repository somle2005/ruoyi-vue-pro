package com.jd.open.api.sdk.domain.order.LocCheckNumServerInterface.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class LocCodeInfoResult implements Serializable {
   private Integer resultCode;
   private String resultMessage;
   private Boolean isSuccess;
   private Integer totalCode;
   private List<LocCodeInfo> loccodeinfoList;

   @JsonProperty("result_code")
   public void setResultCode(Integer resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("result_code")
   public Integer getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("result_message")
   public void setResultMessage(String resultMessage) {
      this.resultMessage = resultMessage;
   }

   @JsonProperty("result_message")
   public String getResultMessage() {
      return this.resultMessage;
   }

   @JsonProperty("is_success")
   public void setIsSuccess(Boolean isSuccess) {
      this.isSuccess = isSuccess;
   }

   @JsonProperty("is_success")
   public Boolean getIsSuccess() {
      return this.isSuccess;
   }

   @JsonProperty("total_code")
   public void setTotalCode(Integer totalCode) {
      this.totalCode = totalCode;
   }

   @JsonProperty("total_code")
   public Integer getTotalCode() {
      return this.totalCode;
   }

   @JsonProperty("loccodeinfo_list")
   public void setLoccodeinfoList(List<LocCodeInfo> loccodeinfoList) {
      this.loccodeinfoList = loccodeinfoList;
   }

   @JsonProperty("loccodeinfo_list")
   public List<LocCodeInfo> getLoccodeinfoList() {
      return this.loccodeinfoList;
   }
}
