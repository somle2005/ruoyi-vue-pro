package com.doudian.open.api.order_orderCancel.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderOrderCancelParam {


	@SerializedName("shop_order_id")
	@OpField(required = true , desc = "店铺主订单号", example= "5050438739367795793")
	private String shopOrderId;

	@SerializedName("cancel_reason")
	@OpField(required = true , desc = "取消原因必须是如下枚举之一：①：用户重复下单②：用户不想买了③：用户买错了/信息填错了④重新下单、联系不上用户⑥：快递无法配送至用户地址⑦：其他；注意请使用枚举值信息，如“用户重复下单”必须要一致，开发者请勿自定义或带有空格等信息，否则无法通过接口校验；", example= "用户不想买了")
	private String cancelReason;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setShopOrderId(String shopOrderId){
		this.shopOrderId = shopOrderId;
	}

	
	public String getShopOrderId(){
		return this.shopOrderId;
	}

	
	public void setCancelReason(String cancelReason){
		this.cancelReason = cancelReason;
	}

	
	public String getCancelReason(){
		return this.cancelReason;
	}

}