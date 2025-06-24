package com.jd.open.api.sdk.domain.customsglobalAPI.EclpdlzServiceProviderJos.response.queryOrderByOrderId;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class EclpdlzServiceProviderOrderResult implements Serializable {
   private EclpdlzServiceProviderResultHead header;
   private List<String> body;

   @JsonProperty("header")
   public void setHeader(EclpdlzServiceProviderResultHead header) {
      this.header = header;
   }

   @JsonProperty("header")
   public EclpdlzServiceProviderResultHead getHeader() {
      return this.header;
   }

   @JsonProperty("body")
   public void setBody(List<String> body) {
      this.body = body;
   }

   @JsonProperty("body")
   public List<String> getBody() {
      return this.body;
   }
}
