package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeBizOrderJxfwJsfServiceRepairServiceCompleteResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class UeBizOrderJxfwJsfServiceRepairServiceCompleteRequest extends AbstractRequest implements JdRequest<UeBizOrderJxfwJsfServiceRepairServiceCompleteResponse> {
   private String createBy;
   private String orderNo;
   private String appId;
   private String dealResult;
   private Date operateDate;
   private String dealRemark;

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

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public void setDealResult(String dealResult) {
      this.dealResult = dealResult;
   }

   public String getDealResult() {
      return this.dealResult;
   }

   public void setOperateDate(Date operateDate) {
      this.operateDate = operateDate;
   }

   public Date getOperateDate() {
      return this.operateDate;
   }

   public void setDealRemark(String dealRemark) {
      this.dealRemark = dealRemark;
   }

   public String getDealRemark() {
      return this.dealRemark;
   }

   public String getApiMethod() {
      return "jingdong.ue.bizOrderJxfwJsfService.repairServiceComplete";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("createBy", this.createBy);
      pmap.put("orderNo", this.orderNo);
      pmap.put("appId", this.appId);
      pmap.put("dealResult", this.dealResult);

      try {
         if (this.operateDate != null) {
            pmap.put("operateDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.operateDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("dealRemark", this.dealRemark);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeBizOrderJxfwJsfServiceRepairServiceCompleteResponse> getResponseClass() {
      return UeBizOrderJxfwJsfServiceRepairServiceCompleteResponse.class;
   }
}
