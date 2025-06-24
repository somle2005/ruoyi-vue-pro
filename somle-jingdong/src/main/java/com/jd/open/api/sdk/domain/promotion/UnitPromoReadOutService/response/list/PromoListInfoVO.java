package com.jd.open.api.sdk.domain.promotion.UnitPromoReadOutService.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class PromoListInfoVO implements Serializable {
   private Boolean resetEnable;
   private String srcName;
   private String promoTypeName;
   private Boolean pauseEnable;
   private Boolean dataEnable;
   private Long promoId;
   private Integer promoLabel;
   private Boolean copyEnable;
   private List<Integer> platForm;
   private String status;
   private Integer wareGrade;
   private String memberName;
   private String venderCode;
   private String statusName;
   private Boolean resumeEnable;
   private String startTime;
   private Long rfId;
   private Boolean popularizeEnable;
   private Integer memberLevel;
   private String promoName;
   private Boolean deleted;
   private String endTime;
   private List<String> platFormNameList;
   private Boolean auditEnable;
   private Integer promoType;
   private Integer srcType;
   private Boolean modifyWareEnable;
   private Boolean delEnable;
   private Boolean modifyEnable;
   private Boolean expired;
   private String wareGradeName;
   private Integer bound;
   private Boolean multiPromo;
   private Integer memberType;
   private Integer limitPromo;

   @JsonProperty("resetEnable")
   public void setResetEnable(Boolean resetEnable) {
      this.resetEnable = resetEnable;
   }

   @JsonProperty("resetEnable")
   public Boolean getResetEnable() {
      return this.resetEnable;
   }

   @JsonProperty("srcName")
   public void setSrcName(String srcName) {
      this.srcName = srcName;
   }

   @JsonProperty("srcName")
   public String getSrcName() {
      return this.srcName;
   }

   @JsonProperty("promoTypeName")
   public void setPromoTypeName(String promoTypeName) {
      this.promoTypeName = promoTypeName;
   }

   @JsonProperty("promoTypeName")
   public String getPromoTypeName() {
      return this.promoTypeName;
   }

   @JsonProperty("pauseEnable")
   public void setPauseEnable(Boolean pauseEnable) {
      this.pauseEnable = pauseEnable;
   }

   @JsonProperty("pauseEnable")
   public Boolean getPauseEnable() {
      return this.pauseEnable;
   }

   @JsonProperty("dataEnable")
   public void setDataEnable(Boolean dataEnable) {
      this.dataEnable = dataEnable;
   }

   @JsonProperty("dataEnable")
   public Boolean getDataEnable() {
      return this.dataEnable;
   }

   @JsonProperty("promoId")
   public void setPromoId(Long promoId) {
      this.promoId = promoId;
   }

   @JsonProperty("promoId")
   public Long getPromoId() {
      return this.promoId;
   }

   @JsonProperty("promoLabel")
   public void setPromoLabel(Integer promoLabel) {
      this.promoLabel = promoLabel;
   }

   @JsonProperty("promoLabel")
   public Integer getPromoLabel() {
      return this.promoLabel;
   }

   @JsonProperty("copyEnable")
   public void setCopyEnable(Boolean copyEnable) {
      this.copyEnable = copyEnable;
   }

   @JsonProperty("copyEnable")
   public Boolean getCopyEnable() {
      return this.copyEnable;
   }

   @JsonProperty("platForm")
   public void setPlatForm(List<Integer> platForm) {
      this.platForm = platForm;
   }

   @JsonProperty("platForm")
   public List<Integer> getPlatForm() {
      return this.platForm;
   }

   @JsonProperty("status")
   public void setStatus(String status) {
      this.status = status;
   }

   @JsonProperty("status")
   public String getStatus() {
      return this.status;
   }

   @JsonProperty("wareGrade")
   public void setWareGrade(Integer wareGrade) {
      this.wareGrade = wareGrade;
   }

   @JsonProperty("wareGrade")
   public Integer getWareGrade() {
      return this.wareGrade;
   }

   @JsonProperty("memberName")
   public void setMemberName(String memberName) {
      this.memberName = memberName;
   }

   @JsonProperty("memberName")
   public String getMemberName() {
      return this.memberName;
   }

   @JsonProperty("venderCode")
   public void setVenderCode(String venderCode) {
      this.venderCode = venderCode;
   }

   @JsonProperty("venderCode")
   public String getVenderCode() {
      return this.venderCode;
   }

   @JsonProperty("statusName")
   public void setStatusName(String statusName) {
      this.statusName = statusName;
   }

   @JsonProperty("statusName")
   public String getStatusName() {
      return this.statusName;
   }

   @JsonProperty("resumeEnable")
   public void setResumeEnable(Boolean resumeEnable) {
      this.resumeEnable = resumeEnable;
   }

   @JsonProperty("resumeEnable")
   public Boolean getResumeEnable() {
      return this.resumeEnable;
   }

   @JsonProperty("startTime")
   public void setStartTime(String startTime) {
      this.startTime = startTime;
   }

   @JsonProperty("startTime")
   public String getStartTime() {
      return this.startTime;
   }

   @JsonProperty("rfId")
   public void setRfId(Long rfId) {
      this.rfId = rfId;
   }

   @JsonProperty("rfId")
   public Long getRfId() {
      return this.rfId;
   }

   @JsonProperty("popularizeEnable")
   public void setPopularizeEnable(Boolean popularizeEnable) {
      this.popularizeEnable = popularizeEnable;
   }

   @JsonProperty("popularizeEnable")
   public Boolean getPopularizeEnable() {
      return this.popularizeEnable;
   }

   @JsonProperty("memberLevel")
   public void setMemberLevel(Integer memberLevel) {
      this.memberLevel = memberLevel;
   }

   @JsonProperty("memberLevel")
   public Integer getMemberLevel() {
      return this.memberLevel;
   }

   @JsonProperty("promoName")
   public void setPromoName(String promoName) {
      this.promoName = promoName;
   }

   @JsonProperty("promoName")
   public String getPromoName() {
      return this.promoName;
   }

   @JsonProperty("deleted")
   public void setDeleted(Boolean deleted) {
      this.deleted = deleted;
   }

   @JsonProperty("deleted")
   public Boolean getDeleted() {
      return this.deleted;
   }

   @JsonProperty("endTime")
   public void setEndTime(String endTime) {
      this.endTime = endTime;
   }

   @JsonProperty("endTime")
   public String getEndTime() {
      return this.endTime;
   }

   @JsonProperty("platFormNameList")
   public void setPlatFormNameList(List<String> platFormNameList) {
      this.platFormNameList = platFormNameList;
   }

   @JsonProperty("platFormNameList")
   public List<String> getPlatFormNameList() {
      return this.platFormNameList;
   }

   @JsonProperty("auditEnable")
   public void setAuditEnable(Boolean auditEnable) {
      this.auditEnable = auditEnable;
   }

   @JsonProperty("auditEnable")
   public Boolean getAuditEnable() {
      return this.auditEnable;
   }

   @JsonProperty("promoType")
   public void setPromoType(Integer promoType) {
      this.promoType = promoType;
   }

   @JsonProperty("promoType")
   public Integer getPromoType() {
      return this.promoType;
   }

   @JsonProperty("srcType")
   public void setSrcType(Integer srcType) {
      this.srcType = srcType;
   }

   @JsonProperty("srcType")
   public Integer getSrcType() {
      return this.srcType;
   }

   @JsonProperty("modifyWareEnable")
   public void setModifyWareEnable(Boolean modifyWareEnable) {
      this.modifyWareEnable = modifyWareEnable;
   }

   @JsonProperty("modifyWareEnable")
   public Boolean getModifyWareEnable() {
      return this.modifyWareEnable;
   }

   @JsonProperty("delEnable")
   public void setDelEnable(Boolean delEnable) {
      this.delEnable = delEnable;
   }

   @JsonProperty("delEnable")
   public Boolean getDelEnable() {
      return this.delEnable;
   }

   @JsonProperty("modifyEnable")
   public void setModifyEnable(Boolean modifyEnable) {
      this.modifyEnable = modifyEnable;
   }

   @JsonProperty("modifyEnable")
   public Boolean getModifyEnable() {
      return this.modifyEnable;
   }

   @JsonProperty("expired")
   public void setExpired(Boolean expired) {
      this.expired = expired;
   }

   @JsonProperty("expired")
   public Boolean getExpired() {
      return this.expired;
   }

   @JsonProperty("wareGradeName")
   public void setWareGradeName(String wareGradeName) {
      this.wareGradeName = wareGradeName;
   }

   @JsonProperty("wareGradeName")
   public String getWareGradeName() {
      return this.wareGradeName;
   }

   @JsonProperty("bound")
   public void setBound(Integer bound) {
      this.bound = bound;
   }

   @JsonProperty("bound")
   public Integer getBound() {
      return this.bound;
   }

   @JsonProperty("multiPromo")
   public void setMultiPromo(Boolean multiPromo) {
      this.multiPromo = multiPromo;
   }

   @JsonProperty("multiPromo")
   public Boolean getMultiPromo() {
      return this.multiPromo;
   }

   @JsonProperty("memberType")
   public void setMemberType(Integer memberType) {
      this.memberType = memberType;
   }

   @JsonProperty("memberType")
   public Integer getMemberType() {
      return this.memberType;
   }

   @JsonProperty("limitPromo")
   public void setLimitPromo(Integer limitPromo) {
      this.limitPromo = limitPromo;
   }

   @JsonProperty("limitPromo")
   public Integer getLimitPromo() {
      return this.limitPromo;
   }
}
