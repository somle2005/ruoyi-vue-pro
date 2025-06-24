package com.jd.open.api.sdk.domain.hudong.SuitPromoWriteOuterService.request.AddSuitPromo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class SuitPromoDetailVO implements Serializable {
   private Integer type;
   private String scene;
   private List<String> endTimes;
   private Boolean popVender;
   private List<String> beginTimes;
   private String name;
   private List<Integer> platForm;
   private Boolean isXnzt;
   private Integer memberLevel;
   private List<SuitWareVO> suitPromoWareVOList;

   @JsonProperty("type")
   public void setType(Integer type) {
      this.type = type;
   }

   @JsonProperty("type")
   public Integer getType() {
      return this.type;
   }

   @JsonProperty("scene")
   public void setScene(String scene) {
      this.scene = scene;
   }

   @JsonProperty("scene")
   public String getScene() {
      return this.scene;
   }

   @JsonProperty("endTimes")
   public void setEndTimes(List<String> endTimes) {
      this.endTimes = endTimes;
   }

   @JsonProperty("endTimes")
   public List<String> getEndTimes() {
      return this.endTimes;
   }

   @JsonProperty("popVender")
   public void setPopVender(Boolean popVender) {
      this.popVender = popVender;
   }

   @JsonProperty("popVender")
   public Boolean getPopVender() {
      return this.popVender;
   }

   @JsonProperty("beginTimes")
   public void setBeginTimes(List<String> beginTimes) {
      this.beginTimes = beginTimes;
   }

   @JsonProperty("beginTimes")
   public List<String> getBeginTimes() {
      return this.beginTimes;
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

   @JsonProperty("isXnzt")
   public void setIsXnzt(Boolean isXnzt) {
      this.isXnzt = isXnzt;
   }

   @JsonProperty("isXnzt")
   public Boolean getIsXnzt() {
      return this.isXnzt;
   }

   @JsonProperty("memberLevel")
   public void setMemberLevel(Integer memberLevel) {
      this.memberLevel = memberLevel;
   }

   @JsonProperty("memberLevel")
   public Integer getMemberLevel() {
      return this.memberLevel;
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
