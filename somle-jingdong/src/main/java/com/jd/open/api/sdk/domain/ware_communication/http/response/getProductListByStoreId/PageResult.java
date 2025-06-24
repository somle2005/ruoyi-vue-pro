package com.jd.open.api.sdk.domain.ware_communication.http.response.getProductListByStoreId;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class PageResult implements Serializable {
   private String code;
   private String message;
   private Integer pageNo;
   private Integer pageSize;
   private Long totalCount;
   private List<Sku> data;

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
      return this.code;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("pageNo")
   public void setPageNo(Integer pageNo) {
      this.pageNo = pageNo;
   }

   @JsonProperty("pageNo")
   public Integer getPageNo() {
      return this.pageNo;
   }

   @JsonProperty("pageSize")
   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public Integer getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("totalCount")
   public void setTotalCount(Long totalCount) {
      this.totalCount = totalCount;
   }

   @JsonProperty("totalCount")
   public Long getTotalCount() {
      return this.totalCount;
   }

   @JsonProperty("data")
   public void setData(List<Sku> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<Sku> getData() {
      return this.data;
   }
}
