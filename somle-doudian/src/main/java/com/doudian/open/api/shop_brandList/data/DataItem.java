package com.doudian.open.api.shop_brandList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class DataItem {


	@SerializedName("id")
	@OpField(desc = "品牌ID", example = "14133")
	private Long id;

	@SerializedName("brand_chinese_name")
	@OpField(desc = "品牌中文名", example = "品牌名")
	private String brandChineseName;

	@SerializedName("brand_english_name")
	@OpField(desc = "品牌英文名", example = "brand_name")
	private String brandEnglishName;

	@SerializedName("brand_reg_num")
	@OpField(desc = "商标注册号", example = "12363569")
	private String brandRegNum;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setId(Long id){
		this.id = id;
	}

	
	public Long getId(){
		return this.id;
	}

	
	public void setBrandChineseName(String brandChineseName){
		this.brandChineseName = brandChineseName;
	}

	
	public String getBrandChineseName(){
		return this.brandChineseName;
	}

	
	public void setBrandEnglishName(String brandEnglishName){
		this.brandEnglishName = brandEnglishName;
	}

	
	public String getBrandEnglishName(){
		return this.brandEnglishName;
	}

	
	public void setBrandRegNum(String brandRegNum){
		this.brandRegNum = brandRegNum;
	}

	
	public String getBrandRegNum(){
		return this.brandRegNum;
	}

}