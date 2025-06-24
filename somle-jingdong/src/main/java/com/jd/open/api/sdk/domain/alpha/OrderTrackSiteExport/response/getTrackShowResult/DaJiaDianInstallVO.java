package com.jd.open.api.sdk.domain.alpha.OrderTrackSiteExport.response.getTrackShowResult;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class DaJiaDianInstallVO implements Serializable {
   private String productName;
   private String productId;
   private String installNumber;
   private List<InstallInfoVO> installInfo;

   @JsonProperty("productName")
   public void setProductName(String productName) {
      this.productName = productName;
   }

   @JsonProperty("productName")
   public String getProductName() {
      return this.productName;
   }

   @JsonProperty("productId")
   public void setProductId(String productId) {
      this.productId = productId;
   }

   @JsonProperty("productId")
   public String getProductId() {
      return this.productId;
   }

   @JsonProperty("installNumber")
   public void setInstallNumber(String installNumber) {
      this.installNumber = installNumber;
   }

   @JsonProperty("installNumber")
   public String getInstallNumber() {
      return this.installNumber;
   }

   @JsonProperty("installInfo")
   public void setInstallInfo(List<InstallInfoVO> installInfo) {
      this.installInfo = installInfo;
   }

   @JsonProperty("installInfo")
   public List<InstallInfoVO> getInstallInfo() {
      return this.installInfo;
   }
}
