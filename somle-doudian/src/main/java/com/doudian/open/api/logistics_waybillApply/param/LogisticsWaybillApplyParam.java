package com.doudian.open.api.logistics_waybillApply.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class LogisticsWaybillApplyParam {


	@SerializedName("waybill_applies")
	@OpField(required = true , desc = "请求结构体", example= "")
	private List<WaybillAppliesItem> waybillApplies;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setWaybillApplies(List<WaybillAppliesItem> waybillApplies){
		this.waybillApplies = waybillApplies;
	}

	
	public List<WaybillAppliesItem> getWaybillApplies(){
		return this.waybillApplies;
	}

}