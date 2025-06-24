package com.jd.open.api.sdk.domain.neirong.StationInfoJosService.response.getStationInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class StationAreaSimpleInfo implements Serializable {
   private Integer status;
   private String areaName;
   private String updateUser;
   private Date updateTime;

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("areaName")
   public void setAreaName(String areaName) {
      this.areaName = areaName;
   }

   @JsonProperty("areaName")
   public String getAreaName() {
      return this.areaName;
   }

   @JsonProperty("updateUser")
   public void setUpdateUser(String updateUser) {
      this.updateUser = updateUser;
   }

   @JsonProperty("updateUser")
   public String getUpdateUser() {
      return this.updateUser;
   }

   @JsonProperty("updateTime")
   public void setUpdateTime(Date updateTime) {
      this.updateTime = updateTime;
   }

   @JsonProperty("updateTime")
   public Date getUpdateTime() {
      return this.updateTime;
   }
}
