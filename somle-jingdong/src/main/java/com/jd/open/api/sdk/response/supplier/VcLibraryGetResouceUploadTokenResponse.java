package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.ResourceRestJsfServiceJosAPI.response.getResouceUploadToken.UploadToken;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VcLibraryGetResouceUploadTokenResponse extends AbstractResponse {
   private UploadToken updateToken;

   @JsonProperty("update_token")
   public void setUpdateToken(UploadToken updateToken) {
      this.updateToken = updateToken;
   }

   @JsonProperty("update_token")
   public UploadToken getUpdateToken() {
      return this.updateToken;
   }
}
