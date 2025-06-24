package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.VcItemExtPropsFindResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VcItemExtPropsFindRequest extends AbstractRequest implements JdRequest<VcItemExtPropsFindResponse> {
   private int categoryLeafId;

   public void setCategoryLeafId(int categoryLeafId) {
      this.categoryLeafId = categoryLeafId;
   }

   public int getCategoryLeafId() {
      return this.categoryLeafId;
   }

   public String getApiMethod() {
      return "jingdong.vc.item.extProps.find";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("category_leaf_id", this.categoryLeafId);
      return JsonUtil.toJson(pmap);
   }

   public Class<VcItemExtPropsFindResponse> getResponseClass() {
      return VcItemExtPropsFindResponse.class;
   }
}
