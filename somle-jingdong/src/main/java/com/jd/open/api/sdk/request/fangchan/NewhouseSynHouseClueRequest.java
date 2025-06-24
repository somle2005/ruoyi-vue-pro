package com.jd.open.api.sdk.request.fangchan;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.fangchan.NewhouseSynHouseClueResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class NewhouseSynHouseClueRequest extends AbstractRequest implements JdRequest<NewhouseSynHouseClueResponse> {
   private Integer clueId;
   private Integer channelId;

   public void setClueId(Integer clueId) {
      this.clueId = clueId;
   }

   public Integer getClueId() {
      return this.clueId;
   }

   public void setChannelId(Integer channelId) {
      this.channelId = channelId;
   }

   public Integer getChannelId() {
      return this.channelId;
   }

   public String getApiMethod() {
      return "jingdong.newhouse.synHouseClue";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("clueId", this.clueId);
      pmap.put("channelId", this.channelId);
      return JsonUtil.toJson(pmap);
   }

   public Class<NewhouseSynHouseClueResponse> getResponseClass() {
      return NewhouseSynHouseClueResponse.class;
   }
}
