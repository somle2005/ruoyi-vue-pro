package com.jd.open.api.sdk.domain.supplier.SalesReturnOrderQueryJosApi.request.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class SalesReturnOrderParamDto implements Serializable {
   private List<String[]> waybillCodes;
   private Date endShipTime;
   private Integer pageSize;
   private Date startShipTime;
   private List<String[]> returnScenes;
   private Date startCreateTime;
   private List<Long[]> skuIds;
   private Date endCreateTime;
   private List<Integer[]> flows;
   private String requestId;
   private List<String[]> returnOrderIds;
   private Integer page;
   private List<Integer[]> returnStatusList;

   @JsonProperty("waybillCodes")
   public void setWaybillCodes(List<String[]> waybillCodes) {
      this.waybillCodes = waybillCodes;
   }

   @JsonProperty("waybillCodes")
   public List<String[]> getWaybillCodes() {
      return this.waybillCodes;
   }

   @JsonProperty("endShipTime")
   public void setEndShipTime(Date endShipTime) {
      this.endShipTime = endShipTime;
   }

   @JsonProperty("endShipTime")
   public Date getEndShipTime() {
      return this.endShipTime;
   }

   @JsonProperty("pageSize")
   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public Integer getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("startShipTime")
   public void setStartShipTime(Date startShipTime) {
      this.startShipTime = startShipTime;
   }

   @JsonProperty("startShipTime")
   public Date getStartShipTime() {
      return this.startShipTime;
   }

   @JsonProperty("returnScenes")
   public void setReturnScenes(List<String[]> returnScenes) {
      this.returnScenes = returnScenes;
   }

   @JsonProperty("returnScenes")
   public List<String[]> getReturnScenes() {
      return this.returnScenes;
   }

   @JsonProperty("startCreateTime")
   public void setStartCreateTime(Date startCreateTime) {
      this.startCreateTime = startCreateTime;
   }

   @JsonProperty("startCreateTime")
   public Date getStartCreateTime() {
      return this.startCreateTime;
   }

   @JsonProperty("skuIds")
   public void setSkuIds(List<Long[]> skuIds) {
      this.skuIds = skuIds;
   }

   @JsonProperty("skuIds")
   public List<Long[]> getSkuIds() {
      return this.skuIds;
   }

   @JsonProperty("endCreateTime")
   public void setEndCreateTime(Date endCreateTime) {
      this.endCreateTime = endCreateTime;
   }

   @JsonProperty("endCreateTime")
   public Date getEndCreateTime() {
      return this.endCreateTime;
   }

   @JsonProperty("flows")
   public void setFlows(List<Integer[]> flows) {
      this.flows = flows;
   }

   @JsonProperty("flows")
   public List<Integer[]> getFlows() {
      return this.flows;
   }

   @JsonProperty("requestId")
   public void setRequestId(String requestId) {
      this.requestId = requestId;
   }

   @JsonProperty("requestId")
   public String getRequestId() {
      return this.requestId;
   }

   @JsonProperty("returnOrderIds")
   public void setReturnOrderIds(List<String[]> returnOrderIds) {
      this.returnOrderIds = returnOrderIds;
   }

   @JsonProperty("returnOrderIds")
   public List<String[]> getReturnOrderIds() {
      return this.returnOrderIds;
   }

   @JsonProperty("page")
   public void setPage(Integer page) {
      this.page = page;
   }

   @JsonProperty("page")
   public Integer getPage() {
      return this.page;
   }

   @JsonProperty("returnStatusList")
   public void setReturnStatusList(List<Integer[]> returnStatusList) {
      this.returnStatusList = returnStatusList;
   }

   @JsonProperty("returnStatusList")
   public List<Integer[]> getReturnStatusList() {
      return this.returnStatusList;
   }
}
