package com.jd.open.api.sdk.response.video;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class MediaSkuBatchBindMaterialResponse extends AbstractResponse {
   private Object maps;

   @JsonProperty("maps")
   public void setMaps(Object maps) {
      this.maps = maps;
   }

   @JsonProperty("maps")
   public Object getMaps() {
      return this.maps;
   }
}
