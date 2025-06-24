package com.doudian.open.api.buyin_strategyPromotionCreate.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class BuyinStrategyPromotionCreateData {


	@SerializedName("result")
	@OpField(desc = "绑定结果", example = "")
	private List<ResultItem> result;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setResult(List<ResultItem> result){
		this.result = result;
	}

	
	public List<ResultItem> getResult(){
		return this.result;
	}

}