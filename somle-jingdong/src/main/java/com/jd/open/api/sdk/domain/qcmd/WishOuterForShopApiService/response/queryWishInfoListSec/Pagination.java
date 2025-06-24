package com.jd.open.api.sdk.domain.qcmd.WishOuterForShopApiService.response.queryWishInfoListSec;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class Pagination implements Serializable {
   private List<WishInfoDTO> wishInfoList;
   private Integer pageNo;
   private Integer totalPage;
   private Integer pageSize;
   private Integer totalCount;

   @JsonProperty("wishInfoList")
   public void setWishInfoList(List<WishInfoDTO> wishInfoList) {
      this.wishInfoList = wishInfoList;
   }

   @JsonProperty("wishInfoList")
   public List<WishInfoDTO> getWishInfoList() {
      return this.wishInfoList;
   }

   @JsonProperty("pageNo")
   public void setPageNo(Integer pageNo) {
      this.pageNo = pageNo;
   }

   @JsonProperty("pageNo")
   public Integer getPageNo() {
      return this.pageNo;
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

   @JsonProperty("totalCount")
   public void setTotalCount(Integer totalCount) {
      this.totalCount = totalCount;
   }

   @JsonProperty("totalCount")
   public Integer getTotalCount() {
      return this.totalCount;
   }
}
