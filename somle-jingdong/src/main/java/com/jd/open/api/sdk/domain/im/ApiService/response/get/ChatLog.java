package com.jd.open.api.sdk.domain.im.ApiService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class ChatLog implements Serializable {
   private String customer;
   private String waiter;
   private String content;
   private String sid;
   private Long skuId;
   private Date time;
   private int channel;
   private boolean waiterSend;

   @JsonProperty("customer")
   public void setCustomer(String customer) {
      this.customer = customer;
   }

   @JsonProperty("customer")
   public String getCustomer() {
      return this.customer;
   }

   @JsonProperty("waiter")
   public void setWaiter(String waiter) {
      this.waiter = waiter;
   }

   @JsonProperty("waiter")
   public String getWaiter() {
      return this.waiter;
   }

   @JsonProperty("content")
   public void setContent(String content) {
      this.content = content;
   }

   @JsonProperty("content")
   public String getContent() {
      return this.content;
   }

   @JsonProperty("sid")
   public void setSid(String sid) {
      this.sid = sid;
   }

   @JsonProperty("sid")
   public String getSid() {
      return this.sid;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("time")
   public void setTime(Date time) {
      this.time = time;
   }

   @JsonProperty("time")
   public Date getTime() {
      return this.time;
   }

   @JsonProperty("channel")
   public void setChannel(int channel) {
      this.channel = channel;
   }

   @JsonProperty("channel")
   public int getChannel() {
      return this.channel;
   }

   @JsonProperty("waiterSend")
   public void setWaiterSend(boolean waiterSend) {
      this.waiterSend = waiterSend;
   }

   @JsonProperty("waiterSend")
   public boolean getWaiterSend() {
      return this.waiterSend;
   }
}
