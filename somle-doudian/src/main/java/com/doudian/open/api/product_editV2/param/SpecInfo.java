package com.doudian.open.api.product_editV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class SpecInfo {


	@SerializedName("spec_values")
	@OpField(required = false , desc = "规格项，如颜色、尺码", example= "")
	private List<SpecValuesItem> specValues;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSpecValues(List<SpecValuesItem> specValues){
		this.specValues = specValues;
	}

	
	public List<SpecValuesItem> getSpecValues(){
		return this.specValues;
	}

}