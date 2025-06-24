package com.jd.open.api.sdk.domain.qcmd.WishOuterForShopApiService.response.queryWishInfoListSec;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class WishApiResult implements Serializable {
   private String msg;
   private String code;
   private Pagination wishInfoList;

   @JsonProperty("msg")
   public void setMsg(String msg) {
      this.msg = msg;
   }

   @JsonProperty("msg")
   public String getMsg() {
      return this.msg;
   }

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
      return this.code;
   }

   @JsonProperty("wishInfoList")
   public void setWishInfoList(Pagination wishInfoList) {
      this.wishInfoList = wishInfoList;
   }

   @JsonProperty("wishInfoList")
   public Pagination getWishInfoList() {
      return this.wishInfoList;
   }
}
