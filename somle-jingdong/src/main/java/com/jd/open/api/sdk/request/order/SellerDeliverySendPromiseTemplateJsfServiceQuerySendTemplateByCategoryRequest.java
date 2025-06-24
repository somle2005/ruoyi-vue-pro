package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.SellerDeliverySendPromiseTemplateJsfServiceQuerySendTemplateByCategoryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SellerDeliverySendPromiseTemplateJsfServiceQuerySendTemplateByCategoryRequest extends AbstractRequest implements JdRequest<SellerDeliverySendPromiseTemplateJsfServiceQuerySendTemplateByCategoryResponse> {
   private Integer categoryId;
   private Boolean dzSku;

   public void setCategoryId(Integer categoryId) {
      this.categoryId = categoryId;
   }

   public Integer getCategoryId() {
      return this.categoryId;
   }

   public void setDzSku(Boolean dzSku) {
      this.dzSku = dzSku;
   }

   public Boolean getDzSku() {
      return this.dzSku;
   }

   public String getApiMethod() {
      return "jingdong.seller.delivery.SendPromiseTemplateJsfService.querySendTemplateByCategory";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("categoryId", this.categoryId);
      pmap.put("dzSku", this.dzSku);
      return JsonUtil.toJson(pmap);
   }

   public Class<SellerDeliverySendPromiseTemplateJsfServiceQuerySendTemplateByCategoryResponse> getResponseClass() {
      return SellerDeliverySendPromiseTemplateJsfServiceQuerySendTemplateByCategoryResponse.class;
   }
}
