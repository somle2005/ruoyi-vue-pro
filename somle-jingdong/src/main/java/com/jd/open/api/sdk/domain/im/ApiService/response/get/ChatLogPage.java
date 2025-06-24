package com.jd.open.api.sdk.domain.im.ApiService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ChatLogPage implements Serializable {
   private List<ChatLog> chatLogList;
   private int totalRecord;

   @JsonProperty("chatLogList")
   public void setChatLogList(List<ChatLog> chatLogList) {
      this.chatLogList = chatLogList;
   }

   @JsonProperty("chatLogList")
   public List<ChatLog> getChatLogList() {
      return this.chatLogList;
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
