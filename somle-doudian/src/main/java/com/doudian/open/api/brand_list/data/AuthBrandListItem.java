package com.doudian.open.api.brand_list.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AuthBrandListItem {


	@SerializedName("brand_id")
	@OpField(desc = "品牌id", example = "123")
	private Long brandId;

	@SerializedName("name_cn")
	@OpField(desc = "中文名", example = "中文名")
	private String nameCn;

	@SerializedName("name_en")
	@OpField(desc = "英文名", example = "xxx")
	private String nameEn;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setBrandId(Long brandId){
		this.brandId = brandId;
	}

	
	public Long getBrandId(){
		return this.brandId;
	}

	
	public void setNameCn(String nameCn){
		this.nameCn = nameCn;
	}

	
	public String getNameCn(){
		return this.nameCn;
	}

	
	public void setNameEn(String nameEn){
		this.nameEn = nameEn;
	}

	
	public String getNameEn(){
		return this.nameEn;
	}

}