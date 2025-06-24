package com.doudian.open.api.buyin_orientKolStrategyCreate.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class BuyinOrientKolStrategyCreateData {


	@SerializedName("success")
	@OpField(desc = "策略是否设置成功;", example = "true")
	private Boolean success;

	@SerializedName("strategy_id")
	@OpField(desc = "策略ID", example = "34567541")
	private Long strategyId;

	@SerializedName("failed")
	@OpField(desc = "失败的达人维度结果信息", example = "")
	private List<FailedItem> failed;


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

	
	public void setFailed(List<FailedItem> failed){
		this.failed = failed;
	}

	
	public List<FailedItem> getFailed(){
		return this.failed;
	}

}