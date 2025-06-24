package com.jd.open.api.sdk.domain.shangjiashouhou.MessageQueryProvider.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class MessageInfo implements Serializable {
   private Integer messageId;
   private Long serviceId;
   private Integer msgType;
   private String msgTypeName;
   private String title;
   private String context;
   private Integer operateType;
   private String operateTypeName;
   private String operatePin;
   private String operateName;
   private Date operateDate;
   private String extJsonStr;

   @JsonProperty("messageId")
   public void setMessageId(Integer messageId) {
      this.messageId = messageId;
   }

   @JsonProperty("messageId")
   public Integer getMessageId() {
      return this.messageId;
   }

   @JsonProperty("serviceId")
   public void setServiceId(Long serviceId) {
      this.serviceId = serviceId;
   }

   @JsonProperty("serviceId")
   public Long getServiceId() {
      return this.serviceId;
   }

   @JsonProperty("msgType")
   public void setMsgType(Integer msgType) {
      this.msgType = msgType;
   }

   @JsonProperty("msgType")
   public Integer getMsgType() {
      return this.msgType;
   }

   @JsonProperty("msgTypeName")
   public void setMsgTypeName(String msgTypeName) {
      this.msgTypeName = msgTypeName;
   }

   @JsonProperty("msgTypeName")
   public String getMsgTypeName() {
      return this.msgTypeName;
   }

   @JsonProperty("title")
   public void setTitle(String title) {
      this.title = title;
   }

   @JsonProperty("title")
   public String getTitle() {
      return this.title;
   }

   @JsonProperty("context")
   public void setContext(String context) {
      this.context = context;
   }

   @JsonProperty("context")
   public String getContext() {
      return this.context;
   }

   @JsonProperty("operateType")
   public void setOperateType(Integer operateType) {
      this.operateType = operateType;
   }

   @JsonProperty("operateType")
   public Integer getOperateType() {
      return this.operateType;
   }

   @JsonProperty("operateTypeName")
   public void setOperateTypeName(String operateTypeName) {
      this.operateTypeName = operateTypeName;
   }

   @JsonProperty("operateTypeName")
   public String getOperateTypeName() {
      return this.operateTypeName;
   }

   @JsonProperty("operatePin")
   public void setOperatePin(String operatePin) {
      this.operatePin = operatePin;
   }

   @JsonProperty("operatePin")
   public String getOperatePin() {
      return this.operatePin;
   }

   @JsonProperty("operateName")
   public void setOperateName(String operateName) {
      this.operateName = operateName;
   }

   @JsonProperty("operateName")
   public String getOperateName() {
      return this.operateName;
   }

   @JsonProperty("operateDate")
   public void setOperateDate(Date operateDate) {
      this.operateDate = operateDate;
   }

   @JsonProperty("operateDate")
   public Date getOperateDate() {
      return this.operateDate;
   }

   @JsonProperty("extJsonStr")
   public void setExtJsonStr(String extJsonStr) {
      this.extJsonStr = extJsonStr;
   }

   @JsonProperty("extJsonStr")
   public String getExtJsonStr() {
      return this.extJsonStr;
   }
}
