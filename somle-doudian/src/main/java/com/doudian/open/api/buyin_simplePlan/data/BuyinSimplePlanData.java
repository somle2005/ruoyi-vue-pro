package com.doudian.open.api.buyin_simplePlan.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class BuyinSimplePlanData {


	@SerializedName("result")
	@OpField(desc = "创建结果", example = "")
	private List<ResultItem> result;

	@SerializedName("total")
	@OpField(desc = "操作的商品数量", example = "10")
	private Long total;


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

	
	public void setTotal(Long total){
		this.total = total;
	}

	
	public Long getTotal(){
		return this.total;
	}

}