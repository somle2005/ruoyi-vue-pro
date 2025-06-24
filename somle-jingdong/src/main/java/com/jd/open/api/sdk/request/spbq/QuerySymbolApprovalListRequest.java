package com.jd.open.api.sdk.request.spbq;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.spbq.QuerySymbolApprovalListResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class QuerySymbolApprovalListRequest extends AbstractRequest implements JdRequest<QuerySymbolApprovalListResponse> {
   private String approvalStatus;
   private Integer pageSize;
   private String searchKey;
   private String bdsBindTypeEnum;
   private Integer pageNo;
   private String symbolName;

   public void setApprovalStatus(String approvalStatus) {
      this.approvalStatus = approvalStatus;
   }

   public String getApprovalStatus() {
      return this.approvalStatus;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setSearchKey(String searchKey) {
      this.searchKey = searchKey;
   }

   public String getSearchKey() {
      return this.searchKey;
   }

   public void setBdsBindTypeEnum(String bdsBindTypeEnum) {
      this.bdsBindTypeEnum = bdsBindTypeEnum;
   }

   public String getBdsBindTypeEnum() {
      return this.bdsBindTypeEnum;
   }

   public void setPageNo(Integer pageNo) {
      this.pageNo = pageNo;
   }

   public Integer getPageNo() {
      return this.pageNo;
   }

   public void setSymbolName(String symbolName) {
      this.symbolName = symbolName;
   }

   public String getSymbolName() {
      return this.symbolName;
   }

   public String getApiMethod() {
      return "jingdong.querySymbolApprovalList";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("approvalStatus", this.approvalStatus);
      pmap.put("pageSize", this.pageSize);
      pmap.put("searchKey", this.searchKey);
      pmap.put("bdsBindTypeEnum", this.bdsBindTypeEnum);
      pmap.put("pageNo", this.pageNo);
      pmap.put("symbolName", this.symbolName);
      return JsonUtil.toJson(pmap);
   }

   public Class<QuerySymbolApprovalListResponse> getResponseClass() {
      return QuerySymbolApprovalListResponse.class;
   }
}
