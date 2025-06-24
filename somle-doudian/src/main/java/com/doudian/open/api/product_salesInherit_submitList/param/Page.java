package com.doudian.open.api.product_salesInherit_submitList.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class Page {


	@SerializedName("page_no")
	@OpField(required = true , desc = "当前页，从1起", example= "1")
	private Integer pageNo;

	@SerializedName("page_size")
	@OpField(required = true , desc = "每页数量；最大50；", example= "50")
	private Integer pageSize;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPageNo(Integer pageNo){
		this.pageNo = pageNo;
	}

	
	public Integer getPageNo(){
		return this.pageNo;
	}

	
	public void setPageSize(Integer pageSize){
		this.pageSize = pageSize;
	}

	
	public Integer getPageSize(){
		return this.pageSize;
	}

}