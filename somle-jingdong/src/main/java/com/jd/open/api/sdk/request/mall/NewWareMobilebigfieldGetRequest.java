package com.jd.open.api.sdk.request.mall;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.mall.NewWareMobilebigfieldGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class NewWareMobilebigfieldGetRequest extends AbstractRequest implements JdRequest<NewWareMobilebigfieldGetResponse> {
   private Long skuid;

   public void setSkuid(Long skuid) {
      this.skuid = skuid;
   }

   public Long getSkuid() {
      return this.skuid;
   }

   public String getApiMethod() {
      return "jingdong.new.ware.mobilebigfield.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("skuid", this.skuid);
      return JsonUtil.toJson(pmap);
   }

   public Class<NewWareMobilebigfieldGetResponse> getResponseClass() {
      return NewWareMobilebigfieldGetResponse.class;
   }
}
