package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class PropertyEffectItem {


	@SerializedName("label_name")
	@OpField(desc = "类目属性名称是否需要被覆写成label_name（目前只有资质证号有这个逻辑）", example = "企业生产名称")
	private String labelName;

	@SerializedName("is_required")
	@OpField(desc = "类目属性是否必填（目前只有生产企业名称和资质证号）: 0-必填, 1-非必填", example = "1")
	private Long isRequired;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setLabelName(String labelName){
		this.labelName = labelName;
	}

	
	public String getLabelName(){
		return this.labelName;
	}

	
	public void setIsRequired(Long isRequired){
		this.isRequired = isRequired;
	}

	
	public Long getIsRequired(){
		return this.isRequired;
	}

}