package com.jd.open.api.sdk.request.directional;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.directional.JosMasterKeyGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class JosMasterKeyGetRequest extends AbstractRequest implements JdRequest<JosMasterKeyGetResponse> {
   private String sig;
   private String sdk_ver;
   private String ts;
   private String tid;

   public String getApiMethod() {
      return "jingdong.jos.master.key.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, String> map = new TreeMap();
      map.put("sig", this.sig);
      map.put("sdk_ver", this.sdk_ver);
      map.put("ts", this.ts);
      map.put("tid", this.tid);
      return JsonUtil.toJson(map);
   }

   public String getSig() {
      return this.sig;
   }

   public void setSig(String sig) {
      this.sig = sig;
   }

   public String getSdk_ver() {
      return this.sdk_ver;
   }

   public void setSdk_ver(String sdk_ver) {
      this.sdk_ver = sdk_ver;
   }

   public String getTs() {
      return this.ts;
   }

   public void setTs(String ts) {
      this.ts = ts;
   }

   public String getTid() {
      return this.tid;
   }

   public void setTid(String tid) {
      this.tid = tid;
   }

   public Class<JosMasterKeyGetResponse> getResponseClass() {
      return JosMasterKeyGetResponse.class;
   }
}
