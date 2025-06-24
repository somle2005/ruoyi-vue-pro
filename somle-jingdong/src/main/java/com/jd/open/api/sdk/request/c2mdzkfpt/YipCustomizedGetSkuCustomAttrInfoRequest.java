package com.jd.open.api.sdk.request.c2mdzkfpt;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.c2mdzkfpt.YipCustomizedGetSkuCustomAttrInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class YipCustomizedGetSkuCustomAttrInfoRequest extends AbstractRequest implements JdRequest<YipCustomizedGetSkuCustomAttrInfoResponse> {
   private String appId;
   private boolean isEnt;
   private String skuId;

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public void setIsEnt(boolean isEnt) {
      this.isEnt = isEnt;
   }

   public boolean getIsEnt() {
      return this.isEnt;
   }

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public String getSkuId() {
      return this.skuId;
   }

   public String getApiMethod() {
      return "jingdong.yip.customized.getSkuCustomAttrInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("appId", this.appId);
      pmap.put("isEnt", this.isEnt);
      pmap.put("skuId", this.skuId);
      return JsonUtil.toJson(pmap);
   }

   public Class<YipCustomizedGetSkuCustomAttrInfoResponse> getResponseClass() {
      return YipCustomizedGetSkuCustomAttrInfoResponse.class;
   }
}
