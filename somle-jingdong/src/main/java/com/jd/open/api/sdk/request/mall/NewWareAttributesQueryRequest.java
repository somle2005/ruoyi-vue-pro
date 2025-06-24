package com.jd.open.api.sdk.request.mall;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.mall.NewWareAttributesQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class NewWareAttributesQueryRequest extends AbstractRequest implements JdRequest<NewWareAttributesQueryResponse> {
   private String id;

   public void setId(String id) {
      this.id = id;
   }

   public String getId() {
      return this.id;
   }

   public String getApiMethod() {
      return "jingdong.new.ware.Attributes.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("id", this.id);
      return JsonUtil.toJson(pmap);
   }

   public Class<NewWareAttributesQueryResponse> getResponseClass() {
      return NewWareAttributesQueryResponse.class;
   }
}
