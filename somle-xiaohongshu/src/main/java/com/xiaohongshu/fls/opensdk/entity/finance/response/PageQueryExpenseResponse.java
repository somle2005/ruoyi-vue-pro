package com.xiaohongshu.fls.opensdk.entity.finance.response;

import java.util.List;

public class PageQueryExpenseResponse {
   public Integer pageNum;
   public Integer pageSize;
   public Integer total;
   public Integer totalPage;
   public List<Expense> expenses;

   public Integer getPageNum() {
      return this.pageNum;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public Integer getTotal() {
      return this.total;
   }

   public Integer getTotalPage() {
      return this.totalPage;
   }

   public List<Expense> getExpenses() {
      return this.expenses;
   }

   public void setPageNum(Integer pageNum) {
      this.pageNum = pageNum;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public void setTotal(Integer total) {
      this.total = total;
   }

   public void setTotalPage(Integer totalPage) {
      this.totalPage = totalPage;
   }

   public void setExpenses(List<Expense> expenses) {
      this.expenses = expenses;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof PageQueryExpenseResponse)) {
         return false;
      } else {
         PageQueryExpenseResponse other = (PageQueryExpenseResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
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

            Object this$total = this.getTotal();
            Object other$total = other.getTotal();
            if (this$total == null) {
               if (other$total != null) {
                  return false;
               }
            } else if (!this$total.equals(other$total)) {
               return false;
            }

            Object this$totalPage = this.getTotalPage();
            Object other$totalPage = other.getTotalPage();
            if (this$totalPage == null) {
               if (other$totalPage != null) {
                  return false;
               }
            } else if (!this$totalPage.equals(other$totalPage)) {
               return false;
            }

            Object this$expenses = this.getExpenses();
            Object other$expenses = other.getExpenses();
            if (this$expenses == null) {
               if (other$expenses != null) {
                  return false;
               }
            } else if (!this$expenses.equals(other$expenses)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof PageQueryExpenseResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $pageNum = this.getPageNum();
      result = result * 59 + ($pageNum == null ? 43 : $pageNum.hashCode());
      Object $pageSize = this.getPageSize();
      result = result * 59 + ($pageSize == null ? 43 : $pageSize.hashCode());
      Object $total = this.getTotal();
      result = result * 59 + ($total == null ? 43 : $total.hashCode());
      Object $totalPage = this.getTotalPage();
      result = result * 59 + ($totalPage == null ? 43 : $totalPage.hashCode());
      Object $expenses = this.getExpenses();
      result = result * 59 + ($expenses == null ? 43 : $expenses.hashCode());
      return result;
   }

   public String toString() {
      return "PageQueryExpenseResponse(pageNum=" + this.getPageNum() + ", pageSize=" + this.getPageSize() + ", total=" + this.getTotal() + ", totalPage=" + this.getTotalPage() + ", expenses=" + this.getExpenses() + ")";
   }

   public static class Expense {
      public Long expenseId;
      public Integer baseBizType;
      public String packageId;
      public String bizNo;
      public Long settledTime;
      public Integer erqingType;
      public Integer settleBizType;
      public Integer transactionSettleStatus;
      public Integer commonSettleStatus;
      public String amount;

      public Long getExpenseId() {
         return this.expenseId;
      }

      public Integer getBaseBizType() {
         return this.baseBizType;
      }

      public String getPackageId() {
         return this.packageId;
      }

      public String getBizNo() {
         return this.bizNo;
      }

      public Long getSettledTime() {
         return this.settledTime;
      }

      public Integer getErqingType() {
         return this.erqingType;
      }

      public Integer getSettleBizType() {
         return this.settleBizType;
      }

      public Integer getTransactionSettleStatus() {
         return this.transactionSettleStatus;
      }

      public Integer getCommonSettleStatus() {
         return this.commonSettleStatus;
      }

      public String getAmount() {
         return this.amount;
      }

      public void setExpenseId(Long expenseId) {
         this.expenseId = expenseId;
      }

      public void setBaseBizType(Integer baseBizType) {
         this.baseBizType = baseBizType;
      }

      public void setPackageId(String packageId) {
         this.packageId = packageId;
      }

      public void setBizNo(String bizNo) {
         this.bizNo = bizNo;
      }

      public void setSettledTime(Long settledTime) {
         this.settledTime = settledTime;
      }

      public void setErqingType(Integer erqingType) {
         this.erqingType = erqingType;
      }

      public void setSettleBizType(Integer settleBizType) {
         this.settleBizType = settleBizType;
      }

      public void setTransactionSettleStatus(Integer transactionSettleStatus) {
         this.transactionSettleStatus = transactionSettleStatus;
      }

      public void setCommonSettleStatus(Integer commonSettleStatus) {
         this.commonSettleStatus = commonSettleStatus;
      }

      public void setAmount(String amount) {
         this.amount = amount;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof Expense)) {
            return false;
         } else {
            Expense other = (Expense)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$expenseId = this.getExpenseId();
               Object other$expenseId = other.getExpenseId();
               if (this$expenseId == null) {
                  if (other$expenseId != null) {
                     return false;
                  }
               } else if (!this$expenseId.equals(other$expenseId)) {
                  return false;
               }

               Object this$baseBizType = this.getBaseBizType();
               Object other$baseBizType = other.getBaseBizType();
               if (this$baseBizType == null) {
                  if (other$baseBizType != null) {
                     return false;
                  }
               } else if (!this$baseBizType.equals(other$baseBizType)) {
                  return false;
               }

               Object this$settledTime = this.getSettledTime();
               Object other$settledTime = other.getSettledTime();
               if (this$settledTime == null) {
                  if (other$settledTime != null) {
                     return false;
                  }
               } else if (!this$settledTime.equals(other$settledTime)) {
                  return false;
               }

               Object this$erqingType = this.getErqingType();
               Object other$erqingType = other.getErqingType();
               if (this$erqingType == null) {
                  if (other$erqingType != null) {
                     return false;
                  }
               } else if (!this$erqingType.equals(other$erqingType)) {
                  return false;
               }

               Object this$settleBizType = this.getSettleBizType();
               Object other$settleBizType = other.getSettleBizType();
               if (this$settleBizType == null) {
                  if (other$settleBizType != null) {
                     return false;
                  }
               } else if (!this$settleBizType.equals(other$settleBizType)) {
                  return false;
               }

               Object this$transactionSettleStatus = this.getTransactionSettleStatus();
               Object other$transactionSettleStatus = other.getTransactionSettleStatus();
               if (this$transactionSettleStatus == null) {
                  if (other$transactionSettleStatus != null) {
                     return false;
                  }
               } else if (!this$transactionSettleStatus.equals(other$transactionSettleStatus)) {
                  return false;
               }

               Object this$commonSettleStatus = this.getCommonSettleStatus();
               Object other$commonSettleStatus = other.getCommonSettleStatus();
               if (this$commonSettleStatus == null) {
                  if (other$commonSettleStatus != null) {
                     return false;
                  }
               } else if (!this$commonSettleStatus.equals(other$commonSettleStatus)) {
                  return false;
               }

               Object this$packageId = this.getPackageId();
               Object other$packageId = other.getPackageId();
               if (this$packageId == null) {
                  if (other$packageId != null) {
                     return false;
                  }
               } else if (!this$packageId.equals(other$packageId)) {
                  return false;
               }

               Object this$bizNo = this.getBizNo();
               Object other$bizNo = other.getBizNo();
               if (this$bizNo == null) {
                  if (other$bizNo != null) {
                     return false;
                  }
               } else if (!this$bizNo.equals(other$bizNo)) {
                  return false;
               }

               Object this$amount = this.getAmount();
               Object other$amount = other.getAmount();
               if (this$amount == null) {
                  if (other$amount != null) {
                     return false;
                  }
               } else if (!this$amount.equals(other$amount)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof Expense;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $expenseId = this.getExpenseId();
         result = result * 59 + ($expenseId == null ? 43 : $expenseId.hashCode());
         Object $baseBizType = this.getBaseBizType();
         result = result * 59 + ($baseBizType == null ? 43 : $baseBizType.hashCode());
         Object $settledTime = this.getSettledTime();
         result = result * 59 + ($settledTime == null ? 43 : $settledTime.hashCode());
         Object $erqingType = this.getErqingType();
         result = result * 59 + ($erqingType == null ? 43 : $erqingType.hashCode());
         Object $settleBizType = this.getSettleBizType();
         result = result * 59 + ($settleBizType == null ? 43 : $settleBizType.hashCode());
         Object $transactionSettleStatus = this.getTransactionSettleStatus();
         result = result * 59 + ($transactionSettleStatus == null ? 43 : $transactionSettleStatus.hashCode());
         Object $commonSettleStatus = this.getCommonSettleStatus();
         result = result * 59 + ($commonSettleStatus == null ? 43 : $commonSettleStatus.hashCode());
         Object $packageId = this.getPackageId();
         result = result * 59 + ($packageId == null ? 43 : $packageId.hashCode());
         Object $bizNo = this.getBizNo();
         result = result * 59 + ($bizNo == null ? 43 : $bizNo.hashCode());
         Object $amount = this.getAmount();
         result = result * 59 + ($amount == null ? 43 : $amount.hashCode());
         return result;
      }

      public String toString() {
         return "PageQueryExpenseResponse.Expense(expenseId=" + this.getExpenseId() + ", baseBizType=" + this.getBaseBizType() + ", packageId=" + this.getPackageId() + ", bizNo=" + this.getBizNo() + ", settledTime=" + this.getSettledTime() + ", erqingType=" + this.getErqingType() + ", settleBizType=" + this.getSettleBizType() + ", transactionSettleStatus=" + this.getTransactionSettleStatus() + ", commonSettleStatus=" + this.getCommonSettleStatus() + ", amount=" + this.getAmount() + ")";
      }
   }
}
