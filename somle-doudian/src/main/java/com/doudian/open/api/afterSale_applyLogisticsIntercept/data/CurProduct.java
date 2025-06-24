package com.doudian.open.api.afterSale_applyLogisticsIntercept.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class CurProduct {


	@SerializedName("order_id")
	@OpField(desc = "商品单订单号", example = "1706063166401591")
	private Long orderId;

	@SerializedName("product_image")
	@OpField(desc = "商品图片", example = "https://tosv.boe.byted.org/obj/temai/5a10d8cfc3747b2862fb72090fd976a3www660-660")
	private String productImage;

	@SerializedName("product_name")
	@OpField(desc = "商品名称", example = "云达人测试单裙")
	private String productName;

	@SerializedName("product_spec")
	@OpField(desc = "商品规格", example = "红色系")
	private String productSpec;

	@SerializedName("tags")
	@OpField(desc = "商品标签", example = "null")
	private List<String> tags;

	@SerializedName("price")
	@OpField(desc = "单价", example = "200")
	private Long price;

	@SerializedName("amount")
	@OpField(desc = "数量", example = "1")
	private Long amount;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setOrderId(Long orderId){
		this.orderId = orderId;
	}

	
	public Long getOrderId(){
		return this.orderId;
	}

	
	public void setProductImage(String productImage){
		this.productImage = productImage;
	}

	
	public String getProductImage(){
		return this.productImage;
	}

	
	public void setProductName(String productName){
		this.productName = productName;
	}

	
	public String getProductName(){
		return this.productName;
	}

	
	public void setProductSpec(String productSpec){
		this.productSpec = productSpec;
	}

	
	public String getProductSpec(){
		return this.productSpec;
	}

	
	public void setTags(List<String> tags){
		this.tags = tags;
	}

	
	public List<String> getTags(){
		return this.tags;
	}

	
	public void setPrice(Long price){
		this.price = price;
	}

	
	public Long getPrice(){
		return this.price;
	}

	
	public void setAmount(Long amount){
		this.amount = amount;
	}

	
	public Long getAmount(){
		return this.amount;
	}

}