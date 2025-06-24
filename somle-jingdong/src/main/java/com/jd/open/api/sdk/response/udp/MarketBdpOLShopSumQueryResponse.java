package com.jd.open.api.sdk.response.udp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.math.BigDecimal;

public class MarketBdpOLShopSumQueryResponse extends AbstractResponse {
   private String platformDesc;
   private BigDecimal avgRt;
   private Double avgRtNewuser;
   private Double avgRtOlduser;
   private Long pv;
   private Long uv;
   private Long landingTimes;
   private Long quitTimes;
   private Long itemPv;
   private Long itemUv;
   private Long homepagePv;
   private Long homepageUv;
   private Long addToCartSkunum;
   private Long addToCartSkutypenum;
   private Long addToCartUsers;
   private Long ordNumDeal;
   private Long saleQttyDeal;
   private Double beforePrefrAmountDeal;
   private Double afterPrefrAmountDeal;
   private Long ordUserNumDeal;
   private Long pvOlduser;
   private Long uvOlduser;
   private Long visitsOlduser;
   private Long pvNewuser;
   private Long uvNewuser;
   private Long visitsNewuser;
   private String tp;
   private String venderId;
   private String venderName;
   private String shopId;
   private String shopName;
   private Long visits;
   private Long bounceTimes;
   private String dt;

   @JsonProperty("platformDesc")
   public void setPlatformDesc(String platformDesc) {
      this.platformDesc = platformDesc;
   }

   @JsonProperty("platformDesc")
   public String getPlatformDesc() {
      return this.platformDesc;
   }

   @JsonProperty("avgRt")
   public void setAvgRt(BigDecimal avgRt) {
      this.avgRt = avgRt;
   }

   @JsonProperty("avgRt")
   public BigDecimal getAvgRt() {
      return this.avgRt;
   }

   @JsonProperty("avgRtNewuser")
   public void setAvgRtNewuser(Double avgRtNewuser) {
      this.avgRtNewuser = avgRtNewuser;
   }

   @JsonProperty("avgRtNewuser")
   public Double getAvgRtNewuser() {
      return this.avgRtNewuser;
   }

   @JsonProperty("avgRtOlduser")
   public void setAvgRtOlduser(Double avgRtOlduser) {
      this.avgRtOlduser = avgRtOlduser;
   }

   @JsonProperty("avgRtOlduser")
   public Double getAvgRtOlduser() {
      return this.avgRtOlduser;
   }

   @JsonProperty("pv")
   public void setPv(Long pv) {
      this.pv = pv;
   }

   @JsonProperty("pv")
   public Long getPv() {
      return this.pv;
   }

   @JsonProperty("uv")
   public void setUv(Long uv) {
      this.uv = uv;
   }

   @JsonProperty("uv")
   public Long getUv() {
      return this.uv;
   }

   @JsonProperty("landingTimes")
   public void setLandingTimes(Long landingTimes) {
      this.landingTimes = landingTimes;
   }

   @JsonProperty("landingTimes")
   public Long getLandingTimes() {
      return this.landingTimes;
   }

   @JsonProperty("quitTimes")
   public void setQuitTimes(Long quitTimes) {
      this.quitTimes = quitTimes;
   }

   @JsonProperty("quitTimes")
   public Long getQuitTimes() {
      return this.quitTimes;
   }

   @JsonProperty("itemPv")
   public void setItemPv(Long itemPv) {
      this.itemPv = itemPv;
   }

   @JsonProperty("itemPv")
   public Long getItemPv() {
      return this.itemPv;
   }

   @JsonProperty("itemUv")
   public void setItemUv(Long itemUv) {
      this.itemUv = itemUv;
   }

   @JsonProperty("itemUv")
   public Long getItemUv() {
      return this.itemUv;
   }

   @JsonProperty("homepagePv")
   public void setHomepagePv(Long homepagePv) {
      this.homepagePv = homepagePv;
   }

   @JsonProperty("homepagePv")
   public Long getHomepagePv() {
      return this.homepagePv;
   }

   @JsonProperty("homepageUv")
   public void setHomepageUv(Long homepageUv) {
      this.homepageUv = homepageUv;
   }

   @JsonProperty("homepageUv")
   public Long getHomepageUv() {
      return this.homepageUv;
   }

   @JsonProperty("addToCartSkunum")
   public void setAddToCartSkunum(Long addToCartSkunum) {
      this.addToCartSkunum = addToCartSkunum;
   }

   @JsonProperty("addToCartSkunum")
   public Long getAddToCartSkunum() {
      return this.addToCartSkunum;
   }

   @JsonProperty("addToCartSkutypenum")
   public void setAddToCartSkutypenum(Long addToCartSkutypenum) {
      this.addToCartSkutypenum = addToCartSkutypenum;
   }

   @JsonProperty("addToCartSkutypenum")
   public Long getAddToCartSkutypenum() {
      return this.addToCartSkutypenum;
   }

   @JsonProperty("addToCartUsers")
   public void setAddToCartUsers(Long addToCartUsers) {
      this.addToCartUsers = addToCartUsers;
   }

