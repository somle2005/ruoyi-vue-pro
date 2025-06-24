package com.jd.open.api.sdk.domain.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

public class Promotion {
   private int id;
   private long venderId;
   private String promoName;
   private String type;
   private String levelMember;
   private String timeBegin;
   private String timeEnd;
   private String evtStatus;
   private String synchStatus;
   private String checkStatus;
   private List<PromotionProduct> promotionProductList = new ArrayList();

   @JsonProperty("evt_status")
   public String getEvtStatus() {
      return this.evtStatus;
   }

   @JsonProperty("evt_status")
   public void setEvtStatus(String evtStatus) {
      this.evtStatus = evtStatus;
   }

   @JsonProperty("check_status")
   public String getCheckStatus() {
      return this.checkStatus;
   }

   @JsonProperty("check_status")
   public void setCheckStatus(String checkStatus) {
      this.checkStatus = checkStatus;
   }

   @JsonProperty("id")
   public int getId() {
      return this.id;
   }

   @JsonProperty("id")
   public void setId(int id) {
      this.id = id;
   }

   @JsonProperty("vender_id")
   public long getVenderId() {
      return this.venderId;
   }

   @JsonProperty("vender_id")
   public void setVenderId(long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("promo_name")
   public String getPromoName() {
      return this.promoName;
   }

   @JsonProperty("promo_name")
   public void setPromoName(String promoName) {
      this.promoName = promoName;
   }

   @JsonProperty("type")
   public String getType() {
      return this.type;
   }

   @JsonProperty("type")
   public void setType(String type) {
      this.type = type;
   }

   @JsonProperty("level_member")
   public String getLevelMember() {
      return this.levelMember;
   }

   @JsonProperty("level_member")
   public void setLevelMember(String levelMember) {
      this.levelMember = levelMember;
   }

   @JsonProperty("time_begin")
   public String getTimeBegin() {
      return this.timeBegin;
   }

   @JsonProperty("time_begin")
   public void setTimeBegin(String timeBegin) {
      this.timeBegin = timeBegin;
   }

   @JsonProperty("time_end")
   public String getTimeEnd() {
      return this.timeEnd;
   }

   @JsonProperty("time_end")
   public void setTimeEnd(String timeEnd) {
      this.timeEnd = timeEnd;
   }

   @JsonProperty("synch_status")
   public String getSynchStatus() {
      return this.synchStatus;
   }

   @JsonProperty("synch_status")
   public void setSynchStatus(String synchStatus) {
      this.synchStatus = synchStatus;
   }

   @JsonProperty("promotion_product_list")
   public List<PromotionProduct> getPromotionProductList() {
      return this.promotionProductList;
   }

   @JsonProperty("promotion_product_list")
   public void setPromotionProductList(List<PromotionProduct> promotionProductList) {
      this.promotionProductList = promotionProductList;
   }
}
