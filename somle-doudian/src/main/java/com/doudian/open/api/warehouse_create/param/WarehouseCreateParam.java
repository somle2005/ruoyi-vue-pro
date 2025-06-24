package com.doudian.open.api.warehouse_create.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class WarehouseCreateParam {


	@SerializedName("out_warehouse_id")
	@OpField(required = true , desc = "外部仓库ID，一个店铺下，同一个外部ID只能创建一个仓库", example= "abc")
	private String outWarehouseId;

	@SerializedName("name")
	@OpField(required = true , desc = "仓库名称", example= "test")
	private String name;

	@SerializedName("intro")
	@OpField(required = true , desc = "仓库介绍", example= "test")
	private String intro;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setOutWarehouseId(String outWarehouseId){
		this.outWarehouseId = outWarehouseId;
	}

	
	public String getOutWarehouseId(){
		return this.outWarehouseId;
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

	
	public void setIntro(String intro){
		this.intro = intro;
	}

	
	public String getIntro(){
		return this.intro;
	}

}