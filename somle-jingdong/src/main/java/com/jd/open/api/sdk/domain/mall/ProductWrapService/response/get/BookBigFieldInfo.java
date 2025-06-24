package com.jd.open.api.sdk.domain.mall.ProductWrapService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class BookBigFieldInfo implements Serializable {
   private String comments;
   private String image;
   private String contentDesc;
   private String relatedProducts;
   private String editerDesc;
   private String catalogue;
   private String bookAbstract;
   private String authorDesc;
   private String introduction;
   private String productFeatures;

   @JsonProperty("comments")
   public void setComments(String comments) {
      this.comments = comments;
   }

   @JsonProperty("comments")
   public String getComments() {
      return this.comments;
   }

   @JsonProperty("image")
   public void setImage(String image) {
      this.image = image;
   }

   @JsonProperty("image")
   public String getImage() {
      return this.image;
   }

   @JsonProperty("content_desc")
   public void setContentDesc(String contentDesc) {
      this.contentDesc = contentDesc;
   }

   @JsonProperty("content_desc")
   public String getContentDesc() {
      return this.contentDesc;
   }

   @JsonProperty("relatedProducts")
   public void setRelatedProducts(String relatedProducts) {
      this.relatedProducts = relatedProducts;
   }

   @JsonProperty("relatedProducts")
   public String getRelatedProducts() {
      return this.relatedProducts;
   }

   @JsonProperty("editer_desc")
   public void setEditerDesc(String editerDesc) {
      this.editerDesc = editerDesc;
   }

   @JsonProperty("editer_desc")
   public String getEditerDesc() {
      return this.editerDesc;
   }

   @JsonProperty("catalogue")
   public void setCatalogue(String catalogue) {
      this.catalogue = catalogue;
   }

   @JsonProperty("catalogue")
   public String getCatalogue() {
      return this.catalogue;
   }

   @JsonProperty("book_abstract")
   public void setBookAbstract(String bookAbstract) {
      this.bookAbstract = bookAbstract;
   }

   @JsonProperty("book_abstract")
   public String getBookAbstract() {
      return this.bookAbstract;
   }

   @JsonProperty("authorDesc")
   public void setAuthorDesc(String authorDesc) {
      this.authorDesc = authorDesc;
   }

   @JsonProperty("authorDesc")
   public String getAuthorDesc() {
      return this.authorDesc;
   }

   @JsonProperty("introduction")
   public void setIntroduction(String introduction) {
      this.introduction = introduction;
   }

   @JsonProperty("introduction")
   public String getIntroduction() {
      return this.introduction;
   }

   @JsonProperty("productFeatures")
   public void setProductFeatures(String productFeatures) {
      this.productFeatures = productFeatures;
   }

   @JsonProperty("productFeatures")
   public String getProductFeatures() {
      return this.productFeatures;
   }
}
