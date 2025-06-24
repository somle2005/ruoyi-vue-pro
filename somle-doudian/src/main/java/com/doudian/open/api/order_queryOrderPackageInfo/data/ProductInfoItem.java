package com.doudian.open.api.order_queryOrderPackageInfo.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductInfoItem {


	@SerializedName("sku_order_id")
	@OpField(desc = "商品绑定的店铺子订单号，抖店平台生成，平台下唯一；注意：一笔订单下有一个子订单和父订单单号相同。", example = "4781320682406083640")
	private String skuOrderId;

	@SerializedName("product_id")
	@OpField(desc = "商品id", example = "3520562294461467745")
	private Long productId;

	@SerializedName("product_name")
	@OpField(desc = "商品名称", example = "XX行李箱")
	private String productName;

	@SerializedName("sku_id")
	@OpField(desc = "商品skuid", example = "3254535")
	private Long skuId;

	@SerializedName("sku_img")
	@OpField(desc = "商品图片", example = "https:xxxx")
	private String skuImg;

	@SerializedName("num")
	@OpField(desc = "商品数量", example = "5")
	private Long num;

	@SerializedName("is_free")
	@OpField(desc = "是否是赠品", example = "false")
	private Boolean isFree;

	@SerializedName("sub_sku_desc")
	@OpField(desc = "子品规格信息", example = "")
	private List<SubSkuDescItem> subSkuDesc;

	@SerializedName("actual_sub_sku")
	@OpField(desc = "实际子品信息", example = "")
	private List<ActualSubSkuItem> actualSubSku;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
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

	
	public void setNum(Long num){
		this.num = num;
	}

	
	public Long getNum(){
		return this.num;
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

	
	public void setActualSubSku(List<ActualSubSkuItem> actualSubSku){
		this.actualSubSku = actualSubSku;
	}

	
	public List<ActualSubSkuItem> getActualSubSku(){
		return this.actualSubSku;
	}

}