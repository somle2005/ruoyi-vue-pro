package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpMasterInsertShopResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpMasterInsertShopRequest extends AbstractRequest implements JdRequest<EclpMasterInsertShopResponse> {
   private String isvShopNo;
   private String spSourceNo;
   private String deptNo;
   private String spShopNo;
   private String shopName;
   private String contacts;
   private String phone;
   private String address;
   private String email;
   private String fax;
   private String afterSaleContacts;
   private String afterSaleAddress;
   private String afterSalePhone;
   private String bdOwnerNo;
   private String reserve1;
   private String reserve2;
   private String reserve3;
   private String reserve4;
   private String reserve5;
   private String reserve6;
   private String reserve7;
   private String reserve8;
   private String reserve9;
   private String reserve10;
   private String outstoreRules;

   public void setIsvShopNo(String isvShopNo) {
      this.isvShopNo = isvShopNo;
   }

   public String getIsvShopNo() {
      return this.isvShopNo;
   }

   public void setSpSourceNo(String spSourceNo) {
      this.spSourceNo = spSourceNo;
   }

   public String getSpSourceNo() {
      return this.spSourceNo;
   }

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
   }

   public void setSpShopNo(String spShopNo) {
      this.spShopNo = spShopNo;
   }

   public String getSpShopNo() {
      return this.spShopNo;
   }

   public void setShopName(String shopName) {
      this.shopName = shopName;
   }

   public String getShopName() {
      return this.shopName;
   }

   public void setContacts(String contacts) {
      this.contacts = contacts;
   }

   public String getContacts() {
      return this.contacts;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }

   public String getPhone() {
      return this.phone;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public String getAddress() {
      return this.address;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getEmail() {
      return this.email;
   }

   public void setFax(String fax) {
      this.fax = fax;
   }

   public String getFax() {
      return this.fax;
   }

   public void setAfterSaleContacts(String afterSaleContacts) {
      this.afterSaleContacts = afterSaleContacts;
   }

   public String getAfterSaleContacts() {
      return this.afterSaleContacts;
   }

   public void setAfterSaleAddress(String afterSaleAddress) {
      this.afterSaleAddress = afterSaleAddress;
   }

   public String getAfterSaleAddress() {
      return this.afterSaleAddress;
   }

   public void setAfterSalePhone(String afterSalePhone) {
      this.afterSalePhone = afterSalePhone;
   }

   public String getAfterSalePhone() {
      return this.afterSalePhone;
   }

   public void setBdOwnerNo(String bdOwnerNo) {
      this.bdOwnerNo = bdOwnerNo;
   }

   public String getBdOwnerNo() {
      return this.bdOwnerNo;
   }

   public void setReserve1(String reserve1) {
      this.reserve1 = reserve1;
   }

   public String getReserve1() {
      return this.reserve1;
   }

   public void setReserve2(String reserve2) {
      this.reserve2 = reserve2;
   }

   public String getReserve2() {
      return this.reserve2;
   }

   public void setReserve3(String reserve3) {
      this.reserve3 = reserve3;
   }

   public String getReserve3() {
      return this.reserve3;
   }

   public void setReserve4(String reserve4) {
      this.reserve4 = reserve4;
   }

   public String getReserve4() {
      return this.reserve4;
   }

   public void setReserve5(String reserve5) {
      this.reserve5 = reserve5;
   }

   public String getReserve5() {
      return this.reserve5;
   }

   public void setReserve6(String reserve6) {
      this.reserve6 = reserve6;
   }

   public String getReserve6() {
      return this.reserve6;
   }

   public void setReserve7(String reserve7) {
      this.reserve7 = reserve7;
   }

   public String getReserve7() {
      return this.reserve7;
   }

   public void setReserve8(String reserve8) {
      this.reserve8 = reserve8;
   }

   public String getReserve8() {
      return this.reserve8;
   }

   public void setReserve9(String reserve9) {
      this.reserve9 = reserve9;
   }

   public String getReserve9() {
      return this.reserve9;
   }

   public void setReserve10(String reserve10) {
      this.reserve10 = reserve10;
   }

   public String getReserve10() {
      return this.reserve10;
   }

   public void setOutstoreRules(String outstoreRules) {
      this.outstoreRules = outstoreRules;
   }

   public String getOutstoreRules() {
      return this.outstoreRules;
   }

   public String getApiMethod() {
      return "jingdong.eclp.master.insertShop";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("isvShopNo", this.isvShopNo);
      pmap.put("spSourceNo", this.spSourceNo);
      pmap.put("deptNo", this.deptNo);
      pmap.put("spShopNo", this.spShopNo);
      pmap.put("shopName", this.shopName);
      pmap.put("contacts", this.contacts);
      pmap.put("phone", this.phone);
      pmap.put("address", this.address);
      pmap.put("email", this.email);
      pmap.put("fax", this.fax);
      pmap.put("afterSaleContacts", this.afterSaleContacts);
      pmap.put("afterSaleAddress", this.afterSaleAddress);
      pmap.put("afterSalePhone", this.afterSalePhone);
      pmap.put("bdOwnerNo", this.bdOwnerNo);
      pmap.put("reserve1", this.reserve1);
      pmap.put("reserve2", this.reserve2);
      pmap.put("reserve3", this.reserve3);
      pmap.put("reserve4", this.reserve4);
      pmap.put("reserve5", this.reserve5);
      pmap.put("reserve6", this.reserve6);
      pmap.put("reserve7", this.reserve7);
      pmap.put("reserve8", this.reserve8);
      pmap.put("reserve9", this.reserve9);
      pmap.put("reserve10", this.reserve10);
      pmap.put("outstoreRules", this.outstoreRules);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpMasterInsertShopResponse> getResponseClass() {
      return EclpMasterInsertShopResponse.class;
   }
}
