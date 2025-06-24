package com.jd.open.api.sdk.response.directional;

import com.jd.open.api.sdk.response.AbstractResponse;
import com.jd.security.tde.KeyResponse;

public class JosMasterKeyGetResponse extends AbstractResponse {
   private KeyResponse response;

   public KeyResponse getResponse() {
      return this.response;
   }

   public void setResponse(KeyResponse response) {
      this.response = response;
   }
}
