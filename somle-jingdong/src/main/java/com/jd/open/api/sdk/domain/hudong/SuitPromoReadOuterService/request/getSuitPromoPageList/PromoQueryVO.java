package com.jd.open.api.sdk.domain.hudong.SuitPromoReadOuterService.request.getSuitPromoPageList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PromoQueryVO implements Serializable {
   private Long wareId;
   private Integer evtStatus;
   private Integer evtType;
   private Integer pageSize;
   private Integer pageIndex;
   private String evtName;
   private Long skuId;

   @JsonProperty("wareId")
   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("wareId")
   public Long getWareId() {
      return this.wareId;
   }

   @JsonProperty("evtStatus")
   public void setEvtStatus(Integer evtStatus) {
      this.evtStatus = evtStatus;
   }

   @JsonProperty("evtStatus")
   public Integer getEvtStatus() {
      return this.evtStatus;
   }

   @JsonProperty("evtType")
   public void setEvtType(Integer evtType) {
      this.evtType = evtType;
   }

   @JsonProperty("evtType")
   public Integer getEvtType() {
      return this.evtType;
   }

   @JsonProperty("pageSize")
   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public Integer getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("pageIndex")
   public void setPageIndex(Integer pageIndex) {
      this.pageIndex = pageIndex;
   }

   @JsonProperty("pageIndex")
   public Integer getPageIndex() {
      return this.pageIndex;
   }

   @JsonProperty("evtName")
   public void setEvtName(String evtName) {
      this.evtName = evtName;
   }

   @JsonProperty("evtName")
   public String getEvtName() {
      return this.evtName;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }
}
