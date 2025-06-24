package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.SiteEngineerEngineerIsAcceptOrderResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SiteEngineerEngineerIsAcceptOrderRequest extends AbstractRequest implements JdRequest<SiteEngineerEngineerIsAcceptOrderResponse> {
   private String appid;
   private Integer engineerId;
   private Integer isAcceptOrder;
   private Integer siteId;

   public void setAppid(String appid) {
      this.appid = appid;
   }

   public String getAppid() {
      return this.appid;
   }

   public void setEngineerId(Integer engineerId) {
      this.engineerId = engineerId;
   }

   public Integer getEngineerId() {
      return this.engineerId;
   }

   public void setIsAcceptOrder(Integer isAcceptOrder) {
      this.isAcceptOrder = isAcceptOrder;
   }

   public Integer getIsAcceptOrder() {
      return this.isAcceptOrder;
   }

   public void setSiteId(Integer siteId) {
      this.siteId = siteId;
   }

   public Integer getSiteId() {
      return this.siteId;
   }

   public String getApiMethod() {
      return "jingdong.siteEngineer.engineerIsAcceptOrder";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("appid", this.appid);
      pmap.put("engineerId", this.engineerId);
      pmap.put("isAcceptOrder", this.isAcceptOrder);
      pmap.put("siteId", this.siteId);
      return JsonUtil.toJson(pmap);
   }

   public Class<SiteEngineerEngineerIsAcceptOrderResponse> getResponseClass() {
      return SiteEngineerEngineerIsAcceptOrderResponse.class;
   }
}
