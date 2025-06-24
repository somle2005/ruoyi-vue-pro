package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpMasterQuerySellerCategoryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpMasterQuerySellerCategoryRequest extends AbstractRequest implements JdRequest<EclpMasterQuerySellerCategoryResponse> {
   private String deptNo;
   private String categoryNo;

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
   }

   public void setCategoryNo(String categoryNo) {
      this.categoryNo = categoryNo;
   }

   public String getCategoryNo() {
      return this.categoryNo;
   }

   public String getApiMethod() {
      return "jingdong.eclp.master.querySellerCategory";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("deptNo", this.deptNo);
      pmap.put("categoryNo", this.categoryNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpMasterQuerySellerCategoryResponse> getResponseClass() {
      return EclpMasterQuerySellerCategoryResponse.class;
   }
}
