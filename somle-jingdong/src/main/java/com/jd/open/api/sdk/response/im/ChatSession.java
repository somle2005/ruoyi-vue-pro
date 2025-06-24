package com.jd.open.api.sdk.response.im;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class ChatSession implements Serializable {
   private String customer;
   private String waiter;
   private Date beginTime;
   private Date replyTime;
   private Date endTime;
   private int sessionType;
   private boolean transfer;
   private String sid;
   private Long skuId;

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

   @JsonProperty("beginTime")
   public void setBeginTime(Date beginTime) {
      this.beginTime = beginTime;
   }

   @JsonProperty("beginTime")
   public Date getBeginTime() {
      return this.beginTime;
   }

   @JsonProperty("replyTime")
   public void setReplyTime(Date replyTime) {
      this.replyTime = replyTime;
   }

   @JsonProperty("replyTime")
   public Date getReplyTime() {
      return this.replyTime;
   }

   @JsonProperty("endTime")
   public void setEndTime(Date endTime) {
      this.endTime = endTime;
   }

   @JsonProperty("endTime")
   public Date getEndTime() {
      return this.endTime;
   }

   @JsonProperty("sessionType")
   public void setSessionType(int sessionType) {
      this.sessionType = sessionType;
   }

   @JsonProperty("sessionType")
   public int getSessionType() {
      return this.sessionType;
   }

   @JsonProperty("transfer")
   public void setTransfer(boolean transfer) {
      this.transfer = transfer;
   }

   @JsonProperty("transfer")
   public boolean getTransfer() {
      return this.transfer;
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
}
