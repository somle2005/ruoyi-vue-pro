package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.NewWareVenderSkusQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class NewWareVenderSkusQueryRequest extends AbstractRequest implements JdRequest<NewWareVenderSkusQueryResponse> {
   private int index;

   public void setIndex(int index) {
      this.index = index;
   }

   public int getIndex() {
      return this.index;
   }

   public String getApiMethod() {
      return "jingdong.new.ware.vender.skus.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("index", this.index);
      return JsonUtil.toJson(pmap);
   }

   public Class<NewWareVenderSkusQueryResponse> getResponseClass() {
      return NewWareVenderSkusQueryResponse.class;
   }
}
