package com.xiaohongshu.fls.opensdk.entity.invoice.response;

import java.util.List;
import java.util.Map;

public class GetInvoiceListResponse {
   public int pageSize;
   public int pageIndex;
   public int total;
   public int totalPage;
   public List<InvoiceRecord> invoiceRecords;

   public int getPageSize() {
      return this.pageSize;
   }

   public int getPageIndex() {
      return this.pageIndex;
   }

   public int getTotal() {
      return this.total;
   }

   public int getTotalPage() {
      return this.totalPage;
   }

   public List<InvoiceRecord> getInvoiceRecords() {
      return this.invoiceRecords;
   }

   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   public void setPageIndex(int pageIndex) {
      this.pageIndex = pageIndex;
   }

   public void setTotal(int total) {
      this.total = total;
   }

   public void setTotalPage(int totalPage) {
      this.totalPage = totalPage;
   }

   public void setInvoiceRecords(List<InvoiceRecord> invoiceRecords) {
      this.invoiceRecords = invoiceRecords;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetInvoiceListResponse)) {
         return false;
      } else {
         GetInvoiceListResponse other = (GetInvoiceListResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getPageSize() != other.getPageSize()) {
            return false;
         } else if (this.getPageIndex() != other.getPageIndex()) {
            return false;
         } else if (this.getTotal() != other.getTotal()) {
            return false;
         } else if (this.getTotalPage() != other.getTotalPage()) {
            return false;
         } else {
            Object this$invoiceRecords = this.getInvoiceRecords();
            Object other$invoiceRecords = other.getInvoiceRecords();
            if (this$invoiceRecords == null) {
               if (other$invoiceRecords != null) {
                  return false;
               }
            } else if (!this$invoiceRecords.equals(other$invoiceRecords)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetInvoiceListResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      result = result * 59 + this.getPageSize();
      result = result * 59 + this.getPageIndex();
      result = result * 59 + this.getTotal();
      result = result * 59 + this.getTotalPage();
      Object $invoiceRecords = this.getInvoiceRecords();
      result = result * 59 + ($invoiceRecords == null ? 43 : $invoiceRecords.hashCode());
      return result;
   }

   public String toString() {
      return "GetInvoiceListResponse(pageSize=" + this.getPageSize() + ", pageIndex=" + this.getPageIndex() + ", total=" + this.getTotal() + ", totalPage=" + this.getTotalPage() + ", invoiceRecords=" + this.getInvoiceRecords() + ")";
   }

   public static class InvoiceRecord {
      public int invoiceStatus;
      public String xhsInvoiceNo;
      public long applyTime;
      public String title;
      public String taxNo;
      public String taxBankAccount;
      public String taxBankName;
      public int invoiceType;
      public String invoiceAmt;
      public String invoiceNos;
      public String invoiceTotalAmt;
      public String refNo;
      public int titleType;
      public long updatedTime;
      public Map<String, String> attrMap;
      public List<InvoiceItem> itemList;
      public List<File> invoiceFileList;
      public String picUrl;
      public String pdfUrl;

      public int getInvoiceStatus() {
         return this.invoiceStatus;
      }

      public String getXhsInvoiceNo() {
         return this.xhsInvoiceNo;
      }

      public long getApplyTime() {
         return this.applyTime;
      }

      public String getTitle() {
         return this.title;
      }

      public String getTaxNo() {
         return this.taxNo;
      }

      public String getTaxBankAccount() {
         return this.taxBankAccount;
      }

      public String getTaxBankName() {
         return this.taxBankName;
      }

      public int getInvoiceType() {
         return this.invoiceType;
      }

      public String getInvoiceAmt() {
         return this.invoiceAmt;
      }

      public String getInvoiceNos() {
         return this.invoiceNos;
      }

      public String getInvoiceTotalAmt() {
         return this.invoiceTotalAmt;
      }

      public String getRefNo() {
         return this.refNo;
      }

      public int getTitleType() {
         return this.titleType;
      }

      public long getUpdatedTime() {
         return this.updatedTime;
      }

      public Map<String, String> getAttrMap() {
         return this.attrMap;
      }

      public List<InvoiceItem> getItemList() {
         return this.itemList;
      }

      public List<File> getInvoiceFileList() {
         return this.invoiceFileList;
      }

      public String getPicUrl() {
         return this.picUrl;
      }

      public String getPdfUrl() {
         return this.pdfUrl;
      }

      public void setInvoiceStatus(int invoiceStatus) {
         this.invoiceStatus = invoiceStatus;
      }

      public void setXhsInvoiceNo(String xhsInvoiceNo) {
         this.xhsInvoiceNo = xhsInvoiceNo;
      }

      public void setApplyTime(long applyTime) {
         this.applyTime = applyTime;
      }

      public void setTitle(String title) {
         this.title = title;
      }

      public void setTaxNo(String taxNo) {
         this.taxNo = taxNo;
      }

      public void setTaxBankAccount(String taxBankAccount) {
         this.taxBankAccount = taxBankAccount;
      }

      public void setTaxBankName(String taxBankName) {
         this.taxBankName = taxBankName;
      }

      public void setInvoiceType(int invoiceType) {
         this.invoiceType = invoiceType;
      }

      public void setInvoiceAmt(String invoiceAmt) {
         this.invoiceAmt = invoiceAmt;
      }

      public void setInvoiceNos(String invoiceNos) {
         this.invoiceNos = invoiceNos;
      }

      public void setInvoiceTotalAmt(String invoiceTotalAmt) {
         this.invoiceTotalAmt = invoiceTotalAmt;
      }

      public void setRefNo(String refNo) {
         this.refNo = refNo;
      }

      public void setTitleType(int titleType) {
         this.titleType = titleType;
      }

      public void setUpdatedTime(long updatedTime) {
         this.updatedTime = updatedTime;
      }

      public void setAttrMap(Map<String, String> attrMap) {
         this.attrMap = attrMap;
      }

      public void setItemList(List<InvoiceItem> itemList) {
         this.itemList = itemList;
      }

      public void setInvoiceFileList(List<File> invoiceFileList) {
         this.invoiceFileList = invoiceFileList;
      }

      public void setPicUrl(String picUrl) {
         this.picUrl = picUrl;
      }

      public void setPdfUrl(String pdfUrl) {
         this.pdfUrl = pdfUrl;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof InvoiceRecord)) {
            return false;
         } else {
            InvoiceRecord other = (InvoiceRecord)o;
            if (!other.canEqual(this)) {
               return false;
            } else if (this.getInvoiceStatus() != other.getInvoiceStatus()) {
               return false;
            } else if (this.getApplyTime() != other.getApplyTime()) {
               return false;
            } else if (this.getInvoiceType() != other.getInvoiceType()) {
               return false;
            } else if (this.getTitleType() != other.getTitleType()) {
               return false;
            } else if (this.getUpdatedTime() != other.getUpdatedTime()) {
               return false;
            } else {
               Object this$xhsInvoiceNo = this.getXhsInvoiceNo();
               Object other$xhsInvoiceNo = other.getXhsInvoiceNo();
               if (this$xhsInvoiceNo == null) {
                  if (other$xhsInvoiceNo != null) {
                     return false;
                  }
               } else if (!this$xhsInvoiceNo.equals(other$xhsInvoiceNo)) {
                  return false;
               }

               Object this$title = this.getTitle();
               Object other$title = other.getTitle();
               if (this$title == null) {
                  if (other$title != null) {
                     return false;
                  }
               } else if (!this$title.equals(other$title)) {
                  return false;
               }

               Object this$taxNo = this.getTaxNo();
               Object other$taxNo = other.getTaxNo();
               if (this$taxNo == null) {
                  if (other$taxNo != null) {
                     return false;
                  }
               } else if (!this$taxNo.equals(other$taxNo)) {
                  return false;
               }

               Object this$taxBankAccount = this.getTaxBankAccount();
               Object other$taxBankAccount = other.getTaxBankAccount();
               if (this$taxBankAccount == null) {
                  if (other$taxBankAccount != null) {
                     return false;
                  }
               } else if (!this$taxBankAccount.equals(other$taxBankAccount)) {
                  return false;
               }

               Object this$taxBankName = this.getTaxBankName();
               Object other$taxBankName = other.getTaxBankName();
               if (this$taxBankName == null) {
                  if (other$taxBankName != null) {
                     return false;
                  }
               } else if (!this$taxBankName.equals(other$taxBankName)) {
                  return false;
               }

               Object this$invoiceAmt = this.getInvoiceAmt();
               Object other$invoiceAmt = other.getInvoiceAmt();
               if (this$invoiceAmt == null) {
                  if (other$invoiceAmt != null) {
                     return false;
                  }
               } else if (!this$invoiceAmt.equals(other$invoiceAmt)) {
                  return false;
               }

               Object this$invoiceNos = this.getInvoiceNos();
               Object other$invoiceNos = other.getInvoiceNos();
               if (this$invoiceNos == null) {
                  if (other$invoiceNos != null) {
                     return false;
                  }
               } else if (!this$invoiceNos.equals(other$invoiceNos)) {
                  return false;
               }

               Object this$invoiceTotalAmt = this.getInvoiceTotalAmt();
               Object other$invoiceTotalAmt = other.getInvoiceTotalAmt();
               if (this$invoiceTotalAmt == null) {
                  if (other$invoiceTotalAmt != null) {
                     return false;
                  }
               } else if (!this$invoiceTotalAmt.equals(other$invoiceTotalAmt)) {
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

               Object this$attrMap = this.getAttrMap();
               Object other$attrMap = other.getAttrMap();
               if (this$attrMap == null) {
                  if (other$attrMap != null) {
                     return false;
                  }
               } else if (!this$attrMap.equals(other$attrMap)) {
                  return false;
               }

               Object this$itemList = this.getItemList();
               Object other$itemList = other.getItemList();
               if (this$itemList == null) {
                  if (other$itemList != null) {
                     return false;
                  }
               } else if (!this$itemList.equals(other$itemList)) {
                  return false;
               }

               Object this$invoiceFileList = this.getInvoiceFileList();
               Object other$invoiceFileList = other.getInvoiceFileList();
               if (this$invoiceFileList == null) {
                  if (other$invoiceFileList != null) {
                     return false;
                  }
               } else if (!this$invoiceFileList.equals(other$invoiceFileList)) {
                  return false;
               }

               Object this$picUrl = this.getPicUrl();
               Object other$picUrl = other.getPicUrl();
               if (this$picUrl == null) {
                  if (other$picUrl != null) {
                     return false;
                  }
               } else if (!this$picUrl.equals(other$picUrl)) {
                  return false;
               }

               Object this$pdfUrl = this.getPdfUrl();
               Object other$pdfUrl = other.getPdfUrl();
               if (this$pdfUrl == null) {
                  if (other$pdfUrl != null) {
                     return false;
                  }
               } else if (!this$pdfUrl.equals(other$pdfUrl)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof InvoiceRecord;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         result = result * 59 + this.getInvoiceStatus();
         long $applyTime = this.getApplyTime();
         result = result * 59 + (int)($applyTime >>> 32 ^ $applyTime);
         result = result * 59 + this.getInvoiceType();
         result = result * 59 + this.getTitleType();
         long $updatedTime = this.getUpdatedTime();
         result = result * 59 + (int)($updatedTime >>> 32 ^ $updatedTime);
         Object $xhsInvoiceNo = this.getXhsInvoiceNo();
         result = result * 59 + ($xhsInvoiceNo == null ? 43 : $xhsInvoiceNo.hashCode());
         Object $title = this.getTitle();
         result = result * 59 + ($title == null ? 43 : $title.hashCode());
         Object $taxNo = this.getTaxNo();
         result = result * 59 + ($taxNo == null ? 43 : $taxNo.hashCode());
         Object $taxBankAccount = this.getTaxBankAccount();
         result = result * 59 + ($taxBankAccount == null ? 43 : $taxBankAccount.hashCode());
         Object $taxBankName = this.getTaxBankName();
         result = result * 59 + ($taxBankName == null ? 43 : $taxBankName.hashCode());
         Object $invoiceAmt = this.getInvoiceAmt();
         result = result * 59 + ($invoiceAmt == null ? 43 : $invoiceAmt.hashCode());
         Object $invoiceNos = this.getInvoiceNos();
         result = result * 59 + ($invoiceNos == null ? 43 : $invoiceNos.hashCode());
         Object $invoiceTotalAmt = this.getInvoiceTotalAmt();
         result = result * 59 + ($invoiceTotalAmt == null ? 43 : $invoiceTotalAmt.hashCode());
         Object $refNo = this.getRefNo();
         result = result * 59 + ($refNo == null ? 43 : $refNo.hashCode());
         Object $attrMap = this.getAttrMap();
         result = result * 59 + ($attrMap == null ? 43 : $attrMap.hashCode());
         Object $itemList = this.getItemList();
         result = result * 59 + ($itemList == null ? 43 : $itemList.hashCode());
         Object $invoiceFileList = this.getInvoiceFileList();
         result = result * 59 + ($invoiceFileList == null ? 43 : $invoiceFileList.hashCode());
         Object $picUrl = this.getPicUrl();
         result = result * 59 + ($picUrl == null ? 43 : $picUrl.hashCode());
         Object $pdfUrl = this.getPdfUrl();
         result = result * 59 + ($pdfUrl == null ? 43 : $pdfUrl.hashCode());
         return result;
      }

      public String toString() {
         return "GetInvoiceListResponse.InvoiceRecord(invoiceStatus=" + this.getInvoiceStatus() + ", xhsInvoiceNo=" + this.getXhsInvoiceNo() + ", applyTime=" + this.getApplyTime() + ", title=" + this.getTitle() + ", taxNo=" + this.getTaxNo() + ", taxBankAccount=" + this.getTaxBankAccount() + ", taxBankName=" + this.getTaxBankName() + ", invoiceType=" + this.getInvoiceType() + ", invoiceAmt=" + this.getInvoiceAmt() + ", invoiceNos=" + this.getInvoiceNos() + ", invoiceTotalAmt=" + this.getInvoiceTotalAmt() + ", refNo=" + this.getRefNo() + ", titleType=" + this.getTitleType() + ", updatedTime=" + this.getUpdatedTime() + ", attrMap=" + this.getAttrMap() + ", itemList=" + this.getItemList() + ", invoiceFileList=" + this.getInvoiceFileList() + ", picUrl=" + this.getPicUrl() + ", pdfUrl=" + this.getPdfUrl() + ")";
      }
   }

   public static class InvoiceItem {
      public String itemId;
      public String itemName;
      public String price;
      public String taxRate;
      public String boughtCount;

      public String getItemId() {
         return this.itemId;
      }

      public String getItemName() {
         return this.itemName;
      }

      public String getPrice() {
         return this.price;
      }

      public String getTaxRate() {
         return this.taxRate;
      }

      public String getBoughtCount() {
         return this.boughtCount;
      }

      public void setItemId(String itemId) {
         this.itemId = itemId;
      }

      public void setItemName(String itemName) {
         this.itemName = itemName;
      }

      public void setPrice(String price) {
         this.price = price;
      }

      public void setTaxRate(String taxRate) {
         this.taxRate = taxRate;
      }

      public void setBoughtCount(String boughtCount) {
         this.boughtCount = boughtCount;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof InvoiceItem)) {
            return false;
         } else {
            InvoiceItem other = (InvoiceItem)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$itemId = this.getItemId();
               Object other$itemId = other.getItemId();
               if (this$itemId == null) {
                  if (other$itemId != null) {
                     return false;
                  }
               } else if (!this$itemId.equals(other$itemId)) {
                  return false;
               }

               Object this$itemName = this.getItemName();
               Object other$itemName = other.getItemName();
               if (this$itemName == null) {
                  if (other$itemName != null) {
                     return false;
                  }
               } else if (!this$itemName.equals(other$itemName)) {
                  return false;
               }

               Object this$price = this.getPrice();
               Object other$price = other.getPrice();
               if (this$price == null) {
                  if (other$price != null) {
                     return false;
                  }
               } else if (!this$price.equals(other$price)) {
                  return false;
               }

               Object this$taxRate = this.getTaxRate();
               Object other$taxRate = other.getTaxRate();
               if (this$taxRate == null) {
                  if (other$taxRate != null) {
                     return false;
                  }
               } else if (!this$taxRate.equals(other$taxRate)) {
                  return false;
               }

               Object this$boughtCount = this.getBoughtCount();
               Object other$boughtCount = other.getBoughtCount();
               if (this$boughtCount == null) {
                  if (other$boughtCount != null) {
                     return false;
                  }
               } else if (!this$boughtCount.equals(other$boughtCount)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof InvoiceItem;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $itemId = this.getItemId();
         result = result * 59 + ($itemId == null ? 43 : $itemId.hashCode());
         Object $itemName = this.getItemName();
         result = result * 59 + ($itemName == null ? 43 : $itemName.hashCode());
         Object $price = this.getPrice();
         result = result * 59 + ($price == null ? 43 : $price.hashCode());
         Object $taxRate = this.getTaxRate();
         result = result * 59 + ($taxRate == null ? 43 : $taxRate.hashCode());
         Object $boughtCount = this.getBoughtCount();
         result = result * 59 + ($boughtCount == null ? 43 : $boughtCount.hashCode());
         return result;
      }

      public String toString() {
         return "GetInvoiceListResponse.InvoiceItem(itemId=" + this.getItemId() + ", itemName=" + this.getItemName() + ", price=" + this.getPrice() + ", taxRate=" + this.getTaxRate() + ", boughtCount=" + this.getBoughtCount() + ")";
      }
   }

   public static class File {
      public String originUrl;
      public String downloadUrl;
      public String fileName;

      public String getOriginUrl() {
         return this.originUrl;
      }

      public String getDownloadUrl() {
         return this.downloadUrl;
      }

      public String getFileName() {
         return this.fileName;
      }

      public void setOriginUrl(String originUrl) {
         this.originUrl = originUrl;
      }

      public void setDownloadUrl(String downloadUrl) {
         this.downloadUrl = downloadUrl;
      }

      public void setFileName(String fileName) {
         this.fileName = fileName;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof File)) {
            return false;
         } else {
            File other = (File)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$originUrl = this.getOriginUrl();
               Object other$originUrl = other.getOriginUrl();
               if (this$originUrl == null) {
                  if (other$originUrl != null) {
                     return false;
                  }
               } else if (!this$originUrl.equals(other$originUrl)) {
                  return false;
               }

               Object this$downloadUrl = this.getDownloadUrl();
               Object other$downloadUrl = other.getDownloadUrl();
               if (this$downloadUrl == null) {
                  if (other$downloadUrl != null) {
                     return false;
                  }
               } else if (!this$downloadUrl.equals(other$downloadUrl)) {
                  return false;
               }

               Object this$fileName = this.getFileName();
               Object other$fileName = other.getFileName();
               if (this$fileName == null) {
                  if (other$fileName != null) {
                     return false;
                  }
               } else if (!this$fileName.equals(other$fileName)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof File;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $originUrl = this.getOriginUrl();
         result = result * 59 + ($originUrl == null ? 43 : $originUrl.hashCode());
         Object $downloadUrl = this.getDownloadUrl();
         result = result * 59 + ($downloadUrl == null ? 43 : $downloadUrl.hashCode());
         Object $fileName = this.getFileName();
         result = result * 59 + ($fileName == null ? 43 : $fileName.hashCode());
         return result;
      }

      public String toString() {
         return "GetInvoiceListResponse.File(originUrl=" + this.getOriginUrl() + ", downloadUrl=" + this.getDownloadUrl() + ", fileName=" + this.getFileName() + ")";
      }
   }
}
