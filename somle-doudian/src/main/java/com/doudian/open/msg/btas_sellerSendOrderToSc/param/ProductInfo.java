package com.doudian.open.msg.btas_sellerSendOrderToSc.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ProductInfo {


	@SerializedName("color")
	@OpField(required = false , desc = "颜色", example= "白色")
	private String color;

	@SerializedName("fresh")
	@OpField(required = false , desc = "新旧程度，文字描述", example= "9层新")
	private String fresh;

	@SerializedName("new_product")
	@OpField(required = false , desc = "文字描述", example= "1")
	private String newProduct;

	@SerializedName("title")
	@OpField(required = false , desc = "商品标题", example= "苹果 Iphone 12 Pro Max")
	private String title;

	@SerializedName("capacity")
	@OpField(required = false , desc = "容量，文字描述", example= "256G")
	private String capacity;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setColor(String color){
		this.color = color;
	}

	
	public String getColor(){
		return this.color;
	}

	
	public void setFresh(String fresh){
		this.fresh = fresh;
	}

	
	public String getFresh(){
		return this.fresh;
	}

	
	public void setNewProduct(String newProduct){
		this.newProduct = newProduct;
	}

	
	public String getNewProduct(){
		return this.newProduct;
	}

	
	public void setTitle(String title){
		this.title = title;
	}

	
	public String getTitle(){
		return this.title;
	}

	
	public void setCapacity(String capacity){
		this.capacity = capacity;
	}

	
	public String getCapacity(){
		return this.capacity;
	}

}