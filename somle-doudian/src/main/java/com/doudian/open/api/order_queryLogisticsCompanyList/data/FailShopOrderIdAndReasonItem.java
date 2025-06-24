package com.doudian.open.api.order_queryLogisticsCompanyList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class FailShopOrderIdAndReasonItem {


	@SerializedName("fail_code")
	@OpField(desc = "订单不存在对应的错误码", example = "100019")
	private String failCode;

	@SerializedName("fail_reason")
	@OpField(desc = "失败原因", example = "订单不存在")
	private String failReason;

	@SerializedName("order_ids")
	@OpField(desc = "本次请求中失败的订单号", example = "[1233,1234]")
	private List<String> orderIds;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setFailCode(String failCode){
		this.failCode = failCode;
	}

	
	public String getFailCode(){
		return this.failCode;
	}

	
	public void setFailReason(String failReason){
		this.failReason = failReason;
	}

	
	public String getFailReason(){
		return this.failReason;
	}

	
	public void setOrderIds(List<String> orderIds){
		this.orderIds = orderIds;
	}

	
	public List<String> getOrderIds(){
		return this.orderIds;
	}

}