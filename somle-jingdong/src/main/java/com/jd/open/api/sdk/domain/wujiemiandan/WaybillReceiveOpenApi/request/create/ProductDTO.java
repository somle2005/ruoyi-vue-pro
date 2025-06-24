package com.jd.open.api.sdk.domain.wujiemiandan.WaybillReceiveOpenApi.request.create;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ProductDTO implements Serializable {
   private String productCode;
   private List<ExtendAttributeDTO> productAttributes;
   private String productName;

   @JsonProperty("productCode")
   public void setProductCode(String productCode) {
      this.productCode = productCode;
   }

   @JsonProperty("productCode")
   public String getProductCode() {
      return this.productCode;
   }

   @JsonProperty("productAttributes")
   public void setProductAttributes(List<ExtendAttributeDTO> productAttributes) {
      this.productAttributes = productAttributes;
   }

   @JsonProperty("productAttributes")
   public List<ExtendAttributeDTO> getProductAttributes() {
      return this.productAttributes;
   }

   @JsonProperty("productName")
   public void setProductName(String productName) {
      this.productName = productName;
   }

   @JsonProperty("productName")
   public String getProductName() {
      return this.productName;
   }
}
