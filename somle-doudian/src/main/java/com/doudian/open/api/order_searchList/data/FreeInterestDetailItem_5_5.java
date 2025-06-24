package com.doudian.open.api.order_searchList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class FreeInterestDetailItem_5_5 {


	@SerializedName("platform_clearing_amount")
	@OpField(desc = "商品单，抖音月付，平台承担免息金额，单位: 分;", example = "200")
	private Long platformClearingAmount;

	@SerializedName("shop_clearing_amount")
	@OpField(desc = "商品单，抖音月付，商家承担免息金额，单位: 分;", example = "100")
	private Long shopClearingAmount;

	@SerializedName("trade_type")
	@OpField(desc = "交易类型，1-支付，2-退款", example = "1")
	private Long tradeType;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPlatformClearingAmount(Long platformClearingAmount){
		this.platformClearingAmount = platformClearingAmount;
	}

	
	public Long getPlatformClearingAmount(){
		return this.platformClearingAmount;
	}

	
	public void setShopClearingAmount(Long shopClearingAmount){
		this.shopClearingAmount = shopClearingAmount;
	}

	
	public Long getShopClearingAmount(){
		return this.shopClearingAmount;
	}

	
	public void setTradeType(Long tradeType){
		this.tradeType = tradeType;
	}

	
	public Long getTradeType(){
		return this.tradeType;
	}

}