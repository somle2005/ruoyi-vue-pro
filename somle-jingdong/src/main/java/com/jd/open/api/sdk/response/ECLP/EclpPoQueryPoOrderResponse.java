package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.queryPoModel.EclpOpenService.response.queryPoOrder.QueryPoModel;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class EclpPoQueryPoOrderResponse extends AbstractResponse {
   private List<QueryPoModel> queryPoModelList;

   @JsonProperty("queryPoModelList")
   public void setQueryPoModelList(List<QueryPoModel> queryPoModelList) {
      this.queryPoModelList = queryPoModelList;
   }

   @JsonProperty("queryPoModelList")
   public List<QueryPoModel> getQueryPoModelList() {
      return this.queryPoModelList;
   }
}
