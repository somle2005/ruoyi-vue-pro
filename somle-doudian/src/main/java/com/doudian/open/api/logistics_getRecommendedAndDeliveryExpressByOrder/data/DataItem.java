package com.doudian.open.api.logistics_getRecommendedAndDeliveryExpressByOrder.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class DataItem {


	@SerializedName("order_privilege_info_list")
	@OpField(desc = "订单权益列表", example = "")
	private List<OrderPrivilegeInfoListItem> orderPrivilegeInfoList;

	@SerializedName("order_id")
	@OpField(desc = "订单号", example = "123")
	private String orderId;

	@SerializedName("express_info_list")
	@OpField(desc = "推荐及可达物流商信息集合", example = "")
	private List<ExpressInfoListItem> expressInfoList;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setOrderPrivilegeInfoList(List<OrderPrivilegeInfoListItem> orderPrivilegeInfoList){
		this.orderPrivilegeInfoList = orderPrivilegeInfoList;
	}

	
	public List<OrderPrivilegeInfoListItem> getOrderPrivilegeInfoList(){
		return this.orderPrivilegeInfoList;
	}

	
	public void setOrderId(String orderId){
		this.orderId = orderId;
	}

	
	public String getOrderId(){
		return this.orderId;
	}

	
	public void setExpressInfoList(List<ExpressInfoListItem> expressInfoList){
		this.expressInfoList = expressInfoList;
	}

	
	public List<ExpressInfoListItem> getExpressInfoList(){
		return this.expressInfoList;
	}

}