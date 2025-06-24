package com.jd.open.api.sdk.response.im;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class ImPopEvaluationlistGetResponse extends AbstractResponse {
   private List<Evaluation> Evaluation;

   @JsonProperty("Evaluation")
   public void setEvaluation(List<Evaluation> Evaluation) {
      this.Evaluation = Evaluation;
   }

   @JsonProperty("Evaluation")
   public List<Evaluation> getEvaluation() {
      return this.Evaluation;
   }
}
