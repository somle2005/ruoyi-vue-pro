package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpMasterQueryDeptResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpMasterQueryDeptRequest extends AbstractRequest implements JdRequest<EclpMasterQueryDeptResponse> {
   private String deptNos;

   public void setDeptNos(String deptNos) {
      this.deptNos = deptNos;
   }

   public String getDeptNos() {
      return this.deptNos;
   }

   public String getApiMethod() {
      return "jingdong.eclp.master.queryDept";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("deptNos", this.deptNos);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpMasterQueryDeptResponse> getResponseClass() {
      return EclpMasterQueryDeptResponse.class;
   }
}
