package com.jd.open.api.sdk.request.jjfw;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jjfw.HomefwTaskUploadFinishImgResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class HomefwTaskUploadFinishImgRequest extends AbstractRequest implements JdRequest<HomefwTaskUploadFinishImgResponse> {
   private String venderCode;
   private String orderNo;
   private String beforeCompletion1;
   private String beforeCompletion2;
   private String beforeCompletion3;
   private String beforeCompletion4;
   private String afterCompletion1;
   private String afterCompletion2;
   private String afterCompletion3;
   private String afterCompletion4;

   public void setVenderCode(String venderCode) {
      this.venderCode = venderCode;
   }

   public String getVenderCode() {
      return this.venderCode;
   }

   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   public String getOrderNo() {
      return this.orderNo;
   }

   public void setBeforeCompletion1(String beforeCompletion1) {
      this.beforeCompletion1 = beforeCompletion1;
   }

   public String getBeforeCompletion1() {
      return this.beforeCompletion1;
   }

   public void setBeforeCompletion2(String beforeCompletion2) {
      this.beforeCompletion2 = beforeCompletion2;
   }

   public String getBeforeCompletion2() {
      return this.beforeCompletion2;
   }

   public void setBeforeCompletion3(String beforeCompletion3) {
      this.beforeCompletion3 = beforeCompletion3;
   }

   public String getBeforeCompletion3() {
      return this.beforeCompletion3;
   }

   public void setBeforeCompletion4(String beforeCompletion4) {
      this.beforeCompletion4 = beforeCompletion4;
   }

   public String getBeforeCompletion4() {
      return this.beforeCompletion4;
   }

   public void setAfterCompletion1(String afterCompletion1) {
      this.afterCompletion1 = afterCompletion1;
   }

   public String getAfterCompletion1() {
      return this.afterCompletion1;
   }

   public void setAfterCompletion2(String afterCompletion2) {
      this.afterCompletion2 = afterCompletion2;
   }

   public String getAfterCompletion2() {
      return this.afterCompletion2;
   }

   public void setAfterCompletion3(String afterCompletion3) {
      this.afterCompletion3 = afterCompletion3;
   }

   public String getAfterCompletion3() {
      return this.afterCompletion3;
   }

   public void setAfterCompletion4(String afterCompletion4) {
      this.afterCompletion4 = afterCompletion4;
   }

   public String getAfterCompletion4() {
      return this.afterCompletion4;
   }

   public String getApiMethod() {
      return "jingdong.homefw.task.uploadFinishImg";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("venderCode", this.venderCode);
      pmap.put("orderNo", this.orderNo);
      pmap.put("beforeCompletion1", this.beforeCompletion1);
      pmap.put("beforeCompletion2", this.beforeCompletion2);
      pmap.put("beforeCompletion3", this.beforeCompletion3);
      pmap.put("beforeCompletion4", this.beforeCompletion4);
      pmap.put("afterCompletion1", this.afterCompletion1);
      pmap.put("afterCompletion2", this.afterCompletion2);
      pmap.put("afterCompletion3", this.afterCompletion3);
      pmap.put("afterCompletion4", this.afterCompletion4);
      return JsonUtil.toJson(pmap);
   }

   public Class<HomefwTaskUploadFinishImgResponse> getResponseClass() {
      return HomefwTaskUploadFinishImgResponse.class;
   }
}
