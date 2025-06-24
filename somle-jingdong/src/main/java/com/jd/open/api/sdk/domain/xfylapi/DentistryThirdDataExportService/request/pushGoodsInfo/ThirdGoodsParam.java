package com.jd.open.api.sdk.domain.xfylapi.DentistryThirdDataExportService.request.pushGoodsInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ThirdGoodsParam implements Serializable {
   private String goodsId;
   private Long channelType;
   private Integer operateType;
   private Integer status;
   private String goodsSuitable;
   private Double goodsPrice;
   private String goodsFeature;
   private String goodsName;
   private List<ThirdGoodsItemParam> goodsItemList;

   @JsonProperty("goodsId")
   public void setGoodsId(String goodsId) {
      this.goodsId = goodsId;
   }

   @JsonProperty("goodsId")
   public String getGoodsId() {
      return this.goodsId;
   }

   @JsonProperty("channelType")
   public void setChannelType(Long channelType) {
      this.channelType = channelType;
   }

   @JsonProperty("channelType")
   public Long getChannelType() {
      return this.channelType;
   }

   @JsonProperty("operateType")
   public void setOperateType(Integer operateType) {
      this.operateType = operateType;
   }

   @JsonProperty("operateType")
   public Integer getOperateType() {
      return this.operateType;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("goodsSuitable")
   public void setGoodsSuitable(String goodsSuitable) {
      this.goodsSuitable = goodsSuitable;
   }

   @JsonProperty("goodsSuitable")
   public String getGoodsSuitable() {
      return this.goodsSuitable;
   }

   @JsonProperty("goodsPrice")
   public void setGoodsPrice(Double goodsPrice) {
      this.goodsPrice = goodsPrice;
   }

   @JsonProperty("goodsPrice")
   public Double getGoodsPrice() {
      return this.goodsPrice;
   }

   @JsonProperty("goodsFeature")
   public void setGoodsFeature(String goodsFeature) {
      this.goodsFeature = goodsFeature;
   }

   @JsonProperty("goodsFeature")
   public String getGoodsFeature() {
      return this.goodsFeature;
   }

   @JsonProperty("goodsName")
   public void setGoodsName(String goodsName) {
      this.goodsName = goodsName;
   }

   @JsonProperty("goodsName")
   public String getGoodsName() {
      return this.goodsName;
   }

   @JsonProperty("goodsItemList")
   public void setGoodsItemList(List<ThirdGoodsItemParam> goodsItemList) {
      this.goodsItemList = goodsItemList;
   }

   @JsonProperty("goodsItemList")
   public List<ThirdGoodsItemParam> getGoodsItemList() {
      return this.goodsItemList;
   }
}
