package com.jd.open.api.sdk.domain.mall.ProductWrapService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class BookInfo implements Serializable {
   private String id;
   private Integer firstCategory;
   private String isbn;
   private String issn;
   private String bookName;
   private String foreignBookName;
   private String language;
   private String author;
   private String editer;
   private String proofreader;
   private String remarker;
   private String transfer;
   private String drawer;
   private String publishers;
   private String publishNo;
   private String series;
   private String brand;
   private String format;
   private String packages;
   private String pages;
   private String batchNo;
   private String publishTime;
   private int printNo;
   private String printTime;
   private String sizeAndHeight;
   private String chinaCatalog;
   private String sheet;
   private String papers;
   private String attachment;
   private int attachmentNum;
   private int packNum;
   private int letters;
   private String barCode;
   private String keywords;
   private String pickState;
   private String compile;
   private String photography;
   private String dictation;
   private String read;
   private String finishing;
   private String write;

   @JsonProperty("id")
   public void setId(String id) {
      this.id = id;
   }

   @JsonProperty("id")
   public String getId() {
      return this.id;
   }

   @JsonProperty("first_category")
   public void setFirstCategory(Integer firstCategory) {
      this.firstCategory = firstCategory;
   }

   @JsonProperty("first_category")
   public Integer getFirstCategory() {
      return this.firstCategory;
   }

   @JsonProperty("isbn")
   public void setIsbn(String isbn) {
      this.isbn = isbn;
   }

   @JsonProperty("isbn")
   public String getIsbn() {
      return this.isbn;
   }

   @JsonProperty("issn")
   public void setIssn(String issn) {
      this.issn = issn;
   }

   @JsonProperty("issn")
   public String getIssn() {
      return this.issn;
   }

   @JsonProperty("book_name")
   public void setBookName(String bookName) {
      this.bookName = bookName;
   }

   @JsonProperty("book_name")
   public String getBookName() {
      return this.bookName;
   }

   @JsonProperty("foreign_book_name")
   public void setForeignBookName(String foreignBookName) {
      this.foreignBookName = foreignBookName;
   }

   @JsonProperty("foreign_book_name")
   public String getForeignBookName() {
      return this.foreignBookName;
   }

   @JsonProperty("language")
   public void setLanguage(String language) {
      this.language = language;
   }

   @JsonProperty("language")
   public String getLanguage() {
      return this.language;
   }

   @JsonProperty("author")
   public void setAuthor(String author) {
      this.author = author;
   }

   @JsonProperty("author")
   public String getAuthor() {
      return this.author;
   }

   @JsonProperty("editer")
   public void setEditer(String editer) {
      this.editer = editer;
   }

   @JsonProperty("editer")
   public String getEditer() {
      return this.editer;
   }

   @JsonProperty("proofreader")
   public void setProofreader(String proofreader) {
      this.proofreader = proofreader;
   }

   @JsonProperty("proofreader")
   public String getProofreader() {
      return this.proofreader;
   }

   @JsonProperty("remarker")
   public void setRemarker(String remarker) {
      this.remarker = remarker;
   }

   @JsonProperty("remarker")
   public String getRemarker() {
      return this.remarker;
   }

   @JsonProperty("transfer")
   public void setTransfer(String transfer) {
      this.transfer = transfer;
   }

   @JsonProperty("transfer")
   public String getTransfer() {
      return this.transfer;
   }

   @JsonProperty("drawer")
   public void setDrawer(String drawer) {
      this.drawer = drawer;
   }

   @JsonProperty("drawer")
   public String getDrawer() {
      return this.drawer;
   }

   @JsonProperty("publishers")
   public void setPublishers(String publishers) {
      this.publishers = publishers;
   }

   @JsonProperty("publishers")
   public String getPublishers() {
      return this.publishers;
   }

   @JsonProperty("publish_no")
   public void setPublishNo(String publishNo) {
      this.publishNo = publishNo;
   }

   @JsonProperty("publish_no")
   public String getPublishNo() {
      return this.publishNo;
   }

   @JsonProperty("series")
   public void setSeries(String series) {
      this.series = series;
   }

   @JsonProperty("series")
   public String getSeries() {
      return this.series;
   }

   @JsonProperty("brand")
   public void setBrand(String brand) {
      this.brand = brand;
   }

   @JsonProperty("brand")
   public String getBrand() {
      return this.brand;
   }

   @JsonProperty("format")
   public void setFormat(String format) {
      this.format = format;
   }

   @JsonProperty("format")
   public String getFormat() {
      return this.format;
   }

   @JsonProperty("packages")
   public void setPackages(String packages) {
      this.packages = packages;
   }

   @JsonProperty("packages")
   public String getPackages() {
      return this.packages;
   }

   @JsonProperty("pages")
   public void setPages(String pages) {
      this.pages = pages;
   }

   @JsonProperty("pages")
   public String getPages() {
      return this.pages;
   }

   @JsonProperty("batch_no")
   public void setBatchNo(String batchNo) {
      this.batchNo = batchNo;
   }

   @JsonProperty("batch_no")
   public String getBatchNo() {
      return this.batchNo;
   }

   @JsonProperty("publish_time")
   public void setPublishTime(String publishTime) {
      this.publishTime = publishTime;
   }

   @JsonProperty("publish_time")
   public String getPublishTime() {
      return this.publishTime;
   }

   @JsonProperty("print_no")
   public void setPrintNo(int printNo) {
      this.printNo = printNo;
   }

   @JsonProperty("print_no")
   public int getPrintNo() {
      return this.printNo;
   }

   @JsonProperty("print_time")
   public void setPrintTime(String printTime) {
      this.printTime = printTime;
   }

   @JsonProperty("print_time")
   public String getPrintTime() {
      return this.printTime;
   }

   @JsonProperty("size_and_height")
   public void setSizeAndHeight(String sizeAndHeight) {
      this.sizeAndHeight = sizeAndHeight;
   }

   @JsonProperty("size_and_height")
   public String getSizeAndHeight() {
      return this.sizeAndHeight;
   }

   @JsonProperty("china_catalog")
   public void setChinaCatalog(String chinaCatalog) {
      this.chinaCatalog = chinaCatalog;
   }

   @JsonProperty("china_catalog")
   public String getChinaCatalog() {
      return this.chinaCatalog;
   }

   @JsonProperty("sheet")
   public void setSheet(String sheet) {
      this.sheet = sheet;
   }

   @JsonProperty("sheet")
   public String getSheet() {
      return this.sheet;
   }

   @JsonProperty("papers")
   public void setPapers(String papers) {
      this.papers = papers;
   }

   @JsonProperty("papers")
   public String getPapers() {
      return this.papers;
   }

   @JsonProperty("attachment")
   public void setAttachment(String attachment) {
      this.attachment = attachment;
   }

   @JsonProperty("attachment")
   public String getAttachment() {
      return this.attachment;
   }

   @JsonProperty("attachment_num")
   public void setAttachmentNum(int attachmentNum) {
      this.attachmentNum = attachmentNum;
   }

   @JsonProperty("attachment_num")
   public int getAttachmentNum() {
      return this.attachmentNum;
   }

   @JsonProperty("pack_num")
   public void setPackNum(int packNum) {
      this.packNum = packNum;
   }

   @JsonProperty("pack_num")
   public int getPackNum() {
      return this.packNum;
   }

   @JsonProperty("letters")
   public void setLetters(int letters) {
      this.letters = letters;
   }

   @JsonProperty("letters")
   public int getLetters() {
      return this.letters;
   }

   @JsonProperty("bar_code")
   public void setBarCode(String barCode) {
      this.barCode = barCode;
   }

   @JsonProperty("bar_code")
   public String getBarCode() {
      return this.barCode;
   }

   @JsonProperty("keywords")
   public void setKeywords(String keywords) {
      this.keywords = keywords;
   }

   @JsonProperty("keywords")
   public String getKeywords() {
      return this.keywords;
   }

   @JsonProperty("pick_state")
   public void setPickState(String pickState) {
      this.pickState = pickState;
   }

   @JsonProperty("pick_state")
   public String getPickState() {
      return this.pickState;
   }

   @JsonProperty("compile")
   public void setCompile(String compile) {
      this.compile = compile;
   }

   @JsonProperty("compile")
   public String getCompile() {
      return this.compile;
   }

   @JsonProperty("photography")
   public void setPhotography(String photography) {
      this.photography = photography;
   }

   @JsonProperty("photography")
   public String getPhotography() {
      return this.photography;
   }

   @JsonProperty("dictation")
   public void setDictation(String dictation) {
      this.dictation = dictation;
   }

   @JsonProperty("dictation")
   public String getDictation() {
      return this.dictation;
   }

   @JsonProperty("read")
   public void setRead(String read) {
      this.read = read;
   }

   @JsonProperty("read")
   public String getRead() {
      return this.read;
   }

   @JsonProperty("finishing")
   public void setFinishing(String finishing) {
      this.finishing = finishing;
   }

   @JsonProperty("finishing")
   public String getFinishing() {
      return this.finishing;
   }

   @JsonProperty("write")
   public void setWrite(String write) {
      this.write = write;
   }

   @JsonProperty("write")
   public String getWrite() {
      return this.write;
   }
}
