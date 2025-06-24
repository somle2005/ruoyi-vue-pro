package com.jd.open.api.sdk.domain.xfylapi.ThirdDataExportService.request.pushGoodsInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ThirdGoodsParam implements Serializable {
   private List<ThirdGoodsItemParam> goodsItemList;
   private String goodsId;
   private Double goodsPrice;
   private Integer operateType;
   private String goodsFeature;
   private String goodsName;
   private Integer status;
   private Long channelType;
   private Integer goodsSuitable;
   private Integer goodsMarry;
   private Double settlePrice;
   private Integer goodsType;

   @JsonProperty("goodsItemList")
   public void setGoodsItemList(List<ThirdGoodsItemParam> goodsItemList) {
      this.goodsItemList = goodsItemList;
   }

   @JsonProperty("goodsItemList")
   public List<ThirdGoodsItemParam> getGoodsItemList() {
      return this.goodsItemList;
   }

   @JsonProperty("goodsId")
   public void setGoodsId(String goodsId) {
      this.goodsId = goodsId;
   }

   @JsonProperty("goodsId")
   public String getGoodsId() {
      return this.goodsId;
   }

   @JsonProperty("goodsPrice")
   public void setGoodsPrice(Double goodsPrice) {
      this.goodsPrice = goodsPrice;
   }

   @JsonProperty("goodsPrice")
   public Double getGoodsPrice() {
      return this.goodsPrice;
   }

   @JsonProperty("operateType")
   public void setOperateType(Integer operateType) {
      this.operateType = operateType;
   }

   @JsonProperty("operateType")
   public Integer getOperateType() {
      return this.operateType;
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

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("channelType")
   public void setChannelType(Long channelType) {
      this.channelType = channelType;
   }

   @JsonProperty("channelType")
   public Long getChannelType() {
      return this.channelType;
   }

   @JsonProperty("goodsSuitable")
   public void setGoodsSuitable(Integer goodsSuitable) {
      this.goodsSuitable = goodsSuitable;
   }

   @JsonProperty("goodsSuitable")
   public Integer getGoodsSuitable() {
      return this.goodsSuitable;
   }

   @JsonProperty("goodsMarry")
   public void setGoodsMarry(Integer goodsMarry) {
      this.goodsMarry = goodsMarry;
   }

   @JsonProperty("goodsMarry")
   public Integer getGoodsMarry() {
      return this.goodsMarry;
   }

   @JsonProperty("settlePrice")
   public void setSettlePrice(Double settlePrice) {
      this.settlePrice = settlePrice;
   }

   @JsonProperty("settlePrice")
   public Double getSettlePrice() {
      return this.settlePrice;
   }

   @JsonProperty("goodsType")
   public void setGoodsType(Integer goodsType) {
      this.goodsType = goodsType;
   }

   @JsonProperty("goodsType")
   public Integer getGoodsType() {
      return this.goodsType;
   }
}
