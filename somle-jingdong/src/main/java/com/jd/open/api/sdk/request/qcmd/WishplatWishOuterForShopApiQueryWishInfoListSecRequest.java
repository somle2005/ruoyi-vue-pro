package com.jd.open.api.sdk.request.qcmd;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.qcmd.WishplatWishOuterForShopApiQueryWishInfoListSecResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WishplatWishOuterForShopApiQueryWishInfoListSecRequest extends AbstractRequest implements JdRequest<WishplatWishOuterForShopApiQueryWishInfoListSecResponse> {
   private Integer page;
   private Integer pageSize;
   private Integer wishTypeId;
   private String startDate;
   private String endDate;

   public void setPage(Integer page) {
      this.page = page;
   }

   public Integer getPage() {
      return this.page;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setWishTypeId(Integer wishTypeId) {
      this.wishTypeId = wishTypeId;
   }

   public Integer getWishTypeId() {
      return this.wishTypeId;
   }

   public void setStartDate(String startDate) {
      this.startDate = startDate;
   }

   public String getStartDate() {
      return this.startDate;
   }

   public void setEndDate(String endDate) {
      this.endDate = endDate;
   }

   public String getEndDate() {
      return this.endDate;
   }

   public String getApiMethod() {
      return "jingdong.wishplat.wishOuterForShopApi.queryWishInfoListSec";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("page", this.page);
      pmap.put("pageSize", this.pageSize);
      pmap.put("wishTypeId", this.wishTypeId);
      pmap.put("startDate", this.startDate);
      pmap.put("endDate", this.endDate);
      return JsonUtil.toJson(pmap);
   }

   public Class<WishplatWishOuterForShopApiQueryWishInfoListSecResponse> getResponseClass() {
      return WishplatWishOuterForShopApiQueryWishInfoListSecResponse.class;
   }
}
