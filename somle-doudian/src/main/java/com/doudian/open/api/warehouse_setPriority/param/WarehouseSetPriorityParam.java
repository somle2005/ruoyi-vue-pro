package com.doudian.open.api.warehouse_setPriority.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.Map;

//auto generated, do not edit

public class WarehouseSetPriorityParam {


	@SerializedName("addr")
	@OpField(required = true , desc = "配送地址", example= "-")
	private Addr addr;

	@SerializedName("priorities")
	@OpField(required = true , desc = "前面是out_warehouse_id，后面是仓优先级 仓优先级，0-5，0优先级最高，5最低", example= "{123213:0,123214:1}")
	private Map<String,Long> priorities;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAddr(Addr addr){
		this.addr = addr;
	}

	
	public Addr getAddr(){
		return this.addr;
	}

	
	public void setPriorities(Map<String,Long> priorities){
		this.priorities = priorities;
	}

	
	public Map<String,Long> getPriorities(){
		return this.priorities;
	}

}