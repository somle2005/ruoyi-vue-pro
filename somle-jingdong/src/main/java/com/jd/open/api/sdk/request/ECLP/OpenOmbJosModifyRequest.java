package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.OpenOmbJosModifyResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class OpenOmbJosModifyRequest extends AbstractRequest implements JdRequest<OpenOmbJosModifyResponse> {
   private String vendorCode;
   private Double weight;
   private String receiveTownName;
   private String receiveCityName;
   private String operateTime;
   private String receiveTel;
   private String receiveMobile;
   private String receiveCountyName;
   private Integer receiveProvinceId;
   private Integer receiveTownId;
   private String operateUser;
   private String waybillCode;
   private String deptNo;
   private String orderNo;
   private Double volume;
   private String receiveName;
   private String receiveProvinceName;
   private String senderStation;
   private String deliverStation;
   private String receiveAddress;
   private Integer receiveCityId;
   private Integer receiveCountyId;
   private String pickupStartTime;
   private String pickupEndTime;

   public void setVendorCode(String vendorCode) {
      this.vendorCode = vendorCode;
   }

   public String getVendorCode() {
      return this.vendorCode;
   }

   public void setWeight(Double weight) {
      this.weight = weight;
   }

   public Double getWeight() {
      return this.weight;
   }

   public void setReceiveTownName(String receiveTownName) {
      this.receiveTownName = receiveTownName;
   }

   public String getReceiveTownName() {
      return this.receiveTownName;
   }

   public void setReceiveCityName(String receiveCityName) {
      this.receiveCityName = receiveCityName;
   }

   public String getReceiveCityName() {
      return this.receiveCityName;
   }

   public void setOperateTime(String operateTime) {
      this.operateTime = operateTime;
   }

   public String getOperateTime() {
      return this.operateTime;
   }

   public void setReceiveTel(String receiveTel) {
      this.receiveTel = receiveTel;
   }

   public String getReceiveTel() {
      return this.receiveTel;
   }

   public void setReceiveMobile(String receiveMobile) {
      this.receiveMobile = receiveMobile;
   }

   public String getReceiveMobile() {
      return this.receiveMobile;
   }

   public void setReceiveCountyName(String receiveCountyName) {
      this.receiveCountyName = receiveCountyName;
   }

   public String getReceiveCountyName() {
      return this.receiveCountyName;
   }

   public void setReceiveProvinceId(Integer receiveProvinceId) {
      this.receiveProvinceId = receiveProvinceId;
   }

   public Integer getReceiveProvinceId() {
      return this.receiveProvinceId;
   }

   public void setReceiveTownId(Integer receiveTownId) {
      this.receiveTownId = receiveTownId;
   }

   public Integer getReceiveTownId() {
      return this.receiveTownId;
   }

   public void setOperateUser(String operateUser) {
      this.operateUser = operateUser;
   }

   public String getOperateUser() {
      return this.operateUser;
   }

   public void setWaybillCode(String waybillCode) {
      this.waybillCode = waybillCode;
   }

   public String getWaybillCode() {
      return this.waybillCode;
   }

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
   }

   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   public String getOrderNo() {
      return this.orderNo;
   }

   public void setVolume(Double volume) {
      this.volume = volume;
   }

   public Double getVolume() {
      return this.volume;
   }

   public void setReceiveName(String receiveName) {
      this.receiveName = receiveName;
   }

   public String getReceiveName() {
      return this.receiveName;
   }

   public void setReceiveProvinceName(String receiveProvinceName) {
      this.receiveProvinceName = receiveProvinceName;
   }

   public String getReceiveProvinceName() {
      return this.receiveProvinceName;
   }

   public void setSenderStation(String senderStation) {
      this.senderStation = senderStation;
   }

   public String getSenderStation() {
      return this.senderStation;
   }

   public void setDeliverStation(String deliverStation) {
      this.deliverStation = deliverStation;
   }

   public String getDeliverStation() {
      return this.deliverStation;
   }

   public void setReceiveAddress(String receiveAddress) {
      this.receiveAddress = receiveAddress;
   }

   public String getReceiveAddress() {
      return this.receiveAddress;
   }

   public void setReceiveCityId(Integer receiveCityId) {
      this.receiveCityId = receiveCityId;
   }

   public Integer getReceiveCityId() {
      return this.receiveCityId;
   }

   public void setReceiveCountyId(Integer receiveCountyId) {
      this.receiveCountyId = receiveCountyId;
   }

   public Integer getReceiveCountyId() {
      return this.receiveCountyId;
   }

   public void setPickupStartTime(String pickupStartTime) {
      this.pickupStartTime = pickupStartTime;
   }

   public String getPickupStartTime() {
      return this.pickupStartTime;
   }

   public void setPickupEndTime(String pickupEndTime) {
      this.pickupEndTime = pickupEndTime;
   }

   public String getPickupEndTime() {
      return this.pickupEndTime;
   }

   public String getApiMethod() {
      return "jingdong.open.omb.jos.modify";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("vendorCode", this.vendorCode);
      pmap.put("weight", this.weight);
      pmap.put("receiveTownName", this.receiveTownName);
      pmap.put("receiveCityName", this.receiveCityName);
      pmap.put("operateTime", this.operateTime);
      pmap.put("receiveTel", this.receiveTel);
      pmap.put("receiveMobile", this.receiveMobile);
      pmap.put("receiveCountyName", this.receiveCountyName);
      pmap.put("receiveProvinceId", this.receiveProvinceId);
      pmap.put("receiveTownId", this.receiveTownId);
      pmap.put("operateUser", this.operateUser);
      pmap.put("waybillCode", this.waybillCode);
      pmap.put("deptNo", this.deptNo);
      pmap.put("orderNo", this.orderNo);
      pmap.put("volume", this.volume);
      pmap.put("receiveName", this.receiveName);
      pmap.put("receiveProvinceName", this.receiveProvinceName);
      pmap.put("senderStation", this.senderStation);
      pmap.put("deliverStation", this.deliverStation);
      pmap.put("receiveAddress", this.receiveAddress);
      pmap.put("receiveCityId", this.receiveCityId);
      pmap.put("receiveCountyId", this.receiveCountyId);
      pmap.put("pickupStartTime", this.pickupStartTime);
      pmap.put("pickupEndTime", this.pickupEndTime);
      return JsonUtil.toJson(pmap);
   }

   public Class<OpenOmbJosModifyResponse> getResponseClass() {
      return OpenOmbJosModifyResponse.class;
   }
}
