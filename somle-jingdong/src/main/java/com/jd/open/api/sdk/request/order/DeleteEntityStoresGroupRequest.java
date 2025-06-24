package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.DeleteEntityStoresGroupResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class DeleteEntityStoresGroupRequest extends AbstractRequest implements JdRequest<DeleteEntityStoresGroupResponse> {
   private Long id;
   private String name;
   private String storeId;

   public void setId(Long id) {
      this.id = id;
   }

   public Long getId() {
      return this.id;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getName() {
      return this.name;
   }

   public void setStoreId(String storeId) {
      this.storeId = storeId;
   }

   public String getStoreId() {
      return this.storeId;
   }

   public String getApiMethod() {
      return "jingdong.deleteEntityStoresGroup";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("id", this.id);
      pmap.put("name", this.name);
      pmap.put("storeId", this.storeId);
      return JsonUtil.toJson(pmap);
   }

   public Class<DeleteEntityStoresGroupResponse> getResponseClass() {
      return DeleteEntityStoresGroupResponse.class;
   }
}
