package com.doudian.open.api.order_mergeV2.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;
import java.util.Map;

//auto generated, do not edit

public class OrderMergeV2Data {


	@SerializedName("order_list")
	@OpField(desc = "合单结果。可合单的订单ID列表用逗号分隔的字符串表示。比如，1111,2222表示订单1111和订单2222可合并发货。", example = "['123123','4564566']")
	private List<String> orderList;

	@SerializedName("failed_order")
	@OpField(desc = "key是失败订单id，value是失败原因", example = "<111:订单不在发货状态>")
	private Map<String,String> failedOrder;


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

	
	public void setFailedOrder(Map<String,String> failedOrder){
		this.failedOrder = failedOrder;
	}

	
	public Map<String,String> getFailedOrder(){
		return this.failedOrder;
	}

}