   @JsonProperty("addToCartUsers")
   public Long getAddToCartUsers() {
      return this.addToCartUsers;
   }

   @JsonProperty("ordNumDeal")
   public void setOrdNumDeal(Long ordNumDeal) {
      this.ordNumDeal = ordNumDeal;
   }

   @JsonProperty("ordNumDeal")
   public Long getOrdNumDeal() {
      return this.ordNumDeal;
   }

   @JsonProperty("saleQttyDeal")
   public void setSaleQttyDeal(Long saleQttyDeal) {
      this.saleQttyDeal = saleQttyDeal;
   }

   @JsonProperty("saleQttyDeal")
   public Long getSaleQttyDeal() {
      return this.saleQttyDeal;
   }

   @JsonProperty("beforePrefrAmountDeal")
   public void setBeforePrefrAmountDeal(Double beforePrefrAmountDeal) {
      this.beforePrefrAmountDeal = beforePrefrAmountDeal;
   }

   @JsonProperty("beforePrefrAmountDeal")
   public Double getBeforePrefrAmountDeal() {
      return this.beforePrefrAmountDeal;
   }

   @JsonProperty("afterPrefrAmountDeal")
   public void setAfterPrefrAmountDeal(Double afterPrefrAmountDeal) {
      this.afterPrefrAmountDeal = afterPrefrAmountDeal;
   }

   @JsonProperty("afterPrefrAmountDeal")
   public Double getAfterPrefrAmountDeal() {
      return this.afterPrefrAmountDeal;
   }

   @JsonProperty("ordUserNumDeal")
   public void setOrdUserNumDeal(Long ordUserNumDeal) {
      this.ordUserNumDeal = ordUserNumDeal;
   }

   @JsonProperty("ordUserNumDeal")
   public Long getOrdUserNumDeal() {
      return this.ordUserNumDeal;
   }

   @JsonProperty("pvOlduser")
   public void setPvOlduser(Long pvOlduser) {
      this.pvOlduser = pvOlduser;
   }

   @JsonProperty("pvOlduser")
   public Long getPvOlduser() {
      return this.pvOlduser;
   }

   @JsonProperty("uvOlduser")
   public void setUvOlduser(Long uvOlduser) {
      this.uvOlduser = uvOlduser;
   }

   @JsonProperty("uvOlduser")
   public Long getUvOlduser() {
      return this.uvOlduser;
   }

   @JsonProperty("visitsOlduser")
   public void setVisitsOlduser(Long visitsOlduser) {
      this.visitsOlduser = visitsOlduser;
   }

   @JsonProperty("visitsOlduser")
   public Long getVisitsOlduser() {
      return this.visitsOlduser;
   }

   @JsonProperty("pvNewuser")
   public void setPvNewuser(Long pvNewuser) {
      this.pvNewuser = pvNewuser;
   }

   @JsonProperty("pvNewuser")
   public Long getPvNewuser() {
      return this.pvNewuser;
   }

   @JsonProperty("uvNewuser")
   public void setUvNewuser(Long uvNewuser) {
      this.uvNewuser = uvNewuser;
   }

   @JsonProperty("uvNewuser")
   public Long getUvNewuser() {
      return this.uvNewuser;
   }

   @JsonProperty("visitsNewuser")
   public void setVisitsNewuser(Long visitsNewuser) {
      this.visitsNewuser = visitsNewuser;
   }

   @JsonProperty("visitsNewuser")
   public Long getVisitsNewuser() {
      return this.visitsNewuser;
   }

   @JsonProperty("tp")
   public void setTp(String tp) {
      this.tp = tp;
   }

   @JsonProperty("tp")
   public String getTp() {
      return this.tp;
   }

   @JsonProperty("venderId")
   public void setVenderId(String venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public String getVenderId() {
      return this.venderId;
   }

   @JsonProperty("venderName")
   public void setVenderName(String venderName) {
      this.venderName = venderName;
   }

   @JsonProperty("venderName")
   public String getVenderName() {
      return this.venderName;
   }

   @JsonProperty("shopId")
   public void setShopId(String shopId) {
      this.shopId = shopId;
   }

   @JsonProperty("shopId")
   public String getShopId() {
      return this.shopId;
   }

   @JsonProperty("shopName")
   public void setShopName(String shopName) {
      this.shopName = shopName;
   }

   @JsonProperty("shopName")
   public String getShopName() {
      return this.shopName;
   }

   @JsonProperty("visits")
   public void setVisits(Long visits) {
      this.visits = visits;
   }

   @JsonProperty("visits")
   public Long getVisits() {
      return this.visits;
   }

   @JsonProperty("bounceTimes")
   public void setBounceTimes(Long bounceTimes) {
      this.bounceTimes = bounceTimes;
   }

   @JsonProperty("bounceTimes")
   public Long getBounceTimes() {
      return this.bounceTimes;
   }

   @JsonProperty("dt")
   public void setDt(String dt) {
      this.dt = dt;
   }

   @JsonProperty("dt")
   public String getDt() {
      return this.dt;
   }
}
