package com.jd.open.api.sdk.domain.shangjiashouhou.ServiceUnsolvedProvider.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class UnsolvedMessage implements Serializable {
   private String createPin;
   private String createName;
   private Date createDate;
   private String context;
   private Integer messageType;
   private String messageTypeName;
   private String extJsonStr;

   @JsonProperty("createPin")
   public void setCreatePin(String createPin) {
      this.createPin = createPin;
   }

   @JsonProperty("createPin")
   public String getCreatePin() {
      return this.createPin;
   }

   @JsonProperty("createName")
   public void setCreateName(String createName) {
      this.createName = createName;
   }

   @JsonProperty("createName")
   public String getCreateName() {
      return this.createName;
   }

   @JsonProperty("createDate")
   public void setCreateDate(Date createDate) {
      this.createDate = createDate;
   }

   @JsonProperty("createDate")
   public Date getCreateDate() {
      return this.createDate;
   }

   @JsonProperty("context")
   public void setContext(String context) {
      this.context = context;
   }

   @JsonProperty("context")
   public String getContext() {
      return this.context;
   }

   @JsonProperty("messageType")
   public void setMessageType(Integer messageType) {
      this.messageType = messageType;
   }

   @JsonProperty("messageType")
   public Integer getMessageType() {
      return this.messageType;
   }

   @JsonProperty("messageTypeName")
   public void setMessageTypeName(String messageTypeName) {
      this.messageTypeName = messageTypeName;
   }

   @JsonProperty("messageTypeName")
   public String getMessageTypeName() {
      return this.messageTypeName;
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
