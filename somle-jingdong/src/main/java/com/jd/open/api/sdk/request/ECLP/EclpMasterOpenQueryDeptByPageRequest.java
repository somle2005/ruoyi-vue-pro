package com.jd.open.api.sdk.request.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.request.queryDeptByPage.Page;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpMasterOpenQueryDeptByPageResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpMasterOpenQueryDeptByPageRequest extends AbstractRequest implements JdRequest<EclpMasterOpenQueryDeptByPageResponse> {
   private String deptNos;
   private Page page;

   public String getApiMethod() {
      return "jingdong.eclp.master.open.queryDeptByPage";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("deptNos", this.deptNos);
      pmap.put("page", this.page);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpMasterOpenQueryDeptByPageResponse> getResponseClass() {
      return EclpMasterOpenQueryDeptByPageResponse.class;
   }

   @JsonProperty("deptNos")
   public void setDeptNos(String deptNos) {
      this.deptNos = deptNos;
   }

   @JsonProperty("deptNos")
   public String getDeptNos() {
      return this.deptNos;
   }

   @JsonProperty("page")
   public void setPage(Page page) {
      this.page = page;
   }

   @JsonProperty("page")
   public Page getPage() {
      return this.page;
   }
}
