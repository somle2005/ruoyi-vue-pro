package com.jd.open.api.sdk.request.promotion;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.SellerPromotionV2ListResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SellerPromotionV2ListRequest extends AbstractRequest implements JdRequest<SellerPromotionV2ListResponse> {
   private String ip;
   private String port;
   private Long promoId;
   private String name;
   private Integer type;
   private Integer favorMode;
   private String beginTime;
   private String endTime;
   private Integer promoStatus;
   private Long wareId;
   private Long skuId;
   private int page;
   private int pageSSize;
   private Integer srcType;
   private Long startId;

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

   public void setName(String name) {
      this.name = name;
   }

   public String getName() {
      return this.name;
   }

   public void setType(Integer type) {
      this.type = type;
   }

   public Integer getType() {
      return this.type;
   }

   public void setFavorMode(Integer favorMode) {
      this.favorMode = favorMode;
   }

   public Integer getFavorMode() {
      return this.favorMode;
   }

   public void setBeginTime(String beginTime) {
      this.beginTime = beginTime;
   }

   public String getBeginTime() {
      return this.beginTime;
   }

   public void setEndTime(String endTime) {
      this.endTime = endTime;
   }

   public String getEndTime() {
      return this.endTime;
   }

   public void setPromoStatus(Integer promoStatus) {
      this.promoStatus = promoStatus;
   }

   public Integer getPromoStatus() {
      return this.promoStatus;
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

   public void setSrcType(Integer srcType) {
      this.srcType = srcType;
   }

   public Integer getSrcType() {
      return this.srcType;
   }

   public void setStartId(Long startId) {
      this.startId = startId;
   }

   public Long getStartId() {
      return this.startId;
   }

   public String getApiMethod() {
      return "jingdong.seller.promotion.v2.list";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("ip", this.ip);
      pmap.put("port", this.port);
      pmap.put("promo_id", this.promoId);
      pmap.put("name", this.name);
      pmap.put("type", this.type);
      pmap.put("favor_mode", this.favorMode);
      pmap.put("begin_time", this.beginTime);
      pmap.put("end_time", this.endTime);
      pmap.put("promo_status", this.promoStatus);
      pmap.put("ware_id", this.wareId);
      pmap.put("sku_id", this.skuId);
      pmap.put("page", this.page);
      pmap.put("pageS_size", this.pageSSize);
      pmap.put("src_type", this.srcType);
      pmap.put("start_id", this.startId);
      return JsonUtil.toJson(pmap);
   }

   public Class<SellerPromotionV2ListResponse> getResponseClass() {
      return SellerPromotionV2ListResponse.class;
   }
}
