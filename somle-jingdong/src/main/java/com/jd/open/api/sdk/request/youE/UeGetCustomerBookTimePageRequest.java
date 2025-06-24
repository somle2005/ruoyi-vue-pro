package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeGetCustomerBookTimePageResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeGetCustomerBookTimePageRequest extends AbstractRequest implements JdRequest<UeGetCustomerBookTimePageResponse> {
   private String venderCode;
   private String appid;
   private String bookOperateDateStart;
   private Integer pageSize;
   private Integer page;
   private String bookOperateDateEnd;

   public void setVenderCode(String venderCode) {
      this.venderCode = venderCode;
   }

   public String getVenderCode() {
      return this.venderCode;
   }

   public void setAppid(String appid) {
      this.appid = appid;
   }

   public String getAppid() {
      return this.appid;
   }

   public void setBookOperateDateStart(String bookOperateDateStart) {
      this.bookOperateDateStart = bookOperateDateStart;
   }

   public String getBookOperateDateStart() {
      return this.bookOperateDateStart;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setPage(Integer page) {
      this.page = page;
   }

   public Integer getPage() {
      return this.page;
   }

   public void setBookOperateDateEnd(String bookOperateDateEnd) {
      this.bookOperateDateEnd = bookOperateDateEnd;
   }

   public String getBookOperateDateEnd() {
      return this.bookOperateDateEnd;
   }

   public String getApiMethod() {
      return "jingdong.ue.getCustomerBookTimePage";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("venderCode", this.venderCode);
      pmap.put("appid", this.appid);
      pmap.put("bookOperateDateStart", this.bookOperateDateStart);
      pmap.put("pageSize", this.pageSize);
      pmap.put("page", this.page);
      pmap.put("bookOperateDateEnd", this.bookOperateDateEnd);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeGetCustomerBookTimePageResponse> getResponseClass() {
      return UeGetCustomerBookTimePageResponse.class;
   }
}
