package com.jd.open.api.sdk.domain.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class WareAreaLimit implements Serializable {
   private Long wareId;
   private Long venderId;
   private Integer areaFid;
   private Integer lev;
   private Integer type;
   private String areaIds;
   private String created;
   private String modified;

   @JsonProperty("ware_id")
   public Long getWareId() {
      return this.wareId;
   }

   @JsonProperty("ware_id")
   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("vender_id")
   public Long getVenderId() {
      return this.venderId;
   }

   @JsonProperty("vender_id")
   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("area_fid")
   public Integer getAreaFid() {
      return this.areaFid;
   }

   @JsonProperty("area_fid")
   public void setAreaFid(Integer areaFid) {
      this.areaFid = areaFid;
   }

   @JsonProperty("lev")
   public Integer getLev() {
      return this.lev;
   }

   @JsonProperty("lev")
   public void setLev(Integer lev) {
      this.lev = lev;
   }

   @JsonProperty("type")
   public Integer getType() {
      return this.type;
   }

   @JsonProperty("type")
   public void setType(Integer type) {
      this.type = type;
   }

   @JsonProperty("area_ids")
   public String getAreaIds() {
      return this.areaIds;
   }

   @JsonProperty("area_ids")
   public void setAreaIds(String areaIds) {
      this.areaIds = areaIds;
   }

   @JsonProperty("created")
   public String getCreated() {
      return this.created;
   }

   @JsonProperty("created")
   public void setCreated(String created) {
      this.created = created;
   }

   @JsonProperty("modified")
   public String getModified() {
      return this.modified;
   }

   @JsonProperty("modified")
   public void setModified(String modified) {
      this.modified = modified;
   }
}
