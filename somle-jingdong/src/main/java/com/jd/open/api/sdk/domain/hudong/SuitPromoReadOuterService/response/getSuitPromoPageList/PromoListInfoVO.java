package com.jd.open.api.sdk.domain.hudong.SuitPromoReadOuterService.response.getSuitPromoPageList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class PromoListInfoVO implements Serializable {
   private Boolean resetEnable;
   private String srcName;
   private String promoTypeName;
   private Boolean pauseEnable;
   private Integer orderLimit;
   private Integer ifMix;
   private Integer type;
   private Integer maxNum;
   private String vendorCode;
   private Boolean dataEnable;
   private List<String> channelList;
   private Long promoId;
   private String beginTime;
   private Integer promoLabel;
   private Boolean copyEnable;
   private List<Integer> platForm;
   private Integer status;
   private Integer wareGrade;
   private String memberName;
   private String statusName;
   private String startTime;
   private Boolean resumeEnable;
   private Long rfId;
   private Boolean popularizeEnable;
   private Integer memberLevel;
   private String promoName;
   private Boolean deleted;
   private VenderBandLevel venderBandLevel;
   private List<String> channelNameList;
   private String endTime;
   private boolean showTokenPrice;
   private List<String> platFormNameList;
   private Boolean newData;
   private Boolean auditEnable;
   private Integer promoType;
   private Integer srcType;
   private List<PromotionPropVO> promotionPropList;
   private Boolean modifyWareEnable;
   private Boolean delEnable;
   private Boolean modifyEnable;
   private Boolean expired;
   private String wareGradeName;
   private String busiCode;
   private Integer bound;
   private Boolean multiPromo;
   private Boolean redBag;
   private Integer memberType;

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

   @JsonProperty("orderLimit")
   public void setOrderLimit(Integer orderLimit) {
      this.orderLimit = orderLimit;
   }

   @JsonProperty("orderLimit")
   public Integer getOrderLimit() {
      return this.orderLimit;
   }

   @JsonProperty("ifMix")
   public void setIfMix(Integer ifMix) {
      this.ifMix = ifMix;
   }

   @JsonProperty("ifMix")
   public Integer getIfMix() {
      return this.ifMix;
   }

   @JsonProperty("type")
   public void setType(Integer type) {
      this.type = type;
   }

   @JsonProperty("type")
   public Integer getType() {
      return this.type;
   }

   @JsonProperty("maxNum")
   public void setMaxNum(Integer maxNum) {
      this.maxNum = maxNum;
   }

   @JsonProperty("maxNum")
   public Integer getMaxNum() {
      return this.maxNum;
   }

   @JsonProperty("vendorCode")
   public void setVendorCode(String vendorCode) {
      this.vendorCode = vendorCode;
   }

   @JsonProperty("vendorCode")
   public String getVendorCode() {
      return this.vendorCode;
   }

   @JsonProperty("dataEnable")
   public void setDataEnable(Boolean dataEnable) {
      this.dataEnable = dataEnable;
   }

   @JsonProperty("dataEnable")
   public Boolean getDataEnable() {
      return this.dataEnable;
   }

   @JsonProperty("channelList")
   public void setChannelList(List<String> channelList) {
      this.channelList = channelList;
   }

   @JsonProperty("channelList")
   public List<String> getChannelList() {
      return this.channelList;
   }

   @JsonProperty("promoId")
   public void setPromoId(Long promoId) {
      this.promoId = promoId;
   }

   @JsonProperty("promoId")
   public Long getPromoId() {
      return this.promoId;
   }

   @JsonProperty("beginTime")
   public void setBeginTime(String beginTime) {
      this.beginTime = beginTime;
   }

   @JsonProperty("beginTime")
   public String getBeginTime() {
      return this.beginTime;
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
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
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

   @JsonProperty("statusName")
   public void setStatusName(String statusName) {
      this.statusName = statusName;
   }

   @JsonProperty("statusName")
   public String getStatusName() {
      return this.statusName;
   }

   @JsonProperty("startTime")
   public void setStartTime(String startTime) {
      this.startTime = startTime;
   }

   @JsonProperty("startTime")
   public String getStartTime() {
      return this.startTime;
   }

   @JsonProperty("resumeEnable")
   public void setResumeEnable(Boolean resumeEnable) {
      this.resumeEnable = resumeEnable;
   }

   @JsonProperty("resumeEnable")
   public Boolean getResumeEnable() {
      return this.resumeEnable;
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

   @JsonProperty("venderBandLevel")
   public void setVenderBandLevel(VenderBandLevel venderBandLevel) {
      this.venderBandLevel = venderBandLevel;
   }

   @JsonProperty("venderBandLevel")
   public VenderBandLevel getVenderBandLevel() {
      return this.venderBandLevel;
   }

   @JsonProperty("channelNameList")
   public void setChannelNameList(List<String> channelNameList) {
      this.channelNameList = channelNameList;
   }

   @JsonProperty("channelNameList")
   public List<String> getChannelNameList() {
      return this.channelNameList;
   }

   @JsonProperty("endTime")
   public void setEndTime(String endTime) {
      this.endTime = endTime;
   }

   @JsonProperty("endTime")
   public String getEndTime() {
      return this.endTime;
   }

   @JsonProperty("showTokenPrice")
   public void setShowTokenPrice(boolean showTokenPrice) {
      this.showTokenPrice = showTokenPrice;
   }

   @JsonProperty("showTokenPrice")
   public boolean getShowTokenPrice() {
      return this.showTokenPrice;
   }

   @JsonProperty("platFormNameList")
   public void setPlatFormNameList(List<String> platFormNameList) {
      this.platFormNameList = platFormNameList;
   }

   @JsonProperty("platFormNameList")
   public List<String> getPlatFormNameList() {
      return this.platFormNameList;
   }

   @JsonProperty("newData")
   public void setNewData(Boolean newData) {
      this.newData = newData;
   }

   @JsonProperty("newData")
   public Boolean getNewData() {
      return this.newData;
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

   @JsonProperty("promotionPropList")
   public void setPromotionPropList(List<PromotionPropVO> promotionPropList) {
      this.promotionPropList = promotionPropList;
   }

   @JsonProperty("promotionPropList")
   public List<PromotionPropVO> getPromotionPropList() {
      return this.promotionPropList;
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

   @JsonProperty("busiCode")
   public void setBusiCode(String busiCode) {
      this.busiCode = busiCode;
   }

   @JsonProperty("busiCode")
   public String getBusiCode() {
      return this.busiCode;
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

   @JsonProperty("redBag")
   public void setRedBag(Boolean redBag) {
      this.redBag = redBag;
   }

   @JsonProperty("redBag")
   public Boolean getRedBag() {
      return this.redBag;
   }

   @JsonProperty("memberType")
   public void setMemberType(Integer memberType) {
      this.memberType = memberType;
   }

   @JsonProperty("memberType")
   public Integer getMemberType() {
      return this.memberType;
   }
}
