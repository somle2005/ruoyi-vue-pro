package com.jd.open.api.sdk.domain.risk.KeeperWareRectificationService.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PageDTO implements Serializable {
   private long totalItem;
   private int pageNo;
   private int pageSize;
   private KeeperWareRectificationDTO data;

   @JsonProperty("totalItem")
   public void setTotalItem(long totalItem) {
      this.totalItem = totalItem;
   }

   @JsonProperty("totalItem")
   public long getTotalItem() {
      return this.totalItem;
   }

   @JsonProperty("pageNo")
   public void setPageNo(int pageNo) {
      this.pageNo = pageNo;
   }

   @JsonProperty("pageNo")
   public int getPageNo() {
      return this.pageNo;
   }

   @JsonProperty("pageSize")
   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public int getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("data")
   public void setData(KeeperWareRectificationDTO data) {
      this.data = data;
   }

   @JsonProperty("data")
   public KeeperWareRectificationDTO getData() {
      return this.data;
   }
}
