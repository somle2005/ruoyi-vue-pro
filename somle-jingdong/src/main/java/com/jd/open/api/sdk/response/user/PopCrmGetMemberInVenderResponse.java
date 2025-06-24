package com.jd.open.api.sdk.response.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.user.CrmCustomerService.response.getMemberInVender.CommonResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopCrmGetMemberInVenderResponse extends AbstractResponse {
   private CommonResult getmemberinvenderResult;

   @JsonProperty("getmemberinvender_result")
   public void setGetmemberinvenderResult(CommonResult getmemberinvenderResult) {
      this.getmemberinvenderResult = getmemberinvenderResult;
   }

   @JsonProperty("getmemberinvender_result")
   public CommonResult getGetmemberinvenderResult() {
      return this.getmemberinvenderResult;
   }
}
