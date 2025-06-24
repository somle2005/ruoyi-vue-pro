package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareWriteTransferMultiCategoryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareWriteTransferMultiCategoryRequest extends AbstractRequest implements JdRequest<WareWriteTransferMultiCategoryResponse> {
   private Long wareId;
   private Long multiCategoryId;

   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   public Long getWareId() {
      return this.wareId;
   }

   public void setMultiCategoryId(Long multiCategoryId) {
      this.multiCategoryId = multiCategoryId;
   }

   public Long getMultiCategoryId() {
      return this.multiCategoryId;
   }

   public String getApiMethod() {
      return "jingdong.ware.write.transferMultiCategory";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("wareId", this.wareId);
      pmap.put("multiCategoryId", this.multiCategoryId);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareWriteTransferMultiCategoryResponse> getResponseClass() {
      return WareWriteTransferMultiCategoryResponse.class;
   }
}
