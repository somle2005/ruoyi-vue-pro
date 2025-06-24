package com.jd.open.api.sdk.request.jiyunshang;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jiyunshang.ProductweighResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ProductweighRequest extends AbstractRequest implements JdRequest<ProductweighResponse> {
   private Long oneOrderId;
   private Long skuId;
   private Long actualWeight;
   private Long billingWeight;
   private Integer jysSkuLength;
   private Integer jysSkuWidth;
   private Integer jysSkuHeight;
   private String extStr;

   public void setOneOrderId(Long oneOrderId) {
      this.oneOrderId = oneOrderId;
   }

   public Long getOneOrderId() {
      return this.oneOrderId;
   }

   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   public Long getSkuId() {
      return this.skuId;
   }

   public void setActualWeight(Long actualWeight) {
      this.actualWeight = actualWeight;
   }

   public Long getActualWeight() {
      return this.actualWeight;
   }

   public void setBillingWeight(Long billingWeight) {
      this.billingWeight = billingWeight;
   }

   public Long getBillingWeight() {
      return this.billingWeight;
   }

   public void setJysSkuLength(Integer jysSkuLength) {
      this.jysSkuLength = jysSkuLength;
   }

   public Integer getJysSkuLength() {
      return this.jysSkuLength;
   }

   public void setJysSkuWidth(Integer jysSkuWidth) {
      this.jysSkuWidth = jysSkuWidth;
   }

   public Integer getJysSkuWidth() {
      return this.jysSkuWidth;
   }

   public void setJysSkuHeight(Integer jysSkuHeight) {
      this.jysSkuHeight = jysSkuHeight;
   }

   public Integer getJysSkuHeight() {
      return this.jysSkuHeight;
   }

   public void setExtStr(String extStr) {
      this.extStr = extStr;
   }

   public String getExtStr() {
      return this.extStr;
   }

   public String getApiMethod() {
      return "jingdong.productweigh";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("oneOrderId", this.oneOrderId);
      pmap.put("skuId", this.skuId);
      pmap.put("actualWeight", this.actualWeight);
      pmap.put("billingWeight", this.billingWeight);
      pmap.put("jysSkuLength", this.jysSkuLength);
      pmap.put("jysSkuWidth", this.jysSkuWidth);
      pmap.put("jysSkuHeight", this.jysSkuHeight);
      pmap.put("extStr", this.extStr);
      return JsonUtil.toJson(pmap);
   }

   public Class<ProductweighResponse> getResponseClass() {
      return ProductweighResponse.class;
   }
}
