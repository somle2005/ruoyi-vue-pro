package com.doudian.open.api.product_detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SellPropertiesItem {


	@SerializedName("value_spec_detail_id")
	@OpField(desc = "规格值id", example = "123123123123")
	private Long valueSpecDetailId;

	@SerializedName("remark")
	@OpField(desc = "备注", example = "非常黄")
	private String remark;

	@SerializedName("value_name")
	@OpField(desc = "规格值名称", example = "黄色")
	private String valueName;

	@SerializedName("value_id")
	@OpField(desc = "销售属性值id，只有在规格由属性库下发时，这个才有值。 默认为0", example = "12345678910")
	private Long valueId;

	@SerializedName("property_name")
	@OpField(desc = "规格项名称", example = "颜色")
	private String propertyName;

	@SerializedName("perperty_id")
	@OpField(desc = "销售属性id，只有在规格由属性库下发时，这个字段才有值。 默认为0", example = "0")
	private Long perpertyId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setValueSpecDetailId(Long valueSpecDetailId){
		this.valueSpecDetailId = valueSpecDetailId;
	}

	
	public Long getValueSpecDetailId(){
		return this.valueSpecDetailId;
	}

	
	public void setRemark(String remark){
		this.remark = remark;
	}

	
	public String getRemark(){
		return this.remark;
	}

	
	public void setValueName(String valueName){
		this.valueName = valueName;
	}

	
	public String getValueName(){
		return this.valueName;
	}

	
	public void setValueId(Long valueId){
		this.valueId = valueId;
	}

	
	public Long getValueId(){
		return this.valueId;
	}

	
	public void setPropertyName(String propertyName){
		this.propertyName = propertyName;
	}

	
	public String getPropertyName(){
		return this.propertyName;
	}

	
	public void setPerpertyId(Long perpertyId){
		this.perpertyId = perpertyId;
	}

	
	public Long getPerpertyId(){
		return this.perpertyId;
	}

}