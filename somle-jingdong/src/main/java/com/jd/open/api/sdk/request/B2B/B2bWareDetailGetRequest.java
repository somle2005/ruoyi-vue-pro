package com.jd.open.api.sdk.request.B2B;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.B2B.B2bWareDetailGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class B2bWareDetailGetRequest extends AbstractRequest implements JdRequest<B2bWareDetailGetResponse> {
   private String channelEnum;
   private String bSkuGetExtendEnumsKyes;
   private String bSkuGetEnumsKeys;
   private String jdSkuIdsKeys;

   public void setChannelEnum(String channelEnum) {
      this.channelEnum = channelEnum;
   }

   public String getChannelEnum() {
      return this.channelEnum;
   }

   public void setBSkuGetExtendEnumsKyes(String bSkuGetExtendEnumsKyes) {
      this.bSkuGetExtendEnumsKyes = bSkuGetExtendEnumsKyes;
   }

   public String getBSkuGetExtendEnumsKyes() {
      return this.bSkuGetExtendEnumsKyes;
   }

   public void setBSkuGetEnumsKeys(String bSkuGetEnumsKeys) {
      this.bSkuGetEnumsKeys = bSkuGetEnumsKeys;
   }

   public String getBSkuGetEnumsKeys() {
      return this.bSkuGetEnumsKeys;
   }

   public void setJdSkuIdsKeys(String jdSkuIdsKeys) {
      this.jdSkuIdsKeys = jdSkuIdsKeys;
   }

   public String getJdSkuIdsKeys() {
      return this.jdSkuIdsKeys;
   }

   public String getApiMethod() {
      return "jingdong.b2b.ware.detail.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("channelEnum", this.channelEnum);
      pmap.put("bSkuGetExtendEnumsKyes", this.bSkuGetExtendEnumsKyes);
      pmap.put("bSkuGetEnumsKeys", this.bSkuGetEnumsKeys);
      pmap.put("jdSkuIdsKeys", this.jdSkuIdsKeys);
      return JsonUtil.toJson(pmap);
   }

   public Class<B2bWareDetailGetResponse> getResponseClass() {
      return B2bWareDetailGetResponse.class;
   }
}
