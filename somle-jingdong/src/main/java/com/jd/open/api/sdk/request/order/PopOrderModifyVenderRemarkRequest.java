package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.PopOrderModifyVenderRemarkResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopOrderModifyVenderRemarkRequest extends AbstractRequest implements JdRequest<PopOrderModifyVenderRemarkResponse> {
   private Long orderId;
   private int flag;
   private String remark;

   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public Long getOrderId() {
      return this.orderId;
   }

   public void setFlag(int flag) {
      this.flag = flag;
   }

   public int getFlag() {
      return this.flag;
   }

   public void setRemark(String remark) {
      this.remark = remark;
   }

   public String getRemark() {
      return this.remark;
   }

   public String getApiMethod() {
      return "jingdong.pop.order.modifyVenderRemark";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("order_id", this.orderId);
      pmap.put("flag", this.flag);
      pmap.put("remark", this.remark);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopOrderModifyVenderRemarkResponse> getResponseClass() {
      return PopOrderModifyVenderRemarkResponse.class;
   }
}
