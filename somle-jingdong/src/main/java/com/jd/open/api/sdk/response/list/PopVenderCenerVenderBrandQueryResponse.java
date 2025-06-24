package com.jd.open.api.sdk.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class PopVenderCenerVenderBrandQueryResponse extends AbstractResponse {
   private List<VenderBrandPubInfo> brandList;

   @JsonProperty("brandList")
   public void setBrandList(List<VenderBrandPubInfo> brandList) {
      this.brandList = brandList;
   }

   @JsonProperty("brandList")
   public List<VenderBrandPubInfo> getBrandList() {
      return this.brandList;
   }
}
