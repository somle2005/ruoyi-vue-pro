package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpCoUpdateB2BSWbMainExpressItemQtyResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpCoUpdateB2BSWbMainExpressItemQtyRequest extends AbstractRequest implements JdRequest<EclpCoUpdateB2BSWbMainExpressItemQtyResponse> {
   private String deptNo;
   private int newWBType;
   private String no;
   private int expressItemQty;
   private String extendFieldStr;

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
   }

   public void setNewWBType(int newWBType) {
      this.newWBType = newWBType;
   }

   public int getNewWBType() {
      return this.newWBType;
   }

   public void setNo(String no) {
      this.no = no;
   }

   public String getNo() {
      return this.no;
   }

   public void setExpressItemQty(int expressItemQty) {
      this.expressItemQty = expressItemQty;
   }

   public int getExpressItemQty() {
      return this.expressItemQty;
   }

   public void setExtendFieldStr(String extendFieldStr) {
      this.extendFieldStr = extendFieldStr;
   }

   public String getExtendFieldStr() {
      return this.extendFieldStr;
   }

   public String getApiMethod() {
      return "jingdong.eclp.co.updateB2BSWbMainExpressItemQty";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("deptNo", this.deptNo);
      pmap.put("newWBType", this.newWBType);
      pmap.put("no", this.no);
      pmap.put("expressItemQty", this.expressItemQty);
      pmap.put("extendFieldStr", this.extendFieldStr);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpCoUpdateB2BSWbMainExpressItemQtyResponse> getResponseClass() {
      return EclpCoUpdateB2BSWbMainExpressItemQtyResponse.class;
   }
}
