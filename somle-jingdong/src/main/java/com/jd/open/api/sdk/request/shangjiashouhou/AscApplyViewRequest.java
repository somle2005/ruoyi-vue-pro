package com.jd.open.api.sdk.request.shangjiashouhou;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.shangjiashouhou.AscApplyViewResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class AscApplyViewRequest extends AbstractRequest implements JdRequest<AscApplyViewResponse> {
   private String buId;
   private String operateNick;
   private Long serviceId;
   private Long skuId;

   public void setBuId(String buId) {
      this.buId = buId;
   }

   public String getBuId() {
      return this.buId;
   }

   public void setOperateNick(String operateNick) {
      this.operateNick = operateNick;
   }

   public String getOperateNick() {
      return this.operateNick;
   }

   public void setServiceId(Long serviceId) {
      this.serviceId = serviceId;
   }

   public Long getServiceId() {
      return this.serviceId;
   }

   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   public Long getSkuId() {
      return this.skuId;
   }

   public String getApiMethod() {
      return "jingdong.asc.apply.view";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("buId", this.buId);
      pmap.put("operateNick", this.operateNick);
      pmap.put("serviceId", this.serviceId);
      pmap.put("skuId", this.skuId);
      return JsonUtil.toJson(pmap);
   }

   public Class<AscApplyViewResponse> getResponseClass() {
      return AscApplyViewResponse.class;
   }
}
