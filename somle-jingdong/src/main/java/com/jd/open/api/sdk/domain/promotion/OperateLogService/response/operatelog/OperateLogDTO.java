package com.jd.open.api.sdk.domain.promotion.OperateLogService.response.operatelog;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class OperateLogDTO implements Serializable {
   private Integer operateLevel;
   private Date created;
   private Long venderId;
   private String remark;
   private String operatorName;
   private String content;
   private Integer site;
   private Integer operate;
   private Long promoId;
   private Long skuId;
   private Long multiActivityId;
   private Long id;

   @JsonProperty("operateLevel")
   public void setOperateLevel(Integer operateLevel) {
      this.operateLevel = operateLevel;
   }

   @JsonProperty("operateLevel")
   public Integer getOperateLevel() {
      return this.operateLevel;
   }

   @JsonProperty("created")
   public void setCreated(Date created) {
      this.created = created;
   }

   @JsonProperty("created")
   public Date getCreated() {
      return this.created;
   }

   @JsonProperty("venderId")
   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public Long getVenderId() {
      return this.venderId;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }

   @JsonProperty("operatorName")
   public void setOperatorName(String operatorName) {
      this.operatorName = operatorName;
   }

   @JsonProperty("operatorName")
   public String getOperatorName() {
      return this.operatorName;
   }

   @JsonProperty("content")
   public void setContent(String content) {
      this.content = content;
   }

   @JsonProperty("content")
   public String getContent() {
      return this.content;
   }

   @JsonProperty("site")
   public void setSite(Integer site) {
      this.site = site;
   }

   @JsonProperty("site")
   public Integer getSite() {
      return this.site;
   }

   @JsonProperty("operate")
   public void setOperate(Integer operate) {
      this.operate = operate;
   }

   @JsonProperty("operate")
   public Integer getOperate() {
      return this.operate;
   }

   @JsonProperty("promoId")
   public void setPromoId(Long promoId) {
      this.promoId = promoId;
   }

   @JsonProperty("promoId")
   public Long getPromoId() {
      return this.promoId;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("multiActivityId")
   public void setMultiActivityId(Long multiActivityId) {
      this.multiActivityId = multiActivityId;
   }

   @JsonProperty("multiActivityId")
   public Long getMultiActivityId() {
      return this.multiActivityId;
   }

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }
}
