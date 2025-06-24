package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpOrderAddDeclareOrderCustomsResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class EclpOrderAddDeclareOrderCustomsRequest extends AbstractRequest implements JdRequest<EclpOrderAddDeclareOrderCustomsResponse> {
   private String platformId;
   private String platformName;
   private String appType;
   private String logisticsNo;
   private String billSerialNo;
   private String billNo;
   private Double freight;
   private Double insuredFee;
   private Double netWeight;
   private Double weight;
   private Integer packNo;
   private Double worth;
   private String goodsName;
   private String orderNo;
   private String shipper;
   private String shipperAddress;
   private String shipperTelephone;
   private String shipperCountry;
   private String consigneeCountry;
   private String consigneeProvince;
   private String consigneeCity;
   private String consigneeDistrict;
   private String consingee;
   private String consigneeAddress;
   private String consigneeTelephone;
   private String buyerIdType;
   private String buyerIdNumber;
   private String customsId;
   private String customsCode;
   private String deptNo;
   private String isvSource;
   private String pattern;
   private String isvUUID;
   private Integer platformType;
   private Date salesPlatformCreateTime;
   private String postType;
   private Integer istax;
   private String logisticsCode;
   private String logisticsName;
   private Integer isDelivery;
   private String ebpCode;
   private String ebpName;
   private String ebcCode;
   private String ebcName;
   private String ebpCiqCode;
   private String ebpCiqName;
   private String ebcCiqCode;
   private String ebcCiqName;
   private String spSoNo;
   private String oaid;

   public void setPlatformId(String platformId) {
      this.platformId = platformId;
   }

   public String getPlatformId() {
      return this.platformId;
   }

   public void setPlatformName(String platformName) {
      this.platformName = platformName;
   }

   public String getPlatformName() {
      return this.platformName;
   }

   public void setAppType(String appType) {
      this.appType = appType;
   }

   public String getAppType() {
      return this.appType;
   }

   public void setLogisticsNo(String logisticsNo) {
      this.logisticsNo = logisticsNo;
   }

   public String getLogisticsNo() {
      return this.logisticsNo;
   }

   public void setBillSerialNo(String billSerialNo) {
      this.billSerialNo = billSerialNo;
   }

   public String getBillSerialNo() {
      return this.billSerialNo;
   }

   public void setBillNo(String billNo) {
      this.billNo = billNo;
   }

   public String getBillNo() {
      return this.billNo;
   }

   public void setFreight(Double freight) {
      this.freight = freight;
   }

   public Double getFreight() {
      return this.freight;
   }

   public void setInsuredFee(Double insuredFee) {
      this.insuredFee = insuredFee;
   }

   public Double getInsuredFee() {
      return this.insuredFee;
   }

   public void setNetWeight(Double netWeight) {
      this.netWeight = netWeight;
   }

   public Double getNetWeight() {
      return this.netWeight;
   }

   public void setWeight(Double weight) {
      this.weight = weight;
   }

   public Double getWeight() {
      return this.weight;
   }

   public void setPackNo(Integer packNo) {
      this.packNo = packNo;
   }

   public Integer getPackNo() {
      return this.packNo;
   }

   public void setWorth(Double worth) {
      this.worth = worth;
   }

   public Double getWorth() {
      return this.worth;
   }

   public void setGoodsName(String goodsName) {
      this.goodsName = goodsName;
   }

   public String getGoodsName() {
      return this.goodsName;
   }

   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   public String getOrderNo() {
      return this.orderNo;
   }

   public void setShipper(String shipper) {
      this.shipper = shipper;
   }

   public String getShipper() {
      return this.shipper;
   }

   public void setShipperAddress(String shipperAddress) {
      this.shipperAddress = shipperAddress;
   }

   public String getShipperAddress() {
      return this.shipperAddress;
   }

   public void setShipperTelephone(String shipperTelephone) {
      this.shipperTelephone = shipperTelephone;
   }

   public String getShipperTelephone() {
      return this.shipperTelephone;
   }

   public void setShipperCountry(String shipperCountry) {
      this.shipperCountry = shipperCountry;
   }

   public String getShipperCountry() {
      return this.shipperCountry;
   }

   public void setConsigneeCountry(String consigneeCountry) {
      this.consigneeCountry = consigneeCountry;
   }

   public String getConsigneeCountry() {
      return this.consigneeCountry;
   }

   public void setConsigneeProvince(String consigneeProvince) {
      this.consigneeProvince = consigneeProvince;
   }

   public String getConsigneeProvince() {
      return this.consigneeProvince;
   }

   public void setConsigneeCity(String consigneeCity) {
      this.consigneeCity = consigneeCity;
   }

   public String getConsigneeCity() {
      return this.consigneeCity;
   }

   public void setConsigneeDistrict(String consigneeDistrict) {
      this.consigneeDistrict = consigneeDistrict;
   }

   public String getConsigneeDistrict() {
      return this.consigneeDistrict;
   }

   public void setConsingee(String consingee) {
      this.consingee = consingee;
   }

   public String getConsingee() {
      return this.consingee;
   }

   public void setConsigneeAddress(String consigneeAddress) {
      this.consigneeAddress = consigneeAddress;
   }

   public String getConsigneeAddress() {
      return this.consigneeAddress;
   }

   public void setConsigneeTelephone(String consigneeTelephone) {
      this.consigneeTelephone = consigneeTelephone;
   }

   public String getConsigneeTelephone() {
      return this.consigneeTelephone;
   }

   public void setBuyerIdType(String buyerIdType) {
      this.buyerIdType = buyerIdType;
   }

   public String getBuyerIdType() {
      return this.buyerIdType;
   }

   public void setBuyerIdNumber(String buyerIdNumber) {
      this.buyerIdNumber = buyerIdNumber;
   }

   public String getBuyerIdNumber() {
      return this.buyerIdNumber;
   }

   public void setCustomsId(String customsId) {
      this.customsId = customsId;
   }

   public String getCustomsId() {
      return this.customsId;
   }

   public void setCustomsCode(String customsCode) {
      this.customsCode = customsCode;
   }

   public String getCustomsCode() {
      return this.customsCode;
   }

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
   }

   public void setIsvSource(String isvSource) {
      this.isvSource = isvSource;
   }

   public String getIsvSource() {
      return this.isvSource;
   }

   public void setPattern(String pattern) {
      this.pattern = pattern;
   }

   public String getPattern() {
      return this.pattern;
   }

   public void setIsvUUID(String isvUUID) {
      this.isvUUID = isvUUID;
   }

   public String getIsvUUID() {
      return this.isvUUID;
   }

   public void setPlatformType(Integer platformType) {
      this.platformType = platformType;
   }

   public Integer getPlatformType() {
      return this.platformType;
   }

   public void setSalesPlatformCreateTime(Date salesPlatformCreateTime) {
      this.salesPlatformCreateTime = salesPlatformCreateTime;
   }

   public Date getSalesPlatformCreateTime() {
      return this.salesPlatformCreateTime;
   }

   public void setPostType(String postType) {
      this.postType = postType;
   }

   public String getPostType() {
      return this.postType;
   }

   public void setIstax(Integer istax) {
      this.istax = istax;
   }

   public Integer getIstax() {
      return this.istax;
   }

   public void setLogisticsCode(String logisticsCode) {
      this.logisticsCode = logisticsCode;
   }

   public String getLogisticsCode() {
      return this.logisticsCode;
   }

   public void setLogisticsName(String logisticsName) {
      this.logisticsName = logisticsName;
   }

   public String getLogisticsName() {
      return this.logisticsName;
   }

   public void setIsDelivery(Integer isDelivery) {
      this.isDelivery = isDelivery;
   }

   public Integer getIsDelivery() {
      return this.isDelivery;
   }

   public void setEbpCode(String ebpCode) {
      this.ebpCode = ebpCode;
   }

   public String getEbpCode() {
      return this.ebpCode;
   }

   public void setEbpName(String ebpName) {
      this.ebpName = ebpName;
   }

   public String getEbpName() {
      return this.ebpName;
   }

   public void setEbcCode(String ebcCode) {
      this.ebcCode = ebcCode;
   }

   public String getEbcCode() {
      return this.ebcCode;
   }

   public void setEbcName(String ebcName) {
      this.ebcName = ebcName;
   }

   public String getEbcName() {
      return this.ebcName;
   }

   public void setEbpCiqCode(String ebpCiqCode) {
      this.ebpCiqCode = ebpCiqCode;
   }

   public String getEbpCiqCode() {
      return this.ebpCiqCode;
   }

   public void setEbpCiqName(String ebpCiqName) {
      this.ebpCiqName = ebpCiqName;
   }

   public String getEbpCiqName() {
      return this.ebpCiqName;
   }

   public void setEbcCiqCode(String ebcCiqCode) {
      this.ebcCiqCode = ebcCiqCode;
   }

   public String getEbcCiqCode() {
      return this.ebcCiqCode;
   }

   public void setEbcCiqName(String ebcCiqName) {
      this.ebcCiqName = ebcCiqName;
   }

   public String getEbcCiqName() {
      return this.ebcCiqName;
   }

   public void setSpSoNo(String spSoNo) {
      this.spSoNo = spSoNo;
   }

   public String getSpSoNo() {
      return this.spSoNo;
   }

   public void setOaid(String oaid) {
      this.oaid = oaid;
   }

   public String getOaid() {
      return this.oaid;
   }

   public String getApiMethod() {
      return "jingdong.eclp.order.addDeclareOrderCustoms";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("platformId", this.platformId);
      pmap.put("platformName", this.platformName);
      pmap.put("appType", this.appType);
      pmap.put("logisticsNo", this.logisticsNo);
      pmap.put("billSerialNo", this.billSerialNo);
      pmap.put("billNo", this.billNo);
      pmap.put("freight", this.freight);
      pmap.put("insuredFee", this.insuredFee);
      pmap.put("netWeight", this.netWeight);
      pmap.put("weight", this.weight);
      pmap.put("packNo", this.packNo);
      pmap.put("worth", this.worth);
      pmap.put("goodsName", this.goodsName);
      pmap.put("orderNo", this.orderNo);
      pmap.put("shipper", this.shipper);
      pmap.put("shipperAddress", this.shipperAddress);
      pmap.put("shipperTelephone", this.shipperTelephone);
      pmap.put("shipperCountry", this.shipperCountry);
      pmap.put("consigneeCountry", this.consigneeCountry);
      pmap.put("consigneeProvince", this.consigneeProvince);
      pmap.put("consigneeCity", this.consigneeCity);
      pmap.put("consigneeDistrict", this.consigneeDistrict);
      pmap.put("consingee", this.consingee);
      pmap.put("consigneeAddress", this.consigneeAddress);
      pmap.put("consigneeTelephone", this.consigneeTelephone);
      pmap.put("buyerIdType", this.buyerIdType);
      pmap.put("buyerIdNumber", this.buyerIdNumber);
      pmap.put("customsId", this.customsId);
      pmap.put("customsCode", this.customsCode);
      pmap.put("deptNo", this.deptNo);
      pmap.put("isvSource", this.isvSource);
      pmap.put("pattern", this.pattern);
      pmap.put("isvUUID", this.isvUUID);
      pmap.put("platformType", this.platformType);

      try {
         if (this.salesPlatformCreateTime != null) {
            pmap.put("salesPlatformCreateTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.salesPlatformCreateTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("postType", this.postType);
      pmap.put("istax", this.istax);
      pmap.put("logisticsCode", this.logisticsCode);
      pmap.put("logisticsName", this.logisticsName);
      pmap.put("isDelivery", this.isDelivery);
      pmap.put("ebpCode", this.ebpCode);
      pmap.put("ebpName", this.ebpName);
      pmap.put("ebcCode", this.ebcCode);
      pmap.put("ebcName", this.ebcName);
      pmap.put("ebpCiqCode", this.ebpCiqCode);
      pmap.put("ebpCiqName", this.ebpCiqName);
      pmap.put("ebcCiqCode", this.ebcCiqCode);
      pmap.put("ebcCiqName", this.ebcCiqName);
      pmap.put("spSoNo", this.spSoNo);
      pmap.put("oaid", this.oaid);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpOrderAddDeclareOrderCustomsResponse> getResponseClass() {
      return EclpOrderAddDeclareOrderCustomsResponse.class;
   }
}
