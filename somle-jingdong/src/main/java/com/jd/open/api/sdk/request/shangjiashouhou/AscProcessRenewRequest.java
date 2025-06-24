package com.jd.open.api.sdk.request.shangjiashouhou;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.shangjiashouhou.AscProcessRenewResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class AscProcessRenewRequest extends AbstractRequest implements JdRequest<AscProcessRenewResponse> {
   private String buId;
   private String operatePin;
   private String operateNick;
   private String operateRemark;
   private Long serviceId;
   private Long orderId;
   private Integer sysVersion;
   private String consigneeName;
   private Integer provinceCode;
   private Integer cityCode;
   private Integer countyCode;
   private Integer villageCode;
   private String detailAddress;
   private String consigneeTel;
   private String applyDescription;
   private Integer deliveryCenterId;
   private String deliveryCenterName;
   private Integer storeId;
   private Boolean collectFreightFlag;
   private String freightAmount;
   private String skuId;
   private String wareName;
   private String wareNum;
   private String relationSkuId;
   private String relationWareType;
   private String extJsonStr;
   private String oaid;
   private String openIdSeller;
   private String xidSeller;

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

   public void setConsigneeTel(String consigneeTel) {
      this.consigneeTel = consigneeTel;
   }

   public String getConsigneeTel() {
      return this.consigneeTel;
   }

   public void setApplyDescription(String applyDescription) {
      this.applyDescription = applyDescription;
   }

   public String getApplyDescription() {
      return this.applyDescription;
   }

   public void setDeliveryCenterId(Integer deliveryCenterId) {
      this.deliveryCenterId = deliveryCenterId;
   }

   public Integer getDeliveryCenterId() {
      return this.deliveryCenterId;
   }

   public void setDeliveryCenterName(String deliveryCenterName) {
      this.deliveryCenterName = deliveryCenterName;
   }

   public String getDeliveryCenterName() {
      return this.deliveryCenterName;
   }

   public void setStoreId(Integer storeId) {
      this.storeId = storeId;
   }

   public Integer getStoreId() {
      return this.storeId;
   }

   public void setCollectFreightFlag(Boolean collectFreightFlag) {
      this.collectFreightFlag = collectFreightFlag;
   }

   public Boolean getCollectFreightFlag() {
      return this.collectFreightFlag;
   }

   public void setFreightAmount(String freightAmount) {
      this.freightAmount = freightAmount;
   }

   public String getFreightAmount() {
      return this.freightAmount;
   }

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public String getSkuId() {
      return this.skuId;
   }

   public void setWareName(String wareName) {
      this.wareName = wareName;
   }

   public String getWareName() {
      return this.wareName;
   }

   public void setWareNum(String wareNum) {
      this.wareNum = wareNum;
   }

   public String getWareNum() {
      return this.wareNum;
   }

   public void setRelationSkuId(String relationSkuId) {
      this.relationSkuId = relationSkuId;
   }

   public String getRelationSkuId() {
      return this.relationSkuId;
   }

   public void setRelationWareType(String relationWareType) {
      this.relationWareType = relationWareType;
   }

   public String getRelationWareType() {
      return this.relationWareType;
   }

   public void setExtJsonStr(String extJsonStr) {
      this.extJsonStr = extJsonStr;
   }

   public String getExtJsonStr() {
      return this.extJsonStr;
   }

   public void setOaid(String oaid) {
      this.oaid = oaid;
   }

   public String getOaid() {
      return this.oaid;
   }

   public void setOpenIdSeller(String openIdSeller) {
      this.openIdSeller = openIdSeller;
   }

   public String getOpenIdSeller() {
      return this.openIdSeller;
   }

   public void setXidSeller(String xidSeller) {
      this.xidSeller = xidSeller;
   }

   public String getXidSeller() {
      return this.xidSeller;
   }

   public String getApiMethod() {
      return "jingdong.asc.process.renew";
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
      pmap.put("provinceCode", this.provinceCode);
      pmap.put("cityCode", this.cityCode);
      pmap.put("countyCode", this.countyCode);
      pmap.put("villageCode", this.villageCode);
      pmap.put("detailAddress", this.detailAddress);
      pmap.put("consigneeTel", this.consigneeTel);
      pmap.put("applyDescription", this.applyDescription);
      pmap.put("deliveryCenterId", this.deliveryCenterId);
      pmap.put("deliveryCenterName", this.deliveryCenterName);
      pmap.put("storeId", this.storeId);
      pmap.put("collectFreightFlag", this.collectFreightFlag);
      pmap.put("freightAmount", this.freightAmount);
      pmap.put("skuId", this.skuId);
      pmap.put("wareName", this.wareName);
      pmap.put("wareNum", this.wareNum);
      pmap.put("relationSkuId", this.relationSkuId);
      pmap.put("relationWareType", this.relationWareType);
      pmap.put("extJsonStr", this.extJsonStr);
      pmap.put("oaid", this.oaid);
      pmap.put("open_id_seller", this.openIdSeller);
      pmap.put("xid_seller", this.xidSeller);
      return JsonUtil.toJson(pmap);
   }

   public Class<AscProcessRenewResponse> getResponseClass() {
      return AscProcessRenewResponse.class;
   }
}
