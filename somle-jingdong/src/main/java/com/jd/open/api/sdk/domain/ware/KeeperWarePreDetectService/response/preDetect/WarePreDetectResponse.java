package com.jd.open.api.sdk.domain.ware.KeeperWarePreDetectService.response.preDetect;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class WarePreDetectResponse implements Serializable {
   private List<KeeperDetectResult> results;
   private Integer score;

   @JsonProperty("results")
   public void setResults(List<KeeperDetectResult> results) {
      this.results = results;
   }

   @JsonProperty("results")
   public List<KeeperDetectResult> getResults() {
      return this.results;
   }

   @JsonProperty("score")
   public void setScore(Integer score) {
      this.score = score;
   }

   @JsonProperty("score")
   public Integer getScore() {
      return this.score;
   }
}
