package com.jd.open.api.sdk.request.mall;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.mall.NewWareBaseproductGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class NewWareBaseproductGetRequest extends AbstractRequest implements JdRequest<NewWareBaseproductGetResponse> {
   private String ids;
   private String basefields;

   public void setIds(String ids) {
      this.ids = ids;
   }

   public String getIds() {
      return this.ids;
   }

   public void setBasefields(String basefields) {
      this.basefields = basefields;
   }

   public String getBasefields() {
      return this.basefields;
   }

   public String getApiMethod() {
      return "jingdong.new.ware.baseproduct.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("ids", this.ids);
      pmap.put("basefields", this.basefields);
      return JsonUtil.toJson(pmap);
   }

   public Class<NewWareBaseproductGetResponse> getResponseClass() {
      return NewWareBaseproductGetResponse.class;
   }
}
