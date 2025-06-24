package com.doudian.open.api.order_logisticsAddMultiPack.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ShippedOrderInfoItem {


	@SerializedName("serial_nos_list")
	@OpField(required = false , desc = "发货需要回传的SN/69/IMEI码信息", example= "")
	private List<SerialNosListItem> serialNosList;

	@SerializedName("shipped_order_id")
	@OpField(required = true , desc = "需要发货的子订单id", example= "123123")
	private String shippedOrderId;

	@SerializedName("shipped_num")
	@OpField(required = false , desc = "子订单的需发货数量", example= "1")
	private Long shippedNum;

	@SerializedName("shipped_item_ids")
	@OpField(required = false , desc = "已废弃", example= "[]")
	private List<String> shippedItemIds;

	@SerializedName("bundle_list")
	@OpField(required = false , desc = "组套商品参数列表", example= "")
	private List<BundleListItem> bundleList;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSerialNosList(List<SerialNosListItem> serialNosList){
		this.serialNosList = serialNosList;
	}

	
	public List<SerialNosListItem> getSerialNosList(){
		return this.serialNosList;
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

	
	public void setBundleList(List<BundleListItem> bundleList){
		this.bundleList = bundleList;
	}

	
	public List<BundleListItem> getBundleList(){
		return this.bundleList;
	}

}