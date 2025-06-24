package com.jd.open.api.sdk.request.wujiemiandan;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.wujiemiandan.LdopAlphaWaybillAppendreceiveResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class LdopAlphaWaybillAppendreceiveRequest extends AbstractRequest implements JdRequest<LdopAlphaWaybillAppendreceiveResponse> {
   private String attribute1;
   private String parentWaybillCode;
   private String providerCode;
   private Integer signReturn;
   private String source;
   private Integer receiveTimeType;
   private String vendorCode;
   private Date promiseCompleteTime;
   private Integer payType;
   private Boolean needGuarantee;
   private String pin;
   private String appKey;
   private String goodsName;
   private BigDecimal height;
   private String expressType;
   private BigDecimal weight;
   private String vendorName;
   private String branchCode;
   private BigDecimal volume;
   private BigDecimal guaranteeMoney;
   private Integer transType;
   private String vendorOrderCode;
   private String remark;
   private String idNumber;
   private String warehouseCode;
   private String expressPayMethod;
   private Integer waybillType;
   private String salePlatform;
   private String addedService;
   private Integer providerId;
   private BigDecimal length;
   private Integer waybillCount;
   private Date pickUpStartTime;
   private Integer promiseTimeType;
   private String settlementCode;
   private BigDecimal shouldPayMoney;
   private BigDecimal goodsMoney;
   private Date createTime;
   private String platformOrderNo;
   private Integer coldChainType;
   private Date pickUpEndTime;
   private BigDecimal width;

   public void setAttribute1(String attribute1) {
      this.attribute1 = attribute1;
   }

   public String getAttribute1() {
      return this.attribute1;
   }

   public void setParentWaybillCode(String parentWaybillCode) {
      this.parentWaybillCode = parentWaybillCode;
   }

   public String getParentWaybillCode() {
      return this.parentWaybillCode;
   }

   public void setProviderCode(String providerCode) {
      this.providerCode = providerCode;
   }

   public String getProviderCode() {
      return this.providerCode;
   }

   public void setSignReturn(Integer signReturn) {
      this.signReturn = signReturn;
   }

   public Integer getSignReturn() {
      return this.signReturn;
   }

   public void setSource(String source) {
      this.source = source;
   }

   public String getSource() {
      return this.source;
   }

   public void setReceiveTimeType(Integer receiveTimeType) {
      this.receiveTimeType = receiveTimeType;
   }

   public Integer getReceiveTimeType() {
      return this.receiveTimeType;
   }

   public void setVendorCode(String vendorCode) {
      this.vendorCode = vendorCode;
   }

   public String getVendorCode() {
      return this.vendorCode;
   }

   public void setPromiseCompleteTime(Date promiseCompleteTime) {
      this.promiseCompleteTime = promiseCompleteTime;
   }

   public Date getPromiseCompleteTime() {
      return this.promiseCompleteTime;
   }

   public void setPayType(Integer payType) {
      this.payType = payType;
   }

   public Integer getPayType() {
      return this.payType;
   }

   public void setNeedGuarantee(Boolean needGuarantee) {
      this.needGuarantee = needGuarantee;
   }

   public Boolean getNeedGuarantee() {
      return this.needGuarantee;
   }

   public void setPin(String pin) {
      this.pin = pin;
   }

   public String getPin() {
      return this.pin;
   }

   public void setAppKey(String appKey) {
      this.appKey = appKey;
   }

   public String getAppKey() {
      return this.appKey;
   }

   public void setGoodsName(String goodsName) {
      this.goodsName = goodsName;
   }

   public String getGoodsName() {
      return this.goodsName;
   }

   public void setHeight(BigDecimal height) {
      this.height = height;
   }

   public BigDecimal getHeight() {
      return this.height;
   }

   public void setExpressType(String expressType) {
      this.expressType = expressType;
   }

   public String getExpressType() {
      return this.expressType;
   }

   public void setWeight(BigDecimal weight) {
      this.weight = weight;
   }

   public BigDecimal getWeight() {
      return this.weight;
   }

   public void setVendorName(String vendorName) {
      this.vendorName = vendorName;
   }

   public String getVendorName() {
      return this.vendorName;
   }

   public void setBranchCode(String branchCode) {
      this.branchCode = branchCode;
   }

   public String getBranchCode() {
      return this.branchCode;
   }

   public void setVolume(BigDecimal volume) {
      this.volume = volume;
   }

   public BigDecimal getVolume() {
      return this.volume;
   }

   public void setGuaranteeMoney(BigDecimal guaranteeMoney) {
      this.guaranteeMoney = guaranteeMoney;
   }

   public BigDecimal getGuaranteeMoney() {
      return this.guaranteeMoney;
   }

   public void setTransType(Integer transType) {
      this.transType = transType;
   }

   public Integer getTransType() {
      return this.transType;
   }

   public void setVendorOrderCode(String vendorOrderCode) {
      this.vendorOrderCode = vendorOrderCode;
   }

   public String getVendorOrderCode() {
      return this.vendorOrderCode;
   }

   public void setRemark(String remark) {
      this.remark = remark;
   }

   public String getRemark() {
      return this.remark;
   }

   public void setIdNumber(String idNumber) {
      this.idNumber = idNumber;
   }

   public String getIdNumber() {
      return this.idNumber;
   }

   public void setWarehouseCode(String warehouseCode) {
      this.warehouseCode = warehouseCode;
   }

   public String getWarehouseCode() {
      return this.warehouseCode;
   }

   public void setExpressPayMethod(String expressPayMethod) {
      this.expressPayMethod = expressPayMethod;
   }

   public String getExpressPayMethod() {
      return this.expressPayMethod;
   }

   public void setWaybillType(Integer waybillType) {
      this.waybillType = waybillType;
   }

   public Integer getWaybillType() {
      return this.waybillType;
   }

   public void setSalePlatform(String salePlatform) {
      this.salePlatform = salePlatform;
   }

   public String getSalePlatform() {
      return this.salePlatform;
   }

   public void setAddedService(String addedService) {
      this.addedService = addedService;
   }

   public String getAddedService() {
      return this.addedService;
   }

   public void setProviderId(Integer providerId) {
      this.providerId = providerId;
   }

   public Integer getProviderId() {
      return this.providerId;
   }

   public void setLength(BigDecimal length) {
      this.length = length;
   }

   public BigDecimal getLength() {
      return this.length;
   }

   public void setWaybillCount(Integer waybillCount) {
      this.waybillCount = waybillCount;
   }

   public Integer getWaybillCount() {
      return this.waybillCount;
   }

   public void setPickUpStartTime(Date pickUpStartTime) {
      this.pickUpStartTime = pickUpStartTime;
   }

   public Date getPickUpStartTime() {
      return this.pickUpStartTime;
   }

   public void setPromiseTimeType(Integer promiseTimeType) {
      this.promiseTimeType = promiseTimeType;
   }

   public Integer getPromiseTimeType() {
      return this.promiseTimeType;
   }

   public void setSettlementCode(String settlementCode) {
      this.settlementCode = settlementCode;
   }

   public String getSettlementCode() {
      return this.settlementCode;
   }

   public void setShouldPayMoney(BigDecimal shouldPayMoney) {
      this.shouldPayMoney = shouldPayMoney;
   }

   public BigDecimal getShouldPayMoney() {
      return this.shouldPayMoney;
   }

   public void setGoodsMoney(BigDecimal goodsMoney) {
      this.goodsMoney = goodsMoney;
   }

   public BigDecimal getGoodsMoney() {
      return this.goodsMoney;
   }

   public void setCreateTime(Date createTime) {
      this.createTime = createTime;
   }

   public Date getCreateTime() {
      return this.createTime;
   }

   public void setPlatformOrderNo(String platformOrderNo) {
      this.platformOrderNo = platformOrderNo;
   }

   public String getPlatformOrderNo() {
      return this.platformOrderNo;
   }

   public void setColdChainType(Integer coldChainType) {
      this.coldChainType = coldChainType;
   }

   public Integer getColdChainType() {
      return this.coldChainType;
   }

   public void setPickUpEndTime(Date pickUpEndTime) {
      this.pickUpEndTime = pickUpEndTime;
   }

   public Date getPickUpEndTime() {
      return this.pickUpEndTime;
   }

   public void setWidth(BigDecimal width) {
      this.width = width;
   }

   public BigDecimal getWidth() {
      return this.width;
   }

   public String getApiMethod() {
      return "jingdong.ldop.alpha.waybill.appendreceive";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("attribute1", this.attribute1);
      pmap.put("parentWaybillCode", this.parentWaybillCode);
      pmap.put("providerCode", this.providerCode);
      pmap.put("signReturn", this.signReturn);
      pmap.put("source", this.source);
      pmap.put("receiveTimeType", this.receiveTimeType);
      pmap.put("vendorCode", this.vendorCode);

      try {
         if (this.promiseCompleteTime != null) {
            pmap.put("promiseCompleteTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.promiseCompleteTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("payType", this.payType);
      pmap.put("needGuarantee", this.needGuarantee);
      pmap.put("pin", this.pin);
      pmap.put("appKey", this.appKey);
      pmap.put("goodsName", this.goodsName);
      pmap.put("height", this.height);
      pmap.put("expressType", this.expressType);
      pmap.put("weight", this.weight);
      pmap.put("vendorName", this.vendorName);
      pmap.put("branchCode", this.branchCode);
      pmap.put("volume", this.volume);
      pmap.put("guaranteeMoney", this.guaranteeMoney);
      pmap.put("transType", this.transType);
      pmap.put("vendorOrderCode", this.vendorOrderCode);
      pmap.put("remark", this.remark);
      pmap.put("idNumber", this.idNumber);
      pmap.put("warehouseCode", this.warehouseCode);
      pmap.put("expressPayMethod", this.expressPayMethod);
      pmap.put("waybillType", this.waybillType);
      pmap.put("salePlatform", this.salePlatform);
      pmap.put("addedService", this.addedService);
      pmap.put("providerId", this.providerId);
      pmap.put("length", this.length);
      pmap.put("waybillCount", this.waybillCount);

      try {
         if (this.pickUpStartTime != null) {
            pmap.put("pickUpStartTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.pickUpStartTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("promiseTimeType", this.promiseTimeType);
      pmap.put("settlementCode", this.settlementCode);
      pmap.put("shouldPayMoney", this.shouldPayMoney);
      pmap.put("goodsMoney", this.goodsMoney);

      try {
         if (this.createTime != null) {
            pmap.put("createTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.createTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("platformOrderNo", this.platformOrderNo);
      pmap.put("coldChainType", this.coldChainType);

      try {
         if (this.pickUpEndTime != null) {
            pmap.put("pickUpEndTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.pickUpEndTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("width", this.width);
      return JsonUtil.toJson(pmap);
   }

   public Class<LdopAlphaWaybillAppendreceiveResponse> getResponseClass() {
      return LdopAlphaWaybillAppendreceiveResponse.class;
   }
}
