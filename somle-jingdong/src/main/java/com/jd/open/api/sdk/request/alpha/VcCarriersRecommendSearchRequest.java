package com.jd.open.api.sdk.request.alpha;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.alpha.VcCarriersRecommendSearchResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VcCarriersRecommendSearchRequest extends AbstractRequest implements JdRequest<VcCarriersRecommendSearchResponse> {
   private Long orderId;
   private Integer receiveProvinceId;
   private Integer receiveCityId;
   private Integer receiveCountyId;
   private Integer receiveTownId;

   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public Long getOrderId() {
      return this.orderId;
   }

   public void setReceiveProvinceId(Integer receiveProvinceId) {
      this.receiveProvinceId = receiveProvinceId;
   }

   public Integer getReceiveProvinceId() {
      return this.receiveProvinceId;
   }

   public void setReceiveCityId(Integer receiveCityId) {
      this.receiveCityId = receiveCityId;
   }

   public Integer getReceiveCityId() {
      return this.receiveCityId;
   }

   public void setReceiveCountyId(Integer receiveCountyId) {
      this.receiveCountyId = receiveCountyId;
   }

   public Integer getReceiveCountyId() {
      return this.receiveCountyId;
   }

   public void setReceiveTownId(Integer receiveTownId) {
      this.receiveTownId = receiveTownId;
   }

   public Integer getReceiveTownId() {
      return this.receiveTownId;
   }

   public String getApiMethod() {
      return "jingdong.vc.carriers.recommend.search";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderId", this.orderId);
      pmap.put("receiveProvinceId", this.receiveProvinceId);
      pmap.put("receiveCityId", this.receiveCityId);
      pmap.put("receiveCountyId", this.receiveCountyId);
      pmap.put("receiveTownId", this.receiveTownId);
      return JsonUtil.toJson(pmap);
   }

   public Class<VcCarriersRecommendSearchResponse> getResponseClass() {
      return VcCarriersRecommendSearchResponse.class;
   }
}
