package com.jd.open.api.sdk.domain.unboundedShop.EmployeeServiceProvider.response.listEmployee;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class Paginate implements Serializable {
   private int page;
   private int pageSize;
   private int totalPage;
   private int totalItem;
   private List<VenderStoreEmployeeDTO> itemList;

   @JsonProperty("page")
   public void setPage(int page) {
      this.page = page;
   }

   @JsonProperty("page")
   public int getPage() {
      return this.page;
   }

   @JsonProperty("pageSize")
   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public int getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("totalPage")
   public void setTotalPage(int totalPage) {
      this.totalPage = totalPage;
   }

   @JsonProperty("totalPage")
   public int getTotalPage() {
      return this.totalPage;
   }

   @JsonProperty("totalItem")
   public void setTotalItem(int totalItem) {
      this.totalItem = totalItem;
   }

   @JsonProperty("totalItem")
   public int getTotalItem() {
      return this.totalItem;
   }

   @JsonProperty("itemList")
   public void setItemList(List<VenderStoreEmployeeDTO> itemList) {
      this.itemList = itemList;
   }

   @JsonProperty("itemList")
   public List<VenderStoreEmployeeDTO> getItemList() {
      return this.itemList;
   }
}
