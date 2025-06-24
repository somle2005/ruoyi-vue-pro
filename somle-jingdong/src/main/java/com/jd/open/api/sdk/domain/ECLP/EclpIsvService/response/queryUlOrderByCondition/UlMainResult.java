package com.jd.open.api.sdk.domain.ECLP.EclpIsvService.response.queryUlOrderByCondition;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class UlMainResult implements Serializable {
   private String ulNo;
   private String outUlNo;
   private Byte status;
   private String deptNo;
   private Byte deliveryMode;
   private String warehouseNo;
   private Byte ulType;
   private Byte allowLackDest;
   private Byte allowReturnDest;
   private Byte destMethod;
   private Byte destReason;
   private String destCompNo;
   private String receiver;
   private String receiverPhone;
   private String email;
   private String province;
   private String city;
   private String county;
   private String town;
   private String address;
   private String backEmail;
   private String remark;
   private String createUser;
   private List<UlItemResult> ulItemResultList;

   @JsonProperty("ulNo")
   public void setUlNo(String ulNo) {
      this.ulNo = ulNo;
   }

   @JsonProperty("ulNo")
   public String getUlNo() {
      return this.ulNo;
   }

   @JsonProperty("outUlNo")
   public void setOutUlNo(String outUlNo) {
      this.outUlNo = outUlNo;
   }

   @JsonProperty("outUlNo")
   public String getOutUlNo() {
      return this.outUlNo;
   }

   @JsonProperty("status")
   public void setStatus(Byte status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Byte getStatus() {
      return this.status;
   }

   @JsonProperty("deptNo")
   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   @JsonProperty("deptNo")
   public String getDeptNo() {
      return this.deptNo;
   }

   @JsonProperty("deliveryMode")
   public void setDeliveryMode(Byte deliveryMode) {
      this.deliveryMode = deliveryMode;
   }

   @JsonProperty("deliveryMode")
   public Byte getDeliveryMode() {
      return this.deliveryMode;
   }

   @JsonProperty("warehouseNo")
   public void setWarehouseNo(String warehouseNo) {
      this.warehouseNo = warehouseNo;
   }

   @JsonProperty("warehouseNo")
   public String getWarehouseNo() {
      return this.warehouseNo;
   }

   @JsonProperty("ulType")
   public void setUlType(Byte ulType) {
      this.ulType = ulType;
   }

   @JsonProperty("ulType")
   public Byte getUlType() {
      return this.ulType;
   }

   @JsonProperty("allowLackDest")
   public void setAllowLackDest(Byte allowLackDest) {
      this.allowLackDest = allowLackDest;
   }

   @JsonProperty("allowLackDest")
   public Byte getAllowLackDest() {
      return this.allowLackDest;
   }

   @JsonProperty("allowReturnDest")
   public void setAllowReturnDest(Byte allowReturnDest) {
      this.allowReturnDest = allowReturnDest;
   }

   @JsonProperty("allowReturnDest")
   public Byte getAllowReturnDest() {
      return this.allowReturnDest;
   }

   @JsonProperty("destMethod")
   public void setDestMethod(Byte destMethod) {
      this.destMethod = destMethod;
   }

   @JsonProperty("destMethod")
   public Byte getDestMethod() {
      return this.destMethod;
   }

   @JsonProperty("destReason")
   public void setDestReason(Byte destReason) {
      this.destReason = destReason;
   }

   @JsonProperty("destReason")
   public Byte getDestReason() {
      return this.destReason;
   }

   @JsonProperty("destCompNo")
   public void setDestCompNo(String destCompNo) {
      this.destCompNo = destCompNo;
   }

   @JsonProperty("destCompNo")
   public String getDestCompNo() {
      return this.destCompNo;
   }

   @JsonProperty("receiver")
   public void setReceiver(String receiver) {
      this.receiver = receiver;
   }

   @JsonProperty("receiver")
   public String getReceiver() {
      return this.receiver;
   }

   @JsonProperty("receiverPhone")
   public void setReceiverPhone(String receiverPhone) {
      this.receiverPhone = receiverPhone;
   }

   @JsonProperty("receiverPhone")
   public String getReceiverPhone() {
      return this.receiverPhone;
   }

   @JsonProperty("email")
   public void setEmail(String email) {
      this.email = email;
   }

   @JsonProperty("email")
   public String getEmail() {
      return this.email;
   }

   @JsonProperty("province")
   public void setProvince(String province) {
      this.province = province;
   }

   @JsonProperty("province")
   public String getProvince() {
      return this.province;
   }

   @JsonProperty("city")
   public void setCity(String city) {
      this.city = city;
   }

   @JsonProperty("city")
   public String getCity() {
      return this.city;
   }

   @JsonProperty("county")
   public void setCounty(String county) {
      this.county = county;
   }

   @JsonProperty("county")
   public String getCounty() {
      return this.county;
   }

   @JsonProperty("town")
   public void setTown(String town) {
      this.town = town;
   }

   @JsonProperty("town")
   public String getTown() {
      return this.town;
   }

   @JsonProperty("address")
   public void setAddress(String address) {
      this.address = address;
   }

   @JsonProperty("address")
   public String getAddress() {
      return this.address;
   }

   @JsonProperty("backEmail")
   public void setBackEmail(String backEmail) {
      this.backEmail = backEmail;
   }

   @JsonProperty("backEmail")
   public String getBackEmail() {
      return this.backEmail;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }

   @JsonProperty("createUser")
   public void setCreateUser(String createUser) {
      this.createUser = createUser;
   }

   @JsonProperty("createUser")
   public String getCreateUser() {
      return this.createUser;
   }

   @JsonProperty("ulItemResultList")
   public void setUlItemResultList(List<UlItemResult> ulItemResultList) {
      this.ulItemResultList = ulItemResultList;
   }

   @JsonProperty("ulItemResultList")
   public List<UlItemResult> getUlItemResultList() {
      return this.ulItemResultList;
   }
}
