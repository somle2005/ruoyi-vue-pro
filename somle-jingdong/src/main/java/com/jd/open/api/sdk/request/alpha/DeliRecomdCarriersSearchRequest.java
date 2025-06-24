package com.jd.open.api.sdk.request.alpha;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.alpha.DeliRecomdCarriersSearchResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class DeliRecomdCarriersSearchRequest extends AbstractRequest implements JdRequest<DeliRecomdCarriersSearchResponse> {
   private Long orderId;
   private String sku;
   private Integer sendProvinceId;
   private Integer sendCityId;
   private Integer sendCountyId;
   private Integer sendTownId;
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

   public void setSku(String sku) {
      this.sku = sku;
   }

   public String getSku() {
      return this.sku;
   }

   public void setSendProvinceId(Integer sendProvinceId) {
      this.sendProvinceId = sendProvinceId;
   }

   public Integer getSendProvinceId() {
      return this.sendProvinceId;
   }

   public void setSendCityId(Integer sendCityId) {
      this.sendCityId = sendCityId;
   }

   public Integer getSendCityId() {
      return this.sendCityId;
   }

   public void setSendCountyId(Integer sendCountyId) {
      this.sendCountyId = sendCountyId;
   }

   public Integer getSendCountyId() {
      return this.sendCountyId;
   }

   public void setSendTownId(Integer sendTownId) {
      this.sendTownId = sendTownId;
   }

   public Integer getSendTownId() {
      return this.sendTownId;
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
      return "jingdong.deliRecomdCarriers.search";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderId", this.orderId);
      pmap.put("sku", this.sku);
      pmap.put("sendProvinceId", this.sendProvinceId);
      pmap.put("sendCityId", this.sendCityId);
      pmap.put("sendCountyId", this.sendCountyId);
      pmap.put("sendTownId", this.sendTownId);
      pmap.put("receiveProvinceId", this.receiveProvinceId);
      pmap.put("receiveCityId", this.receiveCityId);
      pmap.put("receiveCountyId", this.receiveCountyId);
      pmap.put("receiveTownId", this.receiveTownId);
      return JsonUtil.toJson(pmap);
   }

   public Class<DeliRecomdCarriersSearchResponse> getResponseClass() {
      return DeliRecomdCarriersSearchResponse.class;
   }
}
