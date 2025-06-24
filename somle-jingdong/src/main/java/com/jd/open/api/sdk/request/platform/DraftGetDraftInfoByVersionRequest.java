package com.jd.open.api.sdk.request.platform;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.platform.DraftGetDraftInfoByVersionResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class DraftGetDraftInfoByVersionRequest extends AbstractRequest implements JdRequest<DraftGetDraftInfoByVersionResponse> {
   private Long productId;
   private Integer resultMode;
   private Long draftVersion;

   public void setProductId(Long productId) {
      this.productId = productId;
   }

   public Long getProductId() {
      return this.productId;
   }

   public void setResultMode(Integer resultMode) {
      this.resultMode = resultMode;
   }

   public Integer getResultMode() {
      return this.resultMode;
   }

   public void setDraftVersion(Long draftVersion) {
      this.draftVersion = draftVersion;
   }

   public Long getDraftVersion() {
      return this.draftVersion;
   }

   public String getApiMethod() {
      return "jingdong.draft.getDraftInfoByVersion";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("productId", this.productId);
      pmap.put("resultMode", this.resultMode);
      pmap.put("draftVersion", this.draftVersion);
      return JsonUtil.toJson(pmap);
   }

   public Class<DraftGetDraftInfoByVersionResponse> getResponseClass() {
      return DraftGetDraftInfoByVersionResponse.class;
   }
}
