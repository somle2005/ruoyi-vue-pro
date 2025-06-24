package com.jd.open.api.sdk.domain.website.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Ware {
   private Long wareId;
   private String title;
   private String jdPrice;
   private String mUrl;
   private List<WareImg> wareImgs;
   private List<Sku> skus;

   @JsonProperty("ware_id")
   public Long getWareId() {
      return this.wareId;
   }

   @JsonProperty("ware_id")
   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("title")
   public String getTitle() {
      return this.title;
   }

   @JsonProperty("title")
   public void setTitle(String title) {
      this.title = title;
   }

   @JsonProperty("price")
   public String getJdPrice() {
      return this.jdPrice;
   }

   @JsonProperty("price")
   public void setJdPrice(String jdPrice) {
      this.jdPrice = jdPrice;
   }

   @JsonProperty("ware_imgs")
   public List<WareImg> getWareImgs() {
      return this.wareImgs;
   }

   @JsonProperty("ware_imgs")
   public void setWareImgs(List<WareImg> wareImgs) {
      this.wareImgs = wareImgs;
   }

   @JsonProperty("skus")
   public List<Sku> getSkus() {
      return this.skus;
   }

   @JsonProperty("skus")
   public void setSkus(List<Sku> skus) {
      this.skus = skus;
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
