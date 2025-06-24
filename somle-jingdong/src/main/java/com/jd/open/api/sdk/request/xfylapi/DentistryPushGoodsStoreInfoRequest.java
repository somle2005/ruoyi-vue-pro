package com.jd.open.api.sdk.request.xfylapi;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.xfylapi.DentistryPushGoodsStoreInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class DentistryPushGoodsStoreInfoRequest extends AbstractRequest implements JdRequest<DentistryPushGoodsStoreInfoResponse> {
   private String goodsId;
   private Long channelType;
   private Integer status;
   private String storeId;

   public void setGoodsId(String goodsId) {
      this.goodsId = goodsId;
   }

   public String getGoodsId() {
      return this.goodsId;
   }

   public void setChannelType(Long channelType) {
      this.channelType = channelType;
   }

   public Long getChannelType() {
      return this.channelType;
   }

   public void setStatus(Integer status) {
      this.status = status;
   }

   public Integer getStatus() {
      return this.status;
   }

   public void setStoreId(String storeId) {
      this.storeId = storeId;
   }

   public String getStoreId() {
      return this.storeId;
   }

   public String getApiMethod() {
      return "jingdong.dentistry.pushGoodsStoreInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("goodsId", this.goodsId);
      pmap.put("channelType", this.channelType);
      pmap.put("status", this.status);
      pmap.put("storeId", this.storeId);
      return JsonUtil.toJson(pmap);
   }

   public Class<DentistryPushGoodsStoreInfoResponse> getResponseClass() {
      return DentistryPushGoodsStoreInfoResponse.class;
   }
}
