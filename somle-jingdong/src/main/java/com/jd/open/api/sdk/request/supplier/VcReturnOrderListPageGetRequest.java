package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.VcReturnOrderListPageGetResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class VcReturnOrderListPageGetRequest extends AbstractRequest implements JdRequest<VcReturnOrderListPageGetResponse> {
   private Long returnId;
   private Integer fromDeliverCenterId;
   private String returnStates;
   private Date createDateBegin;
   private Date createDateEnd;
   private Integer pageSize;
   private Integer pageIndex;
   private Integer refundOrderType;

   public void setReturnId(Long returnId) {
      this.returnId = returnId;
   }

   public Long getReturnId() {
      return this.returnId;
   }

   public void setFromDeliverCenterId(Integer fromDeliverCenterId) {
      this.fromDeliverCenterId = fromDeliverCenterId;
   }

   public Integer getFromDeliverCenterId() {
      return this.fromDeliverCenterId;
   }

   public void setReturnStates(String returnStates) {
      this.returnStates = returnStates;
   }

   public String getReturnStates() {
      return this.returnStates;
   }

   public void setCreateDateBegin(Date createDateBegin) {
      this.createDateBegin = createDateBegin;
   }

   public Date getCreateDateBegin() {
      return this.createDateBegin;
   }

   public void setCreateDateEnd(Date createDateEnd) {
      this.createDateEnd = createDateEnd;
   }

   public Date getCreateDateEnd() {
      return this.createDateEnd;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setPageIndex(Integer pageIndex) {
      this.pageIndex = pageIndex;
   }

   public Integer getPageIndex() {
      return this.pageIndex;
   }

   public void setRefundOrderType(Integer refundOrderType) {
      this.refundOrderType = refundOrderType;
   }

   public Integer getRefundOrderType() {
      return this.refundOrderType;
   }

   public String getApiMethod() {
      return "jingdong.vc.return.order.list.page.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("returnId", this.returnId);
      pmap.put("fromDeliverCenterId", this.fromDeliverCenterId);
      pmap.put("returnStates", this.returnStates);

      try {
         if (this.createDateBegin != null) {
            pmap.put("createDateBegin", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.createDateBegin));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.createDateEnd != null) {
            pmap.put("createDateEnd", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.createDateEnd));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("pageSize", this.pageSize);
      pmap.put("pageIndex", this.pageIndex);
      pmap.put("refundOrderType", this.refundOrderType);
      return JsonUtil.toJson(pmap);
   }

   public Class<VcReturnOrderListPageGetResponse> getResponseClass() {
      return VcReturnOrderListPageGetResponse.class;
   }
}
