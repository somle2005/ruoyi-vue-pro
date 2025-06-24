package com.jd.open.api.sdk.response.evaluation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.evaluation.PopCommentJsfService.response.getCommentSummarys.CommentSummaryUgcVo;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class PopGetCommentSummarysResponse extends AbstractResponse {
   private String resultCode;
   private List<CommentSummaryUgcVo> summaries;

   @JsonProperty("resultCode")
   public void setResultCode(String resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public String getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("summaries")
   public void setSummaries(List<CommentSummaryUgcVo> summaries) {
      this.summaries = summaries;
   }

   @JsonProperty("summaries")
   public List<CommentSummaryUgcVo> getSummaries() {
      return this.summaries;
   }
}
