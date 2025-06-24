package com.jd.open.api.sdk.domain.c2mdzkfpt.SkuCustomServiceOpenApi.request.batchQueryCustomServiceApplyResult;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class SkuServiceBatchApplyResultVo implements Serializable {
   private List<SkuServiceApplyResultVo> skuServiceApplyResultList;
   private String locale;

   @JsonProperty("skuServiceApplyResultList")
   public void setSkuServiceApplyResultList(List<SkuServiceApplyResultVo> skuServiceApplyResultList) {
      this.skuServiceApplyResultList = skuServiceApplyResultList;
   }

   @JsonProperty("skuServiceApplyResultList")
   public List<SkuServiceApplyResultVo> getSkuServiceApplyResultList() {
      return this.skuServiceApplyResultList;
   }

   @JsonProperty("locale")
   public void setLocale(String locale) {
      this.locale = locale;
   }

   @JsonProperty("locale")
   public String getLocale() {
      return this.locale;
   }
}
