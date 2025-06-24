package com.jd.open.api.sdk.request.jialilue;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jialilue.ImportSkuRelationResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

public class ImportSkuRelationRequest extends AbstractRequest implements JdRequest<ImportSkuRelationResponse> {
   private String pin;
   private String authkey;
   private String skuName;
   private Integer settlementType;
   private String venderSkuName;
   private String venderSkuId;
   private BigDecimal salePrice;
   private String upc;
   private Long storeId;
   private Integer checkSn;
   private Long skuId;
   private Integer skuProperty;
   private Integer type;
   private String openIdBuyer;
   private String xidBuyer;

   public void setPin(String pin) {
      this.pin = pin;
   }

   public String getPin() {
      return this.pin;
   }

   public void setAuthkey(String authkey) {
      this.authkey = authkey;
   }

   public String getAuthkey() {
      return this.authkey;
   }

   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   public String getSkuName() {
      return this.skuName;
   }

   public void setSettlementType(Integer settlementType) {
      this.settlementType = settlementType;
   }

   public Integer getSettlementType() {
      return this.settlementType;
   }

   public void setVenderSkuName(String venderSkuName) {
      this.venderSkuName = venderSkuName;
   }

   public String getVenderSkuName() {
      return this.venderSkuName;
   }

   public void setVenderSkuId(String venderSkuId) {
      this.venderSkuId = venderSkuId;
   }

   public String getVenderSkuId() {
      return this.venderSkuId;
   }

   public void setSalePrice(BigDecimal salePrice) {
      this.salePrice = salePrice;
   }

   public BigDecimal getSalePrice() {
      return this.salePrice;
   }

   public void setUpc(String upc) {
      this.upc = upc;
   }

   public String getUpc() {
      return this.upc;
   }

   public void setStoreId(Long storeId) {
      this.storeId = storeId;
   }

   public Long getStoreId() {
      return this.storeId;
   }

   public void setCheckSn(Integer checkSn) {
      this.checkSn = checkSn;
   }

   public Integer getCheckSn() {
      return this.checkSn;
   }

   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   public Long getSkuId() {
      return this.skuId;
   }

   public void setSkuProperty(Integer skuProperty) {
      this.skuProperty = skuProperty;
   }

   public Integer getSkuProperty() {
      return this.skuProperty;
   }

   public void setType(Integer type) {
      this.type = type;
   }

   public Integer getType() {
      return this.type;
   }

   public void setOpenIdBuyer(String openIdBuyer) {
      this.openIdBuyer = openIdBuyer;
   }

   public String getOpenIdBuyer() {
      return this.openIdBuyer;
   }

   public void setXidBuyer(String xidBuyer) {
      this.xidBuyer = xidBuyer;
   }

   public String getXidBuyer() {
      return this.xidBuyer;
   }

   public String getApiMethod() {
      return "jingdong.importSkuRelation";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("pin", this.pin);
      pmap.put("authkey", this.authkey);
      pmap.put("skuName", this.skuName);
      pmap.put("settlementType", this.settlementType);
      pmap.put("venderSkuName", this.venderSkuName);
      pmap.put("venderSkuId", this.venderSkuId);
      pmap.put("salePrice", this.salePrice);
      pmap.put("upc", this.upc);
      pmap.put("storeId", this.storeId);
      pmap.put("checkSn", this.checkSn);
      pmap.put("skuId", this.skuId);
      pmap.put("skuProperty", this.skuProperty);
      pmap.put("type", this.type);
      pmap.put("open_id_buyer", this.openIdBuyer);
      pmap.put("xid_buyer", this.xidBuyer);
      return JsonUtil.toJson(pmap);
   }

   public Class<ImportSkuRelationResponse> getResponseClass() {
      return ImportSkuRelationResponse.class;
   }
}
