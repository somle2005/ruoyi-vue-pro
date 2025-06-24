package com.jd.open.api.sdk.request.xny;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.xny.CarStartUpChargeNotificationResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class CarStartUpChargeNotificationRequest extends AbstractRequest implements JdRequest<CarStartUpChargeNotificationResponse> {
   private Integer venderId;
   private String StartChargeSeq;
   private Integer StartChargeSeqStat;
   private String StartTime;
   private String IdentCode;
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

   public void setStartChargeSeqStat(Integer StartChargeSeqStat) {
      this.StartChargeSeqStat = StartChargeSeqStat;
   }

   public Integer getStartChargeSeqStat() {
      return this.StartChargeSeqStat;
   }

   public void setStartTime(String StartTime) {
      this.StartTime = StartTime;
   }

   public String getStartTime() {
      return this.StartTime;
   }

   public void setIdentCode(String IdentCode) {
      this.IdentCode = IdentCode;
   }

   public String getIdentCode() {
      return this.IdentCode;
   }

   public void setConnectorID(String ConnectorID) {
      this.ConnectorID = ConnectorID;
   }

   public String getConnectorID() {
      return this.ConnectorID;
   }

   public String getApiMethod() {
      return "jingdong.car.start.up.charge.notification";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("venderId", this.venderId);
      pmap.put("StartChargeSeq", this.StartChargeSeq);
      pmap.put("StartChargeSeqStat", this.StartChargeSeqStat);
      pmap.put("StartTime", this.StartTime);
      pmap.put("IdentCode", this.IdentCode);
      pmap.put("ConnectorID", this.ConnectorID);
      return JsonUtil.toJson(pmap);
   }

   public Class<CarStartUpChargeNotificationResponse> getResponseClass() {
      return CarStartUpChargeNotificationResponse.class;
   }
}
