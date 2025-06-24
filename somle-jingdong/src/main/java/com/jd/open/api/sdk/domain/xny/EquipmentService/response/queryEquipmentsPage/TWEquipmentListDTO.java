package com.jd.open.api.sdk.domain.xny.EquipmentService.response.queryEquipmentsPage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class TWEquipmentListDTO implements Serializable {
   private Integer portCount;
   private Double equipmentLat;
   private Long jdVenderId;
   private String addressInfo;
   private Double equipmentLng;
   private Integer portIdleCount;
   private String equipmentId;
   private Integer equipmentStatus;
   private String jdVenderName;
   private String serviceTel;
   private String communityName;
   private String equipmentName;
   private String communityId;

   @JsonProperty("portCount")
   public void setPortCount(Integer portCount) {
      this.portCount = portCount;
   }

   @JsonProperty("portCount")
   public Integer getPortCount() {
      return this.portCount;
   }

   @JsonProperty("equipmentLat")
   public void setEquipmentLat(Double equipmentLat) {
      this.equipmentLat = equipmentLat;
   }

   @JsonProperty("equipmentLat")
   public Double getEquipmentLat() {
      return this.equipmentLat;
   }

   @JsonProperty("jdVenderId")
   public void setJdVenderId(Long jdVenderId) {
      this.jdVenderId = jdVenderId;
   }

   @JsonProperty("jdVenderId")
   public Long getJdVenderId() {
      return this.jdVenderId;
   }

   @JsonProperty("addressInfo")
   public void setAddressInfo(String addressInfo) {
      this.addressInfo = addressInfo;
   }

   @JsonProperty("addressInfo")
   public String getAddressInfo() {
      return this.addressInfo;
   }

   @JsonProperty("equipmentLng")
   public void setEquipmentLng(Double equipmentLng) {
      this.equipmentLng = equipmentLng;
   }

   @JsonProperty("equipmentLng")
   public Double getEquipmentLng() {
      return this.equipmentLng;
   }

   @JsonProperty("portIdleCount")
   public void setPortIdleCount(Integer portIdleCount) {
      this.portIdleCount = portIdleCount;
   }

   @JsonProperty("portIdleCount")
   public Integer getPortIdleCount() {
      return this.portIdleCount;
   }

   @JsonProperty("equipmentId")
   public void setEquipmentId(String equipmentId) {
      this.equipmentId = equipmentId;
   }

   @JsonProperty("equipmentId")
   public String getEquipmentId() {
      return this.equipmentId;
   }

   @JsonProperty("equipmentStatus")
   public void setEquipmentStatus(Integer equipmentStatus) {
      this.equipmentStatus = equipmentStatus;
   }

   @JsonProperty("equipmentStatus")
   public Integer getEquipmentStatus() {
      return this.equipmentStatus;
   }

   @JsonProperty("jdVenderName")
   public void setJdVenderName(String jdVenderName) {
      this.jdVenderName = jdVenderName;
   }

   @JsonProperty("jdVenderName")
   public String getJdVenderName() {
      return this.jdVenderName;
   }

   @JsonProperty("serviceTel")
   public void setServiceTel(String serviceTel) {
      this.serviceTel = serviceTel;
   }

   @JsonProperty("serviceTel")
   public String getServiceTel() {
      return this.serviceTel;
   }

   @JsonProperty("communityName")
   public void setCommunityName(String communityName) {
      this.communityName = communityName;
   }

   @JsonProperty("communityName")
   public String getCommunityName() {
      return this.communityName;
   }

   @JsonProperty("equipmentName")
   public void setEquipmentName(String equipmentName) {
      this.equipmentName = equipmentName;
   }

   @JsonProperty("equipmentName")
   public String getEquipmentName() {
      return this.equipmentName;
   }

   @JsonProperty("communityId")
   public void setCommunityId(String communityId) {
      this.communityId = communityId;
   }

   @JsonProperty("communityId")
   public String getCommunityId() {
      return this.communityId;
   }
}
