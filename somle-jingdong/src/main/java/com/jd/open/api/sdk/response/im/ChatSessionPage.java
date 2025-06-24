package com.jd.open.api.sdk.response.im;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ChatSessionPage implements Serializable {
   private List<ChatSession> chatSessionList;
   private int totalRecord;

   @JsonProperty("chatSessionList")
   public void setChatSessionList(List<ChatSession> chatSessionList) {
      this.chatSessionList = chatSessionList;
   }

   @JsonProperty("chatSessionList")
   public List<ChatSession> getChatSessionList() {
      return this.chatSessionList;
   }

   @JsonProperty("totalRecord")
   public void setTotalRecord(int totalRecord) {
      this.totalRecord = totalRecord;
   }

   @JsonProperty("totalRecord")
   public int getTotalRecord() {
      return this.totalRecord;
   }
}
