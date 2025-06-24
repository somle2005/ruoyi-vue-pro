package com.jd.open.api.sdk.domain.ware.JOSTextMaterialService.response.batchadd;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class SaveTextMaterialResult implements Serializable {
   private List<RelativeMaterialResult> relativeMaterialResults;

   @JsonProperty("relativeMaterialResults")
   public void setRelativeMaterialResults(List<RelativeMaterialResult> relativeMaterialResults) {
      this.relativeMaterialResults = relativeMaterialResults;
   }

   @JsonProperty("relativeMaterialResults")
   public List<RelativeMaterialResult> getRelativeMaterialResults() {
      return this.relativeMaterialResults;
   }
}
