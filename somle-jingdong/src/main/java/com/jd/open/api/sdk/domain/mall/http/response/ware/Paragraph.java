package com.jd.open.api.sdk.domain.mall.http.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class Paragraph implements Serializable {
   private Content Content;
   private IcoTagInfo IcoTagInfo;
   private String shopId;
   private String wareid;
   private String cid1;
   private String cid2;
   private String catid;
   private String good;
   private String cod;
   private String ico;
   private List<SlaveWare> SlaveParagraph;

   @JsonProperty("Content")
   public void setContent(Content Content) {
      this.Content = Content;
   }

   @JsonProperty("Content")
   public Content getContent() {
      return this.Content;
   }

   @JsonProperty("IcoTagInfo")
   public void setIcoTagInfo(IcoTagInfo IcoTagInfo) {
      this.IcoTagInfo = IcoTagInfo;
   }

   @JsonProperty("IcoTagInfo")
   public IcoTagInfo getIcoTagInfo() {
      return this.IcoTagInfo;
   }

   @JsonProperty("shop_id")
   public void setShopId(String shopId) {
      this.shopId = shopId;
   }

   @JsonProperty("shop_id")
   public String getShopId() {
      return this.shopId;
   }

   @JsonProperty("wareid")
   public void setWareid(String wareid) {
      this.wareid = wareid;
   }

   @JsonProperty("wareid")
   public String getWareid() {
      return this.wareid;
   }

   @JsonProperty("cid1")
   public void setCid1(String cid1) {
      this.cid1 = cid1;
   }

   @JsonProperty("cid1")
   public String getCid1() {
      return this.cid1;
   }

   @JsonProperty("cid2")
   public void setCid2(String cid2) {
      this.cid2 = cid2;
   }

   @JsonProperty("cid2")
   public String getCid2() {
      return this.cid2;
   }

   @JsonProperty("catid")
   public void setCatid(String catid) {
      this.catid = catid;
   }

   @JsonProperty("catid")
   public String getCatid() {
      return this.catid;
   }

   @JsonProperty("good")
   public void setGood(String good) {
      this.good = good;
   }

   @JsonProperty("good")
   public String getGood() {
      return this.good;
   }

   @JsonProperty("cod")
   public void setCod(String cod) {
      this.cod = cod;
   }

   @JsonProperty("cod")
   public String getCod() {
      return this.cod;
   }

   @JsonProperty("ico")
   public void setIco(String ico) {
      this.ico = ico;
   }

   @JsonProperty("ico")
   public String getIco() {
      return this.ico;
   }

   @JsonProperty("SlaveParagraph")
   public void setSlaveParagraph(List<SlaveWare> SlaveParagraph) {
      this.SlaveParagraph = SlaveParagraph;
   }

   @JsonProperty("SlaveParagraph")
   public List<SlaveWare> getSlaveParagraph() {
      return this.SlaveParagraph;
   }
}
