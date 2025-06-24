package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.EdiSdvVendorCommentReplySaveResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EdiSdvVendorCommentReplySaveRequest extends AbstractRequest implements JdRequest<EdiSdvVendorCommentReplySaveResponse> {
   private String username;
   private Long commentId;
   private Integer type;
   private Long parentReplyId;
   private Long targetReplyId;
   private String content;
   private Long venderId;
   private String ip;
   private Integer clientType;
   private String uuid;

   public void setUsername(String username) {
      this.username = username;
   }

   public String getUsername() {
      return this.username;
   }

   public void setCommentId(Long commentId) {
      this.commentId = commentId;
   }

   public Long getCommentId() {
      return this.commentId;
   }

   public void setType(Integer type) {
      this.type = type;
   }

   public Integer getType() {
      return this.type;
   }

   public void setParentReplyId(Long parentReplyId) {
      this.parentReplyId = parentReplyId;
   }

   public Long getParentReplyId() {
      return this.parentReplyId;
   }

   public void setTargetReplyId(Long targetReplyId) {
      this.targetReplyId = targetReplyId;
   }

   public Long getTargetReplyId() {
      return this.targetReplyId;
   }

   public void setContent(String content) {
      this.content = content;
   }

   public String getContent() {
      return this.content;
   }

   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   public Long getVenderId() {
      return this.venderId;
   }

   public void setIp(String ip) {
      this.ip = ip;
   }

   public String getIp() {
      return this.ip;
   }

   public void setClientType(Integer clientType) {
      this.clientType = clientType;
   }

   public Integer getClientType() {
      return this.clientType;
   }

   public void setUuid(String uuid) {
      this.uuid = uuid;
   }

   public String getUuid() {
      return this.uuid;
   }

   public String getApiMethod() {
      return "jingdong.edi.sdv.vendor.comment.reply.save";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("username", this.username);
      pmap.put("commentId", this.commentId);
      pmap.put("type", this.type);
      pmap.put("parentReplyId", this.parentReplyId);
      pmap.put("targetReplyId", this.targetReplyId);
      pmap.put("content", this.content);
      pmap.put("venderId", this.venderId);
      pmap.put("ip", this.ip);
      pmap.put("clientType", this.clientType);
      pmap.put("uuid", this.uuid);
      return JsonUtil.toJson(pmap);
   }

   public Class<EdiSdvVendorCommentReplySaveResponse> getResponseClass() {
      return EdiSdvVendorCommentReplySaveResponse.class;
   }
}
