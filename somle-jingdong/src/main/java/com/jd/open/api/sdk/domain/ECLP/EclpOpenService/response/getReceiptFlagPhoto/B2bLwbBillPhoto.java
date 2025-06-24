package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.getReceiptFlagPhoto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class B2bLwbBillPhoto implements Serializable {
   private String attachmentUrl;
   private String attachmentName;

   @JsonProperty("attachmentUrl")
   public void setAttachmentUrl(String attachmentUrl) {
      this.attachmentUrl = attachmentUrl;
   }

   @JsonProperty("attachmentUrl")
   public String getAttachmentUrl() {
      return this.attachmentUrl;
   }

   @JsonProperty("attachmentName")
   public void setAttachmentName(String attachmentName) {
      this.attachmentName = attachmentName;
   }

   @JsonProperty("attachmentName")
   public String getAttachmentName() {
      return this.attachmentName;
   }
}
