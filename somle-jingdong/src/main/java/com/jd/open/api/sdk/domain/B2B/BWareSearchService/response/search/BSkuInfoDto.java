package com.jd.open.api.sdk.domain.B2B.BWareSearchService.response.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class BSkuInfoDto implements Serializable {
   private Long jdSkuId;

   @JsonProperty("jdSkuId")
   public void setJdSkuId(Long jdSkuId) {
      this.jdSkuId = jdSkuId;
   }

   @JsonProperty("jdSkuId")
   public Long getJdSkuId() {
      return this.jdSkuId;
   }
}
