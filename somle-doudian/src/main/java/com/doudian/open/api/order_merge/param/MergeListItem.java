package com.doudian.open.api.order_merge.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class MergeListItem {


	@SerializedName("order_id")
	@OpField(required = true , desc = "店铺订单id，不可重复。不支持售后单", example= "12345678")
	private String orderId;

	@SerializedName("open_address_id")
	@OpField(required = true , desc = "收件人唯一id，订单列表、订单详情及售后详情API会返回，长度256以内", example= "#zNXM/tzNDQGmCbzkShm99ens7XlA35n9L7CGQtECeoPIi1sczPZpUwDfZ/ygBynRheCl8tp+huFx2zfMwk9qBK3V9COfpkuJSY7YWFZxp/XmsSfSXxUGLidY6jdh6xAiduc4y6DrfcQ=")
	private String openAddressId;


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

	
	public void setOpenAddressId(String openAddressId){
		this.openAddressId = openAddressId;
	}

	
	public String getOpenAddressId(){
		return this.openAddressId;
	}

}