package com.jd.open.api.sdk.domain.unboundedShop.DjcsServiceProvider.response.getVenderStoreInfoList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class Page implements Serializable {
   private Boolean success;
   private String reason;
   private Integer page;
   private Integer pageSize;
   private Integer totalPage;
   private Integer totalItem;
   private List<StoreInfoResTO> itemList;

   @JsonProperty("success")
   public void setSuccess(Boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public Boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("reason")
   public void setReason(String reason) {
      this.reason = reason;
   }

   @JsonProperty("reason")
   public String getReason() {
      return this.reason;
   }

   @JsonProperty("page")
   public void setPage(Integer page) {
      this.page = page;
   }

   @JsonProperty("page")
   public Integer getPage() {
      return this.page;
   }

   @JsonProperty("pageSize")
   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public Integer getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("totalPage")
   public void setTotalPage(Integer totalPage) {
      this.totalPage = totalPage;
   }

   @JsonProperty("totalPage")
   public Integer getTotalPage() {
      return this.totalPage;
   }

   @JsonProperty("totalItem")
   public void setTotalItem(Integer totalItem) {
      this.totalItem = totalItem;
   }

   @JsonProperty("totalItem")
   public Integer getTotalItem() {
      return this.totalItem;
   }

   @JsonProperty("itemList")
   public void setItemList(List<StoreInfoResTO> itemList) {
      this.itemList = itemList;
   }

   @JsonProperty("itemList")
   public List<StoreInfoResTO> getItemList() {
      return this.itemList;
   }
}
