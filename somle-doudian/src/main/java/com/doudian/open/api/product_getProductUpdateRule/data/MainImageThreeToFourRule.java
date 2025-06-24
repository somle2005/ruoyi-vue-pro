package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class MainImageThreeToFourRule {


	@SerializedName("is_show")
	@OpField(desc = "是否展示主图3:4信息", example = "true")
	private Boolean isShow;

	@SerializedName("must_input")
	@OpField(desc = "主图3:4信息是否必填", example = "false")
	private Boolean mustInput;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setIsShow(Boolean isShow){
		this.isShow = isShow;
	}

	
	public Boolean getIsShow(){
		return this.isShow;
	}

	
	public void setMustInput(Boolean mustInput){
		this.mustInput = mustInput;
	}

	
	public Boolean getMustInput(){
		return this.mustInput;
	}

}