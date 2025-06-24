package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpInsideCancelUlOrderResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpInsideCancelUlOrderRequest extends AbstractRequest implements JdRequest<EclpInsideCancelUlOrderResponse> {
   private String ulNo;
   private String outUlNo;
   private String deptNo;
   private String wareHouseNo;

   public void setUlNo(String ulNo) {
      this.ulNo = ulNo;
   }

   public String getUlNo() {
      return this.ulNo;
   }

   public void setOutUlNo(String outUlNo) {
      this.outUlNo = outUlNo;
   }

   public String getOutUlNo() {
      return this.outUlNo;
   }

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
   }

   public void setWareHouseNo(String wareHouseNo) {
      this.wareHouseNo = wareHouseNo;
   }

   public String getWareHouseNo() {
      return this.wareHouseNo;
   }

   public String getApiMethod() {
      return "jingdong.eclp.inside.cancelUlOrder";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("ulNo", this.ulNo);
      pmap.put("outUlNo", this.outUlNo);
      pmap.put("deptNo", this.deptNo);
      pmap.put("wareHouseNo", this.wareHouseNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpInsideCancelUlOrderResponse> getResponseClass() {
      return EclpInsideCancelUlOrderResponse.class;
   }
}
