package com.jd.open.api.sdk.request.refundapply;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.refundapply.PopAfsSoaRefundapplyReplyRefundResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopAfsSoaRefundapplyReplyRefundRequest extends AbstractRequest implements JdRequest<PopAfsSoaRefundapplyReplyRefundResponse> {
   private Long status;
   private Long id;
   private String checkUserName;
   private String remark;
   private Integer rejectType;
   private Integer outWareStatus;

   public void setStatus(Long status) {
      this.status = status;
   }

   public Long getStatus() {
      return this.status;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public Long getId() {
      return this.id;
   }

   public void setCheckUserName(String checkUserName) {
      this.checkUserName = checkUserName;
   }

   public String getCheckUserName() {
      return this.checkUserName;
   }

   public void setRemark(String remark) {
      this.remark = remark;
   }

   public String getRemark() {
      return this.remark;
   }

   public void setRejectType(Integer rejectType) {
      this.rejectType = rejectType;
   }

   public Integer getRejectType() {
      return this.rejectType;
   }

   public void setOutWareStatus(Integer outWareStatus) {
      this.outWareStatus = outWareStatus;
   }

   public Integer getOutWareStatus() {
      return this.outWareStatus;
   }

   public String getApiMethod() {
      return "jingdong.pop.afs.soa.refundapply.replyRefund";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("status", this.status);
      pmap.put("id", this.id);
      pmap.put("checkUserName", this.checkUserName);
      pmap.put("remark", this.remark);
      pmap.put("rejectType", this.rejectType);
      pmap.put("outWareStatus", this.outWareStatus);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopAfsSoaRefundapplyReplyRefundResponse> getResponseClass() {
      return PopAfsSoaRefundapplyReplyRefundResponse.class;
   }
}
