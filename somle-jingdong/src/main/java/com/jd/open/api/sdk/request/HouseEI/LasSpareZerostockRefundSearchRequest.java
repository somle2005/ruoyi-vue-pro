package com.jd.open.api.sdk.request.HouseEI;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.HouseEI.LasSpareZerostockRefundSearchResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LasSpareZerostockRefundSearchRequest extends AbstractRequest implements JdRequest<LasSpareZerostockRefundSearchResponse> {
   private String outNo;

   public void setOutNo(String outNo) {
      this.outNo = outNo;
   }

   public String getOutNo() {
      return this.outNo;
   }

   public String getApiMethod() {
      return "jingdong.las.spare.zerostock.refund.search";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("out_no", this.outNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<LasSpareZerostockRefundSearchResponse> getResponseClass() {
      return LasSpareZerostockRefundSearchResponse.class;
   }
}
