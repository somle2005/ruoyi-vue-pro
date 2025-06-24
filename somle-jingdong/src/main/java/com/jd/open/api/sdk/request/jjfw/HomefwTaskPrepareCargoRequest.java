package com.jd.open.api.sdk.request.jjfw;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jjfw.HomefwTaskPrepareCargoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class HomefwTaskPrepareCargoRequest extends AbstractRequest implements JdRequest<HomefwTaskPrepareCargoResponse> {
   private String venderCode;
   private String orderNo;
   private String remark;

   public void setVenderCode(String venderCode) {
      this.venderCode = venderCode;
   }

   public String getVenderCode() {
      return this.venderCode;
   }

   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   public String getOrderNo() {
      return this.orderNo;
   }

   public void setRemark(String remark) {
      this.remark = remark;
   }

   public String getRemark() {
      return this.remark;
   }

   public String getApiMethod() {
      return "jingdong.homefw.task.prepareCargo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("venderCode", this.venderCode);
      pmap.put("orderNo", this.orderNo);
      pmap.put("remark", this.remark);
      return JsonUtil.toJson(pmap);
   }

   public Class<HomefwTaskPrepareCargoResponse> getResponseClass() {
      return HomefwTaskPrepareCargoResponse.class;
   }
}
