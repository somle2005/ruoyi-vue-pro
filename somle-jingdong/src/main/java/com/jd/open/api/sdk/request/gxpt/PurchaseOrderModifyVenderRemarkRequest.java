package com.jd.open.api.sdk.request.gxpt;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.gxpt.PurchaseOrderModifyVenderRemarkResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PurchaseOrderModifyVenderRemarkRequest extends AbstractRequest implements JdRequest<PurchaseOrderModifyVenderRemarkResponse> {
   private Long orderId;
   private String remark;

   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public Long getOrderId() {
      return this.orderId;
   }

   public void setRemark(String remark) {
      this.remark = remark;
   }

   public String getRemark() {
      return this.remark;
   }

   public String getApiMethod() {
      return "jingdong.purchase.order.modifyVenderRemark";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderId", this.orderId);
      pmap.put("remark", this.remark);
      return JsonUtil.toJson(pmap);
   }

   public Class<PurchaseOrderModifyVenderRemarkResponse> getResponseClass() {
      return PurchaseOrderModifyVenderRemarkResponse.class;
   }
}
