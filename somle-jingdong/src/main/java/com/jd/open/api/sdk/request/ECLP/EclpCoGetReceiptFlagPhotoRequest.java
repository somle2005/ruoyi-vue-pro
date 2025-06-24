package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpCoGetReceiptFlagPhotoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpCoGetReceiptFlagPhotoRequest extends AbstractRequest implements JdRequest<EclpCoGetReceiptFlagPhotoResponse> {
   private String lwbNo;

   public void setLwbNo(String lwbNo) {
      this.lwbNo = lwbNo;
   }

   public String getLwbNo() {
      return this.lwbNo;
   }

   public String getApiMethod() {
      return "jingdong.eclp.co.getReceiptFlagPhoto";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("lwbNo", this.lwbNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpCoGetReceiptFlagPhotoResponse> getResponseClass() {
      return EclpCoGetReceiptFlagPhotoResponse.class;
   }
}
