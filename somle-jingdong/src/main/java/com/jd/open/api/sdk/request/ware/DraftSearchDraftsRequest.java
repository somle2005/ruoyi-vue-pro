package com.jd.open.api.sdk.request.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.JosDraftReadService.request.searchDrafts.JosSearchDraftParam;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.DraftSearchDraftsResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class DraftSearchDraftsRequest extends AbstractRequest implements JdRequest<DraftSearchDraftsResponse> {
   private JosSearchDraftParam josSearchDraftParam;

   public String getApiMethod() {
      return "jingdong.draft.searchDrafts";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("josSearchDraftParam", this.josSearchDraftParam);
      return JsonUtil.toJson(pmap);
   }

   public Class<DraftSearchDraftsResponse> getResponseClass() {
      return DraftSearchDraftsResponse.class;
   }

   @JsonProperty("josSearchDraftParam")
   public void setJosSearchDraftParam(JosSearchDraftParam josSearchDraftParam) {
      this.josSearchDraftParam = josSearchDraftParam;
   }

   @JsonProperty("josSearchDraftParam")
   public JosSearchDraftParam getJosSearchDraftParam() {
      return this.josSearchDraftParam;
   }
}
