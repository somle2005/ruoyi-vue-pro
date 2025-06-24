package com.xiaohongshu.fls.opensdk.entity.afterSale.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class ConfirmReceiveRequest extends BaseRequest {
   public String returnsId;
   public Integer action;
   public Integer reason;
   public String description;

   public String getReturnsId() {
      return this.returnsId;
   }

   public Integer getAction() {
      return this.action;
   }

   public Integer getReason() {
      return this.reason;
   }

   public String getDescription() {
      return this.description;
   }

   public void setReturnsId(String returnsId) {
      this.returnsId = returnsId;
   }

   public void setAction(Integer action) {
      this.action = action;
   }

   public void setReason(Integer reason) {
      this.reason = reason;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ConfirmReceiveRequest)) {
         return false;
      } else {
         ConfirmReceiveRequest other = (ConfirmReceiveRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$action = this.getAction();
            Object other$action = other.getAction();
            if (this$action == null) {
               if (other$action != null) {
                  return false;
               }
            } else if (!this$action.equals(other$action)) {
               return false;
            }

            Object this$reason = this.getReason();
            Object other$reason = other.getReason();
            if (this$reason == null) {
               if (other$reason != null) {
                  return false;
               }
            } else if (!this$reason.equals(other$reason)) {
               return false;
            }

            Object this$returnsId = this.getReturnsId();
            Object other$returnsId = other.getReturnsId();
            if (this$returnsId == null) {
               if (other$returnsId != null) {
                  return false;
               }
            } else if (!this$returnsId.equals(other$returnsId)) {
               return false;
            }

            Object this$description = this.getDescription();
            Object other$description = other.getDescription();
            if (this$description == null) {
               if (other$description != null) {
                  return false;
               }
            } else if (!this$description.equals(other$description)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof ConfirmReceiveRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $action = this.getAction();
      result = result * 59 + ($action == null ? 43 : $action.hashCode());
      Object $reason = this.getReason();
      result = result * 59 + ($reason == null ? 43 : $reason.hashCode());
      Object $returnsId = this.getReturnsId();
      result = result * 59 + ($returnsId == null ? 43 : $returnsId.hashCode());
      Object $description = this.getDescription();
      result = result * 59 + ($description == null ? 43 : $description.hashCode());
      return result;
   }

   public String toString() {
      return "ConfirmReceiveRequest(returnsId=" + this.getReturnsId() + ", action=" + this.getAction() + ", reason=" + this.getReason() + ", description=" + this.getDescription() + ")";
   }
}
