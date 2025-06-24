package com.jd.open.api.sdk.response.evaluation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.evaluation.PopCommentJsfService.response.getUserCommentVoucher.PopCommentVo;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class PopPopCommentJsfServiceGetUserCommentVoucherResponse extends AbstractResponse {
   private int index;
   private int count;
   private String resultCode;
   private List<PopCommentVo> userCommentVoList;

   @JsonProperty("index")
   public void setIndex(int index) {
      this.index = index;
   }

   @JsonProperty("index")
   public int getIndex() {
      return this.index;
   }

   @JsonProperty("count")
   public void setCount(int count) {
      this.count = count;
   }

   @JsonProperty("count")
   public int getCount() {
      return this.count;
   }

   @JsonProperty("resultCode")
   public void setResultCode(String resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public String getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("userCommentVoList")
   public void setUserCommentVoList(List<PopCommentVo> userCommentVoList) {
      this.userCommentVoList = userCommentVoList;
   }

   @JsonProperty("userCommentVoList")
   public List<PopCommentVo> getUserCommentVoList() {
      return this.userCommentVoList;
   }
}
