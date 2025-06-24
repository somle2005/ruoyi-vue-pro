package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class SupplyDayReturnRule {


	@SerializedName("enable")
	@OpField(desc = "true 支持七天无理由，false 不支持七天无理由", example = "true")
	private Boolean enable;

	@SerializedName("options")
	@OpField(desc = "可选的无理由退货选项列表", example = "")
	private List<OptionsItem_4_4> options;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setEnable(Boolean enable){
		this.enable = enable;
	}

	
	public Boolean getEnable(){
		return this.enable;
	}

	
	public void setOptions(List<OptionsItem_4_4> options){
		this.options = options;
	}

	
	public List<OptionsItem_4_4> getOptions(){
		return this.options;
	}

}