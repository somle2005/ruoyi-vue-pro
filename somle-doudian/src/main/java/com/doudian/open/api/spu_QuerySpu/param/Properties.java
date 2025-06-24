package com.doudian.open.api.spu_QuerySpu.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class Properties {


	@SerializedName("brand_id")
	@OpField(required = false , desc = "【选填】品牌", example= "2078711068")
	private Long brandId;

	@SerializedName("model")
	@OpField(required = false , desc = "【选填】型号", example= "F911")
	private String model;

	@SerializedName("book_name")
	@OpField(required = false , desc = "【选填】书名", example= "童话世界")
	private String bookName;

	@SerializedName("product_name")
	@OpField(required = false , desc = "【选填】产品名称", example= "美容护肤面霜")
	private String productName;

	@SerializedName("goods_number")
	@OpField(required = false , desc = "【选填】货号", example= "W91216040101")
	private String goodsNumber;

	@SerializedName("series")
	@OpField(required = false , desc = "【选填】系列", example= "JAMES 系列")
	private String series;

	@SerializedName("registration_approval")
	@OpField(required = false , desc = "【选填】备案/批准文号", example= "粤G妆网备字2023292746")
	private String registrationApproval;

	@SerializedName("ccc")
	@OpField(required = false , desc = "【选填】CCC证书编号", example= "2023011606593938")
	private String ccc;

	@SerializedName("isbn")
	@OpField(required = false , desc = "【选填】ISBN", example= "9787544847346")
	private String isbn;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setBrandId(Long brandId){
		this.brandId = brandId;
	}

	
	public Long getBrandId(){
		return this.brandId;
	}

	
	public void setModel(String model){
		this.model = model;
	}

	
	public String getModel(){
		return this.model;
	}

	
	public void setBookName(String bookName){
		this.bookName = bookName;
	}

	
	public String getBookName(){
		return this.bookName;
	}

	
	public void setProductName(String productName){
		this.productName = productName;
	}

	
	public String getProductName(){
		return this.productName;
	}

	
	public void setGoodsNumber(String goodsNumber){
		this.goodsNumber = goodsNumber;
	}

	
	public String getGoodsNumber(){
		return this.goodsNumber;
	}

	
	public void setSeries(String series){
		this.series = series;
	}

	
	public String getSeries(){
		return this.series;
	}

	
	public void setRegistrationApproval(String registrationApproval){
		this.registrationApproval = registrationApproval;
	}

	
	public String getRegistrationApproval(){
		return this.registrationApproval;
	}

	
	public void setCcc(String ccc){
		this.ccc = ccc;
	}

	
	public String getCcc(){
		return this.ccc;
	}

	
	public void setIsbn(String isbn){
		this.isbn = isbn;
	}

	
	public String getIsbn(){
		return this.isbn;
	}

}