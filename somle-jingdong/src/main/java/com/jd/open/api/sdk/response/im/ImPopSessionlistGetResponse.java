package com.jd.open.api.sdk.response.im;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class ImPopSessionlistGetResponse extends AbstractResponse {
   private ChatSessionPage ChatSessionPage;

   @JsonProperty("ChatSessionPage")
   public void setChatSessionPage(ChatSessionPage ChatSessionPage) {
      this.ChatSessionPage = ChatSessionPage;
   }

   @JsonProperty("ChatSessionPage")
   public ChatSessionPage getChatSessionPage() {
      return this.ChatSessionPage;
   }
}
