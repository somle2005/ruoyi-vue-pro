package com.jd.open.api.sdk.domain.alpha.OrderTrackSiteExport.response.getTrackShowResult;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class TrackShowVo implements Serializable {
   private long orderId;
   private int systemType;
   private int messageType;
   private String content;
   private Date msgTime;
   private String operatorStr;
   private String scanType;
   private String groupType;

   @JsonProperty("orderId")
   public void setOrderId(long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("systemType")
   public void setSystemType(int systemType) {
      this.systemType = systemType;
   }

   @JsonProperty("systemType")
   public int getSystemType() {
      return this.systemType;
   }

   @JsonProperty("messageType")
   public void setMessageType(int messageType) {
      this.messageType = messageType;
   }

   @JsonProperty("messageType")
   public int getMessageType() {
      return this.messageType;
   }

   @JsonProperty("content")
   public void setContent(String content) {
      this.content = content;
   }

   @JsonProperty("content")
   public String getContent() {
      return this.content;
   }

   @JsonProperty("msgTime")
   public void setMsgTime(Date msgTime) {
      this.msgTime = msgTime;
   }

   @JsonProperty("msgTime")
   public Date getMsgTime() {
      return this.msgTime;
   }

   @JsonProperty("operatorStr")
   public void setOperatorStr(String operatorStr) {
      this.operatorStr = operatorStr;
   }

   @JsonProperty("operatorStr")
   public String getOperatorStr() {
      return this.operatorStr;
   }

   @JsonProperty("scanType")
   public void setScanType(String scanType) {
      this.scanType = scanType;
   }

   @JsonProperty("scanType")
   public String getScanType() {
      return this.scanType;
   }

   @JsonProperty("groupType")
   public void setGroupType(String groupType) {
      this.groupType = groupType;
   }

   @JsonProperty("groupType")
   public String getGroupType() {
      return this.groupType;
   }
}
