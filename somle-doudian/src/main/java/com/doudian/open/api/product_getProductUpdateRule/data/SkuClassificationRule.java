package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class SkuClassificationRule {


	@SerializedName("options")
	@OpField(desc = "sku分类信息扩展项", example = "")
	private List<OptionsItem_4_4> options;

	@SerializedName("must_select")
	@OpField(desc = "sku分类信息是否必填", example = "false")
	private Boolean mustSelect;

	@SerializedName("enable")
	@OpField(desc = "是否允许填写sku分类信息", example = "true")
	private Boolean enable;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setOptions(List<OptionsItem_4_4> options){
		this.options = options;
	}

	
	public List<OptionsItem_4_4> getOptions(){
		return this.options;
	}

	
	public void setMustSelect(Boolean mustSelect){
		this.mustSelect = mustSelect;
	}

	
	public Boolean getMustSelect(){
		return this.mustSelect;
	}

	
	public void setEnable(Boolean enable){
		this.enable = enable;
	}

	
	public Boolean getEnable(){
		return this.enable;
	}

}