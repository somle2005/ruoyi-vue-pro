package com.jd.open.api.sdk.request.udp;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.udp.DataVenderSmsSignStatusGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class DataVenderSmsSignStatusGetRequest extends AbstractRequest implements JdRequest<DataVenderSmsSignStatusGetResponse> {
   private Integer channel;

   public void setChannel(Integer channel) {
      this.channel = channel;
   }

   public Integer getChannel() {
      return this.channel;
   }

   public String getApiMethod() {
      return "jingdong.data.vender.sms.sign.status.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("channel", this.channel);
      return JsonUtil.toJson(pmap);
   }

   public Class<DataVenderSmsSignStatusGetResponse> getResponseClass() {
      return DataVenderSmsSignStatusGetResponse.class;
   }
}
