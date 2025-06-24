package com.jd.open.api.sdk.domain.ware.JOSTextMaterialService.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class QueryTextMaterialResult implements Serializable {
   private List<SkuRelativeTextMaterialInfo> textMaterialList;

   @JsonProperty("textMaterialList")
   public void setTextMaterialList(List<SkuRelativeTextMaterialInfo> textMaterialList) {
      this.textMaterialList = textMaterialList;
   }

   @JsonProperty("textMaterialList")
   public List<SkuRelativeTextMaterialInfo> getTextMaterialList() {
      return this.textMaterialList;
   }
}
