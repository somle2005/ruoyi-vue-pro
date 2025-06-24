package com.jd.open.api.sdk.response.im;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.im.OutMerchantsApiService.response.get.PageChatMessageVo;
import com.jd.open.api.sdk.response.AbstractResponse;

public class ImOutMerchantChatmessageOpenapiGetResponse extends AbstractResponse {
   private PageChatMessageVo PageChatMessageVo;

   @JsonProperty("PageChatMessageVo")
   public void setPageChatMessageVo(PageChatMessageVo PageChatMessageVo) {
      this.PageChatMessageVo = PageChatMessageVo;
   }

   @JsonProperty("PageChatMessageVo")
   public PageChatMessageVo getPageChatMessageVo() {
      return this.PageChatMessageVo;
   }
}
