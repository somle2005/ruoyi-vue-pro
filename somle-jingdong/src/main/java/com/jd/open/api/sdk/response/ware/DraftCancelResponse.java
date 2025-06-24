package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.JosDraftWriteService.response.cancel.JosDraftResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class DraftCancelResponse extends AbstractResponse {
   private JosDraftResult josDraftResult;

   @JsonProperty("josDraftResult")
   public void setJosDraftResult(JosDraftResult josDraftResult) {
      this.josDraftResult = josDraftResult;
   }

   @JsonProperty("josDraftResult")
   public JosDraftResult getJosDraftResult() {
      return this.josDraftResult;
   }
}
