package com.doudian.open.api.product_listChannelProduct.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductListChannelProductData {


	@SerializedName("data")
	@OpField(desc = "渠道品列表", example = "")
	private List<DataItem> data;

	@SerializedName("total")
	@OpField(desc = "总数", example = "12")
	private Long total;

	@SerializedName("page")
	@OpField(desc = "当前页面数", example = "1")
	private Long page;

	@SerializedName("size")
	@OpField(desc = "每页数目大小", example = "10")
	private Long size;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setData(List<DataItem> data){
		this.data = data;
	}

	
	public List<DataItem> getData(){
		return this.data;
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