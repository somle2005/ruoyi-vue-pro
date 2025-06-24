package com.jd.open.api.sdk.response.hudong;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.hudong.GiftActivityReadService.response.findAllGiftActivityForPage.GiftActivity;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class InteractCenterApiServiceReadGiftActivityReadServiceFindAllGiftActivityForPageResponse extends AbstractResponse {
   private List<GiftActivity> returnType;

   @JsonProperty("returnType")
   public void setReturnType(List<GiftActivity> returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public List<GiftActivity> getReturnType() {
      return this.returnType;
   }
}
