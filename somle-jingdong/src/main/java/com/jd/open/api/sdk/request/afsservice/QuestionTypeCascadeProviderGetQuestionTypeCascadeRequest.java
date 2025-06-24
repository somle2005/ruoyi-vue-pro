package com.jd.open.api.sdk.request.afsservice;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.afsservice.QuestionTypeCascadeProviderGetQuestionTypeCascadeResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class QuestionTypeCascadeProviderGetQuestionTypeCascadeRequest extends AbstractRequest implements JdRequest<QuestionTypeCascadeProviderGetQuestionTypeCascadeResponse> {
   private Integer parentId;
   private Long wareId;
   private Long afsApplyId;
   private String operatorPin;
   private String operatorNick;
   private String operatorRemark;
   private Date operatorDate;
   private int platformSrc;

   public void setParentId(Integer parentId) {
      this.parentId = parentId;
   }

   public Integer getParentId() {
      return this.parentId;
   }

   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   public Long getWareId() {
      return this.wareId;
   }

   public void setAfsApplyId(Long afsApplyId) {
      this.afsApplyId = afsApplyId;
   }

   public Long getAfsApplyId() {
      return this.afsApplyId;
   }

   public void setOperatorPin(String operatorPin) {
      this.operatorPin = operatorPin;
   }

   public String getOperatorPin() {
      return this.operatorPin;
   }

   public void setOperatorNick(String operatorNick) {
      this.operatorNick = operatorNick;
   }

   public String getOperatorNick() {
      return this.operatorNick;
   }

   public void setOperatorRemark(String operatorRemark) {
      this.operatorRemark = operatorRemark;
   }

   public String getOperatorRemark() {
      return this.operatorRemark;
   }

   public void setOperatorDate(Date operatorDate) {
      this.operatorDate = operatorDate;
   }

   public Date getOperatorDate() {
      return this.operatorDate;
   }

   public void setPlatformSrc(int platformSrc) {
      this.platformSrc = platformSrc;
   }

   public int getPlatformSrc() {
      return this.platformSrc;
   }

   public String getApiMethod() {
      return "jingdong.QuestionTypeCascadeProvider.getQuestionTypeCascade";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("parentId", this.parentId);
      pmap.put("wareId", this.wareId);
      pmap.put("afsApplyId", this.afsApplyId);
      pmap.put("operatorPin", this.operatorPin);
      pmap.put("operatorNick", this.operatorNick);
      pmap.put("operatorRemark", this.operatorRemark);

      try {
         if (this.operatorDate != null) {
            pmap.put("operatorDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.operatorDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("platformSrc", this.platformSrc);
      return JsonUtil.toJson(pmap);
   }

   public Class<QuestionTypeCascadeProviderGetQuestionTypeCascadeResponse> getResponseClass() {
      return QuestionTypeCascadeProviderGetQuestionTypeCascadeResponse.class;
   }
}
