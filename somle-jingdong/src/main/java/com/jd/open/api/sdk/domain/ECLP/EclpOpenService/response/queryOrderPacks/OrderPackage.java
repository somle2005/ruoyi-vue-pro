package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryOrderPacks;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class OrderPackage implements Serializable {
   private String[] packageNo;
   private Double[] packWeight;
   private String[] thirdWayBill;
   private List<SoPackItemGoods> soPackItemsList;
   private List<SoPackMaterial> soPackMaterialList;
   private String[] boxCodes;

   @JsonProperty("packageNo")
   public void setPackageNo(String[] packageNo) {
      this.packageNo = packageNo;
   }

   @JsonProperty("packageNo")
   public String[] getPackageNo() {
      return this.packageNo;
   }

   @JsonProperty("packWeight")
   public void setPackWeight(Double[] packWeight) {
      this.packWeight = packWeight;
   }

   @JsonProperty("packWeight")
   public Double[] getPackWeight() {
      return this.packWeight;
   }

   @JsonProperty("thirdWayBill")
   public void setThirdWayBill(String[] thirdWayBill) {
      this.thirdWayBill = thirdWayBill;
   }

   @JsonProperty("thirdWayBill")
   public String[] getThirdWayBill() {
      return this.thirdWayBill;
   }

   @JsonProperty("soPackItemsList")
   public void setSoPackItemsList(List<SoPackItemGoods> soPackItemsList) {
      this.soPackItemsList = soPackItemsList;
   }

   @JsonProperty("soPackItemsList")
   public List<SoPackItemGoods> getSoPackItemsList() {
      return this.soPackItemsList;
   }

   @JsonProperty("soPackMaterialList")
   public void setSoPackMaterialList(List<SoPackMaterial> soPackMaterialList) {
      this.soPackMaterialList = soPackMaterialList;
   }

   @JsonProperty("soPackMaterialList")
   public List<SoPackMaterial> getSoPackMaterialList() {
      return this.soPackMaterialList;
   }

   @JsonProperty("boxCodes")
   public void setBoxCodes(String[] boxCodes) {
      this.boxCodes = boxCodes;
   }

   @JsonProperty("boxCodes")
   public String[] getBoxCodes() {
      return this.boxCodes;
   }
}
