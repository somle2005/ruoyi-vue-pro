package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.Jd3csOrderQueryDeliverOrdersResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class Jd3csOrderQueryDeliverOrdersRequest extends AbstractRequest implements JdRequest<Jd3csOrderQueryDeliverOrdersResponse> {
   private String venderCode;
   private String appId;
   private String createBy;
   private String orderNo;
   private Integer pageNo;
   private Date startTime;
   private Date endTime;
   private Integer confirmState;

   public void setVenderCode(String venderCode) {
      this.venderCode = venderCode;
   }

   public String getVenderCode() {
      return this.venderCode;
   }

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public void setCreateBy(String createBy) {
      this.createBy = createBy;
   }

   public String getCreateBy() {
      return this.createBy;
   }

   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   public String getOrderNo() {
      return this.orderNo;
   }

   public void setPageNo(Integer pageNo) {
      this.pageNo = pageNo;
   }

   public Integer getPageNo() {
      return this.pageNo;
   }

   public void setStartTime(Date startTime) {
      this.startTime = startTime;
   }

   public Date getStartTime() {
      return this.startTime;
   }

   public void setEndTime(Date endTime) {
      this.endTime = endTime;
   }

   public Date getEndTime() {
      return this.endTime;
   }

   public void setConfirmState(Integer confirmState) {
      this.confirmState = confirmState;
   }

   public Integer getConfirmState() {
      return this.confirmState;
   }

   public String getApiMethod() {
      return "jingdong.jd3cs.order.queryDeliverOrders";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("venderCode", this.venderCode);
      pmap.put("appId", this.appId);
      pmap.put("createBy", this.createBy);
      pmap.put("orderNo", this.orderNo);
      pmap.put("pageNo", this.pageNo);

      try {
         if (this.startTime != null) {
            pmap.put("startTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.startTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.endTime != null) {
            pmap.put("endTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.endTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("confirmState", this.confirmState);
      return JsonUtil.toJson(pmap);
   }

   public Class<Jd3csOrderQueryDeliverOrdersResponse> getResponseClass() {
      return Jd3csOrderQueryDeliverOrdersResponse.class;
   }
}
