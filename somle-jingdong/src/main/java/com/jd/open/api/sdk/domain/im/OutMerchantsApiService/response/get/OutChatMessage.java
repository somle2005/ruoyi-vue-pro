package com.jd.open.api.sdk.domain.im.OutMerchantsApiService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OutChatMessage implements Serializable {
   private String merchantId;
   private String sid;
   private String mid;
   private String uuid;
   private String waiter;
   private String customer;
   private String content;
   private Long created;
   private String channel;
   private Integer waiterSend;
   private Integer mt;
   private Integer chatType;
   private String type;
   private String url;
   private String extParam;

   @JsonProperty("merchantId")
   public void setMerchantId(String merchantId) {
      this.merchantId = merchantId;
   }

   @JsonProperty("merchantId")
   public String getMerchantId() {
      return this.merchantId;
   }

   @JsonProperty("sid")
   public void setSid(String sid) {
      this.sid = sid;
   }

   @JsonProperty("sid")
   public String getSid() {
      return this.sid;
   }

   @JsonProperty("mid")
   public void setMid(String mid) {
      this.mid = mid;
   }

   @JsonProperty("mid")
   public String getMid() {
      return this.mid;
   }

   @JsonProperty("uuid")
   public void setUuid(String uuid) {
      this.uuid = uuid;
   }

   @JsonProperty("uuid")
   public String getUuid() {
      return this.uuid;
   }

   @JsonProperty("waiter")
   public void setWaiter(String waiter) {
      this.waiter = waiter;
   }

   @JsonProperty("waiter")
   public String getWaiter() {
      return this.waiter;
   }

   @JsonProperty("customer")
   public void setCustomer(String customer) {
      this.customer = customer;
   }

   @JsonProperty("customer")
   public String getCustomer() {
      return this.customer;
   }

   @JsonProperty("content")
   public void setContent(String content) {
      this.content = content;
   }

   @JsonProperty("content")
   public String getContent() {
      return this.content;
   }

   @JsonProperty("created")
   public void setCreated(Long created) {
      this.created = created;
   }

   @JsonProperty("created")
   public Long getCreated() {
      return this.created;
   }

   @JsonProperty("channel")
   public void setChannel(String channel) {
      this.channel = channel;
   }

   @JsonProperty("channel")
   public String getChannel() {
      return this.channel;
   }

   @JsonProperty("waiterSend")
   public void setWaiterSend(Integer waiterSend) {
      this.waiterSend = waiterSend;
   }

   @JsonProperty("waiterSend")
   public Integer getWaiterSend() {
      return this.waiterSend;
   }

   @JsonProperty("mt")
   public void setMt(Integer mt) {
      this.mt = mt;
   }

   @JsonProperty("mt")
   public Integer getMt() {
      return this.mt;
   }

   @JsonProperty("chatType")
   public void setChatType(Integer chatType) {
      this.chatType = chatType;
   }

   @JsonProperty("chatType")
   public Integer getChatType() {
      return this.chatType;
   }

   @JsonProperty("type")
   public void setType(String type) {
      this.type = type;
   }

   @JsonProperty("type")
   public String getType() {
      return this.type;
   }

   @JsonProperty("url")
   public void setUrl(String url) {
      this.url = url;
   }

   @JsonProperty("url")
   public String getUrl() {
      return this.url;
   }

   @JsonProperty("extParam")
   public void setExtParam(String extParam) {
      this.extParam = extParam;
   }

   @JsonProperty("extParam")
   public String getExtParam() {
      return this.extParam;
   }
}
