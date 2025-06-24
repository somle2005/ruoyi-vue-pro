package com.jd.open.api.sdk.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.list.CategoryAttrReadService.response.findAttrsByCategoryId.CategoryAttr;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class CategoryReadFindAttrsByCategoryIdResponse extends AbstractResponse {
   private List<CategoryAttr> categoryAttrs;

   @JsonProperty("categoryAttrs")
   public void setCategoryAttrs(List<CategoryAttr> categoryAttrs) {
      this.categoryAttrs = categoryAttrs;
   }

   @JsonProperty("categoryAttrs")
   public List<CategoryAttr> getCategoryAttrs() {
      return this.categoryAttrs;
   }
}
