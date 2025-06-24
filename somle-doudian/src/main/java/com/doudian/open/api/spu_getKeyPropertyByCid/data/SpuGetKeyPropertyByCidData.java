package com.doudian.open.api.spu_getKeyPropertyByCid.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class SpuGetKeyPropertyByCidData {


	@SerializedName("property_info")
	@OpField(desc = "属性信息", example = "-")
	private List<PropertyInfoItem> propertyInfo;

	@SerializedName("brand_info")
	@OpField(desc = "品牌信息（品牌单独处理）", example = "-")
	private List<BrandInfoItem> brandInfo;

	@SerializedName("total")
	@OpField(desc = "总数", example = "30")
	private Long total;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPropertyInfo(List<PropertyInfoItem> propertyInfo){
		this.propertyInfo = propertyInfo;
	}

	
	public List<PropertyInfoItem> getPropertyInfo(){
		return this.propertyInfo;
	}

	
	public void setBrandInfo(List<BrandInfoItem> brandInfo){
		this.brandInfo = brandInfo;
	}

	
	public List<BrandInfoItem> getBrandInfo(){
		return this.brandInfo;
	}

	
	public void setTotal(Long total){
		this.total = total;
	}

	
	public Long getTotal(){
		return this.total;
	}

}