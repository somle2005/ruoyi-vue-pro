package com.doudian.open.api.spu_getSpuRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SpuMaterialRulesItem {


	@SerializedName("material_rule")
	@OpField(desc = "SPU素材的具体规则", example = "")
	private MaterialRule materialRule;

	@SerializedName("material_type")
	@OpField(desc = "素材类型枚举值：1-主图", example = "1")
	private Integer materialType;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setMaterialRule(MaterialRule materialRule){
		this.materialRule = materialRule;
	}

	
	public MaterialRule getMaterialRule(){
		return this.materialRule;
	}

	
	public void setMaterialType(Integer materialType){
		this.materialType = materialType;
	}

	
	public Integer getMaterialType(){
		return this.materialType;
	}

}