package com.doudian.open.api.product_qualificationConfig.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class RuleClauseItem {


	@SerializedName("property_values")
	@OpField(desc = "属性值id数组", example = "[16391,5316,168630]")
	private List<Long> propertyValues;

	@SerializedName("operand_str")
	@OpField(desc = "等于、不等于", example = "等于")
	private String operandStr;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPropertyValues(List<Long> propertyValues){
		this.propertyValues = propertyValues;
	}

	
	public List<Long> getPropertyValues(){
		return this.propertyValues;
	}

	
	public void setOperandStr(String operandStr){
		this.operandStr = operandStr;
	}

	
	public String getOperandStr(){
		return this.operandStr;
	}

}