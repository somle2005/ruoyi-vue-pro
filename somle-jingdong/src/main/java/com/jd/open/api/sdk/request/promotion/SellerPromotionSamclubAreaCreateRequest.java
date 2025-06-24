package com.jd.open.api.sdk.request.promotion;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.SellerPromotionSamclubAreaCreateResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SellerPromotionSamclubAreaCreateRequest extends AbstractRequest implements JdRequest<SellerPromotionSamclubAreaCreateResponse> {
   private String appSecret;
   private String ip;
   private String hostName;
   private String deployAppName;
   private String deployAppId;
   private String requestId;
   private Long skuId;
   private Double normalPrice;
   private Double clubPrice;
   private String areas;

   public void setAppSecret(String appSecret) {
      this.appSecret = appSecret;
   }

   public String getAppSecret() {
      return this.appSecret;
   }

   public void setIp(String ip) {
      this.ip = ip;
   }

   public String getIp() {
      return this.ip;
   }

   public void setHostName(String hostName) {
      this.hostName = hostName;
   }

   public String getHostName() {
      return this.hostName;
   }

   public void setDeployAppName(String deployAppName) {
      this.deployAppName = deployAppName;
   }

   public String getDeployAppName() {
      return this.deployAppName;
   }

   public void setDeployAppId(String deployAppId) {
      this.deployAppId = deployAppId;
   }

   public String getDeployAppId() {
      return this.deployAppId;
   }

   public void setRequestId(String requestId) {
      this.requestId = requestId;
   }

   public String getRequestId() {
      return this.requestId;
   }

   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   public Long getSkuId() {
      return this.skuId;
   }

   public void setNormalPrice(Double normalPrice) {
      this.normalPrice = normalPrice;
   }

   public Double getNormalPrice() {
      return this.normalPrice;
   }

   public void setClubPrice(Double clubPrice) {
      this.clubPrice = clubPrice;
   }

   public Double getClubPrice() {
      return this.clubPrice;
   }

   public void setAreas(String areas) {
      this.areas = areas;
   }

   public String getAreas() {
      return this.areas;
   }

   public String getApiMethod() {
      return "jingdong.seller.promotion.samclub.area.create";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("app_secret", this.appSecret);
      pmap.put("ip", this.ip);
      pmap.put("host_name", this.hostName);
      pmap.put("deploy_app_name", this.deployAppName);
      pmap.put("deploy_app_id", this.deployAppId);
      pmap.put("requestId", this.requestId);
      pmap.put("sku_id", this.skuId);
      pmap.put("normal_price", this.normalPrice);
      pmap.put("club_price", this.clubPrice);
      pmap.put("areas", this.areas);
      return JsonUtil.toJson(pmap);
   }

   public Class<SellerPromotionSamclubAreaCreateResponse> getResponseClass() {
      return SellerPromotionSamclubAreaCreateResponse.class;
   }
}
