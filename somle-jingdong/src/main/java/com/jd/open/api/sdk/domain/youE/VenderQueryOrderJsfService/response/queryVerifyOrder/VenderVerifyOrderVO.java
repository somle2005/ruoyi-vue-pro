package com.jd.open.api.sdk.domain.youE.VenderQueryOrderJsfService.response.queryVerifyOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class VenderVerifyOrderVO implements Serializable {
   private Integer pageNumber;
   private Integer totalSize;
   private Integer totalPage;
   private Integer pageSize;
   private List<VenderVerifyOrderDetails> verifyOrderDetails;

   @JsonProperty("pageNumber")
   public void setPageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
   }

   @JsonProperty("pageNumber")
   public Integer getPageNumber() {
      return this.pageNumber;
   }

   @JsonProperty("totalSize")
   public void setTotalSize(Integer totalSize) {
      this.totalSize = totalSize;
   }

   @JsonProperty("totalSize")
   public Integer getTotalSize() {
      return this.totalSize;
   }

   @JsonProperty("totalPage")
   public void setTotalPage(Integer totalPage) {
      this.totalPage = totalPage;
   }

   @JsonProperty("totalPage")
   public Integer getTotalPage() {
      return this.totalPage;
   }

   @JsonProperty("pageSize")
   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public Integer getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("verifyOrderDetails")
   public void setVerifyOrderDetails(List<VenderVerifyOrderDetails> verifyOrderDetails) {
      this.verifyOrderDetails = verifyOrderDetails;
   }

   @JsonProperty("verifyOrderDetails")
   public List<VenderVerifyOrderDetails> getVerifyOrderDetails() {
      return this.verifyOrderDetails;
   }
}
