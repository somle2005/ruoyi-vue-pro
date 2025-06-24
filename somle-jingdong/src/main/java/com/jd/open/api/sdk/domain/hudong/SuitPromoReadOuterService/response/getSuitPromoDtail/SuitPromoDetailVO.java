package com.jd.open.api.sdk.domain.hudong.SuitPromoReadOuterService.response.getSuitPromoDtail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class SuitPromoDetailVO implements Serializable {
   private MemberDetailVo memberDetail;
   private Integer type;
   private boolean showTokenPrice;
   private Long promoId;
   private VenderTypeInfo venderTypeInfo;
   private String name;
   private List<Integer> platForm;
   private Integer status;
   private Boolean isXnzt;
   private Boolean expired;
   private Integer memberLevel;
   private Boolean redBag;
   private BusiPlatformDetailVo busiPlatformDetail;
   private List<SuitWareVO> suitPromoWareVOList;

   @JsonProperty("memberDetail")
   public void setMemberDetail(MemberDetailVo memberDetail) {
      this.memberDetail = memberDetail;
   }

   @JsonProperty("memberDetail")
   public MemberDetailVo getMemberDetail() {
      return this.memberDetail;
   }

   @JsonProperty("type")
   public void setType(Integer type) {
      this.type = type;
   }

   @JsonProperty("type")
   public Integer getType() {
      return this.type;
   }

   @JsonProperty("showTokenPrice")
   public void setShowTokenPrice(boolean showTokenPrice) {
      this.showTokenPrice = showTokenPrice;
   }

   @JsonProperty("showTokenPrice")
   public boolean getShowTokenPrice() {
      return this.showTokenPrice;
   }

   @JsonProperty("promoId")
   public void setPromoId(Long promoId) {
      this.promoId = promoId;
   }

   @JsonProperty("promoId")
   public Long getPromoId() {
      return this.promoId;
   }

   @JsonProperty("venderTypeInfo")
   public void setVenderTypeInfo(VenderTypeInfo venderTypeInfo) {
      this.venderTypeInfo = venderTypeInfo;
   }

   @JsonProperty("venderTypeInfo")
   public VenderTypeInfo getVenderTypeInfo() {
      return this.venderTypeInfo;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
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

   @JsonProperty("isXnzt")
   public void setIsXnzt(Boolean isXnzt) {
      this.isXnzt = isXnzt;
   }

   @JsonProperty("isXnzt")
   public Boolean getIsXnzt() {
      return this.isXnzt;
   }

   @JsonProperty("expired")
   public void setExpired(Boolean expired) {
      this.expired = expired;
   }

   @JsonProperty("expired")
   public Boolean getExpired() {
      return this.expired;
   }

   @JsonProperty("memberLevel")
   public void setMemberLevel(Integer memberLevel) {
      this.memberLevel = memberLevel;
   }

   @JsonProperty("memberLevel")
   public Integer getMemberLevel() {
      return this.memberLevel;
   }

   @JsonProperty("redBag")
   public void setRedBag(Boolean redBag) {
      this.redBag = redBag;
   }

   @JsonProperty("redBag")
   public Boolean getRedBag() {
      return this.redBag;
   }

   @JsonProperty("busiPlatformDetail")
   public void setBusiPlatformDetail(BusiPlatformDetailVo busiPlatformDetail) {
      this.busiPlatformDetail = busiPlatformDetail;
   }

   @JsonProperty("busiPlatformDetail")
   public BusiPlatformDetailVo getBusiPlatformDetail() {
      return this.busiPlatformDetail;
   }

   @JsonProperty("suitPromoWareVOList")
   public void setSuitPromoWareVOList(List<SuitWareVO> suitPromoWareVOList) {
      this.suitPromoWareVOList = suitPromoWareVOList;
   }

   @JsonProperty("suitPromoWareVOList")
   public List<SuitWareVO> getSuitPromoWareVOList() {
      return this.suitPromoWareVOList;
   }
}
