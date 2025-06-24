package com.doudian.open.api.order_searchList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class SkuCargoFutureStock {


	@SerializedName("supply_sku_snapshots")
	@OpField(desc = "库存扣减信息", example = "")
	private List<SupplySkuSnapshotsItem> supplySkuSnapshots;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSupplySkuSnapshots(List<SupplySkuSnapshotsItem> supplySkuSnapshots){
		this.supplySkuSnapshots = supplySkuSnapshots;
	}

	
	public List<SupplySkuSnapshotsItem> getSupplySkuSnapshots(){
		return this.supplySkuSnapshots;
	}

}