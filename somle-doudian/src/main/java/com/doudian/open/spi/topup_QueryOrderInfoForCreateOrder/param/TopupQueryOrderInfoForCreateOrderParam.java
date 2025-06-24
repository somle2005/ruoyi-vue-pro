package com.doudian.open.spi.topup_QueryOrderInfoForCreateOrder.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class TopupQueryOrderInfoForCreateOrderParam {


	@SerializedName("outer_order_id")
	@OpField(required = true , desc = "商家外部订单号", example= "123456")
	private String outerOrderId;

	@SerializedName("product_id_list")
	@OpField(required = false , desc = "商品id", example= "[1234567]")
	private List<Long> productIdList;

	@SerializedName("sku_id_list")
	@OpField(required = false , desc = "商品skuId", example= "[12345678]")
	private List<Long> skuIdList;

	@SerializedName("shop_id")
	@OpField(required = true , desc = "店铺id", example= "90410")
	private Long shopId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setOuterOrderId(String outerOrderId){
		this.outerOrderId = outerOrderId;
	}

	
	public String getOuterOrderId(){
		return this.outerOrderId;
	}

	
	public void setProductIdList(List<Long> productIdList){
		this.productIdList = productIdList;
	}

	
	public List<Long> getProductIdList(){
		return this.productIdList;
	}

	
	public void setSkuIdList(List<Long> skuIdList){
		this.skuIdList = skuIdList;
	}

	
	public List<Long> getSkuIdList(){
		return this.skuIdList;
	}

	
	public void setShopId(Long shopId){
		this.shopId = shopId;
	}

	
	public Long getShopId(){
		return this.shopId;
	}

}