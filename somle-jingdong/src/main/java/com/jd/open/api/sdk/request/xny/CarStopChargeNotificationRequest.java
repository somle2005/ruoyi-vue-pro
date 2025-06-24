package com.jd.open.api.sdk.request.xny;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.xny.CarStopChargeNotificationResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class CarStopChargeNotificationRequest extends AbstractRequest implements JdRequest<CarStopChargeNotificationResponse> {
   private Integer venderId;
   private String StartChargeSeq;
   private Integer SuccStat;
   private Integer StartChargeSeqStat;
   private Integer FailReason;
   private String ConnectorID;

   public void setVenderId(Integer venderId) {
      this.venderId = venderId;
   }

   public Integer getVenderId() {
      return this.venderId;
   }

   public void setStartChargeSeq(String StartChargeSeq) {
      this.StartChargeSeq = StartChargeSeq;
   }

   public String getStartChargeSeq() {
      return this.StartChargeSeq;
   }

   public void setSuccStat(Integer SuccStat) {
      this.SuccStat = SuccStat;
   }

   public Integer getSuccStat() {
      return this.SuccStat;
   }

   public void setStartChargeSeqStat(Integer StartChargeSeqStat) {
      this.StartChargeSeqStat = StartChargeSeqStat;
   }

   public Integer getStartChargeSeqStat() {
      return this.StartChargeSeqStat;
   }

   public void setFailReason(Integer FailReason) {
      this.FailReason = FailReason;
   }

   public Integer getFailReason() {
      return this.FailReason;
   }

   public void setConnectorID(String ConnectorID) {
      this.ConnectorID = ConnectorID;
   }

   public String getConnectorID() {
      return this.ConnectorID;
   }

   public String getApiMethod() {
      return "jingdong.car.stop.charge.notification";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("venderId", this.venderId);
      pmap.put("StartChargeSeq", this.StartChargeSeq);
      pmap.put("SuccStat", this.SuccStat);
      pmap.put("StartChargeSeqStat", this.StartChargeSeqStat);
      pmap.put("FailReason", this.FailReason);
      pmap.put("ConnectorID", this.ConnectorID);
      return JsonUtil.toJson(pmap);
   }

   public Class<CarStopChargeNotificationResponse> getResponseClass() {
      return CarStopChargeNotificationResponse.class;
   }
}
