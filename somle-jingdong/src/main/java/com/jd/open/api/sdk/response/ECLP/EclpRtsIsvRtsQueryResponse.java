package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.isvRtsQuery.RtsResult;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class EclpRtsIsvRtsQueryResponse extends AbstractResponse {
   private List<RtsResult> rtsResultList;

   @JsonProperty("rtsResultList")
   public void setRtsResultList(List<RtsResult> rtsResultList) {
      this.rtsResultList = rtsResultList;
   }

   @JsonProperty("rtsResultList")
   public List<RtsResult> getRtsResultList() {
      return this.rtsResultList;
   }
}
