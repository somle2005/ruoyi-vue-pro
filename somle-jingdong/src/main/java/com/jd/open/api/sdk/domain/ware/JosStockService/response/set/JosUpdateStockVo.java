package com.jd.open.api.sdk.domain.ware.JosStockService.response.set;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class JosUpdateStockVo implements Serializable {
   private List<JosBatchUpdateVo> updateStockResult;

   @JsonProperty("updateStockResult")
   public void setUpdateStockResult(List<JosBatchUpdateVo> updateStockResult) {
      this.updateStockResult = updateStockResult;
   }

   @JsonProperty("updateStockResult")
   public List<JosBatchUpdateVo> getUpdateStockResult() {
      return this.updateStockResult;
   }
}
