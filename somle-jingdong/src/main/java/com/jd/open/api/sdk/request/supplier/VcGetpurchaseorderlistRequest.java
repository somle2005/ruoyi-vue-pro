package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.VcGetpurchaseorderlistResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class VcGetpurchaseorderlistRequest extends AbstractRequest implements JdRequest<VcGetpurchaseorderlistResponse> {
   private Date createdDateStart;
   private Date createdDateEnd;
   private Integer deliverCenterId;
   private Integer status;
   private Boolean isEptCustomized;
   private Integer pageIndex;
   private Integer pageSize;
   private String orderIds;
   private String wareIds;
   private String states;
   private String confirmStates;

   public void setCreatedDateStart(Date createdDateStart) {
      this.createdDateStart = createdDateStart;
   }

   public Date getCreatedDateStart() {
      return this.createdDateStart;
   }

   public void setCreatedDateEnd(Date createdDateEnd) {
      this.createdDateEnd = createdDateEnd;
   }

   public Date getCreatedDateEnd() {
      return this.createdDateEnd;
   }

   public void setDeliverCenterId(Integer deliverCenterId) {
      this.deliverCenterId = deliverCenterId;
   }

   public Integer getDeliverCenterId() {
      return this.deliverCenterId;
   }

   public void setStatus(Integer status) {
      this.status = status;
   }

   public Integer getStatus() {
      return this.status;
   }

   public void setIsEptCustomized(Boolean isEptCustomized) {
      this.isEptCustomized = isEptCustomized;
   }

   public Boolean getIsEptCustomized() {
      return this.isEptCustomized;
   }

   public void setPageIndex(Integer pageIndex) {
      this.pageIndex = pageIndex;
   }

   public Integer getPageIndex() {
      return this.pageIndex;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setOrderIds(String orderIds) {
      this.orderIds = orderIds;
   }

   public String getOrderIds() {
      return this.orderIds;
   }

   public void setWareIds(String wareIds) {
      this.wareIds = wareIds;
   }

   public String getWareIds() {
      return this.wareIds;
   }

   public void setStates(String states) {
      this.states = states;
   }

   public String getStates() {
      return this.states;
   }

   public void setConfirmStates(String confirmStates) {
      this.confirmStates = confirmStates;
   }

   public String getConfirmStates() {
      return this.confirmStates;
   }

   public String getApiMethod() {
      return "jingdong.vc.getpurchaseorderlist";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();

      try {
         if (this.createdDateStart != null) {
            pmap.put("created_date_start", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.createdDateStart));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.createdDateEnd != null) {
            pmap.put("created_date_end", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.createdDateEnd));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("deliver_center_id", this.deliverCenterId);
      pmap.put("status", this.status);
      pmap.put("is_ept_customized", this.isEptCustomized);
      pmap.put("page_index", this.pageIndex);
      pmap.put("page_size", this.pageSize);
      pmap.put("orderIds", this.orderIds);
      pmap.put("wareIds", this.wareIds);
      pmap.put("states", this.states);
      pmap.put("confirmStates", this.confirmStates);
      return JsonUtil.toJson(pmap);
   }

   public Class<VcGetpurchaseorderlistResponse> getResponseClass() {
      return VcGetpurchaseorderlistResponse.class;
   }
}
