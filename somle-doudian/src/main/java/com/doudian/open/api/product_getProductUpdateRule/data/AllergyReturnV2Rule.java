package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class AllergyReturnV2Rule {


	@SerializedName("enable")
	@OpField(desc = "是否可选过敏包退", example = "true")
	private String enable;

	@SerializedName("must_select")
	@OpField(desc = "是否必选过敏包退", example = "true")
	private String mustSelect;

	@SerializedName("options")
	@OpField(desc = "可选项", example = "")
	private List<OptionsItem_4_4> options;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setEnable(String enable){
		this.enable = enable;
	}

	
	public String getEnable(){
		return this.enable;
	}

	
	public void setMustSelect(String mustSelect){
		this.mustSelect = mustSelect;
	}

	
	public String getMustSelect(){
		return this.mustSelect;
	}

	
	public void setOptions(List<OptionsItem_4_4> options){
		this.options = options;
	}

	
	public List<OptionsItem_4_4> getOptions(){
		return this.options;
	}

}