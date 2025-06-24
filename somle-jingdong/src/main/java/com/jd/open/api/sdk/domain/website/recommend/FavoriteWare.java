package com.jd.open.api.sdk.domain.website.recommend;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FavoriteWare {
   private Long wareId;
   private String wareName;
   private String price;
   private String adWord;
   private String mUrl;

   @JsonProperty("ware_id")
   public Long getWareId() {
      return this.wareId;
   }

   @JsonProperty("ware_id")
   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("title")
   public String getWareName() {
      return this.wareName;
   }

   @JsonProperty("title")
   public void setWareName(String wareName) {
      this.wareName = wareName;
   }

   @JsonProperty("price")
   public String getPrice() {
      return this.price;
   }

   @JsonProperty("price")
   public void setPrice(String price) {
      this.price = price;
   }

   @JsonProperty("ad_word")
   public String getAdWord() {
      return this.adWord;
   }

   @JsonProperty("ad_word")
   public void setAdWord(String adWord) {
      this.adWord = adWord;
   }

   @JsonProperty("m_url")
   public String getmUrl() {
      return this.mUrl;
   }

   @JsonProperty("m_url")
   public void setmUrl(String mUrl) {
      this.mUrl = mUrl;
   }
}
