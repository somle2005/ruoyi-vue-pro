package com.jd.open.api.sdk.request.platform;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.platform.IsvUploadBatchLogResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class IsvUploadBatchLogRequest extends AbstractRequest implements JdRequest<IsvUploadBatchLogResponse> {
   private String josAppKey;
   private String data;
   private long timeStamp;
   private String type;

   public void setJosAppKey(String josAppKey) {
      this.josAppKey = josAppKey;
   }

   public String getJosAppKey() {
      return this.josAppKey;
   }

   public void setData(String data) {
      this.data = data;
   }

   public String getData() {
      return this.data;
   }

   public void setTimeStamp(long timeStamp) {
      this.timeStamp = timeStamp;
   }

   public long getTimeStamp() {
      return this.timeStamp;
   }

   public void setType(String type) {
      this.type = type;
   }

   public String getType() {
      return this.type;
   }

   public String getApiMethod() {
      return "jingdong.isv.uploadBatchLog";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("josAppKey", this.josAppKey);
      pmap.put("data", this.data);
      pmap.put("time_stamp", this.timeStamp);
      pmap.put("type", this.type);
      return JsonUtil.toJson(pmap);
   }

   public Class<IsvUploadBatchLogResponse> getResponseClass() {
      return IsvUploadBatchLogResponse.class;
   }
}
