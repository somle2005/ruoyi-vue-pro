package com.doudian.open.api.spu_queryBookNameByISBN.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class DataItem {


	@SerializedName("spu_id")
	@OpField(desc = "spu id", example = "7130665982338597159")
	private String spuId;

	@SerializedName("book_name")
	@OpField(desc = "图书的书名", example = "小王子")
	private String bookName;

	@SerializedName("category_leaf_id")
	@OpField(desc = "类目ID", example = "23362")
	private Long categoryLeafId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSpuId(String spuId){
		this.spuId = spuId;
	}

	
	public String getSpuId(){
		return this.spuId;
	}

	
	public void setBookName(String bookName){
		this.bookName = bookName;
	}

	
	public String getBookName(){
		return this.bookName;
	}

	
	public void setCategoryLeafId(Long categoryLeafId){
		this.categoryLeafId = categoryLeafId;
	}

	
	public Long getCategoryLeafId(){
		return this.categoryLeafId;
	}

}