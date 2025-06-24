package com.jd.open.api.sdk.request.xny;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.xny.CarNotificationStationStatusResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class CarNotificationStationStatusRequest extends AbstractRequest implements JdRequest<CarNotificationStationStatusResponse> {
   private Integer venderId;
   private String ConnectorID;
   private Integer Status;
   private Integer ParkStatus;
   private Integer LockStatus;

   public void setVenderId(Integer venderId) {
      this.venderId = venderId;
   }

   public Integer getVenderId() {
      return this.venderId;
   }

   public void setConnectorID(String ConnectorID) {
      this.ConnectorID = ConnectorID;
   }

   public String getConnectorID() {
      return this.ConnectorID;
   }

   public void setStatus(Integer Status) {
      this.Status = Status;
   }

   public Integer getStatus() {
      return this.Status;
   }

   public void setParkStatus(Integer ParkStatus) {
      this.ParkStatus = ParkStatus;
   }

   public Integer getParkStatus() {
      return this.ParkStatus;
   }

   public void setLockStatus(Integer LockStatus) {
      this.LockStatus = LockStatus;
   }

   public Integer getLockStatus() {
      return this.LockStatus;
   }

   public String getApiMethod() {
      return "jingdong.car.notificationStationStatus";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("venderId", this.venderId);
      pmap.put("ConnectorID", this.ConnectorID);
      pmap.put("Status", this.Status);
      pmap.put("ParkStatus", this.ParkStatus);
      pmap.put("LockStatus", this.LockStatus);
      return JsonUtil.toJson(pmap);
   }

   public Class<CarNotificationStationStatusResponse> getResponseClass() {
      return CarNotificationStationStatusResponse.class;
   }
}
