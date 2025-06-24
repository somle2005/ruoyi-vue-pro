package com.doudian.open.api.buyin_allKolStrategyCreate.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class BuyinAllKolStrategyCreateData {


	@SerializedName("success")
	@OpField(desc = "是否设置成功", example = "true")
	private Boolean success;

	@SerializedName("strategy_id")
	@OpField(desc = "策略ID", example = "123456")
	private Long strategyId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSuccess(Boolean success){
		this.success = success;
	}

	
	public Boolean getSuccess(){
		return this.success;
	}

	
	public void setStrategyId(Long strategyId){
		this.strategyId = strategyId;
	}

	
	public Long getStrategyId(){
		return this.strategyId;
	}

}