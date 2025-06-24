package com.jd.open.api.sdk.response.im;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.im.ApiService.response.get.ChatLogPage;
import com.jd.open.api.sdk.response.AbstractResponse;

public class ImPopChatlogGetResponse extends AbstractResponse {
   private ChatLogPage ChatLogPage;

   @JsonProperty("ChatLogPage")
   public void setChatLogPage(ChatLogPage ChatLogPage) {
      this.ChatLogPage = ChatLogPage;
   }

   @JsonProperty("ChatLogPage")
   public ChatLogPage getChatLogPage() {
      return this.ChatLogPage;
   }
}
