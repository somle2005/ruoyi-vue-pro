package com.jd.open.api.sdk.domain.mall.ProductWrapService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class AttributeSetting implements Serializable {
   private Long skuId;
   private Long cid;
   private Integer type;
   private Integer attId;
   private Integer valueId;
   private String value;
   private String remark;

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("cid")
   public void setCid(Long cid) {
      this.cid = cid;
   }

   @JsonProperty("cid")
   public Long getCid() {
      return this.cid;
   }

   @JsonProperty("type")
   public void setType(Integer type) {
      this.type = type;
   }

   @JsonProperty("type")
   public Integer getType() {
      return this.type;
   }

   @JsonProperty("attId")
   public void setAttId(Integer attId) {
      this.attId = attId;
   }

   @JsonProperty("attId")
   public Integer getAttId() {
      return this.attId;
   }

   @JsonProperty("valueId")
   public void setValueId(Integer valueId) {
      this.valueId = valueId;
   }

   @JsonProperty("valueId")
   public Integer getValueId() {
      return this.valueId;
   }

   @JsonProperty("value")
   public void setValue(String value) {
      this.value = value;
   }

   @JsonProperty("value")
   public String getValue() {
      return this.value;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }
}
