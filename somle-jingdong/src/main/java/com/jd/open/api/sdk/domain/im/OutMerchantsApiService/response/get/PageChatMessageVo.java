package com.jd.open.api.sdk.domain.im.OutMerchantsApiService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class PageChatMessageVo implements Serializable {
   private String message;
   private Long totalCount;
   private List<OutChatMessage> result;
   private Long pageSize;
   private Long currentPage;
   private Boolean isSuccess;
   private Integer code;

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("totalCount")
   public void setTotalCount(Long totalCount) {
      this.totalCount = totalCount;
   }

   @JsonProperty("totalCount")
   public Long getTotalCount() {
      return this.totalCount;
   }

   @JsonProperty("result")
   public void setResult(List<OutChatMessage> result) {
      this.result = result;
   }

   @JsonProperty("result")
   public List<OutChatMessage> getResult() {
      return this.result;
   }

   @JsonProperty("pageSize")
   public void setPageSize(Long pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public Long getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("currentPage")
   public void setCurrentPage(Long currentPage) {
      this.currentPage = currentPage;
   }

   @JsonProperty("currentPage")
   public Long getCurrentPage() {
      return this.currentPage;
   }

   @JsonProperty("isSuccess")
   public void setIsSuccess(Boolean isSuccess) {
      this.isSuccess = isSuccess;
   }

   @JsonProperty("isSuccess")
   public Boolean getIsSuccess() {
      return this.isSuccess;
   }

   @JsonProperty("code")
   public void setCode(Integer code) {
      this.code = code;
   }

   @JsonProperty("code")
   public Integer getCode() {
      return this.code;
   }
}
