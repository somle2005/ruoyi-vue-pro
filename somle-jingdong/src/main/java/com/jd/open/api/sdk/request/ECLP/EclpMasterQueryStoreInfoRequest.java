package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpMasterQueryStoreInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpMasterQueryStoreInfoRequest extends AbstractRequest implements JdRequest<EclpMasterQueryStoreInfoResponse> {
   private Integer page;
   private Integer pageSize;
   private String sellerNo;
   private String storeNo;

   public void setPage(Integer page) {
      this.page = page;
   }

   public Integer getPage() {
      return this.page;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setSellerNo(String sellerNo) {
      this.sellerNo = sellerNo;
   }

   public String getSellerNo() {
      return this.sellerNo;
   }

   public void setStoreNo(String storeNo) {
      this.storeNo = storeNo;
   }

   public String getStoreNo() {
      return this.storeNo;
   }

   public String getApiMethod() {
      return "jingdong.eclp.master.queryStoreInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("page", this.page);
      pmap.put("pageSize", this.pageSize);
      pmap.put("sellerNo", this.sellerNo);
      pmap.put("storeNo", this.storeNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpMasterQueryStoreInfoResponse> getResponseClass() {
      return EclpMasterQueryStoreInfoResponse.class;
   }
}
