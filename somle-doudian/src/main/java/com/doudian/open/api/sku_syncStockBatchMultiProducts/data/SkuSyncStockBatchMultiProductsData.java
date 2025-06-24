package com.doudian.open.api.sku_syncStockBatchMultiProducts.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class SkuSyncStockBatchMultiProductsData {


	@SerializedName("results")
	@OpField(desc = "结果列表", example = "")
	private List<ResultsItem> results;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setResults(List<ResultsItem> results){
		this.results = results;
	}

	
	public List<ResultsItem> getResults(){
		return this.results;
	}

}