package com.xiaohongshu.fls.opensdk.entity.invoice.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class GetInvoiceListRequest extends BaseRequest {
   public Integer invoiceStatus;
   public String refNo;
   public Long startDateLong;
   public Long endDateLong;
   public Integer pageNum;
   public Integer pageSize;
   public Integer sortEnum;
   public Integer titleType;

   public Integer getInvoiceStatus() {
      return this.invoiceStatus;
   }

   public String getRefNo() {
      return this.refNo;
   }

   public Long getStartDateLong() {
      return this.startDateLong;
   }

   public Long getEndDateLong() {
      return this.endDateLong;
   }

   public Integer getPageNum() {
      return this.pageNum;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public Integer getSortEnum() {
      return this.sortEnum;
   }

   public Integer getTitleType() {
      return this.titleType;
   }

   public void setInvoiceStatus(Integer invoiceStatus) {
      this.invoiceStatus = invoiceStatus;
   }

   public void setRefNo(String refNo) {
      this.refNo = refNo;
   }

   public void setStartDateLong(Long startDateLong) {
      this.startDateLong = startDateLong;
   }

   public void setEndDateLong(Long endDateLong) {
      this.endDateLong = endDateLong;
   }

   public void setPageNum(Integer pageNum) {
      this.pageNum = pageNum;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public void setSortEnum(Integer sortEnum) {
      this.sortEnum = sortEnum;
   }

   public void setTitleType(Integer titleType) {
      this.titleType = titleType;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetInvoiceListRequest)) {
         return false;
      } else {
         GetInvoiceListRequest other = (GetInvoiceListRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$invoiceStatus = this.getInvoiceStatus();
            Object other$invoiceStatus = other.getInvoiceStatus();
            if (this$invoiceStatus == null) {
               if (other$invoiceStatus != null) {
                  return false;
               }
            } else if (!this$invoiceStatus.equals(other$invoiceStatus)) {
               return false;
            }

            Object this$startDateLong = this.getStartDateLong();
            Object other$startDateLong = other.getStartDateLong();
            if (this$startDateLong == null) {
               if (other$startDateLong != null) {
                  return false;
               }
            } else if (!this$startDateLong.equals(other$startDateLong)) {
               return false;
            }

            Object this$endDateLong = this.getEndDateLong();
            Object other$endDateLong = other.getEndDateLong();
            if (this$endDateLong == null) {
               if (other$endDateLong != null) {
                  return false;
               }
            } else if (!this$endDateLong.equals(other$endDateLong)) {
               return false;
            }

            Object this$pageNum = this.getPageNum();
            Object other$pageNum = other.getPageNum();
            if (this$pageNum == null) {
               if (other$pageNum != null) {
                  return false;
               }
            } else if (!this$pageNum.equals(other$pageNum)) {
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

            Object this$sortEnum = this.getSortEnum();
            Object other$sortEnum = other.getSortEnum();
            if (this$sortEnum == null) {
               if (other$sortEnum != null) {
                  return false;
               }
            } else if (!this$sortEnum.equals(other$sortEnum)) {
               return false;
            }

            Object this$titleType = this.getTitleType();
            Object other$titleType = other.getTitleType();
            if (this$titleType == null) {
               if (other$titleType != null) {
                  return false;
               }
            } else if (!this$titleType.equals(other$titleType)) {
               return false;
            }

            Object this$refNo = this.getRefNo();
            Object other$refNo = other.getRefNo();
            if (this$refNo == null) {
               if (other$refNo != null) {
                  return false;
               }
            } else if (!this$refNo.equals(other$refNo)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetInvoiceListRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $invoiceStatus = this.getInvoiceStatus();
      result = result * 59 + ($invoiceStatus == null ? 43 : $invoiceStatus.hashCode());
      Object $startDateLong = this.getStartDateLong();
      result = result * 59 + ($startDateLong == null ? 43 : $startDateLong.hashCode());
      Object $endDateLong = this.getEndDateLong();
      result = result * 59 + ($endDateLong == null ? 43 : $endDateLong.hashCode());
      Object $pageNum = this.getPageNum();
      result = result * 59 + ($pageNum == null ? 43 : $pageNum.hashCode());
      Object $pageSize = this.getPageSize();
      result = result * 59 + ($pageSize == null ? 43 : $pageSize.hashCode());
      Object $sortEnum = this.getSortEnum();
      result = result * 59 + ($sortEnum == null ? 43 : $sortEnum.hashCode());
      Object $titleType = this.getTitleType();
      result = result * 59 + ($titleType == null ? 43 : $titleType.hashCode());
      Object $refNo = this.getRefNo();
      result = result * 59 + ($refNo == null ? 43 : $refNo.hashCode());
      return result;
   }

   public String toString() {
      return "GetInvoiceListRequest(invoiceStatus=" + this.getInvoiceStatus() + ", refNo=" + this.getRefNo() + ", startDateLong=" + this.getStartDateLong() + ", endDateLong=" + this.getEndDateLong() + ", pageNum=" + this.getPageNum() + ", pageSize=" + this.getPageSize() + ", sortEnum=" + this.getSortEnum() + ", titleType=" + this.getTitleType() + ")";
   }
}
