package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.OrderRemarkService.response.modifyVenderRemark.OperatorResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopOrderModifyVenderRemarkResponse extends AbstractResponse {
   private OperatorResult modifyvenderremarkResult;

   @JsonProperty("modifyvenderremark_result")
   public void setModifyvenderremarkResult(OperatorResult modifyvenderremarkResult) {
      this.modifyvenderremarkResult = modifyvenderremarkResult;
   }

   @JsonProperty("modifyvenderremark_result")
   public OperatorResult getModifyvenderremarkResult() {
      return this.modifyvenderremarkResult;
   }
}
