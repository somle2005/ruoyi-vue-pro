package com.jd.open.api.sdk.request.innertest;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.innertest.OtsOrderbankExportRestOrderResourceResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class OtsOrderbankExportRestOrderResourceRequest extends AbstractRequest implements JdRequest<OtsOrderbankExportRestOrderResourceResponse> {
   private Integer orderType;
   private String sendPay;
   private String orderId;
   private BigDecimal totalPrice;
   private BigDecimal discount;
   private BigDecimal yun;
   private Date orderTime;
   private BigDecimal payDiscount;
   private String merchantId;
   private String parentOrderId;
   private String appId;
   private String systemNo;
   private BigDecimal orderPrice;
   private Integer currency;
   private String skuId;
   private String delivery;
   private Integer ver;
   private Integer payMode;
   private String appToken;
   private BigDecimal otherMoney;
   private String productCode;
   private String notePub;
   private String payEnum;
   private String payOrderId;
   private String payTime;
   private String businessNo;
   private String payType;
   private String payMoney;
   private String payCurrencyName;
   private String payMerchantId;
   private String payParentOrderId;
   private String payAppId;
   private String paySystemNo;
   private String payCurrency;
   private String ext2;
   private String ext1;
   private String payVer;
   private String payAppToken;
   private String dataType;
   private String noteInner;
   private String updateTime;
   private String orderBankNo;
   private String eventType;
   private String payTypeName;
   private String currencyPrice;
   private String payCreateTime;
   private String rfIdType;
   private String morePay;
   private String payId;
   private String businessType;
   private BigDecimal paidIn;
   private Integer orderCode;
   private Date tuotouTime;
   private String receivableTypeName;
   private String receAmount;
   private String receivableId;
   private String receivableType;
   private String receCurrencyName;
   private String receCreateTime;
   private String receAppToken;
   private String receAppId;
   private String receSystemNo;
   private String receCurrency;

   public void setOrderType(Integer orderType) {
      this.orderType = orderType;
   }

   public Integer getOrderType() {
      return this.orderType;
   }

   public void setSendPay(String sendPay) {
      this.sendPay = sendPay;
   }

   public String getSendPay() {
      return this.sendPay;
   }

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public String getOrderId() {
      return this.orderId;
   }

   public void setTotalPrice(BigDecimal totalPrice) {
      this.totalPrice = totalPrice;
   }

   public BigDecimal getTotalPrice() {
      return this.totalPrice;
   }

   public void setDiscount(BigDecimal discount) {
      this.discount = discount;
   }

   public BigDecimal getDiscount() {
      return this.discount;
   }

   public void setYun(BigDecimal yun) {
      this.yun = yun;
   }

   public BigDecimal getYun() {
      return this.yun;
   }

   public void setOrderTime(Date orderTime) {
      this.orderTime = orderTime;
   }

   public Date getOrderTime() {
      return this.orderTime;
   }

   public void setPayDiscount(BigDecimal payDiscount) {
      this.payDiscount = payDiscount;
   }

   public BigDecimal getPayDiscount() {
      return this.payDiscount;
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

   public void setSystemNo(String systemNo) {
      this.systemNo = systemNo;
   }

   public String getSystemNo() {
      return this.systemNo;
   }

   public void setOrderPrice(BigDecimal orderPrice) {
      this.orderPrice = orderPrice;
   }

   public BigDecimal getOrderPrice() {
      return this.orderPrice;
   }

   public void setCurrency(Integer currency) {
      this.currency = currency;
   }

   public Integer getCurrency() {
      return this.currency;
   }

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public String getSkuId() {
      return this.skuId;
   }

   public void setDelivery(String delivery) {
      this.delivery = delivery;
   }

   public String getDelivery() {
      return this.delivery;
   }

   public void setVer(Integer ver) {
      this.ver = ver;
   }

   public Integer getVer() {
      return this.ver;
   }

   public void setPayMode(Integer payMode) {
      this.payMode = payMode;
   }

   public Integer getPayMode() {
      return this.payMode;
   }

   public void setAppToken(String appToken) {
      this.appToken = appToken;
   }

   public String getAppToken() {
      return this.appToken;
   }

   public void setOtherMoney(BigDecimal otherMoney) {
      this.otherMoney = otherMoney;
   }

   public BigDecimal getOtherMoney() {
      return this.otherMoney;
   }

   public void setProductCode(String productCode) {
      this.productCode = productCode;
   }

   public String getProductCode() {
      return this.productCode;
   }

   public void setNotePub(String notePub) {
      this.notePub = notePub;
   }

   public String getNotePub() {
      return this.notePub;
   }

   public void setPayEnum(String payEnum) {
      this.payEnum = payEnum;
   }

   public String getPayEnum() {
      return this.payEnum;
   }

   public void setPayOrderId(String payOrderId) {
      this.payOrderId = payOrderId;
   }

   public String getPayOrderId() {
      return this.payOrderId;
   }

   public void setPayTime(String payTime) {
      this.payTime = payTime;
   }

   public String getPayTime() {
      return this.payTime;
   }

   public void setBusinessNo(String businessNo) {
      this.businessNo = businessNo;
   }

   public String getBusinessNo() {
      return this.businessNo;
   }

   public void setPayType(String payType) {
      this.payType = payType;
   }

   public String getPayType() {
      return this.payType;
   }

   public void setPayMoney(String payMoney) {
      this.payMoney = payMoney;
   }

   public String getPayMoney() {
      return this.payMoney;
   }

   public void setPayCurrencyName(String payCurrencyName) {
      this.payCurrencyName = payCurrencyName;
   }

   public String getPayCurrencyName() {
      return this.payCurrencyName;
   }

   public void setPayMerchantId(String payMerchantId) {
      this.payMerchantId = payMerchantId;
   }

   public String getPayMerchantId() {
      return this.payMerchantId;
   }

   public void setPayParentOrderId(String payParentOrderId) {
      this.payParentOrderId = payParentOrderId;
   }

   public String getPayParentOrderId() {
      return this.payParentOrderId;
   }

   public void setPayAppId(String payAppId) {
      this.payAppId = payAppId;
   }

   public String getPayAppId() {
      return this.payAppId;
   }

   public void setPaySystemNo(String paySystemNo) {
      this.paySystemNo = paySystemNo;
   }

   public String getPaySystemNo() {
      return this.paySystemNo;
   }

   public void setPayCurrency(String payCurrency) {
      this.payCurrency = payCurrency;
   }

   public String getPayCurrency() {
      return this.payCurrency;
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

   public void setPayVer(String payVer) {
      this.payVer = payVer;
   }

   public String getPayVer() {
      return this.payVer;
   }

   public void setPayAppToken(String payAppToken) {
      this.payAppToken = payAppToken;
   }

   public String getPayAppToken() {
      return this.payAppToken;
   }

   public void setDataType(String dataType) {
      this.dataType = dataType;
   }

   public String getDataType() {
      return this.dataType;
   }

   public void setNoteInner(String noteInner) {
      this.noteInner = noteInner;
   }

   public String getNoteInner() {
      return this.noteInner;
   }

   public void setUpdateTime(String updateTime) {
      this.updateTime = updateTime;
   }

   public String getUpdateTime() {
      return this.updateTime;
   }

   public void setOrderBankNo(String orderBankNo) {
      this.orderBankNo = orderBankNo;
   }

   public String getOrderBankNo() {
      return this.orderBankNo;
   }

   public void setEventType(String eventType) {
      this.eventType = eventType;
   }

   public String getEventType() {
      return this.eventType;
   }

   public void setPayTypeName(String payTypeName) {
      this.payTypeName = payTypeName;
   }

   public String getPayTypeName() {
      return this.payTypeName;
   }

   public void setCurrencyPrice(String currencyPrice) {
      this.currencyPrice = currencyPrice;
   }

   public String getCurrencyPrice() {
      return this.currencyPrice;
   }

   public void setPayCreateTime(String payCreateTime) {
      this.payCreateTime = payCreateTime;
   }

   public String getPayCreateTime() {
      return this.payCreateTime;
   }

   public void setRfIdType(String rfIdType) {
      this.rfIdType = rfIdType;
   }

   public String getRfIdType() {
      return this.rfIdType;
   }

   public void setMorePay(String morePay) {
      this.morePay = morePay;
   }

   public String getMorePay() {
      return this.morePay;
   }

   public void setPayId(String payId) {
      this.payId = payId;
   }

   public String getPayId() {
      return this.payId;
   }

   public void setBusinessType(String businessType) {
      this.businessType = businessType;
   }

   public String getBusinessType() {
      return this.businessType;
   }

   public void setPaidIn(BigDecimal paidIn) {
      this.paidIn = paidIn;
   }

   public BigDecimal getPaidIn() {
      return this.paidIn;
   }

   public void setOrderCode(Integer orderCode) {
      this.orderCode = orderCode;
   }

   public Integer getOrderCode() {
      return this.orderCode;
   }

   public void setTuotouTime(Date tuotouTime) {
      this.tuotouTime = tuotouTime;
   }

   public Date getTuotouTime() {
      return this.tuotouTime;
   }

   public void setReceivableTypeName(String receivableTypeName) {
      this.receivableTypeName = receivableTypeName;
   }

   public String getReceivableTypeName() {
      return this.receivableTypeName;
   }

   public void setReceAmount(String receAmount) {
      this.receAmount = receAmount;
   }

   public String getReceAmount() {
      return this.receAmount;
   }

   public void setReceivableId(String receivableId) {
      this.receivableId = receivableId;
   }

   public String getReceivableId() {
      return this.receivableId;
   }

   public void setReceivableType(String receivableType) {
      this.receivableType = receivableType;
   }

   public String getReceivableType() {
      return this.receivableType;
   }

   public void setReceCurrencyName(String receCurrencyName) {
      this.receCurrencyName = receCurrencyName;
   }

   public String getReceCurrencyName() {
      return this.receCurrencyName;
   }

   public void setReceCreateTime(String receCreateTime) {
      this.receCreateTime = receCreateTime;
   }

   public String getReceCreateTime() {
      return this.receCreateTime;
   }

   public void setReceAppToken(String receAppToken) {
      this.receAppToken = receAppToken;
   }

   public String getReceAppToken() {
      return this.receAppToken;
   }

   public void setReceAppId(String receAppId) {
      this.receAppId = receAppId;
   }

   public String getReceAppId() {
      return this.receAppId;
   }

   public void setReceSystemNo(String receSystemNo) {
      this.receSystemNo = receSystemNo;
   }

   public String getReceSystemNo() {
      return this.receSystemNo;
   }

   public void setReceCurrency(String receCurrency) {
      this.receCurrency = receCurrency;
   }

   public String getReceCurrency() {
      return this.receCurrency;
   }

   public String getApiMethod() {
      return "jingdong.ots.orderbank.export.rest.OrderResource";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderType", this.orderType);
      pmap.put("sendPay", this.sendPay);
      pmap.put("orderId", this.orderId);
      pmap.put("totalPrice", this.totalPrice);
      pmap.put("discount", this.discount);
      pmap.put("yun", this.yun);

      try {
         if (this.orderTime != null) {
            pmap.put("orderTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.orderTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("payDiscount", this.payDiscount);
      pmap.put("merchantId", this.merchantId);
      pmap.put("parentOrderId", this.parentOrderId);
      pmap.put("appId", this.appId);
      pmap.put("systemNo", this.systemNo);
      pmap.put("orderPrice", this.orderPrice);
      pmap.put("currency", this.currency);
      pmap.put("skuId", this.skuId);
      pmap.put("delivery", this.delivery);
      pmap.put("ver", this.ver);
      pmap.put("payMode", this.payMode);
      pmap.put("appToken", this.appToken);
      pmap.put("otherMoney", this.otherMoney);
      pmap.put("productCode", this.productCode);
      pmap.put("notePub", this.notePub);
      pmap.put("payEnum", this.payEnum);
      pmap.put("payOrderId", this.payOrderId);
      pmap.put("payTime", this.payTime);
      pmap.put("businessNo", this.businessNo);
      pmap.put("payType", this.payType);
      pmap.put("payMoney", this.payMoney);
      pmap.put("payCurrencyName", this.payCurrencyName);
      pmap.put("payMerchantId", this.payMerchantId);
      pmap.put("payParentOrderId", this.payParentOrderId);
      pmap.put("payAppId", this.payAppId);
      pmap.put("paySystemNo", this.paySystemNo);
      pmap.put("payCurrency", this.payCurrency);
      pmap.put("ext2", this.ext2);
      pmap.put("ext1", this.ext1);
      pmap.put("payVer", this.payVer);
      pmap.put("payAppToken", this.payAppToken);
      pmap.put("dataType", this.dataType);
      pmap.put("noteInner", this.noteInner);
      pmap.put("updateTime", this.updateTime);
      pmap.put("orderBankNo", this.orderBankNo);
      pmap.put("eventType", this.eventType);
      pmap.put("payTypeName", this.payTypeName);
      pmap.put("currencyPrice", this.currencyPrice);
      pmap.put("payCreateTime", this.payCreateTime);
      pmap.put("rfIdType", this.rfIdType);
      pmap.put("morePay", this.morePay);
      pmap.put("payId", this.payId);
      pmap.put("businessType", this.businessType);
      pmap.put("paidIn", this.paidIn);
      pmap.put("orderCode", this.orderCode);

      try {
         if (this.tuotouTime != null) {
            pmap.put("tuotouTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.tuotouTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("receivableTypeName", this.receivableTypeName);
      pmap.put("receAmount", this.receAmount);
      pmap.put("receivableId", this.receivableId);
      pmap.put("receivableType", this.receivableType);
      pmap.put("receCurrencyName", this.receCurrencyName);
      pmap.put("receCreateTime", this.receCreateTime);
      pmap.put("receAppToken", this.receAppToken);
      pmap.put("receAppId", this.receAppId);
      pmap.put("receSystemNo", this.receSystemNo);
      pmap.put("receCurrency", this.receCurrency);
      return JsonUtil.toJson(pmap);
   }

   public Class<OtsOrderbankExportRestOrderResourceResponse> getResponseClass() {
      return OtsOrderbankExportRestOrderResourceResponse.class;
   }
}
