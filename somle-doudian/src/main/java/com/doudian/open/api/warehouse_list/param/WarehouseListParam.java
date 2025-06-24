package com.doudian.open.api.warehouse_list.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class WarehouseListParam {


	@SerializedName("out_warehouse_id")
	@OpField(required = false , desc = "外部仓库ID", example= "abc")
	private String outWarehouseId;

	@SerializedName("warehouse_name")
	@OpField(required = false , desc = "仓库名称", example= "仓名称示例")
	private String warehouseName;

	@SerializedName("addr")
	@OpField(required = false , desc = "仓库覆盖地址", example= "-")
	private Addr addr;

	@SerializedName("out_warehouse_ids")
	@OpField(required = false , desc = "外部仓库ID列表", example= "[1596011622, 1596011760]")
	private List<String> outWarehouseIds;

	@SerializedName("order_by")
	@OpField(required = false , desc = "排序方式，可选create_time、update_time", example= "-")
	private String orderBy;

	@SerializedName("rank")
	@OpField(required = false , desc = "顺序，可选desc、asc，与order_by同时生效", example= "desc")
	private String rank;

	@SerializedName("page")
	@OpField(required = true , desc = "页码，从0开始，最大到100", example= "0")
	private Long page;

	@SerializedName("size")
	@OpField(required = true , desc = "每页数量，最大100，超过100会限制到100", example= "10")
	private Long size;


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

	
	public void setWarehouseName(String warehouseName){
		this.warehouseName = warehouseName;
	}

	
	public String getWarehouseName(){
		return this.warehouseName;
	}

	
	public void setAddr(Addr addr){
		this.addr = addr;
	}

	
	public Addr getAddr(){
		return this.addr;
	}

	
	public void setOutWarehouseIds(List<String> outWarehouseIds){
		this.outWarehouseIds = outWarehouseIds;
	}

	
	public List<String> getOutWarehouseIds(){
		return this.outWarehouseIds;
	}

	
	public void setOrderBy(String orderBy){
		this.orderBy = orderBy;
	}

	
	public String getOrderBy(){
		return this.orderBy;
	}

	
	public void setRank(String rank){
		this.rank = rank;
	}

	
	public String getRank(){
		return this.rank;
	}

	
	public void setPage(Long page){
		this.page = page;
	}

	
	public Long getPage(){
		return this.page;
	}

	
	public void setSize(Long size){
		this.size = size;
	}

	
	public Long getSize(){
		return this.size;
	}

}