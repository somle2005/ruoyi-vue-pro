package com.jd.open.api.sdk.domain.seller.VenderAvailableBrandQueryService.response.serachVenderAvailableBrandByCondition;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class VenderAvailableBrandResult implements Serializable {
   private List<VenderAvailableBrandVo> authBrandList;
   private boolean success;
   private String errorCode;
   private Integer rowCount;
   private Long totalCount;
   private Integer pageNum;
   private String errorMsg;

   @JsonProperty("authBrandList")
   public void setAuthBrandList(List<VenderAvailableBrandVo> authBrandList) {
      this.authBrandList = authBrandList;
   }

   @JsonProperty("authBrandList")
   public List<VenderAvailableBrandVo> getAuthBrandList() {
      return this.authBrandList;
   }

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("errorCode")
   public void setErrorCode(String errorCode) {
      this.errorCode = errorCode;
   }

   @JsonProperty("errorCode")
   public String getErrorCode() {
      return this.errorCode;
   }

   @JsonProperty("rowCount")
   public void setRowCount(Integer rowCount) {
      this.rowCount = rowCount;
   }

   @JsonProperty("rowCount")
   public Integer getRowCount() {
      return this.rowCount;
   }

   @JsonProperty("totalCount")
   public void setTotalCount(Long totalCount) {
      this.totalCount = totalCount;
   }

   @JsonProperty("totalCount")
   public Long getTotalCount() {
      return this.totalCount;
   }

   @JsonProperty("pageNum")
   public void setPageNum(Integer pageNum) {
      this.pageNum = pageNum;
   }

   @JsonProperty("pageNum")
   public Integer getPageNum() {
      return this.pageNum;
   }

   @JsonProperty("errorMsg")
   public void setErrorMsg(String errorMsg) {
      this.errorMsg = errorMsg;
   }

   @JsonProperty("errorMsg")
   public String getErrorMsg() {
      return this.errorMsg;
   }
}
