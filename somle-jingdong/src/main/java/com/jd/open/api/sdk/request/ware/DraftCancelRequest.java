package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.DraftCancelResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class DraftCancelRequest extends AbstractRequest implements JdRequest<DraftCancelResponse> {
   private Long productId;
   private Long draftVersion;

   public void setProductId(Long productId) {
      this.productId = productId;
   }

   public Long getProductId() {
      return this.productId;
   }

   public void setDraftVersion(Long draftVersion) {
      this.draftVersion = draftVersion;
   }

   public Long getDraftVersion() {
      return this.draftVersion;
   }

   public String getApiMethod() {
      return "jingdong.draft.cancel";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("productId", this.productId);
      pmap.put("draftVersion", this.draftVersion);
      return JsonUtil.toJson(pmap);
   }

   public Class<DraftCancelResponse> getResponseClass() {
      return DraftCancelResponse.class;
   }
}
