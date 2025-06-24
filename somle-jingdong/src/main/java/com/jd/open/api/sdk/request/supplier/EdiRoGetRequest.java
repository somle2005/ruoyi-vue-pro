package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.EdiRoGetResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class EdiRoGetRequest extends AbstractRequest implements JdRequest<EdiRoGetResponse> {
   private Integer type;
   private Date createTimeStart;
   private Date createTimeEnd;
   private Integer pageNum;
   private Integer pageSize;

   public void setType(Integer type) {
      this.type = type;
   }

   public Integer getType() {
      return this.type;
   }

   public void setCreateTimeStart(Date createTimeStart) {
      this.createTimeStart = createTimeStart;
   }

   public Date getCreateTimeStart() {
      return this.createTimeStart;
   }

   public void setCreateTimeEnd(Date createTimeEnd) {
      this.createTimeEnd = createTimeEnd;
   }

   public Date getCreateTimeEnd() {
      return this.createTimeEnd;
   }

   public void setPageNum(Integer pageNum) {
      this.pageNum = pageNum;
   }

   public Integer getPageNum() {
      return this.pageNum;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public String getApiMethod() {
      return "jingdong.edi.ro.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("type", this.type);

      try {
         if (this.createTimeStart != null) {
            pmap.put("createTimeStart", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.createTimeStart));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.createTimeEnd != null) {
            pmap.put("createTimeEnd", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.createTimeEnd));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("pageNum", this.pageNum);
      pmap.put("pageSize", this.pageSize);
      return JsonUtil.toJson(pmap);
   }

   public Class<EdiRoGetResponse> getResponseClass() {
      return EdiRoGetResponse.class;
   }
}
