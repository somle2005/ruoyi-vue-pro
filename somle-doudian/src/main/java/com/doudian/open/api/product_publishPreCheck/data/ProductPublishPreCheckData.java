package com.doudian.open.api.product_publishPreCheck.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductPublishPreCheckData {


	@SerializedName("common_check_results")
	@OpField(desc = "校验", example = "")
	private List<CommonCheckResultsItem> commonCheckResults;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCommonCheckResults(List<CommonCheckResultsItem> commonCheckResults){
		this.commonCheckResults = commonCheckResults;
	}

	
	public List<CommonCheckResultsItem> getCommonCheckResults(){
		return this.commonCheckResults;
	}

}