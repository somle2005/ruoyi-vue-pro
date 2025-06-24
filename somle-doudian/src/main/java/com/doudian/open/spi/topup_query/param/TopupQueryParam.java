package com.doudian.open.spi.topup_query.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class TopupQueryParam {


	@SerializedName("trade_order_no")
	@OpField(required = false , desc = "充值平台交易单号", example= "4754409207604380918")
	private String tradeOrderNo;

	@SerializedName("topup_biz")
	@OpField(required = false , desc = "业务类型", example= "MOBILE_TOPUP")
	private String topupBiz;

	@SerializedName("shop_id")
	@OpField(required = false , desc = "商家店铺id", example= "12345")
	private String shopId;

	@SerializedName("outer_order_id")
	@OpField(required = false , desc = "外部订单号，特殊充值场景才需要，譬如腾讯充值", example= "1234321")
	private String outerOrderId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTradeOrderNo(String tradeOrderNo){
		this.tradeOrderNo = tradeOrderNo;
	}

	
	public String getTradeOrderNo(){
		return this.tradeOrderNo;
	}

	
	public void setTopupBiz(String topupBiz){
		this.topupBiz = topupBiz;
	}

	
	public String getTopupBiz(){
		return this.topupBiz;
	}

	
	public void setShopId(String shopId){
		this.shopId = shopId;
	}

	
	public String getShopId(){
		return this.shopId;
	}

	
	public void setOuterOrderId(String outerOrderId){
		this.outerOrderId = outerOrderId;
	}

	
	public String getOuterOrderId(){
		return this.outerOrderId;
	}

}