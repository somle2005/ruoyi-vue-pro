package com.jd.open.api.sdk.domain.mall.ProductWrapService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class BookVideoBigFieldEntity implements Serializable {
   private Long skuId;
   private Integer firstClassId;
   private BookBigFieldInfo bookBigFieldInfo;

   @JsonProperty("sku_id")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("sku_id")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("first_class_id")
   public void setFirstClassId(Integer firstClassId) {
      this.firstClassId = firstClassId;
   }

   @JsonProperty("first_class_id")
   public Integer getFirstClassId() {
      return this.firstClassId;
   }

   @JsonProperty("book_big_field_info")
   public void setBookBigFieldInfo(BookBigFieldInfo bookBigFieldInfo) {
      this.bookBigFieldInfo = bookBigFieldInfo;
   }

   @JsonProperty("book_big_field_info")
   public BookBigFieldInfo getBookBigFieldInfo() {
      return this.bookBigFieldInfo;
   }
}
