package com.jd.open.api.sdk.domain.im.RiskCtrlOpenApi.response.sensitiveWordCheck;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OpenApiResponse implements Serializable {
   private ResponseHeader responseHeader;
   private ResponseBody responseBody;

   @JsonProperty("responseHeader")
   public void setResponseHeader(ResponseHeader responseHeader) {
      this.responseHeader = responseHeader;
   }

   @JsonProperty("responseHeader")
   public ResponseHeader getResponseHeader() {
      return this.responseHeader;
   }

   @JsonProperty("responseBody")
   public void setResponseBody(ResponseBody responseBody) {
      this.responseBody = responseBody;
   }

   @JsonProperty("responseBody")
   public ResponseBody getResponseBody() {
      return this.responseBody;
   }
}
