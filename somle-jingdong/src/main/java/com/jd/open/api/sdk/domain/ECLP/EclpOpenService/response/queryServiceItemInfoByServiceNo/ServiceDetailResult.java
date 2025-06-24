package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryServiceItemInfoByServiceNo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ServiceDetailResult implements Serializable {
   private String servicesNo;
   private String servicesStatus;
   private String warehouseNo;
   private String warehouseName;
   private List<ServiceItemInfo> serviceItemInfos;

   @JsonProperty("servicesNo")
   public void setServicesNo(String servicesNo) {
      this.servicesNo = servicesNo;
   }

   @JsonProperty("servicesNo")
   public String getServicesNo() {
      return this.servicesNo;
   }

   @JsonProperty("servicesStatus")
   public void setServicesStatus(String servicesStatus) {
      this.servicesStatus = servicesStatus;
   }

   @JsonProperty("servicesStatus")
   public String getServicesStatus() {
      return this.servicesStatus;
   }

   @JsonProperty("warehouseNo")
   public void setWarehouseNo(String warehouseNo) {
      this.warehouseNo = warehouseNo;
   }

   @JsonProperty("warehouseNo")
   public String getWarehouseNo() {
      return this.warehouseNo;
   }

   @JsonProperty("warehouseName")
   public void setWarehouseName(String warehouseName) {
      this.warehouseName = warehouseName;
   }

   @JsonProperty("warehouseName")
   public String getWarehouseName() {
      return this.warehouseName;
   }

   @JsonProperty("serviceItemInfos")
   public void setServiceItemInfos(List<ServiceItemInfo> serviceItemInfos) {
      this.serviceItemInfos = serviceItemInfos;
   }

   @JsonProperty("serviceItemInfos")
   public List<ServiceItemInfo> getServiceItemInfos() {
      return this.serviceItemInfos;
   }
}
