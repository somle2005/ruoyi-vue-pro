package com.jd.open.api.sdk.request.hudong;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.hudong.JosFansActivityWriteService.request.createGiftActivityWithResult.ClientSource;
import com.jd.open.api.sdk.domain.hudong.JosFansActivityWriteService.request.createGiftActivityWithResult.GiftActivity;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.InteractCenterApiJosJosFansActivityWriteServiceCreateGiftActivityWithResultResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class InteractCenterApiJosJosFansActivityWriteServiceCreateGiftActivityWithResultRequest extends AbstractRequest implements JdRequest<InteractCenterApiJosJosFansActivityWriteServiceCreateGiftActivityWithResultResponse> {
   private ClientSource clientSource;
   private GiftActivity giftActivity;

   public String getApiMethod() {
      return "jingdong.interact.center.api.jos.JosFansActivityWriteService.createGiftActivityWithResult";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("clientSource", this.clientSource);
      pmap.put("giftActivity", this.giftActivity);
      return JsonUtil.toJson(pmap);
   }

   public Class<InteractCenterApiJosJosFansActivityWriteServiceCreateGiftActivityWithResultResponse> getResponseClass() {
      return InteractCenterApiJosJosFansActivityWriteServiceCreateGiftActivityWithResultResponse.class;
   }

   @JsonProperty("clientSource")
   public void setClientSource(ClientSource clientSource) {
      this.clientSource = clientSource;
   }

   @JsonProperty("clientSource")
   public ClientSource getClientSource() {
      return this.clientSource;
   }

   @JsonProperty("giftActivity")
   public void setGiftActivity(GiftActivity giftActivity) {
      this.giftActivity = giftActivity;
   }

   @JsonProperty("giftActivity")
   public GiftActivity getGiftActivity() {
      return this.giftActivity;
   }
}
