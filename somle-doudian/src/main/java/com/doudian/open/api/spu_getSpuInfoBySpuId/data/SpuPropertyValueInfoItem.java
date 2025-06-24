package com.doudian.open.api.spu_getSpuInfoBySpuId.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SpuPropertyValueInfoItem {


	@SerializedName("value_id")
	@OpField(desc = "属性值id", example = "1001")
	private Long valueId;

	@SerializedName("value_name")
	@OpField(desc = "属性值名称", example = "苹果")
	private String valueName;

	@SerializedName("value_alias")
	@OpField(desc = "属性值别名", example = "苹果别名")
	private String valueAlias;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setValueId(Long valueId){
		this.valueId = valueId;
	}

	
	public Long getValueId(){
		return this.valueId;
	}

	
	public void setValueName(String valueName){
		this.valueName = valueName;
	}

	
	public String getValueName(){
		return this.valueName;
	}

	
	public void setValueAlias(String valueAlias){
		this.valueAlias = valueAlias;
	}

	
	public String getValueAlias(){
		return this.valueAlias;
	}

}