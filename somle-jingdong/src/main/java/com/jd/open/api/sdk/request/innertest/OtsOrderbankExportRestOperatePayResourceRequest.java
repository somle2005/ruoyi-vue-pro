package com.jd.open.api.sdk.request.innertest;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.innertest.OtsOrderbankExportRestOperatePayResourceResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class OtsOrderbankExportRestOperatePayResourceRequest extends AbstractRequest implements JdRequest<OtsOrderbankExportRestOperatePayResourceResponse> {
   private String notePub;
   private Integer payEnum;
   private String orderId;
   private Date payTime;
   private String oper;
   private String businessNo;
   private Integer payType;
   private BigDecimal payMoney;
   private String currencyName;
   private String merchantId;
   private String parentOrderId;
   private String appId;
   private Integer currency;
   private String ext2;
   private String ext1;
   private Integer ver;
   private String appToken;
   private Integer dataType;
   private String noteInner;
   private Date updateTime;
   private Integer eventType;
   private String payTypeName;
   private BigDecimal currencyPrice;
   private Date createTime;
   private String rfIdType;
   private String payId;
   private Integer businessType;

   public void setNotePub(String notePub) {
      this.notePub = notePub;
   }

   public String getNotePub() {
      return this.notePub;
   }

   public void setPayEnum(Integer payEnum) {
      this.payEnum = payEnum;
   }

   public Integer getPayEnum() {
      return this.payEnum;
   }

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public String getOrderId() {
      return this.orderId;
   }

   public void setPayTime(Date payTime) {
      this.payTime = payTime;
   }

   public Date getPayTime() {
      return this.payTime;
   }

   public void setOper(String oper) {
      this.oper = oper;
   }

   public String getOper() {
      return this.oper;
   }

   public void setBusinessNo(String businessNo) {
      this.businessNo = businessNo;
   }

   public String getBusinessNo() {
      return this.businessNo;
   }

   public void setPayType(Integer payType) {
      this.payType = payType;
   }

   public Integer getPayType() {
      return this.payType;
   }

   public void setPayMoney(BigDecimal payMoney) {
      this.payMoney = payMoney;
   }

   public BigDecimal getPayMoney() {
      return this.payMoney;
   }

   public void setCurrencyName(String currencyName) {
      this.currencyName = currencyName;
   }

   public String getCurrencyName() {
      return this.currencyName;
   }

   public void setMerchantId(String merchantId) {
      this.merchantId = merchantId;
   }

   public String getMerchantId() {
      return this.merchantId;
   }

   public void setParentOrderId(String parentOrderId) {
      this.parentOrderId = parentOrderId;
   }

   public String getParentOrderId() {
      return this.parentOrderId;
   }

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public void setCurrency(Integer currency) {
      this.currency = currency;
   }

   public Integer getCurrency() {
      return this.currency;
   }

   public void setExt2(String ext2) {
      this.ext2 = ext2;
   }

   public String getExt2() {
      return this.ext2;
   }

   public void setExt1(String ext1) {
      this.ext1 = ext1;
   }

   public String getExt1() {
      return this.ext1;
   }

   public void setVer(Integer ver) {
      this.ver = ver;
   }

   public Integer getVer() {
      return this.ver;
   }

   public void setAppToken(String appToken) {
      this.appToken = appToken;
   }

   public String getAppToken() {
      return this.appToken;
   }

   public void setDataType(Integer dataType) {
      this.dataType = dataType;
   }

   public Integer getDataType() {
      return this.dataType;
   }

   public void setNoteInner(String noteInner) {
      this.noteInner = noteInner;
   }

   public String getNoteInner() {
      return this.noteInner;
   }

   public void setUpdateTime(Date updateTime) {
      this.updateTime = updateTime;
   }

   public Date getUpdateTime() {
      return this.updateTime;
   }

   public void setEventType(Integer eventType) {
      this.eventType = eventType;
   }

   public Integer getEventType() {
      return this.eventType;
   }

   public void setPayTypeName(String payTypeName) {
      this.payTypeName = payTypeName;
   }

   public String getPayTypeName() {
      return this.payTypeName;
   }

   public void setCurrencyPrice(BigDecimal currencyPrice) {
      this.currencyPrice = currencyPrice;
   }

   public BigDecimal getCurrencyPrice() {
      return this.currencyPrice;
   }

   public void setCreateTime(Date createTime) {
      this.createTime = createTime;
   }

   public Date getCreateTime() {
      return this.createTime;
   }

   public void setRfIdType(String rfIdType) {
      this.rfIdType = rfIdType;
   }

   public String getRfIdType() {
      return this.rfIdType;
   }

   public void setPayId(String payId) {
      this.payId = payId;
   }

   public String getPayId() {
      return this.payId;
   }

   public void setBusinessType(Integer businessType) {
      this.businessType = businessType;
   }

   public Integer getBusinessType() {
      return this.businessType;
   }

   public String getApiMethod() {
      return "jingdong.ots.orderbank.export.rest.OperatePayResource";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("notePub", this.notePub);
      pmap.put("payEnum", this.payEnum);
      pmap.put("orderId", this.orderId);

      try {
         if (this.payTime != null) {
            pmap.put("payTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.payTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("oper", this.oper);
      pmap.put("businessNo", this.businessNo);
      pmap.put("payType", this.payType);
      pmap.put("payMoney", this.payMoney);
      pmap.put("currencyName", this.currencyName);
      pmap.put("merchantId", this.merchantId);
      pmap.put("parentOrderId", this.parentOrderId);
      pmap.put("appId", this.appId);
      pmap.put("currency", this.currency);
      pmap.put("ext2", this.ext2);
      pmap.put("ext1", this.ext1);
      pmap.put("ver", this.ver);
      pmap.put("appToken", this.appToken);
      pmap.put("dataType", this.dataType);
      pmap.put("noteInner", this.noteInner);

      try {
         if (this.updateTime != null) {
            pmap.put("updateTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.updateTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("eventType", this.eventType);
      pmap.put("payTypeName", this.payTypeName);
      pmap.put("currencyPrice", this.currencyPrice);

      try {
         if (this.createTime != null) {
            pmap.put("createTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.createTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("rfIdType", this.rfIdType);
      pmap.put("payId", this.payId);
      pmap.put("businessType", this.businessType);
      return JsonUtil.toJson(pmap);
   }

   public Class<OtsOrderbankExportRestOperatePayResourceResponse> getResponseClass() {
      return OtsOrderbankExportRestOperatePayResourceResponse.class;
   }
}
