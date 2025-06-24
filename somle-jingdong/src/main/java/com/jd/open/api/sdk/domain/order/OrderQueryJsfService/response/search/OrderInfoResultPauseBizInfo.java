package com.jd.open.api.sdk.domain.order.OrderQueryJsfService.response.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class OrderInfoResultPauseBizInfo implements Serializable {
   private List<PauseBizStatus> pauseBizStatusList;
   private PauseBizDataYy pauseBizDataYy;

   @JsonProperty("pauseBizStatusList")
   public void setPauseBizStatusList(List<PauseBizStatus> pauseBizStatusList) {
      this.pauseBizStatusList = pauseBizStatusList;
   }

   @JsonProperty("pauseBizStatusList")
   public List<PauseBizStatus> getPauseBizStatusList() {
      return this.pauseBizStatusList;
   }

   @JsonProperty("pauseBizDataYy")
   public void setPauseBizDataYy(PauseBizDataYy pauseBizDataYy) {
      this.pauseBizDataYy = pauseBizDataYy;
   }

   @JsonProperty("pauseBizDataYy")
   public PauseBizDataYy getPauseBizDataYy() {
      return this.pauseBizDataYy;
   }
}
