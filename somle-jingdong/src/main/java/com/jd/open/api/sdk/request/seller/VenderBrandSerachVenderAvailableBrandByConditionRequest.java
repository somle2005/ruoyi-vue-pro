package com.jd.open.api.sdk.request.seller;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.seller.VenderBrandSerachVenderAvailableBrandByConditionResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VenderBrandSerachVenderAvailableBrandByConditionRequest extends AbstractRequest implements JdRequest<VenderBrandSerachVenderAvailableBrandByConditionResponse> {
   private String brandName;
   private Long brandId;
   private int rowCount;
   private int pageNum;
   private Long categoryId;

   public void setBrandName(String brandName) {
      this.brandName = brandName;
   }

   public String getBrandName() {
      return this.brandName;
   }

   public void setBrandId(Long brandId) {
      this.brandId = brandId;
   }

   public Long getBrandId() {
      return this.brandId;
   }

   public void setRowCount(int rowCount) {
      this.rowCount = rowCount;
   }

   public int getRowCount() {
      return this.rowCount;
   }

   public void setPageNum(int pageNum) {
      this.pageNum = pageNum;
   }

   public int getPageNum() {
      return this.pageNum;
   }

   public void setCategoryId(Long categoryId) {
      this.categoryId = categoryId;
   }

   public Long getCategoryId() {
      return this.categoryId;
   }

   public String getApiMethod() {
      return "jingdong.vender.brand.serachVenderAvailableBrandByCondition";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("brandName", this.brandName);
      pmap.put("brandId", this.brandId);
      pmap.put("rowCount", this.rowCount);
      pmap.put("pageNum", this.pageNum);
      pmap.put("categoryId", this.categoryId);
      return JsonUtil.toJson(pmap);
   }

   public Class<VenderBrandSerachVenderAvailableBrandByConditionResponse> getResponseClass() {
      return VenderBrandSerachVenderAvailableBrandByConditionResponse.class;
   }
}
