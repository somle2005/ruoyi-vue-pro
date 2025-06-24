package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeOrderFinishBizProgressResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeOrderFinishBizProgressRequest extends AbstractRequest implements JdRequest<UeOrderFinishBizProgressResponse> {
   private String appId;
   private String barcode2;
   private String pic10;
   private String barcode1;
   private String failureReason;
   private String dealRemark;
   private String createBy;
   private String pic1;
   private String failureName;
   private String operateDate;
   private String orderNo;
   private String fixMethod;
   private String pic9;
   private String pic8;
   private String pic7;
   private String pic6;
   private String dealResult;
   private String pic5;
   private String pic4;
   private String usedMaterial;
   private String pic3;
   private String pic2;

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public void setBarcode2(String barcode2) {
      this.barcode2 = barcode2;
   }

   public String getBarcode2() {
      return this.barcode2;
   }

   public void setPic10(String pic10) {
      this.pic10 = pic10;
   }

   public String getPic10() {
      return this.pic10;
   }

   public void setBarcode1(String barcode1) {
      this.barcode1 = barcode1;
   }

   public String getBarcode1() {
      return this.barcode1;
   }

   public void setFailureReason(String failureReason) {
      this.failureReason = failureReason;
   }

   public String getFailureReason() {
      return this.failureReason;
   }

   public void setDealRemark(String dealRemark) {
      this.dealRemark = dealRemark;
   }

   public String getDealRemark() {
      return this.dealRemark;
   }

   public void setCreateBy(String createBy) {
      this.createBy = createBy;
   }

   public String getCreateBy() {
      return this.createBy;
   }

   public void setPic1(String pic1) {
      this.pic1 = pic1;
   }

   public String getPic1() {
      return this.pic1;
   }

   public void setFailureName(String failureName) {
      this.failureName = failureName;
   }

   public String getFailureName() {
      return this.failureName;
   }

   public void setOperateDate(String operateDate) {
      this.operateDate = operateDate;
   }

   public String getOperateDate() {
      return this.operateDate;
   }

   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   public String getOrderNo() {
      return this.orderNo;
   }

   public void setFixMethod(String fixMethod) {
      this.fixMethod = fixMethod;
   }

   public String getFixMethod() {
      return this.fixMethod;
   }

   public void setPic9(String pic9) {
      this.pic9 = pic9;
   }

   public String getPic9() {
      return this.pic9;
   }

   public void setPic8(String pic8) {
      this.pic8 = pic8;
   }

   public String getPic8() {
      return this.pic8;
   }

   public void setPic7(String pic7) {
      this.pic7 = pic7;
   }

   public String getPic7() {
      return this.pic7;
   }

   public void setPic6(String pic6) {
      this.pic6 = pic6;
   }

   public String getPic6() {
      return this.pic6;
   }

   public void setDealResult(String dealResult) {
      this.dealResult = dealResult;
   }

   public String getDealResult() {
      return this.dealResult;
   }

   public void setPic5(String pic5) {
      this.pic5 = pic5;
   }

   public String getPic5() {
      return this.pic5;
   }

   public void setPic4(String pic4) {
      this.pic4 = pic4;
   }

   public String getPic4() {
      return this.pic4;
   }

   public void setUsedMaterial(String usedMaterial) {
      this.usedMaterial = usedMaterial;
   }

   public String getUsedMaterial() {
      return this.usedMaterial;
   }

   public void setPic3(String pic3) {
      this.pic3 = pic3;
   }

   public String getPic3() {
      return this.pic3;
   }

   public void setPic2(String pic2) {
      this.pic2 = pic2;
   }

   public String getPic2() {
      return this.pic2;
   }

   public String getApiMethod() {
      return "jingdong.ue.order.finishBizProgress";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("appId", this.appId);
      pmap.put("barcode2", this.barcode2);
      pmap.put("pic10", this.pic10);
      pmap.put("barcode1", this.barcode1);
      pmap.put("failureReason", this.failureReason);
      pmap.put("dealRemark", this.dealRemark);
      pmap.put("createBy", this.createBy);
      pmap.put("pic1", this.pic1);
      pmap.put("failureName", this.failureName);
      pmap.put("operateDate", this.operateDate);
      pmap.put("orderNo", this.orderNo);
      pmap.put("fixMethod", this.fixMethod);
      pmap.put("pic9", this.pic9);
      pmap.put("pic8", this.pic8);
      pmap.put("pic7", this.pic7);
      pmap.put("pic6", this.pic6);
      pmap.put("dealResult", this.dealResult);
      pmap.put("pic5", this.pic5);
      pmap.put("pic4", this.pic4);
      pmap.put("usedMaterial", this.usedMaterial);
      pmap.put("pic3", this.pic3);
      pmap.put("pic2", this.pic2);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeOrderFinishBizProgressResponse> getResponseClass() {
      return UeOrderFinishBizProgressResponse.class;
   }
}
