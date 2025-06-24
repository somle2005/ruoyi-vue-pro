package com.jd.open.api.sdk.domain.B2B.BWareReadService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class BWareInfoDto implements Serializable {
   private BSpuInfoDto spuInfo;
   private BSpuExtendInfoDto spuExtendInfo;
   private List<BSpuAttrDto> bSpuAttrs;
   private List<BSpuQualifyDto> bSpuQualifies;
   private List<BImageDto> bSpuImages;
   private List<BSkuInfoDto> skuInfo;

   @JsonProperty("spuInfo")
   public void setSpuInfo(BSpuInfoDto spuInfo) {
      this.spuInfo = spuInfo;
   }

   @JsonProperty("spuInfo")
   public BSpuInfoDto getSpuInfo() {
      return this.spuInfo;
   }

   @JsonProperty("spuExtendInfo")
   public void setSpuExtendInfo(BSpuExtendInfoDto spuExtendInfo) {
      this.spuExtendInfo = spuExtendInfo;
   }

   @JsonProperty("spuExtendInfo")
   public BSpuExtendInfoDto getSpuExtendInfo() {
      return this.spuExtendInfo;
   }

   @JsonProperty("bSpuAttrs")
   public void setBSpuAttrs(List<BSpuAttrDto> bSpuAttrs) {
      this.bSpuAttrs = bSpuAttrs;
   }

   @JsonProperty("bSpuAttrs")
   public List<BSpuAttrDto> getBSpuAttrs() {
      return this.bSpuAttrs;
   }

   @JsonProperty("bSpuQualifies")
   public void setBSpuQualifies(List<BSpuQualifyDto> bSpuQualifies) {
      this.bSpuQualifies = bSpuQualifies;
   }

   @JsonProperty("bSpuQualifies")
   public List<BSpuQualifyDto> getBSpuQualifies() {
      return this.bSpuQualifies;
   }

   @JsonProperty("bSpuImages")
   public void setBSpuImages(List<BImageDto> bSpuImages) {
      this.bSpuImages = bSpuImages;
   }

   @JsonProperty("bSpuImages")
   public List<BImageDto> getBSpuImages() {
      return this.bSpuImages;
   }

   @JsonProperty("skuInfo")
   public void setSkuInfo(List<BSkuInfoDto> skuInfo) {
      this.skuInfo = skuInfo;
   }

   @JsonProperty("skuInfo")
   public List<BSkuInfoDto> getSkuInfo() {
      return this.skuInfo;
   }
}
