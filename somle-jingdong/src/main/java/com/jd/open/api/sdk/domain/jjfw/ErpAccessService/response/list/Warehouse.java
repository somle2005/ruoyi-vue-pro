package com.jd.open.api.sdk.domain.jjfw.ErpAccessService.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class Warehouse implements Serializable {
   private String warehouseName;
   private String phone;
   private String address;
   private Date createDate;
   private Integer stat;
   private String man;

   @JsonProperty("warehouseName")
   public void setWarehouseName(String warehouseName) {
      this.warehouseName = warehouseName;
   }

   @JsonProperty("warehouseName")
   public String getWarehouseName() {
      return this.warehouseName;
   }

   @JsonProperty("phone")
   public void setPhone(String phone) {
      this.phone = phone;
   }

   @JsonProperty("phone")
   public String getPhone() {
      return this.phone;
   }

   @JsonProperty("address")
   public void setAddress(String address) {
      this.address = address;
   }

   @JsonProperty("address")
   public String getAddress() {
      return this.address;
   }

   @JsonProperty("createDate")
   public void setCreateDate(Date createDate) {
      this.createDate = createDate;
   }

   @JsonProperty("createDate")
   public Date getCreateDate() {
      return this.createDate;
   }

   @JsonProperty("stat")
   public void setStat(Integer stat) {
      this.stat = stat;
   }

   @JsonProperty("stat")
   public Integer getStat() {
      return this.stat;
   }

   @JsonProperty("man")
   public void setMan(String man) {
      this.man = man;
   }

   @JsonProperty("man")
   public String getMan() {
      return this.man;
   }
}
