package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeOrderNewFinishResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeOrderNewFinishRequest extends AbstractRequest implements JdRequest<UeOrderNewFinishResponse> {
   private String barcode2;
   private String barcode1;
   private String failureReason;
   private String siteName;
   private String failureName;
   private String pic1;
   private String venderCode;
   private String pic2;
   private String pic3;
   private String dealRemark;
   private String pic4;
   private String fixMethod;
   private String createBy;
   private String appid;
   private Integer dealResult;
   private String settleCode;
   private String inSkuSn;
   private String outSkuSn;
   private String orderNo;
   private String detecDetail;
   private Integer detecResult;
   private String detecPic;
   private String installSituation;
   private String invoiceSituation;
   private String warrantyCard;
   private String outRepair;
   private String chargeAmount;
   private String pic5;
   private String pic6;
   private String pic7;
   private String pic8;
   private String pic9;
   private String pic10;

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

   public void setFailureReason(String failureReason) {
      this.failureReason = failureReason;
   }

   public String getFailureReason() {
      return this.failureReason;
   }

   public void setSiteName(String siteName) {
      this.siteName = siteName;
   }

   public String getSiteName() {
      return this.siteName;
   }

   public void setFailureName(String failureName) {
      this.failureName = failureName;
   }

   public String getFailureName() {
      return this.failureName;
   }

   public void setPic1(String pic1) {
      this.pic1 = pic1;
   }

   public String getPic1() {
      return this.pic1;
   }

   public void setVenderCode(String venderCode) {
      this.venderCode = venderCode;
   }

   public String getVenderCode() {
      return this.venderCode;
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

   public void setFixMethod(String fixMethod) {
      this.fixMethod = fixMethod;
   }

   public String getFixMethod() {
      return this.fixMethod;
   }

   public void setCreateBy(String createBy) {
      this.createBy = createBy;
   }

   public String getCreateBy() {
      return this.createBy;
   }

   public void setAppid(String appid) {
      this.appid = appid;
   }

   public String getAppid() {
      return this.appid;
   }

   public void setDealResult(Integer dealResult) {
      this.dealResult = dealResult;
   }

   public Integer getDealResult() {
      return this.dealResult;
   }

   public void setSettleCode(String settleCode) {
      this.settleCode = settleCode;
   }

   public String getSettleCode() {
      return this.settleCode;
   }

   public void setInSkuSn(String inSkuSn) {
      this.inSkuSn = inSkuSn;
   }

   public String getInSkuSn() {
      return this.inSkuSn;
   }

   public void setOutSkuSn(String outSkuSn) {
      this.outSkuSn = outSkuSn;
   }

   public String getOutSkuSn() {
      return this.outSkuSn;
   }

   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   public String getOrderNo() {
      return this.orderNo;
   }

   public void setDetecDetail(String detecDetail) {
      this.detecDetail = detecDetail;
   }

   public String getDetecDetail() {
      return this.detecDetail;
   }

   public void setDetecResult(Integer detecResult) {
      this.detecResult = detecResult;
   }

   public Integer getDetecResult() {
      return this.detecResult;
   }

   public void setDetecPic(String detecPic) {
      this.detecPic = detecPic;
   }

   public String getDetecPic() {
      return this.detecPic;
   }

   public void setInstallSituation(String installSituation) {
      this.installSituation = installSituation;
   }

   public String getInstallSituation() {
      return this.installSituation;
   }

   public void setInvoiceSituation(String invoiceSituation) {
      this.invoiceSituation = invoiceSituation;
   }

   public String getInvoiceSituation() {
      return this.invoiceSituation;
   }

   public void setWarrantyCard(String warrantyCard) {
      this.warrantyCard = warrantyCard;
   }

   public String getWarrantyCard() {
      return this.warrantyCard;
   }

   public void setOutRepair(String outRepair) {
      this.outRepair = outRepair;
   }

   public String getOutRepair() {
      return this.outRepair;
   }

   public void setChargeAmount(String chargeAmount) {
      this.chargeAmount = chargeAmount;
   }

   public String getChargeAmount() {
      return this.chargeAmount;
   }

   public void setPic5(String pic5) {
      this.pic5 = pic5;
   }

   public String getPic5() {
      return this.pic5;
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

   public void setPic9(String pic9) {
      this.pic9 = pic9;
   }

   public String getPic9() {
      return this.pic9;
   }

   public void setPic10(String pic10) {
      this.pic10 = pic10;
   }

   public String getPic10() {
      return this.pic10;
   }

   public String getApiMethod() {
      return "jingdong.ue.order.new.finish";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("barcode2", this.barcode2);
      pmap.put("barcode1", this.barcode1);
      pmap.put("failureReason", this.failureReason);
      pmap.put("siteName", this.siteName);
      pmap.put("failureName", this.failureName);
      pmap.put("pic1", this.pic1);
      pmap.put("venderCode", this.venderCode);
      pmap.put("pic2", this.pic2);
      pmap.put("pic3", this.pic3);
      pmap.put("dealRemark", this.dealRemark);
      pmap.put("pic4", this.pic4);
      pmap.put("fixMethod", this.fixMethod);
      pmap.put("createBy", this.createBy);
      pmap.put("appid", this.appid);
      pmap.put("dealResult", this.dealResult);
      pmap.put("settleCode", this.settleCode);
      pmap.put("inSkuSn", this.inSkuSn);
      pmap.put("outSkuSn", this.outSkuSn);
      pmap.put("orderNo", this.orderNo);
      pmap.put("detecDetail", this.detecDetail);
      pmap.put("detecResult", this.detecResult);
      pmap.put("detecPic", this.detecPic);
      pmap.put("installSituation", this.installSituation);
      pmap.put("invoiceSituation", this.invoiceSituation);
      pmap.put("warrantyCard", this.warrantyCard);
      pmap.put("outRepair", this.outRepair);
      pmap.put("chargeAmount", this.chargeAmount);
      pmap.put("pic5", this.pic5);
      pmap.put("pic6", this.pic6);
      pmap.put("pic7", this.pic7);
      pmap.put("pic8", this.pic8);
      pmap.put("pic9", this.pic9);
      pmap.put("pic10", this.pic10);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeOrderNewFinishResponse> getResponseClass() {
      return UeOrderNewFinishResponse.class;
   }
}
