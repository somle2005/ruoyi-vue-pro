package com.xiaohongshu.fls.opensdk.entity.common.response;

import java.util.List;

public class GetExpressCompanyListResponse {
   public List<ExpressCompanyInfo> expressCompanyInfos;

   public List<ExpressCompanyInfo> getExpressCompanyInfos() {
      return this.expressCompanyInfos;
   }

   public void setExpressCompanyInfos(List<ExpressCompanyInfo> expressCompanyInfos) {
      this.expressCompanyInfos = expressCompanyInfos;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetExpressCompanyListResponse)) {
         return false;
      } else {
         GetExpressCompanyListResponse other = (GetExpressCompanyListResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$expressCompanyInfos = this.getExpressCompanyInfos();
            Object other$expressCompanyInfos = other.getExpressCompanyInfos();
            if (this$expressCompanyInfos == null) {
               if (other$expressCompanyInfos != null) {
                  return false;
               }
            } else if (!this$expressCompanyInfos.equals(other$expressCompanyInfos)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetExpressCompanyListResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $expressCompanyInfos = this.getExpressCompanyInfos();
      result = result * 59 + ($expressCompanyInfos == null ? 43 : $expressCompanyInfos.hashCode());
      return result;
   }

   public String toString() {
      return "GetExpressCompanyListResponse(expressCompanyInfos=" + this.getExpressCompanyInfos() + ")";
   }

   public static class ExpressCompanyInfo {
      public int expressCompanyId;
      public String expressCompanyCode;
      public String expressCompanyName;
      public String comment;

      public int getExpressCompanyId() {
         return this.expressCompanyId;
      }

      public String getExpressCompanyCode() {
         return this.expressCompanyCode;
      }

      public String getExpressCompanyName() {
         return this.expressCompanyName;
      }

      public String getComment() {
         return this.comment;
      }

      public void setExpressCompanyId(int expressCompanyId) {
         this.expressCompanyId = expressCompanyId;
      }

      public void setExpressCompanyCode(String expressCompanyCode) {
         this.expressCompanyCode = expressCompanyCode;
      }

      public void setExpressCompanyName(String expressCompanyName) {
         this.expressCompanyName = expressCompanyName;
      }

      public void setComment(String comment) {
         this.comment = comment;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof ExpressCompanyInfo)) {
            return false;
         } else {
            ExpressCompanyInfo other = (ExpressCompanyInfo)o;
            if (!other.canEqual(this)) {
               return false;
            } else if (this.getExpressCompanyId() != other.getExpressCompanyId()) {
               return false;
            } else {
               Object this$expressCompanyCode = this.getExpressCompanyCode();
               Object other$expressCompanyCode = other.getExpressCompanyCode();
               if (this$expressCompanyCode == null) {
                  if (other$expressCompanyCode != null) {
                     return false;
                  }
               } else if (!this$expressCompanyCode.equals(other$expressCompanyCode)) {
                  return false;
               }

               Object this$expressCompanyName = this.getExpressCompanyName();
               Object other$expressCompanyName = other.getExpressCompanyName();
               if (this$expressCompanyName == null) {
                  if (other$expressCompanyName != null) {
                     return false;
                  }
               } else if (!this$expressCompanyName.equals(other$expressCompanyName)) {
                  return false;
               }

               Object this$comment = this.getComment();
               Object other$comment = other.getComment();
               if (this$comment == null) {
                  if (other$comment != null) {
                     return false;
                  }
               } else if (!this$comment.equals(other$comment)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof ExpressCompanyInfo;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         result = result * 59 + this.getExpressCompanyId();
         Object $expressCompanyCode = this.getExpressCompanyCode();
         result = result * 59 + ($expressCompanyCode == null ? 43 : $expressCompanyCode.hashCode());
         Object $expressCompanyName = this.getExpressCompanyName();
         result = result * 59 + ($expressCompanyName == null ? 43 : $expressCompanyName.hashCode());
         Object $comment = this.getComment();
         result = result * 59 + ($comment == null ? 43 : $comment.hashCode());
         return result;
      }

      public String toString() {
         return "GetExpressCompanyListResponse.ExpressCompanyInfo(expressCompanyId=" + this.getExpressCompanyId() + ", expressCompanyCode=" + this.getExpressCompanyCode() + ", expressCompanyName=" + this.getExpressCompanyName() + ", comment=" + this.getComment() + ")";
      }
   }
}
