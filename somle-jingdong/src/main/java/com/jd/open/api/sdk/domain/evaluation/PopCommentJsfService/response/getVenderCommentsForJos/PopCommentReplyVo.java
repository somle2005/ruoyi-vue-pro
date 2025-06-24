package com.jd.open.api.sdk.domain.evaluation.PopCommentJsfService.response.getVenderCommentsForJos;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class PopCommentReplyVo implements Serializable {
   private String content;
   private Long replyId;
   private Date creationTime;
   private String nickName;
   private PopCommentReplyVo parentReply;

   @JsonProperty("content")
   public void setContent(String content) {
      this.content = content;
   }

   @JsonProperty("content")
   public String getContent() {
      return this.content;
   }

   @JsonProperty("replyId")
   public void setReplyId(Long replyId) {
      this.replyId = replyId;
   }

   @JsonProperty("replyId")
   public Long getReplyId() {
      return this.replyId;
   }

   @JsonProperty("creationTime")
   public void setCreationTime(Date creationTime) {
      this.creationTime = creationTime;
   }

   @JsonProperty("creationTime")
   public Date getCreationTime() {
      return this.creationTime;
   }

   @JsonProperty("nickName")
   public void setNickName(String nickName) {
      this.nickName = nickName;
   }

   @JsonProperty("nickName")
   public String getNickName() {
      return this.nickName;
   }

   @JsonProperty("parentReply")
   public void setParentReply(PopCommentReplyVo parentReply) {
      this.parentReply = parentReply;
   }

   @JsonProperty("parentReply")
   public PopCommentReplyVo getParentReply() {
      return this.parentReply;
   }
}
