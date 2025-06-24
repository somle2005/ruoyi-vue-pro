package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class SupplySkuSnapshotsItem {


	@SerializedName("batch_detail")
	@OpField(desc = "库存扣减信息列表", example = "")
	private List<BatchDetailItem> batchDetail;

	@SerializedName("inventory_type")
	@OpField(desc = "0-现货库存，1-预售库存", example = "0")
	private Long inventoryType;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setBatchDetail(List<BatchDetailItem> batchDetail){
		this.batchDetail = batchDetail;
	}

	
	public List<BatchDetailItem> getBatchDetail(){
		return this.batchDetail;
	}

	
	public void setInventoryType(Long inventoryType){
		this.inventoryType = inventoryType;
	}

	
	public Long getInventoryType(){
		return this.inventoryType;
	}

}