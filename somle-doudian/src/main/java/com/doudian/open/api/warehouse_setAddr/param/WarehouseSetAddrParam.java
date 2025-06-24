package com.doudian.open.api.warehouse_setAddr.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class WarehouseSetAddrParam {


	@SerializedName("out_warehouse_id")
	@OpField(required = true , desc = "外部仓库ID", example= "abc")
	private String outWarehouseId;

	@SerializedName("addr")
	@OpField(required = true , desc = "仓库地址", example= "-")
	private Addr addr;


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

	
	public void setAddr(Addr addr){
		this.addr = addr;
	}

	
	public Addr getAddr(){
		return this.addr;
	}

}