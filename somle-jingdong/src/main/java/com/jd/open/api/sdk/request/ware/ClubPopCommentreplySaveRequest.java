package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.ClubPopCommentreplySaveResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ClubPopCommentreplySaveRequest extends AbstractRequest implements JdRequest<ClubPopCommentreplySaveResponse> {
   private String commentId;
   private String content;
   private String replyId;

   public void setCommentId(String commentId) {
      this.commentId = commentId;
   }

   public String getCommentId() {
      return this.commentId;
   }

   public void setContent(String content) {
      this.content = content;
   }

   public String getContent() {
      return this.content;
   }

   public void setReplyId(String replyId) {
      this.replyId = replyId;
   }

   public String getReplyId() {
      return this.replyId;
   }

   public String getApiMethod() {
      return "jingdong.club.pop.commentreply.save";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("commentId", this.commentId);
      pmap.put("content", this.content);
      pmap.put("replyId", this.replyId);
      return JsonUtil.toJson(pmap);
   }

   public Class<ClubPopCommentreplySaveResponse> getResponseClass() {
      return ClubPopCommentreplySaveResponse.class;
   }
}
