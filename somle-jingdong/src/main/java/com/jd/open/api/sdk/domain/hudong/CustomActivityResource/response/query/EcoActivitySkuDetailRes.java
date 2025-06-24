package com.jd.open.api.sdk.domain.hudong.CustomActivityResource.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class EcoActivitySkuDetailRes implements Serializable {
   private List<EcoActivitySkuIdRes> ecoActivitySkuIdResList;

   @JsonProperty("ecoActivitySkuIdResList")
   public void setEcoActivitySkuIdResList(List<EcoActivitySkuIdRes> ecoActivitySkuIdResList) {
      this.ecoActivitySkuIdResList = ecoActivitySkuIdResList;
   }

   @JsonProperty("ecoActivitySkuIdResList")
   public List<EcoActivitySkuIdRes> getEcoActivitySkuIdResList() {
      return this.ecoActivitySkuIdResList;
   }
}
