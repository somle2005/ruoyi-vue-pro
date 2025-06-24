package com.jd.open.api.sdk.request.jjfw;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jjfw.HomefwTaskMeasuredResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class HomefwTaskMeasuredRequest extends AbstractRequest implements JdRequest<HomefwTaskMeasuredResponse> {
   private String venderCode;
   private String orderNo;
   private String surveLinks;
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

   public void setSurveLinks(String surveLinks) {
      this.surveLinks = surveLinks;
   }

   public String getSurveLinks() {
      return this.surveLinks;
   }

   public void setRemark(String remark) {
      this.remark = remark;
   }

   public String getRemark() {
      return this.remark;
   }

   public String getApiMethod() {
      return "jingdong.homefw.task.measured";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("venderCode", this.venderCode);
      pmap.put("orderNo", this.orderNo);
      pmap.put("surveLinks", this.surveLinks);
      pmap.put("remark", this.remark);
      return JsonUtil.toJson(pmap);
   }

   public Class<HomefwTaskMeasuredResponse> getResponseClass() {
      return HomefwTaskMeasuredResponse.class;
   }
}
