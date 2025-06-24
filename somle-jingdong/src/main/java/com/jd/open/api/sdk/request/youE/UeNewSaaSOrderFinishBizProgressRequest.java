package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeNewSaaSOrderFinishBizProgressResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeNewSaaSOrderFinishBizProgressRequest extends AbstractRequest implements JdRequest<UeNewSaaSOrderFinishBizProgressResponse> {
   private String warrantyCard;
   private Integer detecResult;
   private String usedMaterial;
   private String failureName;
   private String invoiceSituation;
   private String pic1;
   private String inSkuSn;
   private String installSituation;
   private String appId;
   private String pic6;
   private String pic7;
   private String pic8;
   private String chargeAmount;
   private String pic9;
   private String pic2;
   private String pic3;
   private String dealRemark;
   private String pic4;
   private String pic5;
   private String fixMethod;
   private String detecDetail;
   private String outRepair;
   private String orderNo;
   private String barcode2;
   private String barcode1;
   private String createBy;
   private String pic10;
   private String callSource;
   private String failureReason;
   private String outSkuSn;
   private String dealResult;
   private String operateDate;
   private String receiveBrand;
   private String buyYear;

   public void setWarrantyCard(String warrantyCard) {
      this.warrantyCard = warrantyCard;
   }

   public String getWarrantyCard() {
      return this.warrantyCard;
   }

   public void setDetecResult(Integer detecResult) {
      this.detecResult = detecResult;
   }

   public Integer getDetecResult() {
      return this.detecResult;
   }

   public void setUsedMaterial(String usedMaterial) {
      this.usedMaterial = usedMaterial;
   }

   public String getUsedMaterial() {
      return this.usedMaterial;
   }

   public void setFailureName(String failureName) {
      this.failureName = failureName;
   }

   public String getFailureName() {
      return this.failureName;
   }

   public void setInvoiceSituation(String invoiceSituation) {
      this.invoiceSituation = invoiceSituation;
   }

   public String getInvoiceSituation() {
      return this.invoiceSituation;
   }

   public void setPic1(String pic1) {
      this.pic1 = pic1;
   }

   public String getPic1() {
      return this.pic1;
   }

   public void setInSkuSn(String inSkuSn) {
      this.inSkuSn = inSkuSn;
   }

   public String getInSkuSn() {
      return this.inSkuSn;
   }

   public void setInstallSituation(String installSituation) {
      this.installSituation = installSituation;
   }

   public String getInstallSituation() {
      return this.installSituation;
   }

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public void setPic6(String pic6) {
      this.pic6 = pic6;
   }

   public String getPic6() {
      return this.pic6;
   }

   public void setPic7(String pic7) {
      this.pic7 = pic7;
   }

   public String getPic7() {
      return this.pic7;
   }

   public void setPic8(String pic8) {
      this.pic8 = pic8;
   }

   public String getPic8() {
      return this.pic8;
   }

   public void setChargeAmount(String chargeAmount) {
      this.chargeAmount = chargeAmount;
   }

   public String getChargeAmount() {
      return this.chargeAmount;
   }

   public void setPic9(String pic9) {
      this.pic9 = pic9;
   }

   public String getPic9() {
      return this.pic9;
   }

   public void setPic2(String pic2) {
      this.pic2 = pic2;
   }

   public String getPic2() {
      return this.pic2;
   }

   public void setPic3(String pic3) {
      this.pic3 = pic3;
   }

   public String getPic3() {
      return this.pic3;
   }

   public void setDealRemark(String dealRemark) {
      this.dealRemark = dealRemark;
   }

   public String getDealRemark() {
      return this.dealRemark;
   }

   public void setPic4(String pic4) {
      this.pic4 = pic4;
   }

   public String getPic4() {
      return this.pic4;
   }

   public void setPic5(String pic5) {
      this.pic5 = pic5;
   }

   public String getPic5() {
      return this.pic5;
   }

   public void setFixMethod(String fixMethod) {
      this.fixMethod = fixMethod;
   }

   public String getFixMethod() {
      return this.fixMethod;
   }

   public void setDetecDetail(String detecDetail) {
      this.detecDetail = detecDetail;
   }

   public String getDetecDetail() {
      return this.detecDetail;
   }

   public void setOutRepair(String outRepair) {
      this.outRepair = outRepair;
   }

   public String getOutRepair() {
      return this.outRepair;
   }

   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   public String getOrderNo() {
      return this.orderNo;
   }

   public void setBarcode2(String barcode2) {
      this.barcode2 = barcode2;
   }

   public String getBarcode2() {
      return this.barcode2;
   }

   public void setBarcode1(String barcode1) {
      this.barcode1 = barcode1;
   }

   public String getBarcode1() {
      return this.barcode1;
   }

   public void setCreateBy(String createBy) {
      this.createBy = createBy;
   }

   public String getCreateBy() {
      return this.createBy;
   }

   public void setPic10(String pic10) {
      this.pic10 = pic10;
   }

   public String getPic10() {
      return this.pic10;
   }

   public void setCallSource(String callSource) {
      this.callSource = callSource;
   }

   public String getCallSource() {
      return this.callSource;
   }

   public void setFailureReason(String failureReason) {
      this.failureReason = failureReason;
   }

   public String getFailureReason() {
      return this.failureReason;
   }

   public void setOutSkuSn(String outSkuSn) {
      this.outSkuSn = outSkuSn;
   }

   public String getOutSkuSn() {
      return this.outSkuSn;
   }

   public void setDealResult(String dealResult) {
      this.dealResult = dealResult;
   }

   public String getDealResult() {
      return this.dealResult;
   }

   public void setOperateDate(String operateDate) {
      this.operateDate = operateDate;
   }

   public String getOperateDate() {
      return this.operateDate;
   }

   public void setReceiveBrand(String receiveBrand) {
      this.receiveBrand = receiveBrand;
   }

   public String getReceiveBrand() {
      return this.receiveBrand;
   }

   public void setBuyYear(String buyYear) {
      this.buyYear = buyYear;
   }

   public String getBuyYear() {
      return this.buyYear;
   }

   public String getApiMethod() {
      return "jingdong.ue.newSaaSOrder.finishBizProgress";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("warrantyCard", this.warrantyCard);
      pmap.put("detecResult", this.detecResult);
      pmap.put("usedMaterial", this.usedMaterial);
      pmap.put("failureName", this.failureName);
      pmap.put("invoiceSituation", this.invoiceSituation);
      pmap.put("pic1", this.pic1);
      pmap.put("inSkuSn", this.inSkuSn);
      pmap.put("installSituation", this.installSituation);
      pmap.put("appId", this.appId);
      pmap.put("pic6", this.pic6);
      pmap.put("pic7", this.pic7);
      pmap.put("pic8", this.pic8);
      pmap.put("chargeAmount", this.chargeAmount);
      pmap.put("pic9", this.pic9);
      pmap.put("pic2", this.pic2);
      pmap.put("pic3", this.pic3);
      pmap.put("dealRemark", this.dealRemark);
      pmap.put("pic4", this.pic4);
      pmap.put("pic5", this.pic5);
      pmap.put("fixMethod", this.fixMethod);
      pmap.put("detecDetail", this.detecDetail);
      pmap.put("outRepair", this.outRepair);
      pmap.put("orderNo", this.orderNo);
      pmap.put("barcode2", this.barcode2);
      pmap.put("barcode1", this.barcode1);
      pmap.put("createBy", this.createBy);
      pmap.put("pic10", this.pic10);
      pmap.put("callSource", this.callSource);
      pmap.put("failureReason", this.failureReason);
      pmap.put("outSkuSn", this.outSkuSn);
      pmap.put("dealResult", this.dealResult);
      pmap.put("operateDate", this.operateDate);
      pmap.put("receiveBrand", this.receiveBrand);
      pmap.put("buyYear", this.buyYear);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeNewSaaSOrderFinishBizProgressResponse> getResponseClass() {
      return UeNewSaaSOrderFinishBizProgressResponse.class;
   }
}
