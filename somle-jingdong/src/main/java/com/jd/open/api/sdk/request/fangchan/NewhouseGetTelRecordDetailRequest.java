package com.jd.open.api.sdk.request.fangchan;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.fangchan.NewhouseGetTelRecordDetailResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class NewhouseGetTelRecordDetailRequest extends AbstractRequest implements JdRequest<NewhouseGetTelRecordDetailResponse> {
   private Integer channelId;
   private Integer clueId;

   public void setChannelId(Integer channelId) {
      this.channelId = channelId;
   }

   public Integer getChannelId() {
      return this.channelId;
   }

   public void setClueId(Integer clueId) {
      this.clueId = clueId;
   }

   public Integer getClueId() {
      return this.clueId;
   }

   public String getApiMethod() {
      return "jingdong.newhouse.getTelRecordDetail";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("channelId", this.channelId);
      pmap.put("clueId", this.clueId);
      return JsonUtil.toJson(pmap);
   }

   public Class<NewhouseGetTelRecordDetailResponse> getResponseClass() {
      return NewhouseGetTelRecordDetailResponse.class;
   }
}
