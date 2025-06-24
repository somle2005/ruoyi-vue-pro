package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpGoodsQueryGoodsSerialResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpGoodsQueryGoodsSerialRequest extends AbstractRequest implements JdRequest<EclpGoodsQueryGoodsSerialResponse> {
   private String bizNo;

   public void setBizNo(String bizNo) {
      this.bizNo = bizNo;
   }

   public String getBizNo() {
      return this.bizNo;
   }

   public String getApiMethod() {
      return "jingdong.eclp.goods.queryGoodsSerial";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("bizNo", this.bizNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpGoodsQueryGoodsSerialResponse> getResponseClass() {
      return EclpGoodsQueryGoodsSerialResponse.class;
   }
}
