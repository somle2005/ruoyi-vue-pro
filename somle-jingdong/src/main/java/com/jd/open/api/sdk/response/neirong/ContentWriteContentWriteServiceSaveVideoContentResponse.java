package com.jd.open.api.sdk.response.neirong;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.neirong.ContentWriteService.response.saveVideoContent.JsfResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class ContentWriteContentWriteServiceSaveVideoContentResponse extends AbstractResponse {
   private JsfResult returnType;

   @JsonProperty("returnType")
   public void setReturnType(JsfResult returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public JsfResult getReturnType() {
      return this.returnType;
   }
}
