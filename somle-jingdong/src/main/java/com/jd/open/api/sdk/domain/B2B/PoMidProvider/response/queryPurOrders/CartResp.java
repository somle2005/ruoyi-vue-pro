package com.jd.open.api.sdk.domain.B2B.PoMidProvider.response.queryPurOrders;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class CartResp implements Serializable {
   private List<SkuResp> skuResps;
   private List<SuiteResp> suiteResps;

   @JsonProperty("skuResps")
   public void setSkuResps(List<SkuResp> skuResps) {
      this.skuResps = skuResps;
   }

   @JsonProperty("skuResps")
   public List<SkuResp> getSkuResps() {
      return this.skuResps;
   }

   @JsonProperty("suiteResps")
   public void setSuiteResps(List<SuiteResp> suiteResps) {
      this.suiteResps = suiteResps;
   }

   @JsonProperty("suiteResps")
   public List<SuiteResp> getSuiteResps() {
      return this.suiteResps;
   }
}
