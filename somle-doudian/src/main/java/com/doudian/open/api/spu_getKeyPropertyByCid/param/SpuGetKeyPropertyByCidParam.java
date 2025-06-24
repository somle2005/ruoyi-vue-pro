package com.doudian.open.api.spu_getKeyPropertyByCid.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SpuGetKeyPropertyByCidParam {


	@SerializedName("category_id")
	@OpField(required = true , desc = "类目id", example= "31860")
	private Long categoryId;

	@SerializedName("page")
	@OpField(required = true , desc = "页码", example= "0")
	private Long page;

	@SerializedName("size")
	@OpField(required = true , desc = "每页大小", example= "20")
	private Long size;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCategoryId(Long categoryId){
		this.categoryId = categoryId;
	}

	
	public Long getCategoryId(){
		return this.categoryId;
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