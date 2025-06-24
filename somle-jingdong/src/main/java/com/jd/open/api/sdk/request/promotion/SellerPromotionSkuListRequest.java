package com.jd.open.api.sdk.request.promotion;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.SellerPromotionSkuListResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SellerPromotionSkuListRequest extends AbstractRequest implements JdRequest<SellerPromotionSkuListResponse> {
   private Long wareId;
   private Long skuId;
   private Long promoId;
   private Integer bindType;
   private int page;
   private int size;

   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   public Long getWareId() {
      return this.wareId;
   }

   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   public Long getSkuId() {
      return this.skuId;
   }

   public void setPromoId(Long promoId) {
      this.promoId = promoId;
   }

   public Long getPromoId() {
      return this.promoId;
   }

   public void setBindType(Integer bindType) {
      this.bindType = bindType;
   }

   public Integer getBindType() {
      return this.bindType;
   }

   public void setPage(int page) {
      this.page = page;
   }

   public int getPage() {
      return this.page;
   }

   public void setSize(int size) {
      this.size = size;
   }

   public int getSize() {
      return this.size;
   }

   public String getApiMethod() {
      return "jingdong.seller.promotion.sku.list";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("ware_id", this.wareId);
      pmap.put("sku_id", this.skuId);
      pmap.put("promo_id", this.promoId);
      pmap.put("bind_type", this.bindType);
      pmap.put("page", this.page);
      pmap.put("size", this.size);
      return JsonUtil.toJson(pmap);
   }

   public Class<SellerPromotionSkuListResponse> getResponseClass() {
      return SellerPromotionSkuListResponse.class;
   }
}
