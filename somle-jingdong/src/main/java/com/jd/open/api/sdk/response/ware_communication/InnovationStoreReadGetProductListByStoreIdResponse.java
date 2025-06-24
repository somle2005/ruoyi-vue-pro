package com.jd.open.api.sdk.response.ware_communication;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware_communication.http.response.getProductListByStoreId.PageResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class InnovationStoreReadGetProductListByStoreIdResponse extends AbstractResponse {
   private PageResult getproductlistbystoreidResult;

   @JsonProperty("getproductlistbystoreid_result")
   public void setGetproductlistbystoreidResult(PageResult getproductlistbystoreidResult) {
      this.getproductlistbystoreidResult = getproductlistbystoreidResult;
   }

   @JsonProperty("getproductlistbystoreid_result")
   public PageResult getGetproductlistbystoreidResult() {
      return this.getproductlistbystoreidResult;
   }
}
