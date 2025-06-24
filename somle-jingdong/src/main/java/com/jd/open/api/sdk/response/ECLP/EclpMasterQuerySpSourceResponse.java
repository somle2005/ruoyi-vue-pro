package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.querySpSource.SpSourceOut;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class EclpMasterQuerySpSourceResponse extends AbstractResponse {
   private List<SpSourceOut> queryspsourceResult;

   @JsonProperty("queryspsource_result")
   public void setQueryspsourceResult(List<SpSourceOut> queryspsourceResult) {
      this.queryspsourceResult = queryspsourceResult;
   }

   @JsonProperty("queryspsource_result")
   public List<SpSourceOut> getQueryspsourceResult() {
      return this.queryspsourceResult;
   }
}
