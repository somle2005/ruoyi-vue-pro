package com.jd.open.api.sdk.response.crm;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class CrmGradeUpdateResponse extends AbstractResponse {
   private boolean isSuccess;

   @JsonProperty("is_success")
   public void setIsSuccess(boolean isSuccess) {
      this.isSuccess = isSuccess;
   }

   @JsonProperty("is_success")
   public boolean getIsSuccess() {
      return this.isSuccess;
   }
}
