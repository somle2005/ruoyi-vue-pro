package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.CategoryAttrValueReadService.response.findSaleAttrValueTemplates.SaleAttrValueTemplate;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class CategoryReadFindSaleAttrValueTemplatesResponse extends AbstractResponse {
   private List<SaleAttrValueTemplate> result;

   @JsonProperty("result")
   public void setResult(List<SaleAttrValueTemplate> result) {
      this.result = result;
   }

   @JsonProperty("result")
   public List<SaleAttrValueTemplate> getResult() {
      return this.result;
   }
}
