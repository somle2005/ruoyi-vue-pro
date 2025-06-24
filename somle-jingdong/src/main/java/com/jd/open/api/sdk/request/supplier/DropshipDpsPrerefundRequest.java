package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.DropshipDpsPrerefundResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class DropshipDpsPrerefundRequest extends AbstractRequest implements JdRequest<DropshipDpsPrerefundResponse> {
   private Long customOrderId;
   private String approvalSuggestion;
   private String approvalState;
   private Long id;
   private int operatorState;

   public void setCustomOrderId(Long customOrderId) {
      this.customOrderId = customOrderId;
   }

   public Long getCustomOrderId() {
      return this.customOrderId;
   }

   public void setApprovalSuggestion(String approvalSuggestion) {
      this.approvalSuggestion = approvalSuggestion;
   }

   public String getApprovalSuggestion() {
      return this.approvalSuggestion;
   }

   public void setApprovalState(String approvalState) {
      this.approvalState = approvalState;
   }

   public String getApprovalState() {
      return this.approvalState;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public Long getId() {
      return this.id;
   }

   public void setOperatorState(int operatorState) {
      this.operatorState = operatorState;
   }

   public int getOperatorState() {
      return this.operatorState;
   }

   public String getApiMethod() {
      return "jingdong.dropship.dps.prerefund";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("customOrderId", this.customOrderId);
      pmap.put("approvalSuggestion", this.approvalSuggestion);
      pmap.put("approvalState", this.approvalState);
      pmap.put("id", this.id);
      pmap.put("operatorState", this.operatorState);
      return JsonUtil.toJson(pmap);
   }

   public Class<DropshipDpsPrerefundResponse> getResponseClass() {
      return DropshipDpsPrerefundResponse.class;
   }
}
