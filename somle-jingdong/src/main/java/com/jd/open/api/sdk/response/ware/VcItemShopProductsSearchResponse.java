package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.ProductManagementService.response.search.JosShopProductInfoDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VcItemShopProductsSearchResponse extends AbstractResponse {
   private JosShopProductInfoDto dataResult;

   @JsonProperty("dataResult")
   public void setDataResult(JosShopProductInfoDto dataResult) {
      this.dataResult = dataResult;
   }

   @JsonProperty("dataResult")
   public JosShopProductInfoDto getDataResult() {
      return this.dataResult;
   }
}
