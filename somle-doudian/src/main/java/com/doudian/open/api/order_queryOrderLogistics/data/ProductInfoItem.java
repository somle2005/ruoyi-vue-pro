package com.doudian.open.api.order_queryOrderLogistics.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductInfoItem {


	@SerializedName("num")
	@OpField(desc = "sku件数", example = "1")
	private Long num;

	@SerializedName("actual_sub_sku")
	@OpField(desc = "子品信息", example = "")
	private List<ActualSubSkuItem> actualSubSku;

	@SerializedName("sku_order_id")
	@OpField(desc = "商品单ID", example = "1")
	private String skuOrderId;

	@SerializedName("product_id")
	@OpField(desc = "商品ID", example = "1")
	private Long productId;

	@SerializedName("product_name")
	@OpField(desc = "商品名称", example = "1")
	private String productName;

	@SerializedName("sku_id")
	@OpField(desc = "商品ID", example = "1")
	private Long skuId;

	@SerializedName("sku_img")
	@OpField(desc = "sku图片", example = "1")
	private String skuImg;

	@SerializedName("is_free")
	@OpField(desc = "是否是赠品，true赠品false主品", example = "1")
	private Boolean isFree;

	@SerializedName("sub_sku_desc")
	@OpField(desc = "子品规格信息", example = "")
	private List<SubSkuDescItem> subSkuDesc;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setNum(Long num){
		this.num = num;
	}

	
	public Long getNum(){
		return this.num;
	}

	
	public void setActualSubSku(List<ActualSubSkuItem> actualSubSku){
		this.actualSubSku = actualSubSku;
	}

	
	public List<ActualSubSkuItem> getActualSubSku(){
		return this.actualSubSku;
	}

	
	public void setSkuOrderId(String skuOrderId){
		this.skuOrderId = skuOrderId;
	}

	
	public String getSkuOrderId(){
		return this.skuOrderId;
	}

	
	public void setProductId(Long productId){
		this.productId = productId;
	}

	
	public Long getProductId(){
		return this.productId;
	}

	
	public void setProductName(String productName){
		this.productName = productName;
	}

	
	public String getProductName(){
		return this.productName;
	}

	
	public void setSkuId(Long skuId){
		this.skuId = skuId;
	}

	
	public Long getSkuId(){
		return this.skuId;
	}

	
	public void setSkuImg(String skuImg){
		this.skuImg = skuImg;
	}

	
	public String getSkuImg(){
		return this.skuImg;
	}

	
	public void setIsFree(Boolean isFree){
		this.isFree = isFree;
	}

	
	public Boolean getIsFree(){
		return this.isFree;
	}

	
	public void setSubSkuDesc(List<SubSkuDescItem> subSkuDesc){
		this.subSkuDesc = subSkuDesc;
	}

	
	public List<SubSkuDescItem> getSubSkuDesc(){
		return this.subSkuDesc;
	}

}