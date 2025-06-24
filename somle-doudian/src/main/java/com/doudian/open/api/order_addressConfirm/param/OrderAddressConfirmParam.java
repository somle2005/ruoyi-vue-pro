package com.doudian.open.api.order_addressConfirm.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderAddressConfirmParam {


	@SerializedName("order_id")
	@OpField(required = true , desc = "主订单id，注意请求时order/list或 order/detail中返回的主订单id带的‘A’需要截断掉", example= "3539925204033339668")
	private String orderId;

	@SerializedName("is_approved")
	@OpField(required = true , desc = "0:同意; 拒绝需要传入以下参数： 1001:订单已进入拣货环节 1002:订单已进入配货环节 1003:订单已进入仓库环节1004:订单已进入出库环节 1005:订单已进入发货环节300001:省级地址已变更，无法修改地址300003:市级地址已变更，无法修改地址300004:区级地址已变更，无法修改地址300005:联系人已变更，无法修改地址", example= "0")
	private Long isApproved;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setOrderId(String orderId){
		this.orderId = orderId;
	}

	
	public String getOrderId(){
		return this.orderId;
	}

	
	public void setIsApproved(Long isApproved){
		this.isApproved = isApproved;
	}

	
	public Long getIsApproved(){
		return this.isApproved;
	}

}