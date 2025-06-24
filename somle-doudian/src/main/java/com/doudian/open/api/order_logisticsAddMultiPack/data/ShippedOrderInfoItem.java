package com.doudian.open.api.order_logisticsAddMultiPack.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ShippedOrderInfoItem {


	@SerializedName("shipped_order_id")
	@OpField(desc = "发货的子单id", example = "123123")
	private String shippedOrderId;

	@SerializedName("shipped_num")
	@OpField(desc = "发货子单数量", example = "1")
	private Long shippedNum;

	@SerializedName("shipped_item_ids")
	@OpField(desc = "发货的四层单id", example = "[123123]")
	private List<String> shippedItemIds;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setShippedOrderId(String shippedOrderId){
		this.shippedOrderId = shippedOrderId;
	}

	
	public String getShippedOrderId(){
		return this.shippedOrderId;
	}

	
	public void setShippedNum(Long shippedNum){
		this.shippedNum = shippedNum;
	}

	
	public Long getShippedNum(){
		return this.shippedNum;
	}

	
	public void setShippedItemIds(List<String> shippedItemIds){
		this.shippedItemIds = shippedItemIds;
	}

	
	public List<String> getShippedItemIds(){
		return this.shippedItemIds;
	}

}