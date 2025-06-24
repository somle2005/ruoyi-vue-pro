package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpMasterInsertSellerCategoryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpMasterInsertSellerCategoryRequest extends AbstractRequest implements JdRequest<EclpMasterInsertSellerCategoryResponse> {
   private String deptNo;
   private String categoryName;
   private String previousCategoryNo;

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
   }

   public void setCategoryName(String categoryName) {
      this.categoryName = categoryName;
   }

   public String getCategoryName() {
      return this.categoryName;
   }

   public void setPreviousCategoryNo(String previousCategoryNo) {
      this.previousCategoryNo = previousCategoryNo;
   }

   public String getPreviousCategoryNo() {
      return this.previousCategoryNo;
   }

   public String getApiMethod() {
      return "jingdong.eclp.master.insertSellerCategory";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("deptNo", this.deptNo);
      pmap.put("categoryName", this.categoryName);
      pmap.put("previousCategoryNo", this.previousCategoryNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpMasterInsertSellerCategoryResponse> getResponseClass() {
      return EclpMasterInsertSellerCategoryResponse.class;
   }
}
