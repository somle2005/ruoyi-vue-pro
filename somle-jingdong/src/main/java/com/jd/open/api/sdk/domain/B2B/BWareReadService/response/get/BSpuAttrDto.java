package com.jd.open.api.sdk.domain.B2B.BWareReadService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class BSpuAttrDto implements Serializable {
   private Long jdSkuId;
   private Long mainSkuId;
   private Long wareId;
   private boolean isZD;
   private Integer dataVersion;
   private Long attrValueId;
   private String bizCode;
   private Long jdSpuId;
   private Date created;
   private Integer concurrentVersion;
   private Long b2bSpuId;
   private Long b2bSkuId;
   private Long attrId;
   private String bizChannelEnum;
   private String spuPropertyType;
   private Date modified;
   private Long id;
   private String attrValue;
   private Long zdId;
   private Integer status;

   @JsonProperty("jdSkuId")
   public void setJdSkuId(Long jdSkuId) {
      this.jdSkuId = jdSkuId;
   }

   @JsonProperty("jdSkuId")
   public Long getJdSkuId() {
      return this.jdSkuId;
   }

   @JsonProperty("mainSkuId")
   public void setMainSkuId(Long mainSkuId) {
      this.mainSkuId = mainSkuId;
   }

   @JsonProperty("mainSkuId")
   public Long getMainSkuId() {
      return this.mainSkuId;
   }

   @JsonProperty("wareId")
   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("wareId")
   public Long getWareId() {
      return this.wareId;
   }

   @JsonProperty("isZD")
   public void setIsZD(boolean isZD) {
      this.isZD = isZD;
   }

   @JsonProperty("isZD")
   public boolean getIsZD() {
      return this.isZD;
   }

   @JsonProperty("dataVersion")
   public void setDataVersion(Integer dataVersion) {
      this.dataVersion = dataVersion;
   }

   @JsonProperty("dataVersion")
   public Integer getDataVersion() {
      return this.dataVersion;
   }

   @JsonProperty("attrValueId")
   public void setAttrValueId(Long attrValueId) {
      this.attrValueId = attrValueId;
   }

   @JsonProperty("attrValueId")
   public Long getAttrValueId() {
      return this.attrValueId;
   }

   @JsonProperty("bizCode")
   public void setBizCode(String bizCode) {
      this.bizCode = bizCode;
   }

   @JsonProperty("bizCode")
   public String getBizCode() {
      return this.bizCode;
   }

   @JsonProperty("jdSpuId")
   public void setJdSpuId(Long jdSpuId) {
      this.jdSpuId = jdSpuId;
   }

   @JsonProperty("jdSpuId")
   public Long getJdSpuId() {
      return this.jdSpuId;
   }

   @JsonProperty("created")
   public void setCreated(Date created) {
      this.created = created;
   }

   @JsonProperty("created")
   public Date getCreated() {
      return this.created;
   }

   @JsonProperty("concurrentVersion")
   public void setConcurrentVersion(Integer concurrentVersion) {
      this.concurrentVersion = concurrentVersion;
   }

   @JsonProperty("concurrentVersion")
   public Integer getConcurrentVersion() {
      return this.concurrentVersion;
   }

   @JsonProperty("b2bSpuId")
   public void setB2bSpuId(Long b2bSpuId) {
      this.b2bSpuId = b2bSpuId;
   }

   @JsonProperty("b2bSpuId")
   public Long getB2bSpuId() {
      return this.b2bSpuId;
   }

   @JsonProperty("b2bSkuId")
   public void setB2bSkuId(Long b2bSkuId) {
      this.b2bSkuId = b2bSkuId;
   }

   @JsonProperty("b2bSkuId")
   public Long getB2bSkuId() {
      return this.b2bSkuId;
   }

   @JsonProperty("attrId")
   public void setAttrId(Long attrId) {
      this.attrId = attrId;
   }

   @JsonProperty("attrId")
   public Long getAttrId() {
      return this.attrId;
   }

   @JsonProperty("bizChannelEnum")
   public void setBizChannelEnum(String bizChannelEnum) {
      this.bizChannelEnum = bizChannelEnum;
   }

   @JsonProperty("bizChannelEnum")
   public String getBizChannelEnum() {
      return this.bizChannelEnum;
   }

   @JsonProperty("spuPropertyType")
   public void setSpuPropertyType(String spuPropertyType) {
      this.spuPropertyType = spuPropertyType;
   }

   @JsonProperty("spuPropertyType")
   public String getSpuPropertyType() {
      return this.spuPropertyType;
   }

   @JsonProperty("modified")
   public void setModified(Date modified) {
      this.modified = modified;
   }

   @JsonProperty("modified")
   public Date getModified() {
      return this.modified;
   }

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }

   @JsonProperty("attrValue")
   public void setAttrValue(String attrValue) {
      this.attrValue = attrValue;
   }

   @JsonProperty("attrValue")
   public String getAttrValue() {
      return this.attrValue;
   }

   @JsonProperty("zdId")
   public void setZdId(Long zdId) {
      this.zdId = zdId;
   }

   @JsonProperty("zdId")
   public Long getZdId() {
      return this.zdId;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }
}
