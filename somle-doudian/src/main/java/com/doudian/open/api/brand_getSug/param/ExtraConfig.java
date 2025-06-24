package com.doudian.open.api.brand_getSug.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ExtraConfig {


	@SerializedName("use_origin_brand_info")
	@OpField(required = false , desc = "是否忽略去重 使用原始品牌信息，默认取false", example= "false")
	private Boolean useOriginBrandInfo;

	@SerializedName("use_brand_info")
	@OpField(required = false , desc = "是否忽略新旧映射 使用老品牌信息，默认取false", example= "false")
	private Boolean useBrandInfo;

	@SerializedName("use_brand_name_deduplicate")
	@OpField(required = false , desc = "使用品牌名去重，需要和抖店一致请取true", example= "true")
	private Boolean useBrandNameDeduplicate;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setUseOriginBrandInfo(Boolean useOriginBrandInfo){
		this.useOriginBrandInfo = useOriginBrandInfo;
	}

	
	public Boolean getUseOriginBrandInfo(){
		return this.useOriginBrandInfo;
	}

	
	public void setUseBrandInfo(Boolean useBrandInfo){
		this.useBrandInfo = useBrandInfo;
	}

	
	public Boolean getUseBrandInfo(){
		return this.useBrandInfo;
	}

	
	public void setUseBrandNameDeduplicate(Boolean useBrandNameDeduplicate){
		this.useBrandNameDeduplicate = useBrandNameDeduplicate;
	}

	
	public Boolean getUseBrandNameDeduplicate(){
		return this.useBrandNameDeduplicate;
	}

}