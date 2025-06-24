package com.jd.open.api.sdk.response.imgzone;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class ImgzoneZoneInfo implements Serializable {
   private String name;
   private Integer usedSize;
   private Integer totalSize;
   private Date created;

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("used_size")
   public void setUsedSize(Integer usedSize) {
      this.usedSize = usedSize;
   }

   @JsonProperty("used_size")
   public Integer getUsedSize() {
      return this.usedSize;
   }

   @JsonProperty("total_size")
   public void setTotalSize(Integer totalSize) {
      this.totalSize = totalSize;
   }

   @JsonProperty("total_size")
   public Integer getTotalSize() {
      return this.totalSize;
   }

   @JsonProperty("created")
   public void setCreated(Date created) {
      this.created = created;
   }

   @JsonProperty("created")
   public Date getCreated() {
      return this.created;
   }
}
