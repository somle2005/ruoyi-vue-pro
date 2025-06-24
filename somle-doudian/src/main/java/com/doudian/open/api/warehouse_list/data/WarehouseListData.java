package com.doudian.open.api.warehouse_list.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class WarehouseListData {


	@SerializedName("warehouses")
	@OpField(desc = "仓库信息", example = "-")
	private List<WarehousesItem> warehouses;

	@SerializedName("total")
	@OpField(desc = "总数", example = "3")
	private Long total;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setWarehouses(List<WarehousesItem> warehouses){
		this.warehouses = warehouses;
	}

	
	public List<WarehousesItem> getWarehouses(){
		return this.warehouses;
	}

	
	public void setTotal(Long total){
		this.total = total;
	}

	
	public Long getTotal(){
		return this.total;
	}

}