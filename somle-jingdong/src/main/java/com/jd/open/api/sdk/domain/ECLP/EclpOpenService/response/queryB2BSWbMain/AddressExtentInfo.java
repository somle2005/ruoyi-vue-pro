package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryB2BSWbMain;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class AddressExtentInfo implements Serializable {
   private Long id;
   private Long wbId;
   private String salesErp;
   private Integer ticketNum;
   private BigDecimal netWeight;
   private BigDecimal bubbleWeight;
   private Integer actualSignedPackageCount;
   private List<PackageConsumableDto> packageMaterialDetailList;

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }

   @JsonProperty("wbId")
   public void setWbId(Long wbId) {
      this.wbId = wbId;
   }

   @JsonProperty("wbId")
   public Long getWbId() {
      return this.wbId;
   }

   @JsonProperty("salesErp")
   public void setSalesErp(String salesErp) {
      this.salesErp = salesErp;
   }

   @JsonProperty("salesErp")
   public String getSalesErp() {
      return this.salesErp;
   }

   @JsonProperty("ticketNum")
   public void setTicketNum(Integer ticketNum) {
      this.ticketNum = ticketNum;
   }

   @JsonProperty("ticketNum")
   public Integer getTicketNum() {
      return this.ticketNum;
   }

   @JsonProperty("netWeight")
   public void setNetWeight(BigDecimal netWeight) {
      this.netWeight = netWeight;
   }

   @JsonProperty("netWeight")
   public BigDecimal getNetWeight() {
      return this.netWeight;
   }

   @JsonProperty("bubbleWeight")
   public void setBubbleWeight(BigDecimal bubbleWeight) {
      this.bubbleWeight = bubbleWeight;
   }

   @JsonProperty("bubbleWeight")
   public BigDecimal getBubbleWeight() {
      return this.bubbleWeight;
   }

   @JsonProperty("actualSignedPackageCount")
   public void setActualSignedPackageCount(Integer actualSignedPackageCount) {
      this.actualSignedPackageCount = actualSignedPackageCount;
   }

   @JsonProperty("actualSignedPackageCount")
   public Integer getActualSignedPackageCount() {
      return this.actualSignedPackageCount;
   }

   @JsonProperty("packageMaterialDetailList")
   public void setPackageMaterialDetailList(List<PackageConsumableDto> packageMaterialDetailList) {
      this.packageMaterialDetailList = packageMaterialDetailList;
   }

   @JsonProperty("packageMaterialDetailList")
   public List<PackageConsumableDto> getPackageMaterialDetailList() {
      return this.packageMaterialDetailList;
   }
}
