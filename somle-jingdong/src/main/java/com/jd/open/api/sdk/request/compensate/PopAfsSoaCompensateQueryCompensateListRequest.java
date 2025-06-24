package com.jd.open.api.sdk.request.compensate;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.compensate.PopAfsSoaCompensateQueryCompensateListResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopAfsSoaCompensateQueryCompensateListRequest extends AbstractRequest implements JdRequest<PopAfsSoaCompensateQueryCompensateListResponse> {
   private Long compensateId;
   private Long id;
   private String refId;
   private Long refType;
   private String modifiedStartTime;
   private String modifiedEndTime;
   private Integer pageIndex;
   private Integer pageSize;

   public void setCompensateId(Long compensateId) {
      this.compensateId = compensateId;
   }

   public Long getCompensateId() {
      return this.compensateId;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public Long getId() {
      return this.id;
   }

   public void setRefId(String refId) {
      this.refId = refId;
   }

   public String getRefId() {
      return this.refId;
   }

   public void setRefType(Long refType) {
      this.refType = refType;
   }

   public Long getRefType() {
      return this.refType;
   }

   public void setModifiedStartTime(String modifiedStartTime) {
      this.modifiedStartTime = modifiedStartTime;
   }

   public String getModifiedStartTime() {
      return this.modifiedStartTime;
   }

   public void setModifiedEndTime(String modifiedEndTime) {
      this.modifiedEndTime = modifiedEndTime;
   }

   public String getModifiedEndTime() {
      return this.modifiedEndTime;
   }

   public void setPageIndex(Integer pageIndex) {
      this.pageIndex = pageIndex;
   }

   public Integer getPageIndex() {
      return this.pageIndex;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public String getApiMethod() {
      return "jingdong.pop.afs.soa.compensate.queryCompensateList";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("compensateId", this.compensateId);
      pmap.put("id", this.id);
      pmap.put("refId", this.refId);
      pmap.put("refType", this.refType);
      pmap.put("modifiedStartTime", this.modifiedStartTime);
      pmap.put("modifiedEndTime", this.modifiedEndTime);
      pmap.put("pageIndex", this.pageIndex);
      pmap.put("pageSize", this.pageSize);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopAfsSoaCompensateQueryCompensateListResponse> getResponseClass() {
      return PopAfsSoaCompensateQueryCompensateListResponse.class;
   }
}
