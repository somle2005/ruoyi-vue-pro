package com.jd.open.api.sdk.domain.c2mdzkfpt.SkuCustomServiceOpenApi.request.skuCustomServiceBatchApply;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class SkuServiceBatchApplyVo implements Serializable {
   private List<SkuServiceApplyVo> skuServiceApplyList;
   private String locale;

   @JsonProperty("skuServiceApplyList")
   public void setSkuServiceApplyList(List<SkuServiceApplyVo> skuServiceApplyList) {
      this.skuServiceApplyList = skuServiceApplyList;
   }

   @JsonProperty("skuServiceApplyList")
   public List<SkuServiceApplyVo> getSkuServiceApplyList() {
      return this.skuServiceApplyList;
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
