package com.jd.open.api.sdk.request.sellercat;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.sellercat.SellerCatAddResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SellerCatAddRequest extends AbstractRequest implements JdRequest<SellerCatAddResponse> {
   private String parentId;
   private String name;
   private Boolean isOpen;
   private Boolean isHomeShow;

   public String getApiMethod() {
      return "360buy.sellercat.add";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> map = new TreeMap();
      map.put("parent_id", this.parentId);
      map.put("name", this.name);
      map.put("is_open", this.isOpen);
      map.put("is_home_show", this.isHomeShow);
      return JsonUtil.toJson(map);
   }

   public Class<SellerCatAddResponse> getResponseClass() {
      return SellerCatAddResponse.class;
   }

   public String getParentId() {
      return this.parentId;
   }

   public void setParentId(String parentId) {
      this.parentId = parentId;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Boolean getOpen() {
      return this.isOpen;
   }

   public void setOpen(Boolean open) {
      this.isOpen = open;
   }

   public Boolean getHomeShow() {
      return this.isHomeShow;
   }

   public void setHomeShow(Boolean homeShow) {
      this.isHomeShow = homeShow;
   }
}
