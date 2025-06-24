package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpInsideQueryUlOrderByConditionResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpInsideQueryUlOrderByConditionRequest extends AbstractRequest implements JdRequest<EclpInsideQueryUlOrderByConditionResponse> {
   private int pageSize;
   private int pageNum;
   private String ulNo;
   private String outUlNo;
   private String deptNo;
   private String warehouseNo;
   private Byte allowReturnDest;

   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   public int getPageSize() {
      return this.pageSize;
   }

   public void setPageNum(int pageNum) {
      this.pageNum = pageNum;
   }

   public int getPageNum() {
      return this.pageNum;
   }

   public void setUlNo(String ulNo) {
      this.ulNo = ulNo;
   }

   public String getUlNo() {
      return this.ulNo;
   }

   public void setOutUlNo(String outUlNo) {
      this.outUlNo = outUlNo;
   }

   public String getOutUlNo() {
      return this.outUlNo;
   }

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
   }

   public void setWarehouseNo(String warehouseNo) {
      this.warehouseNo = warehouseNo;
   }

   public String getWarehouseNo() {
      return this.warehouseNo;
   }

   public void setAllowReturnDest(Byte allowReturnDest) {
      this.allowReturnDest = allowReturnDest;
   }

   public Byte getAllowReturnDest() {
      return this.allowReturnDest;
   }

   public String getApiMethod() {
      return "jingdong.eclp.inside.queryUlOrderByCondition";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("pageSize", this.pageSize);
      pmap.put("pageNum", this.pageNum);
      pmap.put("ulNo", this.ulNo);
      pmap.put("outUlNo", this.outUlNo);
      pmap.put("deptNo", this.deptNo);
      pmap.put("warehouseNo", this.warehouseNo);
      pmap.put("allowReturnDest", this.allowReturnDest);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpInsideQueryUlOrderByConditionResponse> getResponseClass() {
      return EclpInsideQueryUlOrderByConditionResponse.class;
   }
}
