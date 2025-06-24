package com.jd.open.api.sdk.domain.ECLP.queryPoModel.EclpOpenService.response.queryPoOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PoBoxModel implements Serializable {
   private String boxNo;
   private String goodsNo;
   private String realInstoreQty;

   @JsonProperty("boxNo")
   public void setBoxNo(String boxNo) {
      this.boxNo = boxNo;
   }

   @JsonProperty("boxNo")
   public String getBoxNo() {
      return this.boxNo;
   }

   @JsonProperty("goodsNo")
   public void setGoodsNo(String goodsNo) {
      this.goodsNo = goodsNo;
   }

   @JsonProperty("goodsNo")
   public String getGoodsNo() {
      return this.goodsNo;
   }

   @JsonProperty("realInstoreQty")
   public void setRealInstoreQty(String realInstoreQty) {
      this.realInstoreQty = realInstoreQty;
   }

   @JsonProperty("realInstoreQty")
   public String getRealInstoreQty() {
      return this.realInstoreQty;
   }
}
