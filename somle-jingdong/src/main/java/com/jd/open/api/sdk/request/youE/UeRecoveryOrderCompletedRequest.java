package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeRecoveryOrderCompletedResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeRecoveryOrderCompletedRequest extends AbstractRequest implements JdRequest<UeRecoveryOrderCompletedResponse> {
   private String appid;
   private String nameplatePic;
   private Double realResiduePrice;
   private String verifyCode;
   private String userVerifyPic;
   private String finishOrder;
   private String machinePic;
   private String finishOrderRemark;
   private String orderNo;
   private String code;

   public void setAppid(String appid) {
      this.appid = appid;
   }

   public String getAppid() {
      return this.appid;
   }

   public void setNameplatePic(String nameplatePic) {
      this.nameplatePic = nameplatePic;
   }

   public String getNameplatePic() {
      return this.nameplatePic;
   }

   public void setRealResiduePrice(Double realResiduePrice) {
      this.realResiduePrice = realResiduePrice;
   }

   public Double getRealResiduePrice() {
      return this.realResiduePrice;
   }

   public void setVerifyCode(String verifyCode) {
      this.verifyCode = verifyCode;
   }

   public String getVerifyCode() {
      return this.verifyCode;
   }

   public void setUserVerifyPic(String userVerifyPic) {
      this.userVerifyPic = userVerifyPic;
   }

   public String getUserVerifyPic() {
      return this.userVerifyPic;
   }

   public void setFinishOrder(String finishOrder) {
      this.finishOrder = finishOrder;
   }

   public String getFinishOrder() {
      return this.finishOrder;
   }

   public void setMachinePic(String machinePic) {
      this.machinePic = machinePic;
   }

   public String getMachinePic() {
      return this.machinePic;
   }

   public void setFinishOrderRemark(String finishOrderRemark) {
      this.finishOrderRemark = finishOrderRemark;
   }

   public String getFinishOrderRemark() {
      return this.finishOrderRemark;
   }

   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   public String getOrderNo() {
      return this.orderNo;
   }

   public void setCode(String code) {
      this.code = code;
   }

   public String getCode() {
      return this.code;
   }

   public String getApiMethod() {
      return "jingdong.ue.recovery.order.completed";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("appid", this.appid);
      pmap.put("nameplatePic", this.nameplatePic);
      pmap.put("realResiduePrice", this.realResiduePrice);
      pmap.put("verifyCode", this.verifyCode);
      pmap.put("userVerifyPic", this.userVerifyPic);
      pmap.put("finishOrder", this.finishOrder);
      pmap.put("machinePic", this.machinePic);
      pmap.put("finishOrderRemark", this.finishOrderRemark);
      pmap.put("orderNo", this.orderNo);
      pmap.put("code", this.code);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeRecoveryOrderCompletedResponse> getResponseClass() {
      return UeRecoveryOrderCompletedResponse.class;
   }
}
