package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryStoreInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class StoreResponse implements Serializable {
   private Integer responseCode;
   private String resultMessage;
   private String totalCount;
   private List<StoreVo> storeList;

   @JsonProperty("responseCode")
   public void setResponseCode(Integer responseCode) {
      this.responseCode = responseCode;
   }

   @JsonProperty("responseCode")
   public Integer getResponseCode() {
      return this.responseCode;
   }

   @JsonProperty("resultMessage")
   public void setResultMessage(String resultMessage) {
      this.resultMessage = resultMessage;
   }

   @JsonProperty("resultMessage")
   public String getResultMessage() {
      return this.resultMessage;
   }

   @JsonProperty("totalCount")
   public void setTotalCount(String totalCount) {
      this.totalCount = totalCount;
   }

   @JsonProperty("totalCount")
   public String getTotalCount() {
      return this.totalCount;
   }

   @JsonProperty("storeList")
   public void setStoreList(List<StoreVo> storeList) {
      this.storeList = storeList;
   }

   @JsonProperty("storeList")
   public List<StoreVo> getStoreList() {
      return this.storeList;
   }
}
