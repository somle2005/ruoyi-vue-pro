package com.doudian.open.msg.trade_TradePartlySellerShip.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ShippedOrderInfoItem {


	@SerializedName("sku_num")
	@OpField(required = false , desc = "该子订单里已购买的sku数量", example= "2")
	private Long skuNum;

	@SerializedName("product_id")
	@OpField(required = false , desc = "对应的商品ID", example= "2329389")
	private Long productId;

	@SerializedName("shipped_num")
	@OpField(required = false , desc = "已发货sku数量", example= "1")
	private Long shippedNum;

	@SerializedName("shipped_order_id")
	@OpField(required = false , desc = "已发货子订单ID", example= "4705288465508532862")
	private Long shippedOrderId;

	@SerializedName("sku_id")
	@OpField(required = false , desc = "对应的skuID", example= "3373737")
	private Long skuId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSkuNum(Long skuNum){
		this.skuNum = skuNum;
	}

	
	public Long getSkuNum(){
		return this.skuNum;
	}

	
	public void setProductId(Long productId){
		this.productId = productId;
	}

	
	public Long getProductId(){
		return this.productId;
	}

	
	public void setShippedNum(Long shippedNum){
		this.shippedNum = shippedNum;
	}

	
	public Long getShippedNum(){
		return this.shippedNum;
	}

	
	public void setShippedOrderId(Long shippedOrderId){
		this.shippedOrderId = shippedOrderId;
	}

	
	public Long getShippedOrderId(){
		return this.shippedOrderId;
	}

	
	public void setSkuId(Long skuId){
		this.skuId = skuId;
	}

	
	public Long getSkuId(){
		return this.skuId;
	}

}