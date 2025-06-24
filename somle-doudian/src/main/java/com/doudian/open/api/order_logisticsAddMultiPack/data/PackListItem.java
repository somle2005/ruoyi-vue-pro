package com.doudian.open.api.order_logisticsAddMultiPack.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class PackListItem {


	@SerializedName("shipped_order_info")
	@OpField(desc = "发货的订单信息", example = "")
	private List<ShippedOrderInfoItem> shippedOrderInfo;

	@SerializedName("logistics_code")
	@OpField(desc = "物流单号", example = "111111111111111")
	private String logisticsCode;

	@SerializedName("pack_id")
	@OpField(desc = "包裹id", example = "4705288465508532862")
	private String packId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setShippedOrderInfo(List<ShippedOrderInfoItem> shippedOrderInfo){
		this.shippedOrderInfo = shippedOrderInfo;
	}

	
	public List<ShippedOrderInfoItem> getShippedOrderInfo(){
		return this.shippedOrderInfo;
	}

	
	public void setLogisticsCode(String logisticsCode){
		this.logisticsCode = logisticsCode;
	}

	
	public String getLogisticsCode(){
		return this.logisticsCode;
	}

	
	public void setPackId(String packId){
		this.packId = packId;
	}

	
	public String getPackId(){
		return this.packId;
	}

}