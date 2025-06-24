package com.jd.open.api.sdk.request.promotion;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.SellerPromotionSkuAddResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SellerPromotionSkuAddRequest extends AbstractRequest implements JdRequest<SellerPromotionSkuAddResponse> {
   private Long promoId;
   private String skuIds;
   private String jdPrices;
   private String promoPrices;
   private String seq;
   private String num;
   private String bindType;

   public void setPromoId(Long promoId) {
      this.promoId = promoId;
   }

   public Long getPromoId() {
      return this.promoId;
   }

   public void setSkuIds(String skuIds) {
      this.skuIds = skuIds;
   }

   public String getSkuIds() {
      return this.skuIds;
   }

   public void setJdPrices(String jdPrices) {
      this.jdPrices = jdPrices;
   }

   public String getJdPrices() {
      return this.jdPrices;
   }

   public void setPromoPrices(String promoPrices) {
      this.promoPrices = promoPrices;
   }

   public String getPromoPrices() {
      return this.promoPrices;
   }

   public void setSeq(String seq) {
      this.seq = seq;
   }

   public String getSeq() {
      return this.seq;
   }

   public void setNum(String num) {
      this.num = num;
   }

   public String getNum() {
      return this.num;
   }

   public void setBindType(String bindType) {
      this.bindType = bindType;
   }

   public String getBindType() {
      return this.bindType;
   }

   public String getApiMethod() {
      return "jingdong.seller.promotion.sku.add";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("promo_id", this.promoId);
      pmap.put("sku_ids", this.skuIds);
      pmap.put("jd_prices", this.jdPrices);
      pmap.put("promo_prices", this.promoPrices);
      pmap.put("seq", this.seq);
      pmap.put("num", this.num);
      pmap.put("bind_type", this.bindType);
      return JsonUtil.toJson(pmap);
   }

   public Class<SellerPromotionSkuAddResponse> getResponseClass() {
      return SellerPromotionSkuAddResponse.class;
   }
}
