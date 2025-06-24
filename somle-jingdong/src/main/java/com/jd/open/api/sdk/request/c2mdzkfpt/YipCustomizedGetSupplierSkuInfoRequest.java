package com.jd.open.api.sdk.request.c2mdzkfpt;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.c2mdzkfpt.YipCustomizedGetSupplierSkuInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class YipCustomizedGetSupplierSkuInfoRequest extends AbstractRequest implements JdRequest<YipCustomizedGetSupplierSkuInfoResponse> {
   private String skuList;
   private String supplier;
   private Integer pageSize;
   private Integer page;
   private String type;

   public void setSkuList(String skuList) {
      this.skuList = skuList;
   }

   public String getSkuList() {
      return this.skuList;
   }

   public void setSupplier(String supplier) {
      this.supplier = supplier;
   }

   public String getSupplier() {
      return this.supplier;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setPage(Integer page) {
      this.page = page;
   }

   public Integer getPage() {
      return this.page;
   }

   public void setType(String type) {
      this.type = type;
   }

   public String getType() {
      return this.type;
   }

   public String getApiMethod() {
      return "jingdong.yip.customized.getSupplierSkuInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("skuList", this.skuList);
      pmap.put("supplier", this.supplier);
      pmap.put("pageSize", this.pageSize);
      pmap.put("page", this.page);
      pmap.put("type", this.type);
      return JsonUtil.toJson(pmap);
   }

   public Class<YipCustomizedGetSupplierSkuInfoResponse> getResponseClass() {
      return YipCustomizedGetSupplierSkuInfoResponse.class;
   }
}
