package com.jd.open.api.sdk.response.unboundedShop;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.unboundedShop.BusinessFacade.response.findBusinessByVenderId.BusinessInfo;
import com.jd.open.api.sdk.response.AbstractResponse;

public class FindBusinessByVenderIdResponse extends AbstractResponse {
   private BusinessInfo findbusinessbyvenderidResult;

   @JsonProperty("findbusinessbyvenderid_result")
   public void setFindbusinessbyvenderidResult(BusinessInfo findbusinessbyvenderidResult) {
      this.findbusinessbyvenderidResult = findbusinessbyvenderidResult;
   }

   @JsonProperty("findbusinessbyvenderid_result")
   public BusinessInfo getFindbusinessbyvenderidResult() {
      return this.findbusinessbyvenderidResult;
   }
}
