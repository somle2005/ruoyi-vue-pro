package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryPageSerialByBillNo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class OQueryResult implements Serializable {
   private List<SerialNumber> serialNumbers;
   private String storeId;
   private String storeName;
   private Integer totalRecords;
   private Integer pageSize;
   private Integer pageNo;

   @JsonProperty("serialNumbers")
   public void setSerialNumbers(List<SerialNumber> serialNumbers) {
      this.serialNumbers = serialNumbers;
   }

   @JsonProperty("serialNumbers")
   public List<SerialNumber> getSerialNumbers() {
      return this.serialNumbers;
   }

   @JsonProperty("storeId")
   public void setStoreId(String storeId) {
      this.storeId = storeId;
   }

   @JsonProperty("storeId")
   public String getStoreId() {
      return this.storeId;
   }

   @JsonProperty("storeName")
   public void setStoreName(String storeName) {
      this.storeName = storeName;
   }

   @JsonProperty("storeName")
   public String getStoreName() {
      return this.storeName;
   }

   @JsonProperty("totalRecords")
   public void setTotalRecords(Integer totalRecords) {
      this.totalRecords = totalRecords;
   }

   @JsonProperty("totalRecords")
   public Integer getTotalRecords() {
      return this.totalRecords;
   }

   @JsonProperty("pageSize")
   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public Integer getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("pageNo")
   public void setPageNo(Integer pageNo) {
      this.pageNo = pageNo;
   }

   @JsonProperty("pageNo")
   public Integer getPageNo() {
      return this.pageNo;
   }
}
