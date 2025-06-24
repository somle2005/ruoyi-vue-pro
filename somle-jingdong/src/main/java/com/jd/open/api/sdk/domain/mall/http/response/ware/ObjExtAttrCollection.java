package com.jd.open.api.sdk.domain.mall.http.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ObjExtAttrCollection implements Serializable {
   private String expandsortid;
   private String expandsortname;
   private String sortorder;
   private String valueid;
   private String valuename;

   @JsonProperty("expandsortid")
   public void setExpandsortid(String expandsortid) {
      this.expandsortid = expandsortid;
   }

   @JsonProperty("expandsortid")
   public String getExpandsortid() {
      return this.expandsortid;
   }

   @JsonProperty("expandsortname")
   public void setExpandsortname(String expandsortname) {
      this.expandsortname = expandsortname;
   }

   @JsonProperty("expandsortname")
   public String getExpandsortname() {
      return this.expandsortname;
   }

   @JsonProperty("sortorder")
   public void setSortorder(String sortorder) {
      this.sortorder = sortorder;
   }

   @JsonProperty("sortorder")
   public String getSortorder() {
      return this.sortorder;
   }

   @JsonProperty("valueid")
   public void setValueid(String valueid) {
      this.valueid = valueid;
   }

   @JsonProperty("valueid")
   public String getValueid() {
      return this.valueid;
   }

   @JsonProperty("valuename")
   public void setValuename(String valuename) {
      this.valuename = valuename;
   }

   @JsonProperty("valuename")
   public String getValuename() {
      return this.valuename;
   }
}
