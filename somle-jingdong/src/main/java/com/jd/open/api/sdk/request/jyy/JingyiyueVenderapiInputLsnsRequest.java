package com.jd.open.api.sdk.request.jyy;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jyy.JingyiyueVenderapiInputLsnsResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class JingyiyueVenderapiInputLsnsRequest extends AbstractRequest implements JdRequest<JingyiyueVenderapiInputLsnsResponse> {
   private String sourceKey;
   private Long appointOrderId;
   private String logisticsNo;
   private String logisticsSource;
   private String operateUser;

   public void setSourceKey(String sourceKey) {
      this.sourceKey = sourceKey;
   }

   public String getSourceKey() {
      return this.sourceKey;
   }

   public void setAppointOrderId(Long appointOrderId) {
      this.appointOrderId = appointOrderId;
   }

   public Long getAppointOrderId() {
      return this.appointOrderId;
   }

   public void setLogisticsNo(String logisticsNo) {
      this.logisticsNo = logisticsNo;
   }

   public String getLogisticsNo() {
      return this.logisticsNo;
   }

   public void setLogisticsSource(String logisticsSource) {
      this.logisticsSource = logisticsSource;
   }

   public String getLogisticsSource() {
      return this.logisticsSource;
   }

   public void setOperateUser(String operateUser) {
      this.operateUser = operateUser;
   }

   public String getOperateUser() {
      return this.operateUser;
   }

   public String getApiMethod() {
      return "jingdong.jingyiyue.venderapi.inputLsns";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("sourceKey", this.sourceKey);
      pmap.put("appointOrderId", this.appointOrderId);
      pmap.put("logisticsNo", this.logisticsNo);
      pmap.put("logisticsSource", this.logisticsSource);
      pmap.put("operateUser", this.operateUser);
      return JsonUtil.toJson(pmap);
   }

   public Class<JingyiyueVenderapiInputLsnsResponse> getResponseClass() {
      return JingyiyueVenderapiInputLsnsResponse.class;
   }
}
