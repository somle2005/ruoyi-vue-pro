package com.doudian.open.api.product_batchCreatePrettifyPic.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class PrettifyPicDataListItem {


	@SerializedName("name")
	@OpField(required = true , desc = "要转换的组件类型 目前可选:text  后续会推出其他类型的支持组件", example= "text")
	private String name;

	@SerializedName("prettify_pic_data_text")
	@OpField(required = true , desc = "当name=text时有效", example= "")
	private PrettifyPicDataText prettifyPicDataText;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

	
	public void setPrettifyPicDataText(PrettifyPicDataText prettifyPicDataText){
		this.prettifyPicDataText = prettifyPicDataText;
	}

	
	public PrettifyPicDataText getPrettifyPicDataText(){
		return this.prettifyPicDataText;
	}

}