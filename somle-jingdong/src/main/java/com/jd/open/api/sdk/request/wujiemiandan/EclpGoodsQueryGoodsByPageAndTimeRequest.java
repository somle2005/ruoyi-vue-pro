package com.jd.open.api.sdk.request.wujiemiandan;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.wujiemiandan.EclpGoodsQueryGoodsByPageAndTimeResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class EclpGoodsQueryGoodsByPageAndTimeRequest extends AbstractRequest implements JdRequest<EclpGoodsQueryGoodsByPageAndTimeResponse> {
   private String deptNo;
   private String isvGoodsNos;
   private String goodsNos;
   private int pageNo;
   private int pageSize;
   private Date updateTimeStart;
   private Date updateTimeEnd;

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
   }

   public void setIsvGoodsNos(String isvGoodsNos) {
      this.isvGoodsNos = isvGoodsNos;
   }

   public String getIsvGoodsNos() {
      return this.isvGoodsNos;
   }

   public void setGoodsNos(String goodsNos) {
      this.goodsNos = goodsNos;
   }

   public String getGoodsNos() {
      return this.goodsNos;
   }

   public void setPageNo(int pageNo) {
      this.pageNo = pageNo;
   }

   public int getPageNo() {
      return this.pageNo;
   }

   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   public int getPageSize() {
      return this.pageSize;
   }

   public void setUpdateTimeStart(Date updateTimeStart) {
      this.updateTimeStart = updateTimeStart;
   }

   public Date getUpdateTimeStart() {
      return this.updateTimeStart;
   }

   public void setUpdateTimeEnd(Date updateTimeEnd) {
      this.updateTimeEnd = updateTimeEnd;
   }

   public Date getUpdateTimeEnd() {
      return this.updateTimeEnd;
   }

   public String getApiMethod() {
      return "jingdong.eclp.goods.queryGoodsByPageAndTime";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("deptNo", this.deptNo);
      pmap.put("isvGoodsNos", this.isvGoodsNos);
      pmap.put("goodsNos", this.goodsNos);
      pmap.put("pageNo", this.pageNo);
      pmap.put("pageSize", this.pageSize);

      try {
         if (this.updateTimeStart != null) {
            pmap.put("updateTimeStart", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.updateTimeStart));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.updateTimeEnd != null) {
            pmap.put("updateTimeEnd", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.updateTimeEnd));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      return JsonUtil.toJson(pmap);
   }

   public Class<EclpGoodsQueryGoodsByPageAndTimeResponse> getResponseClass() {
      return EclpGoodsQueryGoodsByPageAndTimeResponse.class;
   }
}
