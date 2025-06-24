package com.xiaohongshu.fls.opensdk.entity.express.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;
import com.xiaohongshu.fls.opensdk.entity.express.ElectronicBillItem;
import com.xiaohongshu.fls.opensdk.entity.express.ElectronicBillUserInfo;
import java.util.List;

public class ElectronicBillOrderUpdateRequest extends BaseRequest {
   private Integer billVersion;
   private String cpCode;
   private String waybillCode;
   private String objectId;
   private String logisticsServices;
   private UpdatePackageInfo packageInfo;
   private ElectronicBillUserInfo recipient;
   private UpdateSenderUserInfo sender;
   private Long templateId;

   public Integer getBillVersion() {
      return this.billVersion;
   }

   public String getCpCode() {
      return this.cpCode;
   }

   public String getWaybillCode() {
      return this.waybillCode;
   }

   public String getObjectId() {
      return this.objectId;
   }

   public String getLogisticsServices() {
      return this.logisticsServices;
   }

   public UpdatePackageInfo getPackageInfo() {
      return this.packageInfo;
   }

   public ElectronicBillUserInfo getRecipient() {
      return this.recipient;
   }

   public UpdateSenderUserInfo getSender() {
      return this.sender;
   }

   public Long getTemplateId() {
      return this.templateId;
   }

   public void setBillVersion(Integer billVersion) {
      this.billVersion = billVersion;
   }

   public void setCpCode(String cpCode) {
      this.cpCode = cpCode;
   }

   public void setWaybillCode(String waybillCode) {
      this.waybillCode = waybillCode;
   }

   public void setObjectId(String objectId) {
      this.objectId = objectId;
   }

   public void setLogisticsServices(String logisticsServices) {
      this.logisticsServices = logisticsServices;
   }

   public void setPackageInfo(UpdatePackageInfo packageInfo) {
      this.packageInfo = packageInfo;
   }

   public void setRecipient(ElectronicBillUserInfo recipient) {
      this.recipient = recipient;
   }

   public void setSender(UpdateSenderUserInfo sender) {
      this.sender = sender;
   }

