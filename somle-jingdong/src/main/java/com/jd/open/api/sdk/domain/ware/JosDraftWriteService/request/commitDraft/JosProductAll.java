package com.jd.open.api.sdk.domain.ware.JosDraftWriteService.request.commitDraft;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class JosProductAll implements Serializable {
   private JosProduct product;
   private List<JosImage> images;
   private List<JosSku> skus;
   private List<JosImage> rectangleImages;

   @JsonProperty("product")
   public void setProduct(JosProduct product) {
      this.product = product;
   }

   @JsonProperty("product")
   public JosProduct getProduct() {
      return this.product;
   }

   @JsonProperty("images")
   public void setImages(List<JosImage> images) {
      this.images = images;
   }

   @JsonProperty("images")
   public List<JosImage> getImages() {
      return this.images;
   }

   @JsonProperty("skus")
   public void setSkus(List<JosSku> skus) {
      this.skus = skus;
   }

   @JsonProperty("skus")
   public List<JosSku> getSkus() {
      return this.skus;
   }

   @JsonProperty("rectangleImages")
   public void setRectangleImages(List<JosImage> rectangleImages) {
      this.rectangleImages = rectangleImages;
   }

   @JsonProperty("rectangleImages")
   public List<JosImage> getRectangleImages() {
      return this.rectangleImages;
   }
}
