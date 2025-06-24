package com.jd.open.api.sdk.domain.spbq.BdsSymbolClassifyRpc.response.queryClassifyByCate;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class BdsSymbolClassifyResult implements Serializable {
   private Integer limitNum;
   private Integer isQualify;
   private List<BdsSymbolClassifyResult> children;
   private String name;
   private String bindType;
   private String remark;
   private Long id;
   private Integer isShow;
   private Integer isRequire;

   @JsonProperty("limitNum")
   public void setLimitNum(Integer limitNum) {
      this.limitNum = limitNum;
   }

   @JsonProperty("limitNum")
   public Integer getLimitNum() {
      return this.limitNum;
   }

   @JsonProperty("isQualify")
   public void setIsQualify(Integer isQualify) {
      this.isQualify = isQualify;
   }

   @JsonProperty("isQualify")
   public Integer getIsQualify() {
      return this.isQualify;
   }

   @JsonProperty("children")
   public void setChildren(List<BdsSymbolClassifyResult> children) {
      this.children = children;
   }

   @JsonProperty("children")
   public List<BdsSymbolClassifyResult> getChildren() {
      return this.children;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("bindType")
   public void setBindType(String bindType) {
      this.bindType = bindType;
   }

   @JsonProperty("bindType")
   public String getBindType() {
      return this.bindType;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }

   @JsonProperty("isShow")
   public void setIsShow(Integer isShow) {
      this.isShow = isShow;
   }

   @JsonProperty("isShow")
   public Integer getIsShow() {
      return this.isShow;
   }

   @JsonProperty("isRequire")
   public void setIsRequire(Integer isRequire) {
      this.isRequire = isRequire;
   }

   @JsonProperty("isRequire")
   public Integer getIsRequire() {
      return this.isRequire;
   }
}
