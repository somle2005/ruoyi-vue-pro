package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class BundleSkuInfoItem {


	@SerializedName("picture_url")
	@OpField(desc = "子商品图片", example = "https://tosv.boe.byted.org/obj/temai/ffef8099084aeb514b028ec8357d9b4awww640-640")
	private String pictureUrl;

	@SerializedName("product_id")
	@OpField(desc = "子商品在抖店的ID", example = "3520562294461467753")
	private String productId;

	@SerializedName("product_name")
	@OpField(desc = "子商品名称", example = "测试非卖品创建商品")
	private String productName;

	@SerializedName("sku_id")
	@OpField(desc = "子商品在抖店的SkuId", example = "1719024557525047")
	private String skuId;

	@SerializedName("item_num")
	@OpField(desc = "子商品数量", example = "1")
	private Long itemNum;

	@SerializedName("code")
	@OpField(desc = "组套子商品外部编码", example = "M8-1234-101")
	private String code;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPictureUrl(String pictureUrl){
		this.pictureUrl = pictureUrl;
	}

	
	public String getPictureUrl(){
		return this.pictureUrl;
	}

	
	public void setProductId(String productId){
		this.productId = productId;
	}

	
	public String getProductId(){
		return this.productId;
	}

	
	public void setProductName(String productName){
		this.productName = productName;
	}

	
	public String getProductName(){
		return this.productName;
	}

	
	public void setSkuId(String skuId){
		this.skuId = skuId;
	}

	
	public String getSkuId(){
		return this.skuId;
	}

	
	public void setItemNum(Long itemNum){
		this.itemNum = itemNum;
	}

	
	public Long getItemNum(){
		return this.itemNum;
	}

	
	public void setCode(String code){
		this.code = code;
	}

	
	public String getCode(){
		return this.code;
	}

}