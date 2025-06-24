package com.jd.open.api.sdk.request.refundapply;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.refundapply.PopAfsSoaRefundapplyUpdateWarehouseStatusResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopAfsSoaRefundapplyUpdateWarehouseStatusRequest extends AbstractRequest implements JdRequest<PopAfsSoaRefundapplyUpdateWarehouseStatusResponse> {
   private Long orderId;
   private Long refId;
   private Integer status;

   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public Long getOrderId() {
      return this.orderId;
   }

   public void setRefId(Long refId) {
      this.refId = refId;
   }

   public Long getRefId() {
      return this.refId;
   }

   public void setStatus(Integer status) {
      this.status = status;
   }

   public Integer getStatus() {
      return this.status;
   }

   public String getApiMethod() {
      return "jingdong.pop.afs.soa.refundapply.updateWarehouseStatus";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderId", this.orderId);
      pmap.put("refId", this.refId);
      pmap.put("status", this.status);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopAfsSoaRefundapplyUpdateWarehouseStatusResponse> getResponseClass() {
      return PopAfsSoaRefundapplyUpdateWarehouseStatusResponse.class;
   }
}
