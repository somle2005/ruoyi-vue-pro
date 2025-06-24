package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.VcGetrequisitiondetailbywareidResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VcGetrequisitiondetailbywareidRequest extends AbstractRequest implements JdRequest<VcGetrequisitiondetailbywareidResponse> {
   private Long wareId;
   private Integer deliverCenterId;

   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   public Long getWareId() {
      return this.wareId;
   }

   public void setDeliverCenterId(Integer deliverCenterId) {
      this.deliverCenterId = deliverCenterId;
   }

   public Integer getDeliverCenterId() {
      return this.deliverCenterId;
   }

   public String getApiMethod() {
      return "jingdong.vc.getrequisitiondetailbywareid";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("ware_id", this.wareId);
      pmap.put("deliver_center_id", this.deliverCenterId);
      return JsonUtil.toJson(pmap);
   }

   public Class<VcGetrequisitiondetailbywareidResponse> getResponseClass() {
      return VcGetrequisitiondetailbywareidResponse.class;
   }
}
