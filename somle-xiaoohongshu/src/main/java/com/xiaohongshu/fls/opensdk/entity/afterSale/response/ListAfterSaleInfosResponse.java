package com.xiaohongshu.fls.opensdk.entity.afterSale.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

public class ListAfterSaleInfosResponse {
   public List<OpenAPIAfterSaleBasicInfo> afterSaleBasicInfos;
   public Long totalCount;
   public Integer pageNo;
   public Integer pageSize;

   public List<OpenAPIAfterSaleBasicInfo> getAfterSaleBasicInfos() {
      return this.afterSaleBasicInfos;
   }

   public Long getTotalCount() {
      return this.totalCount;
   }

   public Integer getPageNo() {
      return this.pageNo;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setAfterSaleBasicInfos(List<OpenAPIAfterSaleBasicInfo> afterSaleBasicInfos) {
      this.afterSaleBasicInfos = afterSaleBasicInfos;
   }

   public void setTotalCount(Long totalCount) {
      this.totalCount = totalCount;
   }

   public void setPageNo(Integer pageNo) {
      this.pageNo = pageNo;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ListAfterSaleInfosResponse)) {
         return false;
      } else {
         ListAfterSaleInfosResponse other = (ListAfterSaleInfosResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$totalCount = this.getTotalCount();
            Object other$totalCount = other.getTotalCount();
            if (this$totalCount == null) {
               if (other$totalCount != null) {
                  return false;
               }
            } else if (!this$totalCount.equals(other$totalCount)) {
               return false;
            }

            Object this$pageNo = this.getPageNo();
            Object other$pageNo = other.getPageNo();
            if (this$pageNo == null) {
               if (other$pageNo != null) {
                  return false;
               }
            } else if (!this$pageNo.equals(other$pageNo)) {
               return false;
            }

            Object this$pageSize = this.getPageSize();
            Object other$pageSize = other.getPageSize();
            if (this$pageSize == null) {
               if (other$pageSize != null) {
                  return false;
               }
            } else if (!this$pageSize.equals(other$pageSize)) {
               return false;
            }

            Object this$afterSaleBasicInfos = this.getAfterSaleBasicInfos();
            Object other$afterSaleBasicInfos = other.getAfterSaleBasicInfos();
            if (this$afterSaleBasicInfos == null) {
               if (other$afterSaleBasicInfos != null) {
                  return false;
               }
            } else if (!this$afterSaleBasicInfos.equals(other$afterSaleBasicInfos)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof ListAfterSaleInfosResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $totalCount = this.getTotalCount();
      result = result * 59 + ($totalCount == null ? 43 : $totalCount.hashCode());
      Object $pageNo = this.getPageNo();
      result = result * 59 + ($pageNo == null ? 43 : $pageNo.hashCode());
      Object $pageSize = this.getPageSize();
      result = result * 59 + ($pageSize == null ? 43 : $pageSize.hashCode());
      Object $afterSaleBasicInfos = this.getAfterSaleBasicInfos();
      result = result * 59 + ($afterSaleBasicInfos == null ? 43 : $afterSaleBasicInfos.hashCode());
      return result;
   }

   public String toString() {
      return "ListAfterSaleInfosResponse(afterSaleBasicInfos=" + this.getAfterSaleBasicInfos() + ", totalCount=" + this.getTotalCount() + ", pageNo=" + this.getPageNo() + ", pageSize=" + this.getPageSize() + ")";
   }

   @JsonIgnoreProperties(
      ignoreUnknown = true
   )
   public static class OpenAPIAfterSaleBasicInfo {
      public String returnsId;
      public Integer returnType;
      public Integer reasonId;
      public String reasonNameZh;
      public Integer status;
      public String userId;
      public String orderId;
      public Long applyTime;
      public Long updatedAt;
      public Long expireTime;
      public String desc;
      public Integer returnsTag;
      public Double expectedRefundAmountYuan;

      public String getReturnsId() {
         return this.returnsId;
      }

      public Integer getReturnType() {
         return this.returnType;
      }

      public Integer getReasonId() {
         return this.reasonId;
      }

      public String getReasonNameZh() {
         return this.reasonNameZh;
      }

      public Integer getStatus() {
         return this.status;
      }

      public String getUserId() {
         return this.userId;
      }

      public String getOrderId() {
         return this.orderId;
      }

      public Long getApplyTime() {
         return this.applyTime;
      }

      public Long getUpdatedAt() {
         return this.updatedAt;
      }

      public Long getExpireTime() {
         return this.expireTime;
      }

      public String getDesc() {
         return this.desc;
      }

      public Integer getReturnsTag() {
         return this.returnsTag;
      }

      public Double getExpectedRefundAmountYuan() {
         return this.expectedRefundAmountYuan;
      }

      public void setReturnsId(String returnsId) {
         this.returnsId = returnsId;
      }

      public void setReturnType(Integer returnType) {
         this.returnType = returnType;
      }

      public void setReasonId(Integer reasonId) {
         this.reasonId = reasonId;
      }

      public void setReasonNameZh(String reasonNameZh) {
         this.reasonNameZh = reasonNameZh;
      }

      public void setStatus(Integer status) {
         this.status = status;
      }

      public void setUserId(String userId) {
         this.userId = userId;
      }

      public void setOrderId(String orderId) {
         this.orderId = orderId;
      }

      public void setApplyTime(Long applyTime) {
         this.applyTime = applyTime;
      }

      public void setUpdatedAt(Long updatedAt) {
         this.updatedAt = updatedAt;
      }

      public void setExpireTime(Long expireTime) {
         this.expireTime = expireTime;
      }

      public void setDesc(String desc) {
         this.desc = desc;
      }

      public void setReturnsTag(Integer returnsTag) {
         this.returnsTag = returnsTag;
      }

      public void setExpectedRefundAmountYuan(Double expectedRefundAmountYuan) {
         this.expectedRefundAmountYuan = expectedRefundAmountYuan;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof OpenAPIAfterSaleBasicInfo)) {
            return false;
         } else {
            OpenAPIAfterSaleBasicInfo other = (OpenAPIAfterSaleBasicInfo)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$returnType = this.getReturnType();
               Object other$returnType = other.getReturnType();
               if (this$returnType == null) {
                  if (other$returnType != null) {
                     return false;
                  }
               } else if (!this$returnType.equals(other$returnType)) {
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

               Object this$status = this.getStatus();
               Object other$status = other.getStatus();
               if (this$status == null) {
                  if (other$status != null) {
                     return false;
                  }
               } else if (!this$status.equals(other$status)) {
                  return false;
               }

               Object this$applyTime = this.getApplyTime();
               Object other$applyTime = other.getApplyTime();
               if (this$applyTime == null) {
                  if (other$applyTime != null) {
                     return false;
                  }
               } else if (!this$applyTime.equals(other$applyTime)) {
                  return false;
               }

               Object this$updatedAt = this.getUpdatedAt();
               Object other$updatedAt = other.getUpdatedAt();
               if (this$updatedAt == null) {
                  if (other$updatedAt != null) {
                     return false;
                  }
               } else if (!this$updatedAt.equals(other$updatedAt)) {
                  return false;
               }

               Object this$expireTime = this.getExpireTime();
               Object other$expireTime = other.getExpireTime();
               if (this$expireTime == null) {
                  if (other$expireTime != null) {
                     return false;
                  }
               } else if (!this$expireTime.equals(other$expireTime)) {
                  return false;
               }

               Object this$returnsTag = this.getReturnsTag();
               Object other$returnsTag = other.getReturnsTag();
               if (this$returnsTag == null) {
                  if (other$returnsTag != null) {
                     return false;
                  }
               } else if (!this$returnsTag.equals(other$returnsTag)) {
                  return false;
               }

               Object this$expectedRefundAmountYuan = this.getExpectedRefundAmountYuan();
               Object other$expectedRefundAmountYuan = other.getExpectedRefundAmountYuan();
               if (this$expectedRefundAmountYuan == null) {
                  if (other$expectedRefundAmountYuan != null) {
                     return false;
                  }
               } else if (!this$expectedRefundAmountYuan.equals(other$expectedRefundAmountYuan)) {
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

               Object this$reasonNameZh = this.getReasonNameZh();
               Object other$reasonNameZh = other.getReasonNameZh();
               if (this$reasonNameZh == null) {
                  if (other$reasonNameZh != null) {
                     return false;
                  }
               } else if (!this$reasonNameZh.equals(other$reasonNameZh)) {
                  return false;
               }

               Object this$userId = this.getUserId();
               Object other$userId = other.getUserId();
               if (this$userId == null) {
                  if (other$userId != null) {
                     return false;
                  }
               } else if (!this$userId.equals(other$userId)) {
                  return false;
               }

               Object this$orderId = this.getOrderId();
               Object other$orderId = other.getOrderId();
               if (this$orderId == null) {
                  if (other$orderId != null) {
                     return false;
                  }
               } else if (!this$orderId.equals(other$orderId)) {
                  return false;
               }

               Object this$desc = this.getDesc();
               Object other$desc = other.getDesc();
               if (this$desc == null) {
                  if (other$desc != null) {
                     return false;
                  }
               } else if (!this$desc.equals(other$desc)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof OpenAPIAfterSaleBasicInfo;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $returnType = this.getReturnType();
         result = result * 59 + ($returnType == null ? 43 : $returnType.hashCode());
         Object $reasonId = this.getReasonId();
         result = result * 59 + ($reasonId == null ? 43 : $reasonId.hashCode());
         Object $status = this.getStatus();
         result = result * 59 + ($status == null ? 43 : $status.hashCode());
         Object $applyTime = this.getApplyTime();
         result = result * 59 + ($applyTime == null ? 43 : $applyTime.hashCode());
         Object $updatedAt = this.getUpdatedAt();
         result = result * 59 + ($updatedAt == null ? 43 : $updatedAt.hashCode());
         Object $expireTime = this.getExpireTime();
         result = result * 59 + ($expireTime == null ? 43 : $expireTime.hashCode());
         Object $returnsTag = this.getReturnsTag();
         result = result * 59 + ($returnsTag == null ? 43 : $returnsTag.hashCode());
         Object $expectedRefundAmountYuan = this.getExpectedRefundAmountYuan();
         result = result * 59 + ($expectedRefundAmountYuan == null ? 43 : $expectedRefundAmountYuan.hashCode());
         Object $returnsId = this.getReturnsId();
         result = result * 59 + ($returnsId == null ? 43 : $returnsId.hashCode());
         Object $reasonNameZh = this.getReasonNameZh();
         result = result * 59 + ($reasonNameZh == null ? 43 : $reasonNameZh.hashCode());
         Object $userId = this.getUserId();
         result = result * 59 + ($userId == null ? 43 : $userId.hashCode());
         Object $orderId = this.getOrderId();
         result = result * 59 + ($orderId == null ? 43 : $orderId.hashCode());
         Object $desc = this.getDesc();
         result = result * 59 + ($desc == null ? 43 : $desc.hashCode());
         return result;
      }

      public String toString() {
         return "ListAfterSaleInfosResponse.OpenAPIAfterSaleBasicInfo(returnsId=" + this.getReturnsId() + ", returnType=" + this.getReturnType() + ", reasonId=" + this.getReasonId() + ", reasonNameZh=" + this.getReasonNameZh() + ", status=" + this.getStatus() + ", userId=" + this.getUserId() + ", orderId=" + this.getOrderId() + ", applyTime=" + this.getApplyTime() + ", updatedAt=" + this.getUpdatedAt() + ", expireTime=" + this.getExpireTime() + ", desc=" + this.getDesc() + ", returnsTag=" + this.getReturnsTag() + ", expectedRefundAmountYuan=" + this.getExpectedRefundAmountYuan() + ")";
      }
   }
}
