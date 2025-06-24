package com.jd.open.api.sdk.domain.Account.VenderAccountSafService.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class VenderAccountPermCodeResult implements Serializable {
   private List<VenderAccountPermCodeContent> accountPrivilegeS;
   private boolean isSuccess;
   private String errorCode;
   private String errorMsg;
   private int totalCount;

   @JsonProperty("account_privilege_s")
   public void setAccountPrivilegeS(List<VenderAccountPermCodeContent> accountPrivilegeS) {
      this.accountPrivilegeS = accountPrivilegeS;
   }

   @JsonProperty("account_privilege_s")
   public List<VenderAccountPermCodeContent> getAccountPrivilegeS() {
      return this.accountPrivilegeS;
   }

   @JsonProperty("is_success")
   public void setIsSuccess(boolean isSuccess) {
      this.isSuccess = isSuccess;
   }

   @JsonProperty("is_success")
   public boolean getIsSuccess() {
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

   @JsonProperty("total_count")
   public void setTotalCount(int totalCount) {
      this.totalCount = totalCount;
   }

   @JsonProperty("total_count")
   public int getTotalCount() {
      return this.totalCount;
   }
}
