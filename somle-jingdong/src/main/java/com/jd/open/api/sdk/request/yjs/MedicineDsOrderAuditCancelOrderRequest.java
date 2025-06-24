package com.jd.open.api.sdk.request.yjs;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.yjs.MedicineDsOrderAuditCancelOrderResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class MedicineDsOrderAuditCancelOrderRequest extends AbstractRequest implements JdRequest<MedicineDsOrderAuditCancelOrderResponse> {
   private String rejectReason;
   private Long cancelOrderId;
   private Boolean outOfDeptActual;
   private Integer rejectType;
   private Integer auditType;
   private String operateMan;
   private Date reqTimestamp;

   public void setRejectReason(String rejectReason) {
      this.rejectReason = rejectReason;
   }

   public String getRejectReason() {
      return this.rejectReason;
   }

   public void setCancelOrderId(Long cancelOrderId) {
      this.cancelOrderId = cancelOrderId;
   }

   public Long getCancelOrderId() {
      return this.cancelOrderId;
   }

   public void setOutOfDeptActual(Boolean outOfDeptActual) {
      this.outOfDeptActual = outOfDeptActual;
   }

   public Boolean getOutOfDeptActual() {
      return this.outOfDeptActual;
   }

   public void setRejectType(Integer rejectType) {
      this.rejectType = rejectType;
   }

   public Integer getRejectType() {
      return this.rejectType;
   }

   public void setAuditType(Integer auditType) {
      this.auditType = auditType;
   }

   public Integer getAuditType() {
      return this.auditType;
   }

   public void setOperateMan(String operateMan) {
      this.operateMan = operateMan;
   }

   public String getOperateMan() {
      return this.operateMan;
   }

   public void setReqTimestamp(Date reqTimestamp) {
      this.reqTimestamp = reqTimestamp;
   }

   public Date getReqTimestamp() {
      return this.reqTimestamp;
   }

   public String getApiMethod() {
      return "jingdong.medicine.ds.order.auditCancelOrder";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("rejectReason", this.rejectReason);
      pmap.put("cancelOrderId", this.cancelOrderId);
      pmap.put("outOfDeptActual", this.outOfDeptActual);
      pmap.put("rejectType", this.rejectType);
      pmap.put("auditType", this.auditType);
      pmap.put("operateMan", this.operateMan);

      try {
         if (this.reqTimestamp != null) {
            pmap.put("reqTimestamp", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.reqTimestamp));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      return JsonUtil.toJson(pmap);
   }

   public Class<MedicineDsOrderAuditCancelOrderResponse> getResponseClass() {
      return MedicineDsOrderAuditCancelOrderResponse.class;
   }
}
