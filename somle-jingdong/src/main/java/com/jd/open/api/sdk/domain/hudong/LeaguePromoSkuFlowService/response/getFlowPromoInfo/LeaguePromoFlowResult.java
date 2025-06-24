package com.jd.open.api.sdk.domain.hudong.LeaguePromoSkuFlowService.response.getFlowPromoInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class LeaguePromoFlowResult implements Serializable {
   private Date created;
   private Date modified;
   private String remark;
   private Long flowId;
   private Long promoId;
   private Integer type;
   private Long skuId;
   private String extInfo;

   @JsonProperty("created")
   public void setCreated(Date created) {
      this.created = created;
   }

   @JsonProperty("created")
   public Date getCreated() {
      return this.created;
   }

   @JsonProperty("modified")
   public void setModified(Date modified) {
      this.modified = modified;
   }

   @JsonProperty("modified")
   public Date getModified() {
      return this.modified;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }

   @JsonProperty("flowId")
   public void setFlowId(Long flowId) {
      this.flowId = flowId;
   }

   @JsonProperty("flowId")
   public Long getFlowId() {
      return this.flowId;
   }

   @JsonProperty("promoId")
   public void setPromoId(Long promoId) {
      this.promoId = promoId;
   }

   @JsonProperty("promoId")
   public Long getPromoId() {
      return this.promoId;
   }

   @JsonProperty("type")
   public void setType(Integer type) {
      this.type = type;
   }

   @JsonProperty("type")
   public Integer getType() {
      return this.type;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("extInfo")
   public void setExtInfo(String extInfo) {
      this.extInfo = extInfo;
   }

   @JsonProperty("extInfo")
   public String getExtInfo() {
      return this.extInfo;
   }
}
