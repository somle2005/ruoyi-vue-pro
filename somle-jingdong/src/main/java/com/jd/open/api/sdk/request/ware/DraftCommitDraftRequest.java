package com.jd.open.api.sdk.request.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.JosDraftWriteService.request.commitDraft.JosDraftInfo;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.DraftCommitDraftResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class DraftCommitDraftRequest extends AbstractRequest implements JdRequest<DraftCommitDraftResponse> {
   private JosDraftInfo josDraftInfo;

   public String getApiMethod() {
      return "jingdong.draft.commitDraft";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("josDraftInfo", this.josDraftInfo);
      return JsonUtil.toJson(pmap);
   }

   public Class<DraftCommitDraftResponse> getResponseClass() {
      return DraftCommitDraftResponse.class;
   }

   @JsonProperty("josDraftInfo")
   public void setJosDraftInfo(JosDraftInfo josDraftInfo) {
      this.josDraftInfo = josDraftInfo;
   }

   @JsonProperty("josDraftInfo")
   public JosDraftInfo getJosDraftInfo() {
      return this.josDraftInfo;
   }
}
