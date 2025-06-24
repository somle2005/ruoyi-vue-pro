package com.jd.open.api.sdk.response.hudong;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.hudong.CustomActivityResource.response.query.ResponseEntity;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopMarketingGatewaySkuDetailFileQueryResponse extends AbstractResponse {
   private ResponseEntity returnType;

   @JsonProperty("returnType")
   public void setReturnType(ResponseEntity returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public ResponseEntity getReturnType() {
      return this.returnType;
   }
}
