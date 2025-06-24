package com.doudian.open.api.warehouse_createV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class WarehouseCreateV2Param {


	@SerializedName("warehouse")
	@OpField(required = true , desc = "仓相关信息", example= "")
	private Warehouse warehouse;

	@SerializedName("out_warehouse_id")
	@OpField(required = true , desc = "外部仓ID", example= "123")
	private String outWarehouseId;

	@SerializedName("name")
	@OpField(required = true , desc = "仓名称", example= "测试仓")
	private String name;

	@SerializedName("intro")
	@OpField(required = true , desc = "仓介绍", example= "介绍一下仓")
	private String intro;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setWarehouse(Warehouse warehouse){
		this.warehouse = warehouse;
	}

	
	public Warehouse getWarehouse(){
		return this.warehouse;
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