package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpRtsIsvRtsCancelResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpRtsIsvRtsCancelRequest extends AbstractRequest implements JdRequest<EclpRtsIsvRtsCancelResponse> {
   private String eclpRtsNo;
   private String isvRtsNum;
   private String deptNo;
   private String deliveryMode;
   private String warehouseNo;
   private String supplierNo;
   private String receiver;
   private String receiverPhone;
   private String email;
   private String province;
   private String city;
   private String county;
   private String town;
   private String address;
   private String deptGoodsNo;
   private String goodsName;
   private String quantity;
   private String realQuantity;
   private String goodsStatus;

   public void setEclpRtsNo(String eclpRtsNo) {
      this.eclpRtsNo = eclpRtsNo;
   }

   public String getEclpRtsNo() {
      return this.eclpRtsNo;
   }

   public void setIsvRtsNum(String isvRtsNum) {
      this.isvRtsNum = isvRtsNum;
   }

   public String getIsvRtsNum() {
      return this.isvRtsNum;
   }

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
   }

   public void setDeliveryMode(String deliveryMode) {
      this.deliveryMode = deliveryMode;
   }

   public String getDeliveryMode() {
      return this.deliveryMode;
   }

   public void setWarehouseNo(String warehouseNo) {
      this.warehouseNo = warehouseNo;
   }

   public String getWarehouseNo() {
      return this.warehouseNo;
   }

   public void setSupplierNo(String supplierNo) {
      this.supplierNo = supplierNo;
   }

   public String getSupplierNo() {
      return this.supplierNo;
   }

   public void setReceiver(String receiver) {
      this.receiver = receiver;
   }

   public String getReceiver() {
      return this.receiver;
   }

   public void setReceiverPhone(String receiverPhone) {
      this.receiverPhone = receiverPhone;
   }

   public String getReceiverPhone() {
      return this.receiverPhone;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getEmail() {
      return this.email;
   }

   public void setProvince(String province) {
      this.province = province;
   }

   public String getProvince() {
      return this.province;
   }

   public void setCity(String city) {
      this.city = city;
   }

   public String getCity() {
      return this.city;
   }

   public void setCounty(String county) {
      this.county = county;
   }

   public String getCounty() {
      return this.county;
   }

   public void setTown(String town) {
      this.town = town;
   }

   public String getTown() {
      return this.town;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public String getAddress() {
      return this.address;
   }

   public void setDeptGoodsNo(String deptGoodsNo) {
      this.deptGoodsNo = deptGoodsNo;
   }

   public String getDeptGoodsNo() {
      return this.deptGoodsNo;
   }

   public void setGoodsName(String goodsName) {
      this.goodsName = goodsName;
   }

   public String getGoodsName() {
      return this.goodsName;
   }

   public void setQuantity(String quantity) {
      this.quantity = quantity;
   }

   public String getQuantity() {
      return this.quantity;
   }

   public void setRealQuantity(String realQuantity) {
      this.realQuantity = realQuantity;
   }

   public String getRealQuantity() {
      return this.realQuantity;
   }

   public void setGoodsStatus(String goodsStatus) {
      this.goodsStatus = goodsStatus;
   }

   public String getGoodsStatus() {
      return this.goodsStatus;
   }

   public String getApiMethod() {
      return "jingdong.eclp.rts.isvRtsCancel";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("eclpRtsNo", this.eclpRtsNo);
      pmap.put("isvRtsNum", this.isvRtsNum);
      pmap.put("deptNo", this.deptNo);
      pmap.put("deliveryMode", this.deliveryMode);
      pmap.put("warehouseNo", this.warehouseNo);
      pmap.put("supplierNo", this.supplierNo);
      pmap.put("receiver", this.receiver);
      pmap.put("receiverPhone", this.receiverPhone);
      pmap.put("email", this.email);
      pmap.put("province", this.province);
      pmap.put("city", this.city);
      pmap.put("county", this.county);
      pmap.put("town", this.town);
      pmap.put("address", this.address);
      pmap.put("deptGoodsNo", this.deptGoodsNo);
      pmap.put("goodsName", this.goodsName);
      pmap.put("quantity", this.quantity);
      pmap.put("realQuantity", this.realQuantity);
      pmap.put("goodsStatus", this.goodsStatus);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpRtsIsvRtsCancelResponse> getResponseClass() {
      return EclpRtsIsvRtsCancelResponse.class;
   }
}
