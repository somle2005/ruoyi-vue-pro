package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpGoodsQueryGoodsRecordResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class EclpGoodsQueryGoodsRecordRequest extends AbstractRequest implements JdRequest<EclpGoodsQueryGoodsRecordResponse> {
   private String deptNo;
   private String isvGoodsNo;
   private String goodsNo;
   private Integer pageNo;
   private Integer pageSize;
   private Date startDate;
   private Date endDate;

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
   }

   public void setIsvGoodsNo(String isvGoodsNo) {
      this.isvGoodsNo = isvGoodsNo;
   }

   public String getIsvGoodsNo() {
      return this.isvGoodsNo;
   }

   public void setGoodsNo(String goodsNo) {
      this.goodsNo = goodsNo;
   }

   public String getGoodsNo() {
      return this.goodsNo;
   }

   public void setPageNo(Integer pageNo) {
      this.pageNo = pageNo;
   }

   public Integer getPageNo() {
      return this.pageNo;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setStartDate(Date startDate) {
      this.startDate = startDate;
   }

   public Date getStartDate() {
      return this.startDate;
   }

   public void setEndDate(Date endDate) {
      this.endDate = endDate;
   }

   public Date getEndDate() {
      return this.endDate;
   }

   public String getApiMethod() {
      return "jingdong.eclp.goods.queryGoodsRecord";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("deptNo", this.deptNo);
      pmap.put("isvGoodsNo", this.isvGoodsNo);
      pmap.put("goodsNo", this.goodsNo);
      pmap.put("pageNo", this.pageNo);
      pmap.put("pageSize", this.pageSize);

      try {
         if (this.startDate != null) {
            pmap.put("startDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.startDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.endDate != null) {
            pmap.put("endDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.endDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      return JsonUtil.toJson(pmap);
   }

   public Class<EclpGoodsQueryGoodsRecordResponse> getResponseClass() {
      return EclpGoodsQueryGoodsRecordResponse.class;
   }
}
