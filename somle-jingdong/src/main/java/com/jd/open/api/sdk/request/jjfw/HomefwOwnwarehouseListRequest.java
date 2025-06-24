package com.jd.open.api.sdk.request.jjfw;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jjfw.HomefwOwnwarehouseListResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class HomefwOwnwarehouseListRequest extends AbstractRequest implements JdRequest<HomefwOwnwarehouseListResponse> {
   private String warehouseName;

   public void setWarehouseName(String warehouseName) {
      this.warehouseName = warehouseName;
   }

   public String getWarehouseName() {
      return this.warehouseName;
   }

   public String getApiMethod() {
      return "jingdong.homefw.ownwarehouse.list";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("warehouseName", this.warehouseName);
      return JsonUtil.toJson(pmap);
   }

   public Class<HomefwOwnwarehouseListResponse> getResponseClass() {
      return HomefwOwnwarehouseListResponse.class;
   }
}
