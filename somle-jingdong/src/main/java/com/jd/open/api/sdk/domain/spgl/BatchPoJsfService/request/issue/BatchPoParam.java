package com.jd.open.api.sdk.domain.spgl.BatchPoJsfService.request.issue;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class BatchPoParam implements Serializable {
   private String bookNo;
   private String poNo;
   private List<BatchSkuParam> batchSkuParamList;

   @JsonProperty("bookNo")
   public void setBookNo(String bookNo) {
      this.bookNo = bookNo;
   }

   @JsonProperty("bookNo")
   public String getBookNo() {
      return this.bookNo;
   }

   @JsonProperty("poNo")
   public void setPoNo(String poNo) {
      this.poNo = poNo;
   }

   @JsonProperty("poNo")
   public String getPoNo() {
      return this.poNo;
   }

   @JsonProperty("batchSkuParamList")
   public void setBatchSkuParamList(List<BatchSkuParam> batchSkuParamList) {
      this.batchSkuParamList = batchSkuParamList;
   }

   @JsonProperty("batchSkuParamList")
   public List<BatchSkuParam> getBatchSkuParamList() {
      return this.batchSkuParamList;
   }
}
