package com.jd.open.api.sdk.request.promotion;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.SellerPromotionV2SkuListResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SellerPromotionV2SkuListRequest extends AbstractRequest implements JdRequest<SellerPromotionV2SkuListResponse> {
   private String ip;
   private String port;
   private Long promoId;
   private Long wareId;
   private Long skuId;
   private Integer bindType;
   private Integer promoType;
   private int page;
   private int pageSSize;

   public void setIp(String ip) {
      this.ip = ip;
   }

   public String getIp() {
      return this.ip;
   }

   public void setPort(String port) {
      this.port = port;
   }

   public String getPort() {
      return this.port;
   }

   public void setPromoId(Long promoId) {
      this.promoId = promoId;
   }

   public Long getPromoId() {
      return this.promoId;
   }

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

   public void setBindType(Integer bindType) {
      this.bindType = bindType;
   }

   public Integer getBindType() {
      return this.bindType;
   }

   public void setPromoType(Integer promoType) {
      this.promoType = promoType;
   }

   public Integer getPromoType() {
      return this.promoType;
   }

   public void setPage(int page) {
      this.page = page;
   }

   public int getPage() {
      return this.page;
   }

   public void setPageSSize(int pageSSize) {
      this.pageSSize = pageSSize;
   }

   public int getPageSSize() {
      return this.pageSSize;
   }

   public String getApiMethod() {
      return "jingdong.seller.promotion.v2.sku.list";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("ip", this.ip);
      pmap.put("port", this.port);
      pmap.put("promo_id", this.promoId);
      pmap.put("ware_id", this.wareId);
      pmap.put("sku_id", this.skuId);
      pmap.put("bind_type", this.bindType);
      pmap.put("promo_type", this.promoType);
      pmap.put("page", this.page);
      pmap.put("pageS_size", this.pageSSize);
      return JsonUtil.toJson(pmap);
   }

   public Class<SellerPromotionV2SkuListResponse> getResponseClass() {
      return SellerPromotionV2SkuListResponse.class;
   }
}
