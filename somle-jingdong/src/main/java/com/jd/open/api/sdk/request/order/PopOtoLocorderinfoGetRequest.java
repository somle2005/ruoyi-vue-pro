package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.PopOtoLocorderinfoGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopOtoLocorderinfoGetRequest extends AbstractRequest implements JdRequest<PopOtoLocorderinfoGetResponse> {
   private Long orderId;
   private Integer codeType;

   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public Long getOrderId() {
      return this.orderId;
   }

   public void setCodeType(Integer codeType) {
      this.codeType = codeType;
   }

   public Integer getCodeType() {
      return this.codeType;
   }

   public String getApiMethod() {
      return "jingdong.pop.oto.locorderinfo.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("order_id", this.orderId);
      pmap.put("code_type", this.codeType);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopOtoLocorderinfoGetResponse> getResponseClass() {
      return PopOtoLocorderinfoGetResponse.class;
   }
}
