package com.jd.open.api.sdk.domain.wujiemiandan.EclpOpenService.response.queryGoodsByPageAndTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class PageableResult implements Serializable {
   private List<GoodsInfo> resultList;
   private int recordCount;

   @JsonProperty("resultList")
   public void setResultList(List<GoodsInfo> resultList) {
      this.resultList = resultList;
   }

   @JsonProperty("resultList")
   public List<GoodsInfo> getResultList() {
      return this.resultList;
   }

   @JsonProperty("recordCount")
   public void setRecordCount(int recordCount) {
      this.recordCount = recordCount;
   }

   @JsonProperty("recordCount")
   public int getRecordCount() {
      return this.recordCount;
   }
}
