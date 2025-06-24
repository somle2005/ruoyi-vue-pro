package com.jd.open.api.sdk.domain.mall.ProductWrapService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class BookVideoEntity implements Serializable {
   private Long skuId;
   private BookInfo bookInfo;

   @JsonProperty("sku_id")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("sku_id")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("book_info")
   public void setBookInfo(BookInfo bookInfo) {
      this.bookInfo = bookInfo;
   }

   @JsonProperty("book_info")
   public BookInfo getBookInfo() {
      return this.bookInfo;
   }
}
