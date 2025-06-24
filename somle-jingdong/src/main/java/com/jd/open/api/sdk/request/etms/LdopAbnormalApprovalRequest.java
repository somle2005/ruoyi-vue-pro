package com.jd.open.api.sdk.request.etms;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.etms.LdopAbnormalApprovalResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LdopAbnormalApprovalRequest extends AbstractRequest implements JdRequest<LdopAbnormalApprovalResponse> {
   private String customerCode;
   private String deliveryId;
   private String responseComment;
   private Integer type;

   public void setCustomerCode(String customerCode) {
      this.customerCode = customerCode;
   }

   public String getCustomerCode() {
      return this.customerCode;
   }

   public void setDeliveryId(String deliveryId) {
      this.deliveryId = deliveryId;
   }

   public String getDeliveryId() {
      return this.deliveryId;
   }

   public void setResponseComment(String responseComment) {
      this.responseComment = responseComment;
   }

   public String getResponseComment() {
      return this.responseComment;
   }

   public void setType(Integer type) {
      this.type = type;
   }

   public Integer getType() {
      return this.type;
   }

   public String getApiMethod() {
      return "jingdong.ldop.abnormal.approval";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("customerCode", this.customerCode);
      pmap.put("deliveryId", this.deliveryId);
      pmap.put("responseComment", this.responseComment);
      pmap.put("type", this.type);
      return JsonUtil.toJson(pmap);
   }

   public Class<LdopAbnormalApprovalResponse> getResponseClass() {
      return LdopAbnormalApprovalResponse.class;
   }
}
