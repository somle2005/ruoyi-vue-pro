package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class RuleClauseItem {


	@SerializedName("operand")
	@OpField(desc = "1 - 相等，2 - 不相等， 3 - 包含， 4 - 不包含", example = "1")
	private Long operand;

	@SerializedName("operand_str")
	@OpField(desc = "操作（值枚举：等于、不等于）", example = "等于")
	private String operandStr;

	@SerializedName("property_values")
	@OpField(desc = "属性值ID列表", example = "[123,456]")
	private List<Long> propertyValues;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setOperand(Long operand){
		this.operand = operand;
	}

	
	public Long getOperand(){
		return this.operand;
	}

	
	public void setOperandStr(String operandStr){
		this.operandStr = operandStr;
	}

	
	public String getOperandStr(){
		return this.operandStr;
	}

	
	public void setPropertyValues(List<Long> propertyValues){
		this.propertyValues = propertyValues;
	}

	
	public List<Long> getPropertyValues(){
		return this.propertyValues;
	}

}