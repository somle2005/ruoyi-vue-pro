package com.jd.open.api.sdk.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.list.CategoryAttrReadService.response.findAttrsByCategoryIdJos.CategoryAttrJos;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class CategoryReadFindAttrsByCategoryIdJosResponse extends AbstractResponse {
   private List<CategoryAttrJos> categoryAttrs;

   @JsonProperty("categoryAttrs")
   public void setCategoryAttrs(List<CategoryAttrJos> categoryAttrs) {
      this.categoryAttrs = categoryAttrs;
   }

   @JsonProperty("categoryAttrs")
   public List<CategoryAttrJos> getCategoryAttrs() {
      return this.categoryAttrs;
   }
}
