package com.jd.open.api.sdk.domain.qqdkfptjq.OmnicOmcJosService.response.orderList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class OrderDetail implements Serializable {
   private Long modelId;
   private Long orderId;
   private Integer num;
   private String salesChannelSkuId;
   private BigDecimal transactionPrice;
   private BigDecimal skuPrice;
   private String skuName;
   private Long salesUnitId;
   private Long sequenceNo;
   private String skuId;
   private BigDecimal priceThreshold;
   private String salesUnitName;
   private String batchNo;
   private String skuSpec;
   private String skuUuid;
   private BigDecimal skuAmount;
   private Double rebateRate;
   private String upc;
   private Double weight;
   private Long tenantId;
   private String outSkuId;
   private Double bulk;
   private Integer checkSn;
   private String extendJson;

   @JsonProperty("modelId")
   public void setModelId(Long modelId) {
      this.modelId = modelId;
   }

   @JsonProperty("modelId")
   public Long getModelId() {
      return this.modelId;
   }

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("num")
   public void setNum(Integer num) {
      this.num = num;
   }

   @JsonProperty("num")
   public Integer getNum() {
      return this.num;
   }

   @JsonProperty("salesChannelSkuId")
   public void setSalesChannelSkuId(String salesChannelSkuId) {
      this.salesChannelSkuId = salesChannelSkuId;
   }

   @JsonProperty("salesChannelSkuId")
   public String getSalesChannelSkuId() {
      return this.salesChannelSkuId;
   }

   @JsonProperty("transactionPrice")
   public void setTransactionPrice(BigDecimal transactionPrice) {
      this.transactionPrice = transactionPrice;
   }

   @JsonProperty("transactionPrice")
   public BigDecimal getTransactionPrice() {
      return this.transactionPrice;
   }

   @JsonProperty("skuPrice")
   public void setSkuPrice(BigDecimal skuPrice) {
      this.skuPrice = skuPrice;
   }

   @JsonProperty("skuPrice")
   public BigDecimal getSkuPrice() {
      return this.skuPrice;
   }

   @JsonProperty("skuName")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("salesUnitId")
   public void setSalesUnitId(Long salesUnitId) {
      this.salesUnitId = salesUnitId;
   }

   @JsonProperty("salesUnitId")
   public Long getSalesUnitId() {
      return this.salesUnitId;
   }

   @JsonProperty("sequenceNo")
   public void setSequenceNo(Long sequenceNo) {
      this.sequenceNo = sequenceNo;
   }

   @JsonProperty("sequenceNo")
   public Long getSequenceNo() {
      return this.sequenceNo;
   }

   @JsonProperty("skuId")
   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public String getSkuId() {
      return this.skuId;
   }

   @JsonProperty("priceThreshold")
   public void setPriceThreshold(BigDecimal priceThreshold) {
      this.priceThreshold = priceThreshold;
   }

   @JsonProperty("priceThreshold")
   public BigDecimal getPriceThreshold() {
      return this.priceThreshold;
   }

   @JsonProperty("salesUnitName")
   public void setSalesUnitName(String salesUnitName) {
      this.salesUnitName = salesUnitName;
   }

   @JsonProperty("salesUnitName")
   public String getSalesUnitName() {
      return this.salesUnitName;
   }

   @JsonProperty("batchNo")
   public void setBatchNo(String batchNo) {
      this.batchNo = batchNo;
   }

   @JsonProperty("batchNo")
   public String getBatchNo() {
      return this.batchNo;
   }

   @JsonProperty("skuSpec")
   public void setSkuSpec(String skuSpec) {
      this.skuSpec = skuSpec;
   }

   @JsonProperty("skuSpec")
   public String getSkuSpec() {
      return this.skuSpec;
   }

   @JsonProperty("skuUuid")
   public void setSkuUuid(String skuUuid) {
      this.skuUuid = skuUuid;
   }

   @JsonProperty("skuUuid")
   public String getSkuUuid() {
      return this.skuUuid;
   }

   @JsonProperty("skuAmount")
   public void setSkuAmount(BigDecimal skuAmount) {
      this.skuAmount = skuAmount;
   }

   @JsonProperty("skuAmount")
   public BigDecimal getSkuAmount() {
      return this.skuAmount;
   }

   @JsonProperty("rebateRate")
   public void setRebateRate(Double rebateRate) {
      this.rebateRate = rebateRate;
   }

   @JsonProperty("rebateRate")
   public Double getRebateRate() {
      return this.rebateRate;
   }

   @JsonProperty("upc")
   public void setUpc(String upc) {
      this.upc = upc;
   }

   @JsonProperty("upc")
   public String getUpc() {
      return this.upc;
   }

   @JsonProperty("weight")
   public void setWeight(Double weight) {
      this.weight = weight;
   }

   @JsonProperty("weight")
   public Double getWeight() {
      return this.weight;
   }

   @JsonProperty("tenantId")
   public void setTenantId(Long tenantId) {
      this.tenantId = tenantId;
   }

   @JsonProperty("tenantId")
   public Long getTenantId() {
      return this.tenantId;
   }

   @JsonProperty("outSkuId")
   public void setOutSkuId(String outSkuId) {
      this.outSkuId = outSkuId;
   }

   @JsonProperty("outSkuId")
   public String getOutSkuId() {
      return this.outSkuId;
   }

   @JsonProperty("bulk")
   public void setBulk(Double bulk) {
      this.bulk = bulk;
   }

   @JsonProperty("bulk")
   public Double getBulk() {
      return this.bulk;
   }

   @JsonProperty("checkSn")
   public void setCheckSn(Integer checkSn) {
      this.checkSn = checkSn;
   }

   @JsonProperty("checkSn")
   public Integer getCheckSn() {
      return this.checkSn;
   }

   @JsonProperty("extendJson")
   public void setExtendJson(String extendJson) {
      this.extendJson = extendJson;
   }

   @JsonProperty("extendJson")
   public String getExtendJson() {
      return this.extendJson;
   }
}
