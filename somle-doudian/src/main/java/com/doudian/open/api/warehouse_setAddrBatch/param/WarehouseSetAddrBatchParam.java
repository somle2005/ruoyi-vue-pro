package com.doudian.open.api.warehouse_setAddrBatch.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class WarehouseSetAddrBatchParam {


	@SerializedName("out_warehouse_id")
	@OpField(required = true , desc = "外部仓库ID", example= "abc")
	private String outWarehouseId;

	@SerializedName("addr_list")
	@OpField(required = true , desc = "仓库配送地址列表", example= "")
	private List<AddrListItem> addrList;


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

	
	public void setAddrList(List<AddrListItem> addrList){
		this.addrList = addrList;
	}

	
	public List<AddrListItem> getAddrList(){
		return this.addrList;
	}

}