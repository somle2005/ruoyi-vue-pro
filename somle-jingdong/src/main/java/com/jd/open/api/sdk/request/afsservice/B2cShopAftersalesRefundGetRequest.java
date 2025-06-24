package com.jd.open.api.sdk.request.afsservice;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.afsservice.B2cShopAftersalesRefundGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class B2cShopAftersalesRefundGetRequest extends AbstractRequest implements JdRequest<B2cShopAftersalesRefundGetResponse> {
   private Long afsServiceId;
   private Integer skuNum;

   public void setAfsServiceId(Long afsServiceId) {
      this.afsServiceId = afsServiceId;
   }

   public Long getAfsServiceId() {
      return this.afsServiceId;
   }

   public void setSkuNum(Integer skuNum) {
      this.skuNum = skuNum;
   }

   public Integer getSkuNum() {
      return this.skuNum;
   }

   public String getApiMethod() {
      return "jingdong.b2c.shop.aftersales.refund.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("afsServiceId", this.afsServiceId);
      pmap.put("skuNum", this.skuNum);
      return JsonUtil.toJson(pmap);
   }

   public Class<B2cShopAftersalesRefundGetResponse> getResponseClass() {
      return B2cShopAftersalesRefundGetResponse.class;
   }
}
