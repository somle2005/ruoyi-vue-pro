package com.jd.open.api.sdk.response.mall;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.mall.ProductWrapService.response.get.BookVideoBigFieldEntity;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class WareBookbigfieldGetResponse extends AbstractResponse {
   private List<BookVideoBigFieldEntity> BookBigFieldEntity;

   @JsonProperty("BookBigFieldEntity")
   public void setBookBigFieldEntity(List<BookVideoBigFieldEntity> BookBigFieldEntity) {
      this.BookBigFieldEntity = BookBigFieldEntity;
   }

   @JsonProperty("BookBigFieldEntity")
   public List<BookVideoBigFieldEntity> getBookBigFieldEntity() {
      return this.BookBigFieldEntity;
   }
}
