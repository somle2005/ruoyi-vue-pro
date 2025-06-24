package com.jd.open.api.sdk.domain.stock.StoreService.response.queryStockInBill;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class StockBillInfo implements Serializable {
   private Long id;
   private Long comId;
   private Long orgId;
   private Long whId;
   private String warehouseName;
   private Long goodsNumApply;
   private Double goodsMoneyApply;
   private Date timeApply;
   private Long goodsNumActual;
   private Double goodsMoneyActual;
   private Date timeActual;
   private Integer status;
   private List<StockBillDetail> detailList;

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }

   @JsonProperty("com_id")
   public void setComId(Long comId) {
      this.comId = comId;
   }

   @JsonProperty("com_id")
   public Long getComId() {
      return this.comId;
   }

   @JsonProperty("org_id")
   public void setOrgId(Long orgId) {
      this.orgId = orgId;
   }

   @JsonProperty("org_id")
   public Long getOrgId() {
      return this.orgId;
   }

   @JsonProperty("wh_id")
   public void setWhId(Long whId) {
      this.whId = whId;
   }

   @JsonProperty("wh_id")
   public Long getWhId() {
      return this.whId;
   }

   @JsonProperty("warehouse_name")
   public void setWarehouseName(String warehouseName) {
      this.warehouseName = warehouseName;
   }

   @JsonProperty("warehouse_name")
   public String getWarehouseName() {
      return this.warehouseName;
   }

   @JsonProperty("goods_num_apply")
   public void setGoodsNumApply(Long goodsNumApply) {
      this.goodsNumApply = goodsNumApply;
   }

   @JsonProperty("goods_num_apply")
   public Long getGoodsNumApply() {
      return this.goodsNumApply;
   }

   @JsonProperty("goods_money_apply")
   public void setGoodsMoneyApply(Double goodsMoneyApply) {
      this.goodsMoneyApply = goodsMoneyApply;
   }

   @JsonProperty("goods_money_apply")
   public Double getGoodsMoneyApply() {
      return this.goodsMoneyApply;
   }

   @JsonProperty("time_apply")
   public void setTimeApply(Date timeApply) {
      this.timeApply = timeApply;
   }

   @JsonProperty("time_apply")
   public Date getTimeApply() {
      return this.timeApply;
   }

   @JsonProperty("goods_num_actual")
   public void setGoodsNumActual(Long goodsNumActual) {
      this.goodsNumActual = goodsNumActual;
   }

   @JsonProperty("goods_num_actual")
   public Long getGoodsNumActual() {
      return this.goodsNumActual;
   }

   @JsonProperty("goods_money_actual")
   public void setGoodsMoneyActual(Double goodsMoneyActual) {
      this.goodsMoneyActual = goodsMoneyActual;
   }

   @JsonProperty("goods_money_actual")
   public Double getGoodsMoneyActual() {
      return this.goodsMoneyActual;
   }

   @JsonProperty("time_actual")
   public void setTimeActual(Date timeActual) {
      this.timeActual = timeActual;
   }

   @JsonProperty("time_actual")
   public Date getTimeActual() {
      return this.timeActual;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("detail_list")
   public void setDetailList(List<StockBillDetail> detailList) {
      this.detailList = detailList;
   }

   @JsonProperty("detail_list")
   public List<StockBillDetail> getDetailList() {
      return this.detailList;
   }
}
