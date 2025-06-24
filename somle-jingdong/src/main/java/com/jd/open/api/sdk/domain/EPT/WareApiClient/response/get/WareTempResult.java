package com.jd.open.api.sdk.domain.EPT.WareApiClient.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class WareTempResult implements Serializable {
   private Integer totalCount;
   private Integer currentPage;
   private List<RecommendTempVO> wareTempList;
   private String messegeCode;
   private String message;
   private boolean success;

   @JsonProperty("totalCount")
   public void setTotalCount(Integer totalCount) {
      this.totalCount = totalCount;
   }

   @JsonProperty("totalCount")
   public Integer getTotalCount() {
      return this.totalCount;
   }

   @JsonProperty("currentPage")
   public void setCurrentPage(Integer currentPage) {
      this.currentPage = currentPage;
   }

   @JsonProperty("currentPage")
   public Integer getCurrentPage() {
      return this.currentPage;
   }

   @JsonProperty("wareTempList")
   public void setWareTempList(List<RecommendTempVO> wareTempList) {
      this.wareTempList = wareTempList;
   }

   @JsonProperty("wareTempList")
   public List<RecommendTempVO> getWareTempList() {
      return this.wareTempList;
   }

   @JsonProperty("messegeCode")
   public void setMessegeCode(String messegeCode) {
      this.messegeCode = messegeCode;
   }

   @JsonProperty("messegeCode")
   public String getMessegeCode() {
      return this.messegeCode;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }
}
