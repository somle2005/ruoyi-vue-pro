package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.WaybillAttachmentApi.response.getWaybillAttachment.WaybillAttachmentResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class GetWaybillAttachmentResponse extends AbstractResponse {
   private WaybillAttachmentResponse waybillAttachmentResponse;

   @JsonProperty("waybillAttachmentResponse")
   public void setWaybillAttachmentResponse(WaybillAttachmentResponse waybillAttachmentResponse) {
      this.waybillAttachmentResponse = waybillAttachmentResponse;
   }

   @JsonProperty("waybillAttachmentResponse")
   public WaybillAttachmentResponse getWaybillAttachmentResponse() {
      return this.waybillAttachmentResponse;
   }
}
