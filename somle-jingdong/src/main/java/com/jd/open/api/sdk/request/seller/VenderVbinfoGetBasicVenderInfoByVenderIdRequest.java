package com.jd.open.api.sdk.request.seller;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.seller.VenderVbinfoGetBasicVenderInfoByVenderIdResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VenderVbinfoGetBasicVenderInfoByVenderIdRequest extends AbstractRequest implements JdRequest<VenderVbinfoGetBasicVenderInfoByVenderIdResponse> {
   private String colNames;
   private int source;

   public void setColNames(String colNames) {
      this.colNames = colNames;
   }

   public String getColNames() {
      return this.colNames;
   }

   public void setSource(int source) {
      this.source = source;
   }

   public int getSource() {
      return this.source;
   }

   public String getApiMethod() {
      return "jingdong.vender.vbinfo.getBasicVenderInfoByVenderId";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("colNames", this.colNames);
      pmap.put("source", this.source);
      return JsonUtil.toJson(pmap);
   }

   public Class<VenderVbinfoGetBasicVenderInfoByVenderIdResponse> getResponseClass() {
      return VenderVbinfoGetBasicVenderInfoByVenderIdResponse.class;
   }
}
