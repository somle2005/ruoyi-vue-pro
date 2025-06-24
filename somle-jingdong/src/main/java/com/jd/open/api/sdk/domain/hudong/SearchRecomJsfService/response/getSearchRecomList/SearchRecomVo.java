package com.jd.open.api.sdk.domain.hudong.SearchRecomJsfService.response.getSearchRecomList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SearchRecomVo implements Serializable {
   private String content;
   private Integer recomSubtype;
   private Integer recomTermType;
   private Long actId;
   private Integer recomStatus;
   private Long skuNum;
   private String actName;
   private Long recomId;

   @JsonProperty("content")
   public void setContent(String content) {
      this.content = content;
   }

   @JsonProperty("content")
   public String getContent() {
      return this.content;
   }

   @JsonProperty("recomSubtype")
   public void setRecomSubtype(Integer recomSubtype) {
      this.recomSubtype = recomSubtype;
   }

   @JsonProperty("recomSubtype")
   public Integer getRecomSubtype() {
      return this.recomSubtype;
   }

   @JsonProperty("recomTermType")
   public void setRecomTermType(Integer recomTermType) {
      this.recomTermType = recomTermType;
   }

   @JsonProperty("recomTermType")
   public Integer getRecomTermType() {
      return this.recomTermType;
   }

   @JsonProperty("actId")
   public void setActId(Long actId) {
      this.actId = actId;
   }

   @JsonProperty("actId")
   public Long getActId() {
      return this.actId;
   }

   @JsonProperty("recomStatus")
   public void setRecomStatus(Integer recomStatus) {
      this.recomStatus = recomStatus;
   }

   @JsonProperty("recomStatus")
   public Integer getRecomStatus() {
      return this.recomStatus;
   }

   @JsonProperty("skuNum")
   public void setSkuNum(Long skuNum) {
      this.skuNum = skuNum;
   }

   @JsonProperty("skuNum")
   public Long getSkuNum() {
      return this.skuNum;
   }

   @JsonProperty("actName")
   public void setActName(String actName) {
      this.actName = actName;
   }

   @JsonProperty("actName")
   public String getActName() {
      return this.actName;
   }

   @JsonProperty("recomId")
   public void setRecomId(Long recomId) {
      this.recomId = recomId;
   }

   @JsonProperty("recomId")
   public Long getRecomId() {
      return this.recomId;
   }
}
