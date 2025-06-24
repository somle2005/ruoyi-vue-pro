package com.jd.open.api.sdk.request.xfylapi;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.xfylapi.HealthcarePushGoodsStoreInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class HealthcarePushGoodsStoreInfoRequest extends AbstractRequest implements JdRequest<HealthcarePushGoodsStoreInfoResponse> {
   private String goodsId;
   private Integer status;
   private Long channelType;
   private String storeId;
   private Integer vipType;

   public void setGoodsId(String goodsId) {
      this.goodsId = goodsId;
   }

   public String getGoodsId() {
      return this.goodsId;
   }

   public void setStatus(Integer status) {
      this.status = status;
   }

   public Integer getStatus() {
      return this.status;
   }

   public void setChannelType(Long channelType) {
      this.channelType = channelType;
   }

   public Long getChannelType() {
      return this.channelType;
   }

   public void setStoreId(String storeId) {
      this.storeId = storeId;
   }

   public String getStoreId() {
      return this.storeId;
   }

   public void setVipType(Integer vipType) {
      this.vipType = vipType;
   }

   public Integer getVipType() {
      return this.vipType;
   }

   public String getApiMethod() {
      return "jingdong.healthcare.pushGoodsStoreInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("goodsId", this.goodsId);
      pmap.put("status", this.status);
      pmap.put("channelType", this.channelType);
      pmap.put("storeId", this.storeId);
      pmap.put("vipType", this.vipType);
      return JsonUtil.toJson(pmap);
   }

   public Class<HealthcarePushGoodsStoreInfoResponse> getResponseClass() {
      return HealthcarePushGoodsStoreInfoResponse.class;
   }
}
