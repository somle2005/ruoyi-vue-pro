package com.doudian.open.api.buyin_kolStrategyEdit.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class FailedItem {


	@SerializedName("buyin_id")
	@OpField(desc = "达人百应ID", example = "70987654321")
	private Long buyinId;

	@SerializedName("reason")
	@OpField(desc = "失败原因", example = "达人账号错误")
	private String reason;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setBuyinId(Long buyinId){
		this.buyinId = buyinId;
	}

	
	public Long getBuyinId(){
		return this.buyinId;
	}

	
	public void setReason(String reason){
		this.reason = reason;
	}

	
	public String getReason(){
		return this.reason;
	}

}