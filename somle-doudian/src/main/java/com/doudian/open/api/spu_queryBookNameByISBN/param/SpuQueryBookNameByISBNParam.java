package com.doudian.open.api.spu_queryBookNameByISBN.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SpuQueryBookNameByISBNParam {


	@SerializedName("category_leaf_id")
	@OpField(required = false , desc = "类目ID", example= "23362")
	private Long categoryLeafId;

	@SerializedName("isbn")
	@OpField(required = true , desc = "ISBN编号", example= "9787555289227")
	private String isbn;

	@SerializedName("page_no")
	@OpField(required = true , desc = "当前页数。默认从0开始", example= "0")
	private Long pageNo;

	@SerializedName("page_size")
	@OpField(required = true , desc = "页大小。范围1-100", example= "10")
	private Long pageSize;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCategoryLeafId(Long categoryLeafId){
		this.categoryLeafId = categoryLeafId;
	}

	
	public Long getCategoryLeafId(){
		return this.categoryLeafId;
	}

	
	public void setIsbn(String isbn){
		this.isbn = isbn;
	}

	
	public String getIsbn(){
		return this.isbn;
	}

	
	public void setPageNo(Long pageNo){
		this.pageNo = pageNo;
	}

	
	public Long getPageNo(){
		return this.pageNo;
	}

	
	public void setPageSize(Long pageSize){
		this.pageSize = pageSize;
	}

	
	public Long getPageSize(){
		return this.pageSize;
	}

}