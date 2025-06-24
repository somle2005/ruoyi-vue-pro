package com.jd.open.api.sdk.request.evaluation;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.evaluation.PopGetCommentSummarysResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopGetCommentSummarysRequest extends AbstractRequest implements JdRequest<PopGetCommentSummarysResponse> {
   private Integer aggr;
   private String objectIds;

   public void setAggr(Integer aggr) {
      this.aggr = aggr;
   }

   public Integer getAggr() {
      return this.aggr;
   }

   public void setObjectIds(String objectIds) {
      this.objectIds = objectIds;
   }

   public String getObjectIds() {
      return this.objectIds;
   }

   public String getApiMethod() {
      return "jingdong.pop.getCommentSummarys";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("aggr", this.aggr);
      pmap.put("objectIds", this.objectIds);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopGetCommentSummarysResponse> getResponseClass() {
      return PopGetCommentSummarysResponse.class;
   }
}
