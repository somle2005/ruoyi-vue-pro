package com.jd.open.api.sdk.request.jinsuanpan;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.jinsuanpan.FinInvoiceApplyOrderProvider.request.list.ApplyOrderJosQueryParam;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jinsuanpan.ShopCinvoiceApplyOrderListResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ShopCinvoiceApplyOrderListRequest extends AbstractRequest implements JdRequest<ShopCinvoiceApplyOrderListResponse> {
   private ApplyOrderJosQueryParam param;

   public String getApiMethod() {
      return "jingdong.shop.cinvoice.apply.order.list";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("param", this.param);
      return JsonUtil.toJson(pmap);
   }

   public Class<ShopCinvoiceApplyOrderListResponse> getResponseClass() {
      return ShopCinvoiceApplyOrderListResponse.class;
   }

   @JsonProperty("param")
   public void setParam(ApplyOrderJosQueryParam param) {
      this.param = param;
   }

   @JsonProperty("param")
   public ApplyOrderJosQueryParam getParam() {
      return this.param;
   }
}
