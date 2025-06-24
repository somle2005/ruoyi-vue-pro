package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.IvcProductConfigSdkServiceLowestBuySetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class IvcProductConfigSdkServiceLowestBuySetRequest extends AbstractRequest implements JdRequest<IvcProductConfigSdkServiceLowestBuySetResponse> {
   private Integer lowestBuyNum;
   private Long skuId;
   private Integer gmspbcNum;
   private String appKey;

   public void setLowestBuyNum(Integer lowestBuyNum) {
      this.lowestBuyNum = lowestBuyNum;
   }

   public Integer getLowestBuyNum() {
      return this.lowestBuyNum;
   }

   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   public Long getSkuId() {
      return this.skuId;
   }

   public void setGmspbcNum(Integer gmspbcNum) {
      this.gmspbcNum = gmspbcNum;
   }

   public Integer getGmspbcNum() {
      return this.gmspbcNum;
   }

   public void setAppKey(String appKey) {
      this.appKey = appKey;
   }

   public String getAppKey() {
      return this.appKey;
   }

   public String getApiMethod() {
      return "jingdong.ivc.productConfigSdkService.lowestBuy.set";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("lowestBuyNum", this.lowestBuyNum);
      pmap.put("skuId", this.skuId);
      pmap.put("gmspbcNum", this.gmspbcNum);
      pmap.put("appKey", this.appKey);
      return JsonUtil.toJson(pmap);
   }

   public Class<IvcProductConfigSdkServiceLowestBuySetResponse> getResponseClass() {
      return IvcProductConfigSdkServiceLowestBuySetResponse.class;
   }
}
