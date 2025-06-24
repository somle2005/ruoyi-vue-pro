package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.PoCommonForJosWebService.response.getcomponentlist.Component;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class VcGetcomponentlistResponse extends AbstractResponse {
   private List<Component> arg89;

   @JsonProperty("arg89")
   public void setArg89(List<Component> arg89) {
      this.arg89 = arg89;
   }

   @JsonProperty("arg89")
   public List<Component> getArg89() {
      return this.arg89;
   }
}
