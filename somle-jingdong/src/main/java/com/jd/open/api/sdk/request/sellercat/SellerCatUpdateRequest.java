package com.jd.open.api.sdk.request.sellercat;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.sellercat.SellerCatUpdateResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SellerCatUpdateRequest extends AbstractRequest implements JdRequest<SellerCatUpdateResponse> {
   private String cid;
   private String name;
   private Boolean isHomeShow;

   public String getCid() {
      return this.cid;
   }

   public void setCid(String cid) {
      this.cid = cid;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Boolean getHomeShow() {
      return this.isHomeShow;
   }

   public void setHomeShow(Boolean homeShow) {
      this.isHomeShow = homeShow;
   }

   public String getApiMethod() {
      return "360buy.sellercat.update";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("cid", this.cid);
      pmap.put("name", this.name);
      pmap.put("is_home_show", this.isHomeShow);
      return JsonUtil.toJson(pmap);
   }

   public Class<SellerCatUpdateResponse> getResponseClass() {
      return SellerCatUpdateResponse.class;
   }
}
