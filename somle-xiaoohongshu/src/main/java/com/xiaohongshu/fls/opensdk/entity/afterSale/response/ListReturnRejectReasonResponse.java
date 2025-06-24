package com.xiaohongshu.fls.opensdk.entity.afterSale.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(
   ignoreUnknown = true
)
public class ListReturnRejectReasonResponse {
   public List<OpenAPIRejectReasonDTO> rejectReasons;

   public List<OpenAPIRejectReasonDTO> getRejectReasons() {
      return this.rejectReasons;
   }

   public void setRejectReasons(List<OpenAPIRejectReasonDTO> rejectReasons) {
      this.rejectReasons = rejectReasons;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ListReturnRejectReasonResponse)) {
         return false;
      } else {
         ListReturnRejectReasonResponse other = (ListReturnRejectReasonResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$rejectReasons = this.getRejectReasons();
            Object other$rejectReasons = other.getRejectReasons();
            if (this$rejectReasons == null) {
               if (other$rejectReasons != null) {
                  return false;
               }
            } else if (!this$rejectReasons.equals(other$rejectReasons)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof ListReturnRejectReasonResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $rejectReasons = this.getRejectReasons();
      result = result * 59 + ($rejectReasons == null ? 43 : $rejectReasons.hashCode());
      return result;
   }

   public String toString() {
      return "ListReturnRejectReasonResponse(rejectReasons=" + this.getRejectReasons() + ")";
   }

   public static class OpenAPIRejectReasonDTO {
      public Integer reasonType;
      public Integer reasonId;
      public String reasonName;

      public Integer getReasonType() {
         return this.reasonType;
      }

      public Integer getReasonId() {
         return this.reasonId;
      }

      public String getReasonName() {
         return this.reasonName;
      }

      public void setReasonType(Integer reasonType) {
         this.reasonType = reasonType;
      }

      public void setReasonId(Integer reasonId) {
         this.reasonId = reasonId;
      }

      public void setReasonName(String reasonName) {
         this.reasonName = reasonName;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof OpenAPIRejectReasonDTO)) {
            return false;
         } else {
            OpenAPIRejectReasonDTO other = (OpenAPIRejectReasonDTO)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$reasonType = this.getReasonType();
               Object other$reasonType = other.getReasonType();
               if (this$reasonType == null) {
                  if (other$reasonType != null) {
                     return false;
                  }
               } else if (!this$reasonType.equals(other$reasonType)) {
                  return false;
               }

               Object this$reasonId = this.getReasonId();
               Object other$reasonId = other.getReasonId();
               if (this$reasonId == null) {
                  if (other$reasonId != null) {
                     return false;
                  }
               } else if (!this$reasonId.equals(other$reasonId)) {
                  return false;
               }

               Object this$reasonName = this.getReasonName();
               Object other$reasonName = other.getReasonName();
               if (this$reasonName == null) {
                  if (other$reasonName != null) {
                     return false;
                  }
               } else if (!this$reasonName.equals(other$reasonName)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof OpenAPIRejectReasonDTO;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $reasonType = this.getReasonType();
         result = result * 59 + ($reasonType == null ? 43 : $reasonType.hashCode());
         Object $reasonId = this.getReasonId();
         result = result * 59 + ($reasonId == null ? 43 : $reasonId.hashCode());
         Object $reasonName = this.getReasonName();
         result = result * 59 + ($reasonName == null ? 43 : $reasonName.hashCode());
         return result;
      }

      public String toString() {
         return "ListReturnRejectReasonResponse.OpenAPIRejectReasonDTO(reasonType=" + this.getReasonType() + ", reasonId=" + this.getReasonId() + ", reasonName=" + this.getReasonName() + ")";
      }
   }
}
