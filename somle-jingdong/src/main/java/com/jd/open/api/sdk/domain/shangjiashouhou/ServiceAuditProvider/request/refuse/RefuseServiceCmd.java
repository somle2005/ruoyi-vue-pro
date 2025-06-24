package com.jd.open.api.sdk.domain.shangjiashouhou.ServiceAuditProvider.request.refuse;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class RefuseServiceCmd implements Serializable {
   private String buId;
   private Integer questionTypeCid2;
   private Integer questionTypeCid1;
   private String approveNotes;
   private Long afsServiceId;
   private String remark;
   private String refuseReasonName;
   private boolean sendSmsFlag;
   private Integer auditBasisId;
   private List<WareDetailInfo> closeDetailInfo;
   private Integer refuseReason;
   private OperatorInfoReq operatorInfoReq;

   @JsonProperty("buId")
   public void setBuId(String buId) {
      this.buId = buId;
   }

   @JsonProperty("buId")
   public String getBuId() {
      return this.buId;
   }

   @JsonProperty("questionTypeCid2")
   public void setQuestionTypeCid2(Integer questionTypeCid2) {
      this.questionTypeCid2 = questionTypeCid2;
   }

   @JsonProperty("questionTypeCid2")
   public Integer getQuestionTypeCid2() {
      return this.questionTypeCid2;
   }

   @JsonProperty("questionTypeCid1")
   public void setQuestionTypeCid1(Integer questionTypeCid1) {
      this.questionTypeCid1 = questionTypeCid1;
   }

   @JsonProperty("questionTypeCid1")
   public Integer getQuestionTypeCid1() {
      return this.questionTypeCid1;
   }

   @JsonProperty("approveNotes")
   public void setApproveNotes(String approveNotes) {
      this.approveNotes = approveNotes;
   }

   @JsonProperty("approveNotes")
   public String getApproveNotes() {
      return this.approveNotes;
   }

   @JsonProperty("afsServiceId")
   public void setAfsServiceId(Long afsServiceId) {
      this.afsServiceId = afsServiceId;
   }

   @JsonProperty("afsServiceId")
   public Long getAfsServiceId() {
      return this.afsServiceId;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }

   @JsonProperty("refuseReasonName")
   public void setRefuseReasonName(String refuseReasonName) {
      this.refuseReasonName = refuseReasonName;
   }

   @JsonProperty("refuseReasonName")
   public String getRefuseReasonName() {
      return this.refuseReasonName;
   }

   @JsonProperty("sendSmsFlag")
   public void setSendSmsFlag(boolean sendSmsFlag) {
      this.sendSmsFlag = sendSmsFlag;
   }

   @JsonProperty("sendSmsFlag")
   public boolean getSendSmsFlag() {
      return this.sendSmsFlag;
   }

   @JsonProperty("auditBasisId")
   public void setAuditBasisId(Integer auditBasisId) {
      this.auditBasisId = auditBasisId;
   }

   @JsonProperty("auditBasisId")
   public Integer getAuditBasisId() {
      return this.auditBasisId;
   }

   @JsonProperty("closeDetailInfo")
   public void setCloseDetailInfo(List<WareDetailInfo> closeDetailInfo) {
      this.closeDetailInfo = closeDetailInfo;
   }

   @JsonProperty("closeDetailInfo")
   public List<WareDetailInfo> getCloseDetailInfo() {
      return this.closeDetailInfo;
   }

   @JsonProperty("refuseReason")
   public void setRefuseReason(Integer refuseReason) {
      this.refuseReason = refuseReason;
   }

   @JsonProperty("refuseReason")
   public Integer getRefuseReason() {
      return this.refuseReason;
   }

   @JsonProperty("operatorInfoReq")
   public void setOperatorInfoReq(OperatorInfoReq operatorInfoReq) {
      this.operatorInfoReq = operatorInfoReq;
   }

   @JsonProperty("operatorInfoReq")
   public OperatorInfoReq getOperatorInfoReq() {
      return this.operatorInfoReq;
   }
}
