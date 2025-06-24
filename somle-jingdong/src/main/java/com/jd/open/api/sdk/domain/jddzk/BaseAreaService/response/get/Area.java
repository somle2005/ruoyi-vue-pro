package com.jd.open.api.sdk.domain.jddzk.BaseAreaService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Area implements Serializable {
   private Integer areaId;
   private String areaName;
   private Integer parentId;
   private Integer status;
   private Integer level;
   private String nameCode;
   private int overseas;
   private String areaCode;

   @JsonProperty("areaId")
   public void setAreaId(Integer areaId) {
      this.areaId = areaId;
   }

   @JsonProperty("areaId")
   public Integer getAreaId() {
      return this.areaId;
   }

   @JsonProperty("areaName")
   public void setAreaName(String areaName) {
      this.areaName = areaName;
   }

   @JsonProperty("areaName")
   public String getAreaName() {
      return this.areaName;
   }

   @JsonProperty("parentId")
   public void setParentId(Integer parentId) {
      this.parentId = parentId;
   }

   @JsonProperty("parentId")
   public Integer getParentId() {
      return this.parentId;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("level")
   public void setLevel(Integer level) {
      this.level = level;
   }

   @JsonProperty("level")
   public Integer getLevel() {
      return this.level;
   }

   @JsonProperty("nameCode")
   public void setNameCode(String nameCode) {
      this.nameCode = nameCode;
   }

   @JsonProperty("nameCode")
   public String getNameCode() {
      return this.nameCode;
   }

   @JsonProperty("overseas")
   public void setOverseas(int overseas) {
      this.overseas = overseas;
   }

   @JsonProperty("overseas")
   public int getOverseas() {
      return this.overseas;
   }

   @JsonProperty("areaCode")
   public void setAreaCode(String areaCode) {
      this.areaCode = areaCode;
   }

   @JsonProperty("areaCode")
   public String getAreaCode() {
      return this.areaCode;
   }
}
