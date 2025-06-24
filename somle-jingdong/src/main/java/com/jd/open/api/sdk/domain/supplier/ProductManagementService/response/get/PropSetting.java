package com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PropSetting implements Serializable {
   private Integer pid;
   private Integer vid;
   private String remark;
   private String vname;

   @JsonProperty("pid")
   public void setPid(Integer pid) {
      this.pid = pid;
   }

   @JsonProperty("pid")
   public Integer getPid() {
      return this.pid;
   }

   @JsonProperty("vid")
   public void setVid(Integer vid) {
      this.vid = vid;
   }

   @JsonProperty("vid")
   public Integer getVid() {
      return this.vid;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }

   @JsonProperty("vname")
   public void setVname(String vname) {
      this.vname = vname;
   }

   @JsonProperty("vname")
   public String getVname() {
      return this.vname;
   }
}
