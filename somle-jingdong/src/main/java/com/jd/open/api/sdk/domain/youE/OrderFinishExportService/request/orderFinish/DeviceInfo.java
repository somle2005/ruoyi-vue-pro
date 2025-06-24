package com.jd.open.api.sdk.domain.youE.OrderFinishExportService.request.orderFinish;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class DeviceInfo implements Serializable {
   private String inSkuSn;
   private String outSkuSn;
   private String productSn;
   private List<String> inCodeList;
   private List<String> outCodeList;

   @JsonProperty("inSkuSn")
   public void setInSkuSn(String inSkuSn) {
      this.inSkuSn = inSkuSn;
   }

   @JsonProperty("inSkuSn")
   public String getInSkuSn() {
      return this.inSkuSn;
   }

   @JsonProperty("outSkuSn")
   public void setOutSkuSn(String outSkuSn) {
      this.outSkuSn = outSkuSn;
   }

   @JsonProperty("outSkuSn")
   public String getOutSkuSn() {
      return this.outSkuSn;
   }

   @JsonProperty("productSn")
   public void setProductSn(String productSn) {
      this.productSn = productSn;
   }

   @JsonProperty("productSn")
   public String getProductSn() {
      return this.productSn;
   }

   @JsonProperty("inCodeList")
   public void setInCodeList(List<String> inCodeList) {
      this.inCodeList = inCodeList;
   }

   @JsonProperty("inCodeList")
   public List<String> getInCodeList() {
      return this.inCodeList;
   }

   @JsonProperty("outCodeList")
   public void setOutCodeList(List<String> outCodeList) {
      this.outCodeList = outCodeList;
   }

   @JsonProperty("outCodeList")
   public List<String> getOutCodeList() {
      return this.outCodeList;
   }
}
