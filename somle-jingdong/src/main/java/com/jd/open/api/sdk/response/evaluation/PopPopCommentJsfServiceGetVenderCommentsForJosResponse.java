package com.jd.open.api.sdk.response.evaluation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.evaluation.PopCommentJsfService.response.getVenderCommentsForJos.PopCommentJosVo;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class PopPopCommentJsfServiceGetVenderCommentsForJosResponse extends AbstractResponse {
   private List<PopCommentJosVo> comments;
   private int totalItem;
   private int page;
   private String resultCode;
   private String resultMsg;

   @JsonProperty("comments")
   public void setComments(List<PopCommentJosVo> comments) {
      this.comments = comments;
   }

   @JsonProperty("comments")
   public List<PopCommentJosVo> getComments() {
      return this.comments;
   }

   @JsonProperty("totalItem")
   public void setTotalItem(int totalItem) {
      this.totalItem = totalItem;
   }

   @JsonProperty("totalItem")
   public int getTotalItem() {
      return this.totalItem;
   }

   @JsonProperty("page")
   public void setPage(int page) {
      this.page = page;
   }

   @JsonProperty("page")
   public int getPage() {
      return this.page;
   }

   @JsonProperty("resultCode")
   public void setResultCode(String resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public String getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("resultMsg")
   public void setResultMsg(String resultMsg) {
      this.resultMsg = resultMsg;
   }

   @JsonProperty("resultMsg")
   public String getResultMsg() {
      return this.resultMsg;
   }
}
