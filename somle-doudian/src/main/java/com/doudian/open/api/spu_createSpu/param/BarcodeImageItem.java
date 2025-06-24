package com.doudian.open.api.spu_createSpu.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class BarcodeImageItem {


	@SerializedName("content")
	@OpField(required = false , desc = "条码图链接", example= "https://lf3-cm.ecombdstatic.com/obj/ecom-ecop/168223854898b464cf2268f14ec6ae01ce05d0745ad3914371.jpeg")
	private String content;

	@SerializedName("name")
	@OpField(required = false , desc = "条码图名称", example= "条码图名称")
	private String name;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setContent(String content){
		this.content = content;
	}

	
	public String getContent(){
		return this.content;
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

}