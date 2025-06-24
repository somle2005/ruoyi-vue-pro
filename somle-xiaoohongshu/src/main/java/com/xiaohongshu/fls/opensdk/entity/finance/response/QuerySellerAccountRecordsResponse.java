package com.xiaohongshu.fls.opensdk.entity.finance.response;

import java.util.List;

public class QuerySellerAccountRecordsResponse {
   public Integer pageNum;
   public Integer pageSize;
   public Integer total;
   public Integer totalPage;
   public List<Record> records;

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

   public List<Record> getRecords() {
      return this.records;
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

   public void setRecords(List<Record> records) {
      this.records = records;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof QuerySellerAccountRecordsResponse)) {
         return false;
      } else {
         QuerySellerAccountRecordsResponse other = (QuerySellerAccountRecordsResponse)o;
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

            Object this$records = this.getRecords();
            Object other$records = other.getRecords();
            if (this$records == null) {
               if (other$records != null) {
                  return false;
               }
            } else if (!this$records.equals(other$records)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof QuerySellerAccountRecordsResponse;
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
      Object $records = this.getRecords();
      result = result * 59 + ($records == null ? 43 : $records.hashCode());
      return result;
   }

   public String toString() {
      return "QuerySellerAccountRecordsResponse(pageNum=" + this.getPageNum() + ", pageSize=" + this.getPageSize() + ", total=" + this.getTotal() + ", totalPage=" + this.getTotalPage() + ", records=" + this.getRecords() + ")";
   }

   public static class Record {
      public Long accountId;
      public String sellerId;
      public String tradeNo;
      public String incomeAmount;
      public String outcomeAmount;
      public String balanceAmount;
      public String businessNo;
      public String remark;
      public String type;
      public String typeDesc;
      public Long createdTime;
      public String businessType;
      public String balanceBefore;
      public String fundType;
      public Boolean disableBusinessNoLink;

      public Long getAccountId() {
         return this.accountId;
      }

      public String getSellerId() {
         return this.sellerId;
      }

      public String getTradeNo() {
         return this.tradeNo;
      }

      public String getIncomeAmount() {
         return this.incomeAmount;
      }

      public String getOutcomeAmount() {
         return this.outcomeAmount;
      }

      public String getBalanceAmount() {
         return this.balanceAmount;
      }

      public String getBusinessNo() {
         return this.businessNo;
      }

      public String getRemark() {
         return this.remark;
      }

      public String getType() {
         return this.type;
      }

      public String getTypeDesc() {
         return this.typeDesc;
      }

      public Long getCreatedTime() {
         return this.createdTime;
      }

      public String getBusinessType() {
         return this.businessType;
      }

      public String getBalanceBefore() {
         return this.balanceBefore;
      }

      public String getFundType() {
         return this.fundType;
      }

      public Boolean getDisableBusinessNoLink() {
         return this.disableBusinessNoLink;
      }

      public void setAccountId(Long accountId) {
         this.accountId = accountId;
      }

      public void setSellerId(String sellerId) {
         this.sellerId = sellerId;
      }

      public void setTradeNo(String tradeNo) {
         this.tradeNo = tradeNo;
      }

      public void setIncomeAmount(String incomeAmount) {
         this.incomeAmount = incomeAmount;
      }

      public void setOutcomeAmount(String outcomeAmount) {
         this.outcomeAmount = outcomeAmount;
      }

      public void setBalanceAmount(String balanceAmount) {
         this.balanceAmount = balanceAmount;
      }

      public void setBusinessNo(String businessNo) {
         this.businessNo = businessNo;
      }

      public void setRemark(String remark) {
         this.remark = remark;
      }

      public void setType(String type) {
         this.type = type;
      }

      public void setTypeDesc(String typeDesc) {
         this.typeDesc = typeDesc;
      }

      public void setCreatedTime(Long createdTime) {
         this.createdTime = createdTime;
      }

      public void setBusinessType(String businessType) {
         this.businessType = businessType;
      }

      public void setBalanceBefore(String balanceBefore) {
         this.balanceBefore = balanceBefore;
      }

      public void setFundType(String fundType) {
         this.fundType = fundType;
      }

      public void setDisableBusinessNoLink(Boolean disableBusinessNoLink) {
         this.disableBusinessNoLink = disableBusinessNoLink;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof Record)) {
            return false;
         } else {
            Record other = (Record)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$accountId = this.getAccountId();
               Object other$accountId = other.getAccountId();
               if (this$accountId == null) {
                  if (other$accountId != null) {
                     return false;
                  }
               } else if (!this$accountId.equals(other$accountId)) {
                  return false;
               }

               Object this$createdTime = this.getCreatedTime();
               Object other$createdTime = other.getCreatedTime();
               if (this$createdTime == null) {
                  if (other$createdTime != null) {
                     return false;
                  }
               } else if (!this$createdTime.equals(other$createdTime)) {
                  return false;
               }

               Object this$disableBusinessNoLink = this.getDisableBusinessNoLink();
               Object other$disableBusinessNoLink = other.getDisableBusinessNoLink();
               if (this$disableBusinessNoLink == null) {
                  if (other$disableBusinessNoLink != null) {
                     return false;
                  }
               } else if (!this$disableBusinessNoLink.equals(other$disableBusinessNoLink)) {
                  return false;
               }

               Object this$sellerId = this.getSellerId();
               Object other$sellerId = other.getSellerId();
               if (this$sellerId == null) {
                  if (other$sellerId != null) {
                     return false;
                  }
               } else if (!this$sellerId.equals(other$sellerId)) {
                  return false;
               }

               Object this$tradeNo = this.getTradeNo();
               Object other$tradeNo = other.getTradeNo();
               if (this$tradeNo == null) {
                  if (other$tradeNo != null) {
                     return false;
                  }
               } else if (!this$tradeNo.equals(other$tradeNo)) {
                  return false;
               }

               Object this$incomeAmount = this.getIncomeAmount();
               Object other$incomeAmount = other.getIncomeAmount();
               if (this$incomeAmount == null) {
                  if (other$incomeAmount != null) {
                     return false;
                  }
               } else if (!this$incomeAmount.equals(other$incomeAmount)) {
                  return false;
               }

               Object this$outcomeAmount = this.getOutcomeAmount();
               Object other$outcomeAmount = other.getOutcomeAmount();
               if (this$outcomeAmount == null) {
                  if (other$outcomeAmount != null) {
                     return false;
                  }
               } else if (!this$outcomeAmount.equals(other$outcomeAmount)) {
                  return false;
               }

               Object this$balanceAmount = this.getBalanceAmount();
               Object other$balanceAmount = other.getBalanceAmount();
               if (this$balanceAmount == null) {
                  if (other$balanceAmount != null) {
                     return false;
                  }
               } else if (!this$balanceAmount.equals(other$balanceAmount)) {
                  return false;
               }

               Object this$businessNo = this.getBusinessNo();
               Object other$businessNo = other.getBusinessNo();
               if (this$businessNo == null) {
                  if (other$businessNo != null) {
                     return false;
                  }
               } else if (!this$businessNo.equals(other$businessNo)) {
                  return false;
               }

               Object this$remark = this.getRemark();
               Object other$remark = other.getRemark();
               if (this$remark == null) {
                  if (other$remark != null) {
                     return false;
                  }
               } else if (!this$remark.equals(other$remark)) {
                  return false;
               }

               Object this$type = this.getType();
               Object other$type = other.getType();
               if (this$type == null) {
                  if (other$type != null) {
                     return false;
                  }
               } else if (!this$type.equals(other$type)) {
                  return false;
               }

               Object this$typeDesc = this.getTypeDesc();
               Object other$typeDesc = other.getTypeDesc();
               if (this$typeDesc == null) {
                  if (other$typeDesc != null) {
                     return false;
                  }
               } else if (!this$typeDesc.equals(other$typeDesc)) {
                  return false;
               }

               Object this$businessType = this.getBusinessType();
               Object other$businessType = other.getBusinessType();
               if (this$businessType == null) {
                  if (other$businessType != null) {
                     return false;
                  }
               } else if (!this$businessType.equals(other$businessType)) {
                  return false;
               }

               Object this$balanceBefore = this.getBalanceBefore();
               Object other$balanceBefore = other.getBalanceBefore();
               if (this$balanceBefore == null) {
                  if (other$balanceBefore != null) {
                     return false;
                  }
               } else if (!this$balanceBefore.equals(other$balanceBefore)) {
                  return false;
               }

               Object this$fundType = this.getFundType();
               Object other$fundType = other.getFundType();
               if (this$fundType == null) {
                  if (other$fundType != null) {
                     return false;
                  }
               } else if (!this$fundType.equals(other$fundType)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof Record;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $accountId = this.getAccountId();
         result = result * 59 + ($accountId == null ? 43 : $accountId.hashCode());
         Object $createdTime = this.getCreatedTime();
         result = result * 59 + ($createdTime == null ? 43 : $createdTime.hashCode());
         Object $disableBusinessNoLink = this.getDisableBusinessNoLink();
         result = result * 59 + ($disableBusinessNoLink == null ? 43 : $disableBusinessNoLink.hashCode());
         Object $sellerId = this.getSellerId();
         result = result * 59 + ($sellerId == null ? 43 : $sellerId.hashCode());
         Object $tradeNo = this.getTradeNo();
         result = result * 59 + ($tradeNo == null ? 43 : $tradeNo.hashCode());
         Object $incomeAmount = this.getIncomeAmount();
         result = result * 59 + ($incomeAmount == null ? 43 : $incomeAmount.hashCode());
         Object $outcomeAmount = this.getOutcomeAmount();
         result = result * 59 + ($outcomeAmount == null ? 43 : $outcomeAmount.hashCode());
         Object $balanceAmount = this.getBalanceAmount();
         result = result * 59 + ($balanceAmount == null ? 43 : $balanceAmount.hashCode());
         Object $businessNo = this.getBusinessNo();
         result = result * 59 + ($businessNo == null ? 43 : $businessNo.hashCode());
         Object $remark = this.getRemark();
         result = result * 59 + ($remark == null ? 43 : $remark.hashCode());
         Object $type = this.getType();
         result = result * 59 + ($type == null ? 43 : $type.hashCode());
         Object $typeDesc = this.getTypeDesc();
         result = result * 59 + ($typeDesc == null ? 43 : $typeDesc.hashCode());
         Object $businessType = this.getBusinessType();
         result = result * 59 + ($businessType == null ? 43 : $businessType.hashCode());
         Object $balanceBefore = this.getBalanceBefore();
         result = result * 59 + ($balanceBefore == null ? 43 : $balanceBefore.hashCode());
         Object $fundType = this.getFundType();
         result = result * 59 + ($fundType == null ? 43 : $fundType.hashCode());
         return result;
      }

      public String toString() {
         return "QuerySellerAccountRecordsResponse.Record(accountId=" + this.getAccountId() + ", sellerId=" + this.getSellerId() + ", tradeNo=" + this.getTradeNo() + ", incomeAmount=" + this.getIncomeAmount() + ", outcomeAmount=" + this.getOutcomeAmount() + ", balanceAmount=" + this.getBalanceAmount() + ", businessNo=" + this.getBusinessNo() + ", remark=" + this.getRemark() + ", type=" + this.getType() + ", typeDesc=" + this.getTypeDesc() + ", createdTime=" + this.getCreatedTime() + ", businessType=" + this.getBusinessType() + ", balanceBefore=" + this.getBalanceBefore() + ", fundType=" + this.getFundType() + ", disableBusinessNoLink=" + this.getDisableBusinessNoLink() + ")";
      }
   }
}
