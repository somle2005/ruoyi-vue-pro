package com.jd.open.api.sdk.request.shangjiashouhou;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.shangjiashouhou.AscProcessBackResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class AscProcessBackRequest extends AbstractRequest implements JdRequest<AscProcessBackResponse> {
   private String buId;
   private String operatePin;
   private String operateNick;
   private String operateRemark;
   private Long serviceId;
   private Long orderId;
   private Integer sysVersion;
   private String consigneeName;
   private String consigneeTel;
   private Integer provinceCode;
   private Integer cityCode;
   private Integer countyCode;
   private Integer villageCode;
   private String detailAddress;
   private Integer repairState;
   private String applyRemark;
   private Integer shipWayId;
   private String shipWayName;
   private String expressCode;
   private String partCodes;
   private String extJsonStr;
   private Integer wareNum;
   private String oaid;

   public void setBuId(String buId) {
      this.buId = buId;
   }

   public String getBuId() {
      return this.buId;
   }

   public void setOperatePin(String operatePin) {
      this.operatePin = operatePin;
   }

   public String getOperatePin() {
      return this.operatePin;
   }

   public void setOperateNick(String operateNick) {
      this.operateNick = operateNick;
   }

   public String getOperateNick() {
      return this.operateNick;
   }

   public void setOperateRemark(String operateRemark) {
      this.operateRemark = operateRemark;
   }

   public String getOperateRemark() {
      return this.operateRemark;
   }

   public void setServiceId(Long serviceId) {
      this.serviceId = serviceId;
   }

   public Long getServiceId() {
      return this.serviceId;
   }

   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public Long getOrderId() {
      return this.orderId;
   }

   public void setSysVersion(Integer sysVersion) {
      this.sysVersion = sysVersion;
   }

   public Integer getSysVersion() {
      return this.sysVersion;
   }

   public void setConsigneeName(String consigneeName) {
      this.consigneeName = consigneeName;
   }

   public String getConsigneeName() {
      return this.consigneeName;
   }

   public void setConsigneeTel(String consigneeTel) {
      this.consigneeTel = consigneeTel;
   }

   public String getConsigneeTel() {
      return this.consigneeTel;
   }

   public void setProvinceCode(Integer provinceCode) {
      this.provinceCode = provinceCode;
   }

   public Integer getProvinceCode() {
      return this.provinceCode;
   }

   public void setCityCode(Integer cityCode) {
      this.cityCode = cityCode;
   }

   public Integer getCityCode() {
      return this.cityCode;
   }

   public void setCountyCode(Integer countyCode) {
      this.countyCode = countyCode;
   }

   public Integer getCountyCode() {
      return this.countyCode;
   }

   public void setVillageCode(Integer villageCode) {
      this.villageCode = villageCode;
   }

   public Integer getVillageCode() {
      return this.villageCode;
   }

   public void setDetailAddress(String detailAddress) {
      this.detailAddress = detailAddress;
   }

   public String getDetailAddress() {
      return this.detailAddress;
   }

   public void setRepairState(Integer repairState) {
      this.repairState = repairState;
   }

   public Integer getRepairState() {
      return this.repairState;
   }

   public void setApplyRemark(String applyRemark) {
      this.applyRemark = applyRemark;
   }

   public String getApplyRemark() {
      return this.applyRemark;
   }

   public void setShipWayId(Integer shipWayId) {
      this.shipWayId = shipWayId;
   }

   public Integer getShipWayId() {
      return this.shipWayId;
   }

   public void setShipWayName(String shipWayName) {
      this.shipWayName = shipWayName;
   }

   public String getShipWayName() {
      return this.shipWayName;
   }

   public void setExpressCode(String expressCode) {
      this.expressCode = expressCode;
   }

   public String getExpressCode() {
      return this.expressCode;
   }

   public void setPartCodes(String partCodes) {
      this.partCodes = partCodes;
   }

   public String getPartCodes() {
      return this.partCodes;
   }

   public void setExtJsonStr(String extJsonStr) {
      this.extJsonStr = extJsonStr;
   }

   public String getExtJsonStr() {
      return this.extJsonStr;
   }

   public void setWareNum(Integer wareNum) {
      this.wareNum = wareNum;
   }

   public Integer getWareNum() {
      return this.wareNum;
   }

   public void setOaid(String oaid) {
      this.oaid = oaid;
   }

   public String getOaid() {
      return this.oaid;
   }

   public String getApiMethod() {
      return "jingdong.asc.process.back";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("buId", this.buId);
      pmap.put("operatePin", this.operatePin);
      pmap.put("operateNick", this.operateNick);
      pmap.put("operateRemark", this.operateRemark);
      pmap.put("serviceId", this.serviceId);
      pmap.put("orderId", this.orderId);
      pmap.put("sysVersion", this.sysVersion);
      pmap.put("consigneeName", this.consigneeName);
      pmap.put("consigneeTel", this.consigneeTel);
      pmap.put("provinceCode", this.provinceCode);
      pmap.put("cityCode", this.cityCode);
      pmap.put("countyCode", this.countyCode);
      pmap.put("villageCode", this.villageCode);
      pmap.put("detailAddress", this.detailAddress);
      pmap.put("repairState", this.repairState);
      pmap.put("applyRemark", this.applyRemark);
      pmap.put("shipWayId", this.shipWayId);
      pmap.put("shipWayName", this.shipWayName);
      pmap.put("expressCode", this.expressCode);
      pmap.put("partCodes", this.partCodes);
      pmap.put("extJsonStr", this.extJsonStr);
      pmap.put("wareNum", this.wareNum);
      pmap.put("oaid", this.oaid);
      return JsonUtil.toJson(pmap);
   }

   public Class<AscProcessBackResponse> getResponseClass() {
      return AscProcessBackResponse.class;
   }
}
