package com.doudian.open.api.logistics_createSFOrder.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ServiceListItem {


	@SerializedName("name")
	@OpField(required = true , desc = "增值服务名，如COD等", example= "SVC-INSURE")
	private String name;

	@SerializedName("value")
	@OpField(required = false , desc = "增值服务扩展属性，参考增值", example= "1")
	private String value;

	@SerializedName("value1")
	@OpField(required = false , desc = "增值服务扩展属性", example= "1")
	private String value1;

	@SerializedName("value2")
	@OpField(required = false , desc = "增值服务扩展属性2", example= "1")
	private String value2;

	@SerializedName("value3")
	@OpField(required = false , desc = "增值服务扩展属性3", example= "1")
	private String value3;

	@SerializedName("value4")
	@OpField(required = false , desc = "增值服务扩展属性4", example= "1")
	private String value4;


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

	
	public void setValue(String value){
		this.value = value;
	}

	
	public String getValue(){
		return this.value;
	}

	
	public void setValue1(String value1){
		this.value1 = value1;
	}

	
	public String getValue1(){
		return this.value1;
	}

	
	public void setValue2(String value2){
		this.value2 = value2;
	}

	
	public String getValue2(){
		return this.value2;
	}

	
	public void setValue3(String value3){
		this.value3 = value3;
	}

	
	public String getValue3(){
		return this.value3;
	}

	
	public void setValue4(String value4){
		this.value4 = value4;
	}

	
	public String getValue4(){
		return this.value4;
	}

}