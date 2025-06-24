package com.jd.open.api.sdk.response.video;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class PopVideoInfosDeleteResponse extends AbstractResponse {
   private List<Long> delSuccessIds;

   @JsonProperty("del_success_ids")
   public void setDelSuccessIds(List<Long> delSuccessIds) {
      this.delSuccessIds = delSuccessIds;
   }

   @JsonProperty("del_success_ids")
   public List<Long> getDelSuccessIds() {
      return this.delSuccessIds;
   }
}
