package com.jd.open.api.sdk.response.mall;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.mall.ProductWrapService.response.get.BookVideoEntity;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class WareBasebookGetResponse extends AbstractResponse {
   private List<BookVideoEntity> BookEntity;

   @JsonProperty("BookEntity")
   public void setBookEntity(List<BookVideoEntity> BookEntity) {
      this.BookEntity = BookEntity;
   }

   @JsonProperty("BookEntity")
   public List<BookVideoEntity> getBookEntity() {
      return this.BookEntity;
   }
}
