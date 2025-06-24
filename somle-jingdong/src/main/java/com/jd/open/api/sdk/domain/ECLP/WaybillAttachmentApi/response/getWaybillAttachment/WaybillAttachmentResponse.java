package com.jd.open.api.sdk.domain.ECLP.WaybillAttachmentApi.response.getWaybillAttachment;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class WaybillAttachmentResponse implements Serializable {
   private Integer code;
   private List<AttachmentInfo> attachmentInfos;
   private String message;

   @JsonProperty("code")
   public void setCode(Integer code) {
      this.code = code;
   }

   @JsonProperty("code")
   public Integer getCode() {
      return this.code;
   }

   @JsonProperty("attachmentInfos")
   public void setAttachmentInfos(List<AttachmentInfo> attachmentInfos) {
      this.attachmentInfos = attachmentInfos;
   }

   @JsonProperty("attachmentInfos")
   public List<AttachmentInfo> getAttachmentInfos() {
      return this.attachmentInfos;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }
}
