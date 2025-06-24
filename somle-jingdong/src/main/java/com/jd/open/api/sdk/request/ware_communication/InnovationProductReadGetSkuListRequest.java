package com.jd.open.api.sdk.request.ware_communication;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware_communication.InnovationProductReadGetSkuListResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class InnovationProductReadGetSkuListRequest extends AbstractRequest implements JdRequest<InnovationProductReadGetSkuListResponse> {
   private String spuId;
   private String skuId;
   private Integer pageNo;
   private Integer pageSize;
   private String categoryId;
   private String title;

   public void setSpuId(String spuId) {
      this.spuId = spuId;
   }

   public String getSpuId() {
      return this.spuId;
   }

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public String getSkuId() {
      return this.skuId;
   }

   public void setPageNo(Integer pageNo) {
      this.pageNo = pageNo;
   }

   public Integer getPageNo() {
      return this.pageNo;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setCategoryId(String categoryId) {
      this.categoryId = categoryId;
   }

   public String getCategoryId() {
      return this.categoryId;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getTitle() {
      return this.title;
   }

   public String getApiMethod() {
      return "jingdong.innovation.product.read.getSkuList";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("spuId", this.spuId);
      pmap.put("skuId", this.skuId);
      pmap.put("pageNo", this.pageNo);
      pmap.put("pageSize", this.pageSize);
      pmap.put("categoryId", this.categoryId);
      pmap.put("title", this.title);
      return JsonUtil.toJson(pmap);
   }

   public Class<InnovationProductReadGetSkuListResponse> getResponseClass() {
      return InnovationProductReadGetSkuListResponse.class;
   }
}
