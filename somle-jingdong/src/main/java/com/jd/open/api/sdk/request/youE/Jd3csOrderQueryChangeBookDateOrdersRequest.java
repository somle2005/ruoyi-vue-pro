package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.Jd3csOrderQueryChangeBookDateOrdersResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Jd3csOrderQueryChangeBookDateOrdersRequest extends AbstractRequest implements JdRequest<Jd3csOrderQueryChangeBookDateOrdersResponse> {
   private String venderCode;
   private String appId;
   private String createBy;
   private Integer data;

   public void setVenderCode(String venderCode) {
      this.venderCode = venderCode;
   }

   public String getVenderCode() {
      return this.venderCode;
   }

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public void setCreateBy(String createBy) {
      this.createBy = createBy;
   }

   public String getCreateBy() {
      return this.createBy;
   }

   public void setData(Integer data) {
      this.data = data;
   }

   public Integer getData() {
      return this.data;
   }

   public String getApiMethod() {
      return "jingdong.jd3cs.order.queryChangeBookDateOrders";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("venderCode", this.venderCode);
      pmap.put("appId", this.appId);
      pmap.put("createBy", this.createBy);
      pmap.put("data", this.data);
      return JsonUtil.toJson(pmap);
   }

   public Class<Jd3csOrderQueryChangeBookDateOrdersResponse> getResponseClass() {
      return Jd3csOrderQueryChangeBookDateOrdersResponse.class;
   }
}
