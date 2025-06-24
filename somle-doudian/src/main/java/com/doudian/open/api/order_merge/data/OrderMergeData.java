package com.doudian.open.api.order_merge.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class OrderMergeData {


	@SerializedName("order_list")
	@OpField(desc = "合单结果。可合单的订单ID列表用逗号分隔的字符串表示。比如，1111,2222表示订单1111和订单2222可合并发货，3333表示无法合单。", example = "[1111,2222,3333]")
	private List<String> orderList;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setOrderList(List<String> orderList){
		this.orderList = orderList;
	}

	
	public List<String> getOrderList(){
		return this.orderList;
	}

}