package com.jd.open.api.sdk.domain.B2B.BWareSearchService.request.fx;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class BizSkuSearchReq implements Serializable {
   private Long jdSkuId;
   private Long b2bPoolId;
   private Set<String> returnFieldList;
   private String operatorErp;
   private String skuName;
   private Integer yn;
   private List<Sort> sortList;
   private Integer auditStatus;
   private Integer status;

   @JsonProperty("jdSkuId")
   public void setJdSkuId(Long jdSkuId) {
      this.jdSkuId = jdSkuId;
   }

   @JsonProperty("jdSkuId")
   public Long getJdSkuId() {
      return this.jdSkuId;
   }

   @JsonProperty("b2bPoolId")
   public void setB2bPoolId(Long b2bPoolId) {
      this.b2bPoolId = b2bPoolId;
   }

   @JsonProperty("b2bPoolId")
   public Long getB2bPoolId() {
      return this.b2bPoolId;
   }

   @JsonProperty("returnFieldList")
   public void setReturnFieldList(Set<String> returnFieldList) {
      this.returnFieldList = returnFieldList;
   }

   @JsonProperty("returnFieldList")
   public Set<String> getReturnFieldList() {
      return this.returnFieldList;
   }

   @JsonProperty("operatorErp")
   public void setOperatorErp(String operatorErp) {
      this.operatorErp = operatorErp;
   }

   @JsonProperty("operatorErp")
   public String getOperatorErp() {
      return this.operatorErp;
   }

   @JsonProperty("skuName")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("yn")
   public void setYn(Integer yn) {
      this.yn = yn;
   }

   @JsonProperty("yn")
   public Integer getYn() {
      return this.yn;
   }

   @JsonProperty("sortList")
   public void setSortList(List<Sort> sortList) {
      this.sortList = sortList;
   }

   @JsonProperty("sortList")
   public List<Sort> getSortList() {
      return this.sortList;
   }

   @JsonProperty("auditStatus")
   public void setAuditStatus(Integer auditStatus) {
      this.auditStatus = auditStatus;
   }

   @JsonProperty("auditStatus")
   public Integer getAuditStatus() {
      return this.auditStatus;
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
