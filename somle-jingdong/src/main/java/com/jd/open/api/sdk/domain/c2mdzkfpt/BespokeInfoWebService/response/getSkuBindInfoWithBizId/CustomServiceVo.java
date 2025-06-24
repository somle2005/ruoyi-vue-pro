package com.jd.open.api.sdk.domain.c2mdzkfpt.BespokeInfoWebService.response.getSkuBindInfoWithBizId;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class CustomServiceVo implements Serializable {
   private Long configId;
   private Long skuId;
   private String supplier;
   private Long serviceId;
   private String serviceName;
   private String customExt;
   private Integer productType;
   private List<String> serviceDetailList;

   @JsonProperty("configId")
   public void setConfigId(Long configId) {
      this.configId = configId;
   }

   @JsonProperty("configId")
   public Long getConfigId() {
      return this.configId;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("supplier")
   public void setSupplier(String supplier) {
      this.supplier = supplier;
   }

   @JsonProperty("supplier")
   public String getSupplier() {
      return this.supplier;
   }

   @JsonProperty("serviceId")
   public void setServiceId(Long serviceId) {
      this.serviceId = serviceId;
   }

   @JsonProperty("serviceId")
   public Long getServiceId() {
      return this.serviceId;
   }

   @JsonProperty("serviceName")
   public void setServiceName(String serviceName) {
      this.serviceName = serviceName;
   }

   @JsonProperty("serviceName")
   public String getServiceName() {
      return this.serviceName;
   }

   @JsonProperty("customExt")
   public void setCustomExt(String customExt) {
      this.customExt = customExt;
   }

   @JsonProperty("customExt")
   public String getCustomExt() {
      return this.customExt;
   }

   @JsonProperty("productType")
   public void setProductType(Integer productType) {
      this.productType = productType;
   }

   @JsonProperty("productType")
   public Integer getProductType() {
      return this.productType;
   }

   @JsonProperty("serviceDetailList")
   public void setServiceDetailList(List<String> serviceDetailList) {
      this.serviceDetailList = serviceDetailList;
   }

   @JsonProperty("serviceDetailList")
   public List<String> getServiceDetailList() {
      return this.serviceDetailList;
   }
}