   public void setTemplateId(Long templateId) {
      this.templateId = templateId;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ElectronicBillOrderUpdateRequest)) {
         return false;
      } else {
         ElectronicBillOrderUpdateRequest other = (ElectronicBillOrderUpdateRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$billVersion = this.getBillVersion();
            Object other$billVersion = other.getBillVersion();
            if (this$billVersion == null) {
               if (other$billVersion != null) {
                  return false;
               }
            } else if (!this$billVersion.equals(other$billVersion)) {
               return false;
            }

            Object this$templateId = this.getTemplateId();
            Object other$templateId = other.getTemplateId();
            if (this$templateId == null) {
               if (other$templateId != null) {
                  return false;
               }
            } else if (!this$templateId.equals(other$templateId)) {
               return false;
            }

            Object this$cpCode = this.getCpCode();
            Object other$cpCode = other.getCpCode();
            if (this$cpCode == null) {
               if (other$cpCode != null) {
                  return false;
               }
            } else if (!this$cpCode.equals(other$cpCode)) {
               return false;
            }

            Object this$waybillCode = this.getWaybillCode();
            Object other$waybillCode = other.getWaybillCode();
            if (this$waybillCode == null) {
               if (other$waybillCode != null) {
                  return false;
               }
            } else if (!this$waybillCode.equals(other$waybillCode)) {
               return false;
            }

            Object this$objectId = this.getObjectId();
            Object other$objectId = other.getObjectId();
            if (this$objectId == null) {
               if (other$objectId != null) {
                  return false;
               }
            } else if (!this$objectId.equals(other$objectId)) {
               return false;
            }

            Object this$logisticsServices = this.getLogisticsServices();
            Object other$logisticsServices = other.getLogisticsServices();
            if (this$logisticsServices == null) {
               if (other$logisticsServices != null) {
                  return false;
               }
            } else if (!this$logisticsServices.equals(other$logisticsServices)) {
               return false;
            }

            Object this$packageInfo = this.getPackageInfo();
            Object other$packageInfo = other.getPackageInfo();
            if (this$packageInfo == null) {
               if (other$packageInfo != null) {
                  return false;
               }
            } else if (!this$packageInfo.equals(other$packageInfo)) {
               return false;
            }

            Object this$recipient = this.getRecipient();
            Object other$recipient = other.getRecipient();
            if (this$recipient == null) {
               if (other$recipient != null) {
                  return false;
               }
            } else if (!this$recipient.equals(other$recipient)) {
               return false;
            }

            Object this$sender = this.getSender();
            Object other$sender = other.getSender();
            if (this$sender == null) {
               if (other$sender != null) {
                  return false;
               }
            } else if (!this$sender.equals(other$sender)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof ElectronicBillOrderUpdateRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $billVersion = this.getBillVersion();
      result = result * 59 + ($billVersion == null ? 43 : $billVersion.hashCode());
      Object $templateId = this.getTemplateId();
      result = result * 59 + ($templateId == null ? 43 : $templateId.hashCode());
      Object $cpCode = this.getCpCode();
      result = result * 59 + ($cpCode == null ? 43 : $cpCode.hashCode());
      Object $waybillCode = this.getWaybillCode();
      result = result * 59 + ($waybillCode == null ? 43 : $waybillCode.hashCode());
      Object $objectId = this.getObjectId();
      result = result * 59 + ($objectId == null ? 43 : $objectId.hashCode());
      Object $logisticsServices = this.getLogisticsServices();
      result = result * 59 + ($logisticsServices == null ? 43 : $logisticsServices.hashCode());
      Object $packageInfo = this.getPackageInfo();
      result = result * 59 + ($packageInfo == null ? 43 : $packageInfo.hashCode());
      Object $recipient = this.getRecipient();
      result = result * 59 + ($recipient == null ? 43 : $recipient.hashCode());
      Object $sender = this.getSender();
      result = result * 59 + ($sender == null ? 43 : $sender.hashCode());
      return result;
   }

   public String toString() {
      return "ElectronicBillOrderUpdateRequest(billVersion=" + this.getBillVersion() + ", cpCode=" + this.getCpCode() + ", waybillCode=" + this.getWaybillCode() + ", objectId=" + this.getObjectId() + ", logisticsServices=" + this.getLogisticsServices() + ", packageInfo=" + this.getPackageInfo() + ", recipient=" + this.getRecipient() + ", sender=" + this.getSender() + ", templateId=" + this.getTemplateId() + ")";
   }

   public static class UpdateSenderUserInfo {
      private String mobile;
      private String name;
      private String phone;

      public String getMobile() {
         return this.mobile;
      }

      public String getName() {
         return this.name;
      }

      public String getPhone() {
         return this.phone;
      }

      public void setMobile(String mobile) {
         this.mobile = mobile;
      }

      public void setName(String name) {
         this.name = name;
      }

      public void setPhone(String phone) {
         this.phone = phone;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof UpdateSenderUserInfo)) {
            return false;
         } else {
            UpdateSenderUserInfo other = (UpdateSenderUserInfo)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$mobile = this.getMobile();
               Object other$mobile = other.getMobile();
               if (this$mobile == null) {
                  if (other$mobile != null) {
                     return false;
                  }
               } else if (!this$mobile.equals(other$mobile)) {
                  return false;
               }

               Object this$name = this.getName();
               Object other$name = other.getName();
               if (this$name == null) {
                  if (other$name != null) {
                     return false;
                  }
               } else if (!this$name.equals(other$name)) {
                  return false;
               }

               Object this$phone = this.getPhone();
               Object other$phone = other.getPhone();
               if (this$phone == null) {
                  if (other$phone != null) {
                     return false;
                  }
               } else if (!this$phone.equals(other$phone)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof UpdateSenderUserInfo;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $mobile = this.getMobile();
         result = result * 59 + ($mobile == null ? 43 : $mobile.hashCode());
         Object $name = this.getName();
         result = result * 59 + ($name == null ? 43 : $name.hashCode());
         Object $phone = this.getPhone();
         result = result * 59 + ($phone == null ? 43 : $phone.hashCode());
         return result;
      }

      public String toString() {
         return "ElectronicBillOrderUpdateRequest.UpdateSenderUserInfo(mobile=" + this.getMobile() + ", name=" + this.getName() + ", phone=" + this.getPhone() + ")";
      }
   }

   public static class UpdatePackageInfo {
      private List<ElectronicBillItem> items;
      private Long volume;
      private Long weight;
      private Long length;
      private Long width;
      private Long height;

      public List<ElectronicBillItem> getItems() {
         return this.items;
      }

      public Long getVolume() {
         return this.volume;
      }

      public Long getWeight() {
         return this.weight;
      }

      public Long getLength() {
         return this.length;
      }

      public Long getWidth() {
         return this.width;
      }

      public Long getHeight() {
         return this.height;
      }

      public void setItems(List<ElectronicBillItem> items) {
         this.items = items;
      }

      public void setVolume(Long volume) {
         this.volume = volume;
      }

      public void setWeight(Long weight) {
         this.weight = weight;
      }

      public void setLength(Long length) {
         this.length = length;
      }

      public void setWidth(Long width) {
         this.width = width;
      }

      public void setHeight(Long height) {
         this.height = height;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof UpdatePackageInfo)) {
            return false;
         } else {
            UpdatePackageInfo other = (UpdatePackageInfo)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$volume = this.getVolume();
               Object other$volume = other.getVolume();
               if (this$volume == null) {
                  if (other$volume != null) {
                     return false;
                  }
               } else if (!this$volume.equals(other$volume)) {
                  return false;
               }

               Object this$weight = this.getWeight();
               Object other$weight = other.getWeight();
               if (this$weight == null) {
                  if (other$weight != null) {
                     return false;
                  }
               } else if (!this$weight.equals(other$weight)) {
                  return false;
               }

               Object this$length = this.getLength();
               Object other$length = other.getLength();
               if (this$length == null) {
                  if (other$length != null) {
                     return false;
                  }
               } else if (!this$length.equals(other$length)) {
                  return false;
               }

               Object this$width = this.getWidth();
               Object other$width = other.getWidth();
               if (this$width == null) {
                  if (other$width != null) {
                     return false;
                  }
               } else if (!this$width.equals(other$width)) {
                  return false;
               }

               Object this$height = this.getHeight();
               Object other$height = other.getHeight();
               if (this$height == null) {
                  if (other$height != null) {
                     return false;
                  }
               } else if (!this$height.equals(other$height)) {
                  return false;
               }

               Object this$items = this.getItems();
               Object other$items = other.getItems();
               if (this$items == null) {
                  if (other$items != null) {
                     return false;
                  }
               } else if (!this$items.equals(other$items)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof UpdatePackageInfo;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $volume = this.getVolume();
         result = result * 59 + ($volume == null ? 43 : $volume.hashCode());
         Object $weight = this.getWeight();
         result = result * 59 + ($weight == null ? 43 : $weight.hashCode());
         Object $length = this.getLength();
         result = result * 59 + ($length == null ? 43 : $length.hashCode());
         Object $width = this.getWidth();
         result = result * 59 + ($width == null ? 43 : $width.hashCode());
         Object $height = this.getHeight();
         result = result * 59 + ($height == null ? 43 : $height.hashCode());
         Object $items = this.getItems();
         result = result * 59 + ($items == null ? 43 : $items.hashCode());
         return result;
      }

      public String toString() {
         return "ElectronicBillOrderUpdateRequest.UpdatePackageInfo(items=" + this.getItems() + ", volume=" + this.getVolume() + ", weight=" + this.getWeight() + ", length=" + this.getLength() + ", width=" + this.getWidth() + ", height=" + this.getHeight() + ")";
      }
   }
}
