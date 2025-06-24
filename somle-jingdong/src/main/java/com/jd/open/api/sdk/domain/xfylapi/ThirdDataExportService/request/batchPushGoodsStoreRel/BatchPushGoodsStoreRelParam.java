package com.jd.open.api.sdk.domain.xfylapi.ThirdDataExportService.request.batchPushGoodsStoreRel;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class BatchPushGoodsStoreRelParam implements Serializable {
   private String goodsId;
   private Long channelType;
   private List<ThirdGoodsStoreRel> relations;

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

   @JsonProperty("relations")
   public void setRelations(List<ThirdGoodsStoreRel> relations) {
      this.relations = relations;
   }

   @JsonProperty("relations")
   public List<ThirdGoodsStoreRel> getRelations() {
      return this.relations;
   }
}
