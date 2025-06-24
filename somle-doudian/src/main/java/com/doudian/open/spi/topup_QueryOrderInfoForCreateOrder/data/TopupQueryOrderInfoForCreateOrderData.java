package com.doudian.open.spi.topup_QueryOrderInfoForCreateOrder.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class TopupQueryOrderInfoForCreateOrderData {


	@SerializedName("outer_order_id")
	@OpField(desc = "外部商家订单号", example = "123456")
	private String outerOrderId;

	@SerializedName("pay_amount")
	@OpField(desc = "用户应该支付金额（单位分）", example = "10000")
	private Long payAmount;

	@SerializedName("promotion_amount")
	@OpField(desc = "优惠金额（单位分）；优惠金额+支付金额=商品价格", example = "1000")
	private Long promotionAmount;


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

	
	public void setPayAmount(Long payAmount){
		this.payAmount = payAmount;
	}

	
	public Long getPayAmount(){
		return this.payAmount;
	}

	
	public void setPromotionAmount(Long promotionAmount){
		this.promotionAmount = promotionAmount;
	}

	
	public Long getPromotionAmount(){
		return this.promotionAmount;
	}

}