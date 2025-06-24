package com.jd.open.api.sdk.response.qcmd;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.qcmd.WishOuterForShopApiService.response.queryWishInfoList.WishApiResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class WishplatWishOuterForShopApiQueryWishInfoListResponse extends AbstractResponse {
   private WishApiResult wishApiResult;

   @JsonProperty("wishApiResult")
   public void setWishApiResult(WishApiResult wishApiResult) {
      this.wishApiResult = wishApiResult;
   }

   @JsonProperty("wishApiResult")
   public WishApiResult getWishApiResult() {
      return this.wishApiResult;
   }
}
