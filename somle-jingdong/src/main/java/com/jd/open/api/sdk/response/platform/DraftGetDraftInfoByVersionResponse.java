package com.jd.open.api.sdk.response.platform;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.platform.JosDraftReadService.response.getDraftInfoByVersion.JosDraftResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class DraftGetDraftInfoByVersionResponse extends AbstractResponse {
   private JosDraftResult JosDraftResult;

   @JsonProperty("JosDraftResult")
   public void setJosDraftResult(JosDraftResult JosDraftResult) {
      this.JosDraftResult = JosDraftResult;
   }

   @JsonProperty("JosDraftResult")
   public JosDraftResult getJosDraftResult() {
      return this.JosDraftResult;
   }
}
