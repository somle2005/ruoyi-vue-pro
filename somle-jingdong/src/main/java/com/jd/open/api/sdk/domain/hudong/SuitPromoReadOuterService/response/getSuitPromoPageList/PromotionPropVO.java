package com.jd.open.api.sdk.domain.hudong.SuitPromoReadOuterService.response.getSuitPromoPageList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PromotionPropVO implements Serializable {
   private int tokenId;
   private int io;
   private int num;
   private int promoType;
   private Integer couponValidDays;
   private String couponKey;
   private int rfid;
   private long promoId;
   private int type;

   @JsonProperty("tokenId")
   public void setTokenId(int tokenId) {
      this.tokenId = tokenId;
   }

   @JsonProperty("tokenId")
   public int getTokenId() {
      return this.tokenId;
   }

   @JsonProperty("io")
   public void setIo(int io) {
      this.io = io;
   }

   @JsonProperty("io")
   public int getIo() {
      return this.io;
   }

   @JsonProperty("num")
   public void setNum(int num) {
      this.num = num;
   }

   @JsonProperty("num")
   public int getNum() {
      return this.num;
   }

   @JsonProperty("promoType")
   public void setPromoType(int promoType) {
      this.promoType = promoType;
   }

   @JsonProperty("promoType")
   public int getPromoType() {
      return this.promoType;
   }

   @JsonProperty("couponValidDays")
   public void setCouponValidDays(Integer couponValidDays) {
      this.couponValidDays = couponValidDays;
   }

   @JsonProperty("couponValidDays")
   public Integer getCouponValidDays() {
      return this.couponValidDays;
   }

   @JsonProperty("couponKey")
   public void setCouponKey(String couponKey) {
      this.couponKey = couponKey;
   }

   @JsonProperty("couponKey")
   public String getCouponKey() {
      return this.couponKey;
   }

   @JsonProperty("rfid")
   public void setRfid(int rfid) {
      this.rfid = rfid;
   }

   @JsonProperty("rfid")
   public int getRfid() {
      return this.rfid;
   }

   @JsonProperty("promoId")
   public void setPromoId(long promoId) {
      this.promoId = promoId;
   }

   @JsonProperty("promoId")
   public long getPromoId() {
      return this.promoId;
   }

   @JsonProperty("type")
   public void setType(int type) {
      this.type = type;
   }

   @JsonProperty("type")
   public int getType() {
      return this.type;
   }
}
