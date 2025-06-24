package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class OptionsItem_4 {


	@SerializedName("options")
	@OpField(desc = "售后天数选项列表", example = "")
	private List<OptionsItem> options;

	@SerializedName("name")
	@OpField(desc = "三包服务类型名称", example = "寄修")
	private String name;

	@SerializedName("value")
	@OpField(desc = "三包服务类型值", example = "1")
	private String value;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setOptions(List<OptionsItem> options){
		this.options = options;
	}

	
	public List<OptionsItem> getOptions(){
		return this.options;
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

	
	public void setValue(String value){
		this.value = value;
	}

	
	public String getValue(){
		return this.value;
	}

}