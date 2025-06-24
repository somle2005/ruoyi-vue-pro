package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.GetWaybillAttachmentResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class GetWaybillAttachmentRequest extends AbstractRequest implements JdRequest<GetWaybillAttachmentResponse> {
   private Integer orderType;
   private String deliveryId;
   private Integer attachmentType;
   private String customerCode;

   public void setOrderType(Integer orderType) {
      this.orderType = orderType;
   }

   public Integer getOrderType() {
      return this.orderType;
   }

   public void setDeliveryId(String deliveryId) {
      this.deliveryId = deliveryId;
   }

   public String getDeliveryId() {
      return this.deliveryId;
   }

   public void setAttachmentType(Integer attachmentType) {
      this.attachmentType = attachmentType;
   }

   public Integer getAttachmentType() {
      return this.attachmentType;
   }

   public void setCustomerCode(String customerCode) {
      this.customerCode = customerCode;
   }

   public String getCustomerCode() {
      return this.customerCode;
   }

   public String getApiMethod() {
      return "jingdong.getWaybillAttachment";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderType", this.orderType);
      pmap.put("deliveryId", this.deliveryId);
      pmap.put("attachmentType", this.attachmentType);
      pmap.put("customerCode", this.customerCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<GetWaybillAttachmentResponse> getResponseClass() {
      return GetWaybillAttachmentResponse.class;
   }
}
