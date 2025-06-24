package com.xiaohongshu.fls.opensdk.entity.finance.response;

import java.util.List;

public class PageQueryTransactionResponse {
   public Integer pageNum;
   public Integer pageSize;
   public Integer total;
   public Integer totalPage;
   public List<Transaction> transactions;

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

   public List<Transaction> getTransactions() {
      return this.transactions;
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

   public void setTransactions(List<Transaction> transactions) {
      this.transactions = transactions;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof PageQueryTransactionResponse)) {
         return false;
      } else {
         PageQueryTransactionResponse other = (PageQueryTransactionResponse)o;
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

            Object this$transactions = this.getTransactions();
            Object other$transactions = other.getTransactions();
            if (this$transactions == null) {
               if (other$transactions != null) {
                  return false;
               }
            } else if (!this$transactions.equals(other$transactions)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof PageQueryTransactionResponse;
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
      Object $transactions = this.getTransactions();
      result = result * 59 + ($transactions == null ? 43 : $transactions.hashCode());
      return result;
   }

   public String toString() {
      return "PageQueryTransactionResponse(pageNum=" + this.getPageNum() + ", pageSize=" + this.getPageSize() + ", total=" + this.getTotal() + ", totalPage=" + this.getTotalPage() + ", transactions=" + this.getTransactions() + ")";
   }

   public static class Transaction {
      public Long transactionId;
      public String packageId;
      public Integer statementType;
      public Integer transactionBizType;
      public Integer settleBizType;
      public String deliveryId;
      public String transactionBizNo;
      public String returnId;
      public Long orderTime;
      public Long canSettleTime;
      public Long settledTime;
      public String predictableSettleTime;
      public Integer erqingType;
      public Integer transactionSettleStatus;
      public Integer commonSettleStatus;
      public String amount;
      public String goodsAmount;
      public String payAmount;
      public String appPromotion;
      public String freightAmount;
      public String freightAppPromotion;
      public String noFreightReason;
      public String taxAmount;
      public String noTaxReason;
      public String freightTaxAmount;
      public String noFreightTaxReason;
      public String commissionAmount;
      public String payChannelAmount;
      public String noPayChannelReason;
      public String cpsAmount;
      public String installmentAmount;
      public String noInstallmentReason;
      public String extraAmount;
      public String noExtraReason;
      public String calculateRemark;
      public List<GoodsDetail> goodsDetails;

      public Long getTransactionId() {
         return this.transactionId;
      }

      public String getPackageId() {
         return this.packageId;
      }

      public Integer getStatementType() {
         return this.statementType;
      }

      public Integer getTransactionBizType() {
         return this.transactionBizType;
      }

      public Integer getSettleBizType() {
         return this.settleBizType;
      }

      public String getDeliveryId() {
         return this.deliveryId;
      }

      public String getTransactionBizNo() {
         return this.transactionBizNo;
      }

      public String getReturnId() {
         return this.returnId;
      }

      public Long getOrderTime() {
         return this.orderTime;
      }

      public Long getCanSettleTime() {
         return this.canSettleTime;
      }

      public Long getSettledTime() {
         return this.settledTime;
      }

      public String getPredictableSettleTime() {
         return this.predictableSettleTime;
      }

      public Integer getErqingType() {
         return this.erqingType;
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

      public String getGoodsAmount() {
         return this.goodsAmount;
      }

      public String getPayAmount() {
         return this.payAmount;
      }

      public String getAppPromotion() {
         return this.appPromotion;
      }

      public String getFreightAmount() {
         return this.freightAmount;
      }

      public String getFreightAppPromotion() {
         return this.freightAppPromotion;
      }

      public String getNoFreightReason() {
         return this.noFreightReason;
      }

      public String getTaxAmount() {
         return this.taxAmount;
      }

      public String getNoTaxReason() {
         return this.noTaxReason;
      }

      public String getFreightTaxAmount() {
         return this.freightTaxAmount;
      }

      public String getNoFreightTaxReason() {
         return this.noFreightTaxReason;
      }

      public String getCommissionAmount() {
         return this.commissionAmount;
      }

      public String getPayChannelAmount() {
         return this.payChannelAmount;
      }

      public String getNoPayChannelReason() {
         return this.noPayChannelReason;
      }

      public String getCpsAmount() {
         return this.cpsAmount;
      }

      public String getInstallmentAmount() {
         return this.installmentAmount;
      }

      public String getNoInstallmentReason() {
         return this.noInstallmentReason;
      }

      public String getExtraAmount() {
         return this.extraAmount;
      }

      public String getNoExtraReason() {
         return this.noExtraReason;
      }

      public String getCalculateRemark() {
         return this.calculateRemark;
      }

      public List<GoodsDetail> getGoodsDetails() {
         return this.goodsDetails;
      }

      public void setTransactionId(Long transactionId) {
         this.transactionId = transactionId;
      }

      public void setPackageId(String packageId) {
         this.packageId = packageId;
      }

      public void setStatementType(Integer statementType) {
         this.statementType = statementType;
      }

      public void setTransactionBizType(Integer transactionBizType) {
         this.transactionBizType = transactionBizType;
      }

      public void setSettleBizType(Integer settleBizType) {
         this.settleBizType = settleBizType;
      }

      public void setDeliveryId(String deliveryId) {
         this.deliveryId = deliveryId;
      }

      public void setTransactionBizNo(String transactionBizNo) {
         this.transactionBizNo = transactionBizNo;
      }

      public void setReturnId(String returnId) {
         this.returnId = returnId;
      }

      public void setOrderTime(Long orderTime) {
         this.orderTime = orderTime;
      }

      public void setCanSettleTime(Long canSettleTime) {
         this.canSettleTime = canSettleTime;
      }

      public void setSettledTime(Long settledTime) {
         this.settledTime = settledTime;
      }

      public void setPredictableSettleTime(String predictableSettleTime) {
         this.predictableSettleTime = predictableSettleTime;
      }

      public void setErqingType(Integer erqingType) {
         this.erqingType = erqingType;
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

      public void setGoodsAmount(String goodsAmount) {
         this.goodsAmount = goodsAmount;
      }

      public void setPayAmount(String payAmount) {
         this.payAmount = payAmount;
      }

      public void setAppPromotion(String appPromotion) {
         this.appPromotion = appPromotion;
      }

      public void setFreightAmount(String freightAmount) {
         this.freightAmount = freightAmount;
      }

      public void setFreightAppPromotion(String freightAppPromotion) {
         this.freightAppPromotion = freightAppPromotion;
      }

      public void setNoFreightReason(String noFreightReason) {
         this.noFreightReason = noFreightReason;
      }

      public void setTaxAmount(String taxAmount) {
         this.taxAmount = taxAmount;
      }

      public void setNoTaxReason(String noTaxReason) {
         this.noTaxReason = noTaxReason;
      }

      public void setFreightTaxAmount(String freightTaxAmount) {
         this.freightTaxAmount = freightTaxAmount;
      }

      public void setNoFreightTaxReason(String noFreightTaxReason) {
         this.noFreightTaxReason = noFreightTaxReason;
      }

      public void setCommissionAmount(String commissionAmount) {
         this.commissionAmount = commissionAmount;
      }

      public void setPayChannelAmount(String payChannelAmount) {
         this.payChannelAmount = payChannelAmount;
      }

      public void setNoPayChannelReason(String noPayChannelReason) {
         this.noPayChannelReason = noPayChannelReason;
      }

      public void setCpsAmount(String cpsAmount) {
         this.cpsAmount = cpsAmount;
      }

      public void setInstallmentAmount(String installmentAmount) {
         this.installmentAmount = installmentAmount;
      }

      public void setNoInstallmentReason(String noInstallmentReason) {
         this.noInstallmentReason = noInstallmentReason;
      }

      public void setExtraAmount(String extraAmount) {
         this.extraAmount = extraAmount;
      }

      public void setNoExtraReason(String noExtraReason) {
         this.noExtraReason = noExtraReason;
      }

      public void setCalculateRemark(String calculateRemark) {
         this.calculateRemark = calculateRemark;
      }

      public void setGoodsDetails(List<GoodsDetail> goodsDetails) {
         this.goodsDetails = goodsDetails;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof Transaction)) {
            return false;
         } else {
            Transaction other = (Transaction)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$transactionId = this.getTransactionId();
               Object other$transactionId = other.getTransactionId();
               if (this$transactionId == null) {
                  if (other$transactionId != null) {
                     return false;
                  }
               } else if (!this$transactionId.equals(other$transactionId)) {
                  return false;
               }

               Object this$statementType = this.getStatementType();
               Object other$statementType = other.getStatementType();
               if (this$statementType == null) {
                  if (other$statementType != null) {
                     return false;
                  }
               } else if (!this$statementType.equals(other$statementType)) {
                  return false;
               }

               Object this$transactionBizType = this.getTransactionBizType();
               Object other$transactionBizType = other.getTransactionBizType();
               if (this$transactionBizType == null) {
                  if (other$transactionBizType != null) {
                     return false;
                  }
               } else if (!this$transactionBizType.equals(other$transactionBizType)) {
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

               Object this$orderTime = this.getOrderTime();
               Object other$orderTime = other.getOrderTime();
               if (this$orderTime == null) {
                  if (other$orderTime != null) {
                     return false;
                  }
               } else if (!this$orderTime.equals(other$orderTime)) {
                  return false;
               }

               Object this$canSettleTime = this.getCanSettleTime();
               Object other$canSettleTime = other.getCanSettleTime();
               if (this$canSettleTime == null) {
                  if (other$canSettleTime != null) {
                     return false;
                  }
               } else if (!this$canSettleTime.equals(other$canSettleTime)) {
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

               Object this$deliveryId = this.getDeliveryId();
               Object other$deliveryId = other.getDeliveryId();
               if (this$deliveryId == null) {
                  if (other$deliveryId != null) {
                     return false;
                  }
               } else if (!this$deliveryId.equals(other$deliveryId)) {
                  return false;
               }

               Object this$transactionBizNo = this.getTransactionBizNo();
               Object other$transactionBizNo = other.getTransactionBizNo();
               if (this$transactionBizNo == null) {
                  if (other$transactionBizNo != null) {
                     return false;
                  }
               } else if (!this$transactionBizNo.equals(other$transactionBizNo)) {
                  return false;
               }

               Object this$returnId = this.getReturnId();
               Object other$returnId = other.getReturnId();
               if (this$returnId == null) {
                  if (other$returnId != null) {
                     return false;
                  }
               } else if (!this$returnId.equals(other$returnId)) {
                  return false;
               }

               Object this$predictableSettleTime = this.getPredictableSettleTime();
               Object other$predictableSettleTime = other.getPredictableSettleTime();
               if (this$predictableSettleTime == null) {
                  if (other$predictableSettleTime != null) {
                     return false;
                  }
               } else if (!this$predictableSettleTime.equals(other$predictableSettleTime)) {
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

               Object this$goodsAmount = this.getGoodsAmount();
               Object other$goodsAmount = other.getGoodsAmount();
               if (this$goodsAmount == null) {
                  if (other$goodsAmount != null) {
                     return false;
                  }
               } else if (!this$goodsAmount.equals(other$goodsAmount)) {
                  return false;
               }

               Object this$payAmount = this.getPayAmount();
               Object other$payAmount = other.getPayAmount();
               if (this$payAmount == null) {
                  if (other$payAmount != null) {
                     return false;
                  }
               } else if (!this$payAmount.equals(other$payAmount)) {
                  return false;
               }

               Object this$appPromotion = this.getAppPromotion();
               Object other$appPromotion = other.getAppPromotion();
               if (this$appPromotion == null) {
                  if (other$appPromotion != null) {
                     return false;
                  }
               } else if (!this$appPromotion.equals(other$appPromotion)) {
                  return false;
               }

               Object this$freightAmount = this.getFreightAmount();
               Object other$freightAmount = other.getFreightAmount();
               if (this$freightAmount == null) {
                  if (other$freightAmount != null) {
                     return false;
                  }
               } else if (!this$freightAmount.equals(other$freightAmount)) {
                  return false;
               }

               Object this$freightAppPromotion = this.getFreightAppPromotion();
               Object other$freightAppPromotion = other.getFreightAppPromotion();
               if (this$freightAppPromotion == null) {
                  if (other$freightAppPromotion != null) {
                     return false;
                  }
               } else if (!this$freightAppPromotion.equals(other$freightAppPromotion)) {
                  return false;
               }

               Object this$noFreightReason = this.getNoFreightReason();
               Object other$noFreightReason = other.getNoFreightReason();
               if (this$noFreightReason == null) {
                  if (other$noFreightReason != null) {
                     return false;
                  }
               } else if (!this$noFreightReason.equals(other$noFreightReason)) {
                  return false;
               }

               Object this$taxAmount = this.getTaxAmount();
               Object other$taxAmount = other.getTaxAmount();
               if (this$taxAmount == null) {
                  if (other$taxAmount != null) {
                     return false;
                  }
               } else if (!this$taxAmount.equals(other$taxAmount)) {
                  return false;
               }

               Object this$noTaxReason = this.getNoTaxReason();
               Object other$noTaxReason = other.getNoTaxReason();
               if (this$noTaxReason == null) {
                  if (other$noTaxReason != null) {
                     return false;
                  }
               } else if (!this$noTaxReason.equals(other$noTaxReason)) {
                  return false;
               }

               Object this$freightTaxAmount = this.getFreightTaxAmount();
               Object other$freightTaxAmount = other.getFreightTaxAmount();
               if (this$freightTaxAmount == null) {
                  if (other$freightTaxAmount != null) {
                     return false;
                  }
               } else if (!this$freightTaxAmount.equals(other$freightTaxAmount)) {
                  return false;
               }

               Object this$noFreightTaxReason = this.getNoFreightTaxReason();
               Object other$noFreightTaxReason = other.getNoFreightTaxReason();
               if (this$noFreightTaxReason == null) {
                  if (other$noFreightTaxReason != null) {
                     return false;
                  }
               } else if (!this$noFreightTaxReason.equals(other$noFreightTaxReason)) {
                  return false;
               }

               Object this$commissionAmount = this.getCommissionAmount();
               Object other$commissionAmount = other.getCommissionAmount();
               if (this$commissionAmount == null) {
                  if (other$commissionAmount != null) {
                     return false;
                  }
               } else if (!this$commissionAmount.equals(other$commissionAmount)) {
                  return false;
               }

               Object this$payChannelAmount = this.getPayChannelAmount();
               Object other$payChannelAmount = other.getPayChannelAmount();
               if (this$payChannelAmount == null) {
                  if (other$payChannelAmount != null) {
                     return false;
                  }
               } else if (!this$payChannelAmount.equals(other$payChannelAmount)) {
                  return false;
               }

               Object this$noPayChannelReason = this.getNoPayChannelReason();
               Object other$noPayChannelReason = other.getNoPayChannelReason();
               if (this$noPayChannelReason == null) {
                  if (other$noPayChannelReason != null) {
                     return false;
                  }
               } else if (!this$noPayChannelReason.equals(other$noPayChannelReason)) {
                  return false;
               }

               Object this$cpsAmount = this.getCpsAmount();
               Object other$cpsAmount = other.getCpsAmount();
               if (this$cpsAmount == null) {
                  if (other$cpsAmount != null) {
                     return false;
                  }
               } else if (!this$cpsAmount.equals(other$cpsAmount)) {
                  return false;
               }

               Object this$installmentAmount = this.getInstallmentAmount();
               Object other$installmentAmount = other.getInstallmentAmount();
               if (this$installmentAmount == null) {
                  if (other$installmentAmount != null) {
                     return false;
                  }
               } else if (!this$installmentAmount.equals(other$installmentAmount)) {
                  return false;
               }

               Object this$noInstallmentReason = this.getNoInstallmentReason();
               Object other$noInstallmentReason = other.getNoInstallmentReason();
               if (this$noInstallmentReason == null) {
                  if (other$noInstallmentReason != null) {
                     return false;
                  }
               } else if (!this$noInstallmentReason.equals(other$noInstallmentReason)) {
                  return false;
               }

               Object this$extraAmount = this.getExtraAmount();
               Object other$extraAmount = other.getExtraAmount();
               if (this$extraAmount == null) {
                  if (other$extraAmount != null) {
                     return false;
                  }
               } else if (!this$extraAmount.equals(other$extraAmount)) {
                  return false;
               }

               Object this$noExtraReason = this.getNoExtraReason();
               Object other$noExtraReason = other.getNoExtraReason();
               if (this$noExtraReason == null) {
                  if (other$noExtraReason != null) {
                     return false;
                  }
               } else if (!this$noExtraReason.equals(other$noExtraReason)) {
                  return false;
               }

               Object this$calculateRemark = this.getCalculateRemark();
               Object other$calculateRemark = other.getCalculateRemark();
               if (this$calculateRemark == null) {
                  if (other$calculateRemark != null) {
                     return false;
                  }
               } else if (!this$calculateRemark.equals(other$calculateRemark)) {
                  return false;
               }

               Object this$goodsDetails = this.getGoodsDetails();
               Object other$goodsDetails = other.getGoodsDetails();
               if (this$goodsDetails == null) {
                  if (other$goodsDetails != null) {
                     return false;
                  }
               } else if (!this$goodsDetails.equals(other$goodsDetails)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof Transaction;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $transactionId = this.getTransactionId();
         result = result * 59 + ($transactionId == null ? 43 : $transactionId.hashCode());
         Object $statementType = this.getStatementType();
         result = result * 59 + ($statementType == null ? 43 : $statementType.hashCode());
         Object $transactionBizType = this.getTransactionBizType();
         result = result * 59 + ($transactionBizType == null ? 43 : $transactionBizType.hashCode());
         Object $settleBizType = this.getSettleBizType();
         result = result * 59 + ($settleBizType == null ? 43 : $settleBizType.hashCode());
         Object $orderTime = this.getOrderTime();
         result = result * 59 + ($orderTime == null ? 43 : $orderTime.hashCode());
         Object $canSettleTime = this.getCanSettleTime();
         result = result * 59 + ($canSettleTime == null ? 43 : $canSettleTime.hashCode());
         Object $settledTime = this.getSettledTime();
         result = result * 59 + ($settledTime == null ? 43 : $settledTime.hashCode());
         Object $erqingType = this.getErqingType();
         result = result * 59 + ($erqingType == null ? 43 : $erqingType.hashCode());
         Object $transactionSettleStatus = this.getTransactionSettleStatus();
         result = result * 59 + ($transactionSettleStatus == null ? 43 : $transactionSettleStatus.hashCode());
         Object $commonSettleStatus = this.getCommonSettleStatus();
         result = result * 59 + ($commonSettleStatus == null ? 43 : $commonSettleStatus.hashCode());
         Object $packageId = this.getPackageId();
         result = result * 59 + ($packageId == null ? 43 : $packageId.hashCode());
         Object $deliveryId = this.getDeliveryId();
         result = result * 59 + ($deliveryId == null ? 43 : $deliveryId.hashCode());
         Object $transactionBizNo = this.getTransactionBizNo();
         result = result * 59 + ($transactionBizNo == null ? 43 : $transactionBizNo.hashCode());
         Object $returnId = this.getReturnId();
         result = result * 59 + ($returnId == null ? 43 : $returnId.hashCode());
         Object $predictableSettleTime = this.getPredictableSettleTime();
         result = result * 59 + ($predictableSettleTime == null ? 43 : $predictableSettleTime.hashCode());
         Object $amount = this.getAmount();
         result = result * 59 + ($amount == null ? 43 : $amount.hashCode());
         Object $goodsAmount = this.getGoodsAmount();
         result = result * 59 + ($goodsAmount == null ? 43 : $goodsAmount.hashCode());
         Object $payAmount = this.getPayAmount();
         result = result * 59 + ($payAmount == null ? 43 : $payAmount.hashCode());
         Object $appPromotion = this.getAppPromotion();
         result = result * 59 + ($appPromotion == null ? 43 : $appPromotion.hashCode());
         Object $freightAmount = this.getFreightAmount();
         result = result * 59 + ($freightAmount == null ? 43 : $freightAmount.hashCode());
         Object $freightAppPromotion = this.getFreightAppPromotion();
         result = result * 59 + ($freightAppPromotion == null ? 43 : $freightAppPromotion.hashCode());
         Object $noFreightReason = this.getNoFreightReason();
         result = result * 59 + ($noFreightReason == null ? 43 : $noFreightReason.hashCode());
         Object $taxAmount = this.getTaxAmount();
         result = result * 59 + ($taxAmount == null ? 43 : $taxAmount.hashCode());
         Object $noTaxReason = this.getNoTaxReason();
         result = result * 59 + ($noTaxReason == null ? 43 : $noTaxReason.hashCode());
         Object $freightTaxAmount = this.getFreightTaxAmount();
         result = result * 59 + ($freightTaxAmount == null ? 43 : $freightTaxAmount.hashCode());
         Object $noFreightTaxReason = this.getNoFreightTaxReason();
         result = result * 59 + ($noFreightTaxReason == null ? 43 : $noFreightTaxReason.hashCode());
         Object $commissionAmount = this.getCommissionAmount();
         result = result * 59 + ($commissionAmount == null ? 43 : $commissionAmount.hashCode());
         Object $payChannelAmount = this.getPayChannelAmount();
         result = result * 59 + ($payChannelAmount == null ? 43 : $payChannelAmount.hashCode());
         Object $noPayChannelReason = this.getNoPayChannelReason();
         result = result * 59 + ($noPayChannelReason == null ? 43 : $noPayChannelReason.hashCode());
         Object $cpsAmount = this.getCpsAmount();
         result = result * 59 + ($cpsAmount == null ? 43 : $cpsAmount.hashCode());
         Object $installmentAmount = this.getInstallmentAmount();
         result = result * 59 + ($installmentAmount == null ? 43 : $installmentAmount.hashCode());
         Object $noInstallmentReason = this.getNoInstallmentReason();
         result = result * 59 + ($noInstallmentReason == null ? 43 : $noInstallmentReason.hashCode());
         Object $extraAmount = this.getExtraAmount();
         result = result * 59 + ($extraAmount == null ? 43 : $extraAmount.hashCode());
         Object $noExtraReason = this.getNoExtraReason();
         result = result * 59 + ($noExtraReason == null ? 43 : $noExtraReason.hashCode());
         Object $calculateRemark = this.getCalculateRemark();
         result = result * 59 + ($calculateRemark == null ? 43 : $calculateRemark.hashCode());
         Object $goodsDetails = this.getGoodsDetails();
         result = result * 59 + ($goodsDetails == null ? 43 : $goodsDetails.hashCode());
         return result;
      }

      public String toString() {
         return "PageQueryTransactionResponse.Transaction(transactionId=" + this.getTransactionId() + ", packageId=" + this.getPackageId() + ", statementType=" + this.getStatementType() + ", transactionBizType=" + this.getTransactionBizType() + ", settleBizType=" + this.getSettleBizType() + ", deliveryId=" + this.getDeliveryId() + ", transactionBizNo=" + this.getTransactionBizNo() + ", returnId=" + this.getReturnId() + ", orderTime=" + this.getOrderTime() + ", canSettleTime=" + this.getCanSettleTime() + ", settledTime=" + this.getSettledTime() + ", predictableSettleTime=" + this.getPredictableSettleTime() + ", erqingType=" + this.getErqingType() + ", transactionSettleStatus=" + this.getTransactionSettleStatus() + ", commonSettleStatus=" + this.getCommonSettleStatus() + ", amount=" + this.getAmount() + ", goodsAmount=" + this.getGoodsAmount() + ", payAmount=" + this.getPayAmount() + ", appPromotion=" + this.getAppPromotion() + ", freightAmount=" + this.getFreightAmount() + ", freightAppPromotion=" + this.getFreightAppPromotion() + ", noFreightReason=" + this.getNoFreightReason() + ", taxAmount=" + this.getTaxAmount() + ", noTaxReason=" + this.getNoTaxReason() + ", freightTaxAmount=" + this.getFreightTaxAmount() + ", noFreightTaxReason=" + this.getNoFreightTaxReason() + ", commissionAmount=" + this.getCommissionAmount() + ", payChannelAmount=" + this.getPayChannelAmount() + ", noPayChannelReason=" + this.getNoPayChannelReason() + ", cpsAmount=" + this.getCpsAmount() + ", installmentAmount=" + this.getInstallmentAmount() + ", noInstallmentReason=" + this.getNoInstallmentReason() + ", extraAmount=" + this.getExtraAmount() + ", noExtraReason=" + this.getNoExtraReason() + ", calculateRemark=" + this.getCalculateRemark() + ", goodsDetails=" + this.getGoodsDetails() + ")";
      }
   }

   public static class GoodsDetail {
      public Long transactionId;
      public String newSkuId;
      public Integer newSkuQuantity;
      public String rawAmount;
      public String payAmount;
      public String sellerPromotion;
      public String appPromotion;
      public String goodsAmount;
      public String noGoodsReason;
      public String taxAmount;
      public String noTaxReason;
      public String commissionAmount;
      public String serviceCommissionAmount;
      public String redCommissionAmount;
      public String noCommissionReason;
      public String cpsAmount;
      public String noCpsReason;
      public String commissionReturnAmount;
      public String noCommissionReturnReason;

      public Long getTransactionId() {
         return this.transactionId;
      }

      public String getNewSkuId() {
         return this.newSkuId;
      }

      public Integer getNewSkuQuantity() {
         return this.newSkuQuantity;
      }

      public String getRawAmount() {
         return this.rawAmount;
      }

      public String getPayAmount() {
         return this.payAmount;
      }

      public String getSellerPromotion() {
         return this.sellerPromotion;
      }

      public String getAppPromotion() {
         return this.appPromotion;
      }

      public String getGoodsAmount() {
         return this.goodsAmount;
      }

      public String getNoGoodsReason() {
         return this.noGoodsReason;
      }

      public String getTaxAmount() {
         return this.taxAmount;
      }

      public String getNoTaxReason() {
         return this.noTaxReason;
      }

      public String getCommissionAmount() {
         return this.commissionAmount;
      }

      public String getServiceCommissionAmount() {
         return this.serviceCommissionAmount;
      }

      public String getRedCommissionAmount() {
         return this.redCommissionAmount;
      }

      public String getNoCommissionReason() {
         return this.noCommissionReason;
      }

      public String getCpsAmount() {
         return this.cpsAmount;
      }

      public String getNoCpsReason() {
         return this.noCpsReason;
      }

      public String getCommissionReturnAmount() {
         return this.commissionReturnAmount;
      }

      public String getNoCommissionReturnReason() {
         return this.noCommissionReturnReason;
      }

      public void setTransactionId(Long transactionId) {
         this.transactionId = transactionId;
      }

      public void setNewSkuId(String newSkuId) {
         this.newSkuId = newSkuId;
      }

      public void setNewSkuQuantity(Integer newSkuQuantity) {
         this.newSkuQuantity = newSkuQuantity;
      }

      public void setRawAmount(String rawAmount) {
         this.rawAmount = rawAmount;
      }

      public void setPayAmount(String payAmount) {
         this.payAmount = payAmount;
      }

      public void setSellerPromotion(String sellerPromotion) {
         this.sellerPromotion = sellerPromotion;
      }

      public void setAppPromotion(String appPromotion) {
         this.appPromotion = appPromotion;
      }

      public void setGoodsAmount(String goodsAmount) {
         this.goodsAmount = goodsAmount;
      }

      public void setNoGoodsReason(String noGoodsReason) {
         this.noGoodsReason = noGoodsReason;
      }

      public void setTaxAmount(String taxAmount) {
         this.taxAmount = taxAmount;
      }

      public void setNoTaxReason(String noTaxReason) {
         this.noTaxReason = noTaxReason;
      }

      public void setCommissionAmount(String commissionAmount) {
         this.commissionAmount = commissionAmount;
      }

      public void setServiceCommissionAmount(String serviceCommissionAmount) {
         this.serviceCommissionAmount = serviceCommissionAmount;
      }

      public void setRedCommissionAmount(String redCommissionAmount) {
         this.redCommissionAmount = redCommissionAmount;
      }

      public void setNoCommissionReason(String noCommissionReason) {
         this.noCommissionReason = noCommissionReason;
      }

      public void setCpsAmount(String cpsAmount) {
         this.cpsAmount = cpsAmount;
      }

      public void setNoCpsReason(String noCpsReason) {
         this.noCpsReason = noCpsReason;
      }

      public void setCommissionReturnAmount(String commissionReturnAmount) {
         this.commissionReturnAmount = commissionReturnAmount;
      }

      public void setNoCommissionReturnReason(String noCommissionReturnReason) {
         this.noCommissionReturnReason = noCommissionReturnReason;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof GoodsDetail)) {
            return false;
         } else {
            GoodsDetail other = (GoodsDetail)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$transactionId = this.getTransactionId();
               Object other$transactionId = other.getTransactionId();
               if (this$transactionId == null) {
                  if (other$transactionId != null) {
                     return false;
                  }
               } else if (!this$transactionId.equals(other$transactionId)) {
                  return false;
               }

               Object this$newSkuQuantity = this.getNewSkuQuantity();
               Object other$newSkuQuantity = other.getNewSkuQuantity();
               if (this$newSkuQuantity == null) {
                  if (other$newSkuQuantity != null) {
                     return false;
                  }
               } else if (!this$newSkuQuantity.equals(other$newSkuQuantity)) {
                  return false;
               }

               Object this$newSkuId = this.getNewSkuId();
               Object other$newSkuId = other.getNewSkuId();
               if (this$newSkuId == null) {
                  if (other$newSkuId != null) {
                     return false;
                  }
               } else if (!this$newSkuId.equals(other$newSkuId)) {
                  return false;
               }

               Object this$rawAmount = this.getRawAmount();
               Object other$rawAmount = other.getRawAmount();
               if (this$rawAmount == null) {
                  if (other$rawAmount != null) {
                     return false;
                  }
               } else if (!this$rawAmount.equals(other$rawAmount)) {
                  return false;
               }

               Object this$payAmount = this.getPayAmount();
               Object other$payAmount = other.getPayAmount();
               if (this$payAmount == null) {
                  if (other$payAmount != null) {
                     return false;
                  }
               } else if (!this$payAmount.equals(other$payAmount)) {
                  return false;
               }

               Object this$sellerPromotion = this.getSellerPromotion();
               Object other$sellerPromotion = other.getSellerPromotion();
               if (this$sellerPromotion == null) {
                  if (other$sellerPromotion != null) {
                     return false;
                  }
               } else if (!this$sellerPromotion.equals(other$sellerPromotion)) {
                  return false;
               }

               Object this$appPromotion = this.getAppPromotion();
               Object other$appPromotion = other.getAppPromotion();
               if (this$appPromotion == null) {
                  if (other$appPromotion != null) {
                     return false;
                  }
               } else if (!this$appPromotion.equals(other$appPromotion)) {
                  return false;
               }

               Object this$goodsAmount = this.getGoodsAmount();
               Object other$goodsAmount = other.getGoodsAmount();
               if (this$goodsAmount == null) {
                  if (other$goodsAmount != null) {
                     return false;
                  }
               } else if (!this$goodsAmount.equals(other$goodsAmount)) {
                  return false;
               }

               Object this$noGoodsReason = this.getNoGoodsReason();
               Object other$noGoodsReason = other.getNoGoodsReason();
               if (this$noGoodsReason == null) {
                  if (other$noGoodsReason != null) {
                     return false;
                  }
               } else if (!this$noGoodsReason.equals(other$noGoodsReason)) {
                  return false;
               }

               Object this$taxAmount = this.getTaxAmount();
               Object other$taxAmount = other.getTaxAmount();
               if (this$taxAmount == null) {
                  if (other$taxAmount != null) {
                     return false;
                  }
               } else if (!this$taxAmount.equals(other$taxAmount)) {
                  return false;
               }

               Object this$noTaxReason = this.getNoTaxReason();
               Object other$noTaxReason = other.getNoTaxReason();
               if (this$noTaxReason == null) {
                  if (other$noTaxReason != null) {
                     return false;
                  }
               } else if (!this$noTaxReason.equals(other$noTaxReason)) {
                  return false;
               }

               Object this$commissionAmount = this.getCommissionAmount();
               Object other$commissionAmount = other.getCommissionAmount();
               if (this$commissionAmount == null) {
                  if (other$commissionAmount != null) {
                     return false;
                  }
               } else if (!this$commissionAmount.equals(other$commissionAmount)) {
                  return false;
               }

               Object this$serviceCommissionAmount = this.getServiceCommissionAmount();
               Object other$serviceCommissionAmount = other.getServiceCommissionAmount();
               if (this$serviceCommissionAmount == null) {
                  if (other$serviceCommissionAmount != null) {
                     return false;
                  }
               } else if (!this$serviceCommissionAmount.equals(other$serviceCommissionAmount)) {
                  return false;
               }

               Object this$redCommissionAmount = this.getRedCommissionAmount();
               Object other$redCommissionAmount = other.getRedCommissionAmount();
               if (this$redCommissionAmount == null) {
                  if (other$redCommissionAmount != null) {
                     return false;
                  }
               } else if (!this$redCommissionAmount.equals(other$redCommissionAmount)) {
                  return false;
               }

               Object this$noCommissionReason = this.getNoCommissionReason();
               Object other$noCommissionReason = other.getNoCommissionReason();
               if (this$noCommissionReason == null) {
                  if (other$noCommissionReason != null) {
                     return false;
                  }
               } else if (!this$noCommissionReason.equals(other$noCommissionReason)) {
                  return false;
               }

               Object this$cpsAmount = this.getCpsAmount();
               Object other$cpsAmount = other.getCpsAmount();
               if (this$cpsAmount == null) {
                  if (other$cpsAmount != null) {
                     return false;
                  }
               } else if (!this$cpsAmount.equals(other$cpsAmount)) {
                  return false;
               }

               Object this$noCpsReason = this.getNoCpsReason();
               Object other$noCpsReason = other.getNoCpsReason();
               if (this$noCpsReason == null) {
                  if (other$noCpsReason != null) {
                     return false;
                  }
               } else if (!this$noCpsReason.equals(other$noCpsReason)) {
                  return false;
               }

               Object this$commissionReturnAmount = this.getCommissionReturnAmount();
               Object other$commissionReturnAmount = other.getCommissionReturnAmount();
               if (this$commissionReturnAmount == null) {
                  if (other$commissionReturnAmount != null) {
                     return false;
                  }
               } else if (!this$commissionReturnAmount.equals(other$commissionReturnAmount)) {
                  return false;
               }

               Object this$noCommissionReturnReason = this.getNoCommissionReturnReason();
               Object other$noCommissionReturnReason = other.getNoCommissionReturnReason();
               if (this$noCommissionReturnReason == null) {
                  if (other$noCommissionReturnReason != null) {
                     return false;
                  }
               } else if (!this$noCommissionReturnReason.equals(other$noCommissionReturnReason)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof GoodsDetail;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $transactionId = this.getTransactionId();
         result = result * 59 + ($transactionId == null ? 43 : $transactionId.hashCode());
         Object $newSkuQuantity = this.getNewSkuQuantity();
         result = result * 59 + ($newSkuQuantity == null ? 43 : $newSkuQuantity.hashCode());
         Object $newSkuId = this.getNewSkuId();
         result = result * 59 + ($newSkuId == null ? 43 : $newSkuId.hashCode());
         Object $rawAmount = this.getRawAmount();
         result = result * 59 + ($rawAmount == null ? 43 : $rawAmount.hashCode());
         Object $payAmount = this.getPayAmount();
         result = result * 59 + ($payAmount == null ? 43 : $payAmount.hashCode());
         Object $sellerPromotion = this.getSellerPromotion();
         result = result * 59 + ($sellerPromotion == null ? 43 : $sellerPromotion.hashCode());
         Object $appPromotion = this.getAppPromotion();
         result = result * 59 + ($appPromotion == null ? 43 : $appPromotion.hashCode());
         Object $goodsAmount = this.getGoodsAmount();
         result = result * 59 + ($goodsAmount == null ? 43 : $goodsAmount.hashCode());
         Object $noGoodsReason = this.getNoGoodsReason();
         result = result * 59 + ($noGoodsReason == null ? 43 : $noGoodsReason.hashCode());
         Object $taxAmount = this.getTaxAmount();
         result = result * 59 + ($taxAmount == null ? 43 : $taxAmount.hashCode());
         Object $noTaxReason = this.getNoTaxReason();
         result = result * 59 + ($noTaxReason == null ? 43 : $noTaxReason.hashCode());
         Object $commissionAmount = this.getCommissionAmount();
         result = result * 59 + ($commissionAmount == null ? 43 : $commissionAmount.hashCode());
         Object $serviceCommissionAmount = this.getServiceCommissionAmount();
         result = result * 59 + ($serviceCommissionAmount == null ? 43 : $serviceCommissionAmount.hashCode());
         Object $redCommissionAmount = this.getRedCommissionAmount();
         result = result * 59 + ($redCommissionAmount == null ? 43 : $redCommissionAmount.hashCode());
         Object $noCommissionReason = this.getNoCommissionReason();
         result = result * 59 + ($noCommissionReason == null ? 43 : $noCommissionReason.hashCode());
         Object $cpsAmount = this.getCpsAmount();
         result = result * 59 + ($cpsAmount == null ? 43 : $cpsAmount.hashCode());
         Object $noCpsReason = this.getNoCpsReason();
         result = result * 59 + ($noCpsReason == null ? 43 : $noCpsReason.hashCode());
         Object $commissionReturnAmount = this.getCommissionReturnAmount();
         result = result * 59 + ($commissionReturnAmount == null ? 43 : $commissionReturnAmount.hashCode());
         Object $noCommissionReturnReason = this.getNoCommissionReturnReason();
         result = result * 59 + ($noCommissionReturnReason == null ? 43 : $noCommissionReturnReason.hashCode());
         return result;
      }

      public String toString() {
         return "PageQueryTransactionResponse.GoodsDetail(transactionId=" + this.getTransactionId() + ", newSkuId=" + this.getNewSkuId() + ", newSkuQuantity=" + this.getNewSkuQuantity() + ", rawAmount=" + this.getRawAmount() + ", payAmount=" + this.getPayAmount() + ", sellerPromotion=" + this.getSellerPromotion() + ", appPromotion=" + this.getAppPromotion() + ", goodsAmount=" + this.getGoodsAmount() + ", noGoodsReason=" + this.getNoGoodsReason() + ", taxAmount=" + this.getTaxAmount() + ", noTaxReason=" + this.getNoTaxReason() + ", commissionAmount=" + this.getCommissionAmount() + ", serviceCommissionAmount=" + this.getServiceCommissionAmount() + ", redCommissionAmount=" + this.getRedCommissionAmount() + ", noCommissionReason=" + this.getNoCommissionReason() + ", cpsAmount=" + this.getCpsAmount() + ", noCpsReason=" + this.getNoCpsReason() + ", commissionReturnAmount=" + this.getCommissionReturnAmount() + ", noCommissionReturnReason=" + this.getNoCommissionReturnReason() + ")";
      }
   }
}
