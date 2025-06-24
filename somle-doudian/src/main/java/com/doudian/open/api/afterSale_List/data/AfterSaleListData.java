package com.doudian.open.api.afterSale_List.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class AfterSaleListData {


	@SerializedName("items")
	@OpField(desc = "售后列表元素", example = "")
	private List<ItemsItem> items;

	@SerializedName("has_more")
	@OpField(desc = "是否还有更多", example = "true")
	private Boolean hasMore;

	@SerializedName("total")
	@OpField(desc = "当前搜索条件下，匹配到的总数量", example = "1025")
	private Long total;

	@SerializedName("page")
	@OpField(desc = "页码，从0开始", example = "0")
	private Long page;

	@SerializedName("size")
	@OpField(desc = "当前返回售后数量", example = "10")
	private Long size;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setItems(List<ItemsItem> items){
		this.items = items;
	}

	
	public List<ItemsItem> getItems(){
		return this.items;
	}

	
	public void setHasMore(Boolean hasMore){
		this.hasMore = hasMore;
	}

	
	public Boolean getHasMore(){
		return this.hasMore;
	}

	
	public void setTotal(Long total){
		this.total = total;
	}

	
	public Long getTotal(){
		return this.total;
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