package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.DraftGetLastestDraftResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class DraftGetLastestDraftRequest extends AbstractRequest implements JdRequest<DraftGetLastestDraftResponse> {
   private Long productId;

   public void setProductId(Long productId) {
      this.productId = productId;
   }

   public Long getProductId() {
      return this.productId;
   }

   public String getApiMethod() {
      return "jingdong.draft.getLastestDraft";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("productId", this.productId);
      return JsonUtil.toJson(pmap);
   }

   public Class<DraftGetLastestDraftResponse> getResponseClass() {
      return DraftGetLastestDraftResponse.class;
   }
}
