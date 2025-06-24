package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryBatchAttrStock;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class BatchAttrStockResponse implements Serializable {
   private String cursor;
   private List<BatchAttrData> batchAttrData;
   private String errMsg;
   private Integer totalCount;
   private int responseCode;

   @JsonProperty("cursor")
   public void setCursor(String cursor) {
      this.cursor = cursor;
   }

   @JsonProperty("cursor")
   public String getCursor() {
      return this.cursor;
   }

   @JsonProperty("batchAttrData")
   public void setBatchAttrData(List<BatchAttrData> batchAttrData) {
      this.batchAttrData = batchAttrData;
   }

   @JsonProperty("batchAttrData")
   public List<BatchAttrData> getBatchAttrData() {
      return this.batchAttrData;
   }

   @JsonProperty("errMsg")
   public void setErrMsg(String errMsg) {
      this.errMsg = errMsg;
   }

   @JsonProperty("errMsg")
   public String getErrMsg() {
      return this.errMsg;
   }

   @JsonProperty("totalCount")
   public void setTotalCount(Integer totalCount) {
      this.totalCount = totalCount;
   }

   @JsonProperty("totalCount")
   public Integer getTotalCount() {
      return this.totalCount;
   }

   @JsonProperty("responseCode")
   public void setResponseCode(int responseCode) {
      this.responseCode = responseCode;
   }

   @JsonProperty("responseCode")
   public int getResponseCode() {
      return this.responseCode;
   }
}
