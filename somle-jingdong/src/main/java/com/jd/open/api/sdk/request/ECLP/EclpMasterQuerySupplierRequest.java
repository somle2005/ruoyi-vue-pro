package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpMasterQuerySupplierResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpMasterQuerySupplierRequest extends AbstractRequest implements JdRequest<EclpMasterQuerySupplierResponse> {
   private String deptNo;
   private String supplierNos;

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
   }

   public void setSupplierNos(String supplierNos) {
      this.supplierNos = supplierNos;
   }

   public String getSupplierNos() {
      return this.supplierNos;
   }

   public String getApiMethod() {
      return "jingdong.eclp.master.querySupplier";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("deptNo", this.deptNo);
      pmap.put("supplierNos", this.supplierNos);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpMasterQuerySupplierResponse> getResponseClass() {
      return EclpMasterQuerySupplierResponse.class;
   }
}
