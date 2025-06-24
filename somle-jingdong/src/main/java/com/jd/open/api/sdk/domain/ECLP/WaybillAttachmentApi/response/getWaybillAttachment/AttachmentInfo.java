package com.jd.open.api.sdk.domain.ECLP.WaybillAttachmentApi.response.getWaybillAttachment;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class AttachmentInfo implements Serializable {
   private String attachmentUrl;

   @JsonProperty("attachmentUrl")
   public void setAttachmentUrl(String attachmentUrl) {
      this.attachmentUrl = attachmentUrl;
   }

   @JsonProperty("attachmentUrl")
   public String getAttachmentUrl() {
      return this.attachmentUrl;
   }
}
