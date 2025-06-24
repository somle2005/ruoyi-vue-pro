package com.jd.open.api.sdk.domain.B2B.B2BOrderProvider.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class TrackShow implements Serializable {
   private String msgTime;
   private String content;
   private String op;

   @JsonProperty("msgTime")
   public void setMsgTime(String msgTime) {
      this.msgTime = msgTime;
   }

   @JsonProperty("msgTime")
   public String getMsgTime() {
      return this.msgTime;
   }

   @JsonProperty("content")
   public void setContent(String content) {
      this.content = content;
   }

   @JsonProperty("content")
   public String getContent() {
      return this.content;
   }

   @JsonProperty("op")
   public void setOp(String op) {
      this.op = op;
   }

   @JsonProperty("op")
   public String getOp() {
      return this.op;
   }
}
