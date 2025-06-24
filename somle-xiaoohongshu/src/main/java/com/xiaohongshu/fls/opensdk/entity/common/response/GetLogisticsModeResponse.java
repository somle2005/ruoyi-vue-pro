package com.xiaohongshu.fls.opensdk.entity.common.response;

import java.util.ArrayList;
import java.util.List;

public class GetLogisticsModeResponse {
   public List<LogisticMode> logisticModes = new ArrayList();

   public List<LogisticMode> getLogisticModes() {
      return this.logisticModes;
   }

   public void setLogisticModes(List<LogisticMode> logisticModes) {
      this.logisticModes = logisticModes;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetLogisticsModeResponse)) {
         return false;
      } else {
         GetLogisticsModeResponse other = (GetLogisticsModeResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$logisticModes = this.getLogisticModes();
            Object other$logisticModes = other.getLogisticModes();
            if (this$logisticModes == null) {
               if (other$logisticModes != null) {
                  return false;
               }
            } else if (!this$logisticModes.equals(other$logisticModes)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetLogisticsModeResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $logisticModes = this.getLogisticModes();
      result = result * 59 + ($logisticModes == null ? 43 : $logisticModes.hashCode());
      return result;
   }

   public String toString() {
      return "GetLogisticsModeResponse(logisticModes=" + this.getLogisticModes() + ")";
   }

   public static class LogisticMode {
      public String logisticsCode;
      public String logisticsTranslation;

      public String getLogisticsCode() {
         return this.logisticsCode;
      }

      public String getLogisticsTranslation() {
         return this.logisticsTranslation;
      }

      public void setLogisticsCode(String logisticsCode) {
         this.logisticsCode = logisticsCode;
      }

      public void setLogisticsTranslation(String logisticsTranslation) {
         this.logisticsTranslation = logisticsTranslation;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof LogisticMode)) {
            return false;
         } else {
            LogisticMode other = (LogisticMode)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$logisticsCode = this.getLogisticsCode();
               Object other$logisticsCode = other.getLogisticsCode();
               if (this$logisticsCode == null) {
                  if (other$logisticsCode != null) {
                     return false;
                  }
               } else if (!this$logisticsCode.equals(other$logisticsCode)) {
                  return false;
               }

               Object this$logisticsTranslation = this.getLogisticsTranslation();
               Object other$logisticsTranslation = other.getLogisticsTranslation();
               if (this$logisticsTranslation == null) {
                  if (other$logisticsTranslation != null) {
                     return false;
                  }
               } else if (!this$logisticsTranslation.equals(other$logisticsTranslation)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof LogisticMode;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $logisticsCode = this.getLogisticsCode();
         result = result * 59 + ($logisticsCode == null ? 43 : $logisticsCode.hashCode());
         Object $logisticsTranslation = this.getLogisticsTranslation();
         result = result * 59 + ($logisticsTranslation == null ? 43 : $logisticsTranslation.hashCode());
         return result;
      }

      public String toString() {
         return "GetLogisticsModeResponse.LogisticMode(logisticsCode=" + this.getLogisticsCode() + ", logisticsTranslation=" + this.getLogisticsTranslation() + ")";
      }
   }
}
