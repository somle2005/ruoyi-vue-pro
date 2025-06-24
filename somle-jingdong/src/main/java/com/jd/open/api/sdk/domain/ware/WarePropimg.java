package com.jd.open.api.sdk.domain.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class WarePropimg implements Serializable {
   private static final long serialVersionUID = 5369631942104165662L;
   private Long wareId;
   private Long imgId;
   private String colorId;
   private String imgUrl;
   private String isMain;
   private String created;

   @JsonProperty("img_id")
   public Long getImgId() {
      return this.imgId;
   }

   @JsonProperty("img_id")
   public void setImgId(Long imgId) {
      this.imgId = imgId;
   }

   @JsonProperty("color_id")
   public String getColorId() {
      return this.colorId;
   }

   @JsonProperty("color_id")
   public void setColorId(String colorId) {
      this.colorId = colorId;
   }

   @JsonProperty("ware_id")
   public Long getWareId() {
      return this.wareId;
   }

   @JsonProperty("ware_id")
   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("img_url")
   public String getImgUrl() {
      return this.imgUrl;
   }

   @JsonProperty("img_url")
   public void setImgUrl(String imgUrl) {
      this.imgUrl = imgUrl;
   }

   @JsonProperty("is_main")
   public String getMain() {
      return this.isMain;
   }

   @JsonProperty("is_main")
   public void setMain(String main) {
      this.isMain = main;
   }

   @JsonProperty("created")
   public String getCreated() {
      return this.created;
   }

   @JsonProperty("created")
   public void setCreated(String created) {
      this.created = created;
   }
}
