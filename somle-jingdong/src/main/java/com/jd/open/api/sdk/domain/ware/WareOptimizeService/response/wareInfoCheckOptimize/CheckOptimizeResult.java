package com.jd.open.api.sdk.domain.ware.WareOptimizeService.response.wareInfoCheckOptimize;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CheckOptimizeResult implements Serializable {
   private String spuDetectResult;
   private Object preDetectDetail;
   private String fastPublishWareRecommendResult;
   private Object optimizationResult;

   @JsonProperty("spuDetectResult")
   public void setSpuDetectResult(String spuDetectResult) {
      this.spuDetectResult = spuDetectResult;
   }

   @JsonProperty("spuDetectResult")
   public String getSpuDetectResult() {
      return this.spuDetectResult;
   }

   @JsonProperty("preDetectDetail")
   public void setPreDetectDetail(Object preDetectDetail) {
      this.preDetectDetail = preDetectDetail;
   }

   @JsonProperty("preDetectDetail")
   public Object getPreDetectDetail() {
      return this.preDetectDetail;
   }

   @JsonProperty("fastPublishWareRecommendResult")
   public void setFastPublishWareRecommendResult(String fastPublishWareRecommendResult) {
      this.fastPublishWareRecommendResult = fastPublishWareRecommendResult;
   }

   @JsonProperty("fastPublishWareRecommendResult")
   public String getFastPublishWareRecommendResult() {
      return this.fastPublishWareRecommendResult;
   }

   @JsonProperty("optimizationResult")
   public void setOptimizationResult(Object optimizationResult) {
      this.optimizationResult = optimizationResult;
   }

   @JsonProperty("optimizationResult")
   public Object getOptimizationResult() {
      return this.optimizationResult;
   }
}
