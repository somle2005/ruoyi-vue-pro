package com.jd.open.api.sdk.domain.B2B.B2BOrderProvider.request.submitPo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PreOccupyReq implements Serializable {
   private Boolean preOccupy;

   @JsonProperty("preOccupy")
   public void setPreOccupy(Boolean preOccupy) {
      this.preOccupy = preOccupy;
   }

   @JsonProperty("preOccupy")
   public Boolean getPreOccupy() {
      return this.preOccupy;
   }
}
