package com.doudian.open.api.spu_getSpuInfoBySpuId.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class SpuPropertyInfosItem {


	@SerializedName("property_id")
	@OpField(desc = "属性id", example = "1493")
	private Long propertyId;

	@SerializedName("property_name")
	@OpField(desc = "属性名", example = "品牌")
	private String propertyName;

	@SerializedName("type")
	@OpField(desc = "属性类型，0 绑定属性 1关键属性 2售卖属性 3 商品属性", example = "0")
	private Long type;

	@SerializedName("property_alias")
	@OpField(desc = "属性别名", example = "品牌别名")
	private String propertyAlias;

	@SerializedName("spu_property_value_info")
	@OpField(desc = "属性值信息", example = "-")
	private List<SpuPropertyValueInfoItem> spuPropertyValueInfo;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPropertyId(Long propertyId){
		this.propertyId = propertyId;
	}

	
	public Long getPropertyId(){
		return this.propertyId;
	}

	
	public void setPropertyName(String propertyName){
		this.propertyName = propertyName;
	}

	
	public String getPropertyName(){
		return this.propertyName;
	}

	
	public void setType(Long type){
		this.type = type;
	}

	
	public Long getType(){
		return this.type;
	}

	
	public void setPropertyAlias(String propertyAlias){
		this.propertyAlias = propertyAlias;
	}

	
	public String getPropertyAlias(){
		return this.propertyAlias;
	}

	
	public void setSpuPropertyValueInfo(List<SpuPropertyValueInfoItem> spuPropertyValueInfo){
		this.spuPropertyValueInfo = spuPropertyValueInfo;
	}

	
	public List<SpuPropertyValueInfoItem> getSpuPropertyValueInfo(){
		return this.spuPropertyValueInfo;
	}

}