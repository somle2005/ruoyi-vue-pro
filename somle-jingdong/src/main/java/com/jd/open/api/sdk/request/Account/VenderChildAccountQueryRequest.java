package com.jd.open.api.sdk.request.Account;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.Account.VenderChildAccountQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VenderChildAccountQueryRequest extends AbstractRequest implements JdRequest<VenderChildAccountQueryResponse> {
   private int page;
   private int size;

   public void setPage(int page) {
      this.page = page;
   }

   public int getPage() {
      return this.page;
   }

   public void setSize(int size) {
      this.size = size;
   }

   public int getSize() {
      return this.size;
   }

   public String getApiMethod() {
      return "jingdong.vender.childAccount.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("page", this.page);
      pmap.put("size", this.size);
      return JsonUtil.toJson(pmap);
   }

   public Class<VenderChildAccountQueryResponse> getResponseClass() {
      return VenderChildAccountQueryResponse.class;
   }
}
