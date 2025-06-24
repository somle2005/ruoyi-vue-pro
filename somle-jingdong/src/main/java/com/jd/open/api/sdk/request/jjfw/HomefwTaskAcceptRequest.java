package com.jd.open.api.sdk.request.jjfw;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jjfw.HomefwTaskAcceptResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class HomefwTaskAcceptRequest extends AbstractRequest implements JdRequest<HomefwTaskAcceptResponse> {
   private String venderCode;
   private String orderNo;
   private Integer acceptType;
   private String remark;
   private String handleTime;
   private Integer isOneOrder;

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

   public void setAcceptType(Integer acceptType) {
      this.acceptType = acceptType;
   }

   public Integer getAcceptType() {
      return this.acceptType;
   }

   public void setRemark(String remark) {
      this.remark = remark;
   }

   public String getRemark() {
      return this.remark;
   }

   public void setHandleTime(String handleTime) {
      this.handleTime = handleTime;
   }

   public String getHandleTime() {
      return this.handleTime;
   }

   public void setIsOneOrder(Integer isOneOrder) {
      this.isOneOrder = isOneOrder;
   }

   public Integer getIsOneOrder() {
      return this.isOneOrder;
   }

   public String getApiMethod() {
      return "jingdong.homefw.task.accept";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("venderCode", this.venderCode);
      pmap.put("orderNo", this.orderNo);
      pmap.put("acceptType", this.acceptType);
      pmap.put("remark", this.remark);
      pmap.put("handleTime", this.handleTime);
      pmap.put("isOneOrder", this.isOneOrder);
      return JsonUtil.toJson(pmap);
   }

   public Class<HomefwTaskAcceptResponse> getResponseClass() {
      return HomefwTaskAcceptResponse.class;
   }
}
