package com.jd.open.api.sdk.response.fangchan;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.fangchan.RentSpuSaasPublishService.response.publishService.HandleProductResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class NbhouseRentSpuPublishServiceResponse extends AbstractResponse {
   private HandleProductResult handlerentproductinfoResult;

   @JsonProperty("handlerentproductinfo_result")
   public void setHandlerentproductinfoResult(HandleProductResult handlerentproductinfoResult) {
      this.handlerentproductinfoResult = handlerentproductinfoResult;
   }

   @JsonProperty("handlerentproductinfo_result")
   public HandleProductResult getHandlerentproductinfoResult() {
      return this.handlerentproductinfoResult;
   }
}
