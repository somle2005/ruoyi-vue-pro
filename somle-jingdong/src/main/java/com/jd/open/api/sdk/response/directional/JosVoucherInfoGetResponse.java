package com.jd.open.api.sdk.response.directional;

import com.jd.open.api.sdk.domain.directional.GetVoucherInfoRes;
import com.jd.open.api.sdk.response.AbstractResponse;

public class JosVoucherInfoGetResponse extends AbstractResponse {
   private GetVoucherInfoRes response;

   public GetVoucherInfoRes getResponse() {
      return this.response;
   }

   public void setResponse(GetVoucherInfoRes response) {
      this.response = response;
   }
}
