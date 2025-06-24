package com.jd.open.api.sdk.request.spbq;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.spbq.QueryClassifyByCateResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class QueryClassifyByCateRequest extends AbstractRequest implements JdRequest<QueryClassifyByCateResponse> {
   private Integer itemCateCd;
   private Integer level;
   private Integer pageNo;
   private Integer pageSize;

   public void setItemCateCd(Integer itemCateCd) {
      this.itemCateCd = itemCateCd;
   }

   public Integer getItemCateCd() {
      return this.itemCateCd;
   }

   public void setLevel(Integer level) {
      this.level = level;
   }

   public Integer getLevel() {
      return this.level;
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

   public String getApiMethod() {
      return "jingdong.queryClassifyByCate";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("itemCateCd", this.itemCateCd);
      pmap.put("level", this.level);
      pmap.put("pageNo", this.pageNo);
      pmap.put("pageSize", this.pageSize);
      return JsonUtil.toJson(pmap);
   }

   public Class<QueryClassifyByCateResponse> getResponseClass() {
      return QueryClassifyByCateResponse.class;
   }
}
