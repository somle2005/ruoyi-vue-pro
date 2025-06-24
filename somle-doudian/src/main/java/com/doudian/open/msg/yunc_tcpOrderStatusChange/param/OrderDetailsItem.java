package com.doudian.open.msg.yunc_tcpOrderStatusChange.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderDetailsItem {


	@SerializedName("platform_order_no")
	@OpField(required = false , desc = "抖音电商平台交易父订单号", example= "44444")
	private String platformOrderNo;

	@SerializedName("subplatform_order_no")
	@OpField(required = false , desc = "抖音电商平台交易子订单号", example= "99999")
	private String subplatformOrderNo;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPlatformOrderNo(String platformOrderNo){
		this.platformOrderNo = platformOrderNo;
	}

	
	public String getPlatformOrderNo(){
		return this.platformOrderNo;
	}

	
	public void setSubplatformOrderNo(String subplatformOrderNo){
		this.subplatformOrderNo = subplatformOrderNo;
	}

	
	public String getSubplatformOrderNo(){
		return this.subplatformOrderNo;
	}

}