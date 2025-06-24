package com.jd.open.api.sdk.domain.B2B.B2BWareQueryProviderNew.response.getNew;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class BSpuQualifyDto implements Serializable {
   private Long wareId;
   private Date gmtModify;
   private Integer yn;
   private String imagePath;
   private String bizCode;
   private Long id;
   private Date gmtCreate;
   private Integer imageIndex;

   @JsonProperty("wareId")
   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("wareId")
   public Long getWareId() {
      return this.wareId;
   }

   @JsonProperty("gmtModify")
   public void setGmtModify(Date gmtModify) {
      this.gmtModify = gmtModify;
   }

   @JsonProperty("gmtModify")
   public Date getGmtModify() {
      return this.gmtModify;
   }

   @JsonProperty("yn")
   public void setYn(Integer yn) {
      this.yn = yn;
   }

   @JsonProperty("yn")
   public Integer getYn() {
      return this.yn;
   }

   @JsonProperty("imagePath")
   public void setImagePath(String imagePath) {
      this.imagePath = imagePath;
   }

   @JsonProperty("imagePath")
   public String getImagePath() {
      return this.imagePath;
   }

   @JsonProperty("bizCode")
   public void setBizCode(String bizCode) {
      this.bizCode = bizCode;
   }

   @JsonProperty("bizCode")
   public String getBizCode() {
      return this.bizCode;
   }

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }

   @JsonProperty("gmtCreate")
   public void setGmtCreate(Date gmtCreate) {
      this.gmtCreate = gmtCreate;
   }

   @JsonProperty("gmtCreate")
   public Date getGmtCreate() {
      return this.gmtCreate;
   }

   @JsonProperty("imageIndex")
   public void setImageIndex(Integer imageIndex) {
      this.imageIndex = imageIndex;
   }

   @JsonProperty("imageIndex")
   public Integer getImageIndex() {
      return this.imageIndex;
   }
}
