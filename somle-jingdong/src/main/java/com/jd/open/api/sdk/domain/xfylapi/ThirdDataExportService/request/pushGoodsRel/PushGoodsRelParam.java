package com.jd.open.api.sdk.domain.xfylapi.ThirdDataExportService.request.pushGoodsRel;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Set;

public class PushGoodsRelParam implements Serializable {
   private String goodsId;
   private Long channelType;
   private Integer relType;
   private Set<String> targetGoodsId;

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

   @JsonProperty("relType")
   public void setRelType(Integer relType) {
      this.relType = relType;
   }

   @JsonProperty("relType")
   public Integer getRelType() {
      return this.relType;
   }

   @JsonProperty("targetGoodsId")
   public void setTargetGoodsId(Set<String> targetGoodsId) {
      this.targetGoodsId = targetGoodsId;
   }

   @JsonProperty("targetGoodsId")
   public Set<String> getTargetGoodsId() {
      return this.targetGoodsId;
   }
}
