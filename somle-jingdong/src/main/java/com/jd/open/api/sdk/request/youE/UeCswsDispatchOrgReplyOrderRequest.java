package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeCswsDispatchOrgReplyOrderResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeCswsDispatchOrgReplyOrderRequest extends AbstractRequest implements JdRequest<UeCswsDispatchOrgReplyOrderResponse> {
   private String replyTime;
   private String createdBy;
   private String appId;
   private String cusOrderNo;
   private Long size;
   private String title;
   private String type;
   private String url;
   private String content;
   private String vendorCode;

   public void setReplyTime(String replyTime) {
      this.replyTime = replyTime;
   }

   public String getReplyTime() {
      return this.replyTime;
   }

   public void setCreatedBy(String createdBy) {
      this.createdBy = createdBy;
   }

   public String getCreatedBy() {
      return this.createdBy;
   }

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public void setCusOrderNo(String cusOrderNo) {
      this.cusOrderNo = cusOrderNo;
   }

   public String getCusOrderNo() {
      return this.cusOrderNo;
   }

   public void setSize(Long size) {
      this.size = size;
   }

   public Long getSize() {
      return this.size;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getTitle() {
      return this.title;
   }

   public void setType(String type) {
      this.type = type;
   }

   public String getType() {
      return this.type;
   }

   public void setUrl(String url) {
      this.url = url;
   }

   public String getUrl() {
      return this.url;
   }

   public void setContent(String content) {
      this.content = content;
   }

   public String getContent() {
      return this.content;
   }

   public void setVendorCode(String vendorCode) {
      this.vendorCode = vendorCode;
   }

   public String getVendorCode() {
      return this.vendorCode;
   }

   public String getApiMethod() {
      return "jingdong.ue.csws.dispatch.orgReplyOrder";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("replyTime", this.replyTime);
      pmap.put("createdBy", this.createdBy);
      pmap.put("appId", this.appId);
      pmap.put("cusOrderNo", this.cusOrderNo);
      pmap.put("size", this.size);
      pmap.put("title", this.title);
      pmap.put("type", this.type);
      pmap.put("url", this.url);
      pmap.put("content", this.content);
      pmap.put("vendorCode", this.vendorCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeCswsDispatchOrgReplyOrderResponse> getResponseClass() {
      return UeCswsDispatchOrgReplyOrderResponse.class;
   }
}
