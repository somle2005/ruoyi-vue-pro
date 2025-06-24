package com.doudian.open.api.spu_QuerySpu.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class SpuQuerySpuParam {


	@SerializedName("page")
	@OpField(required = true , desc = "【必填】从第0页开始", example= "0")
	private Long page;

	@SerializedName("size")
	@OpField(required = true , desc = "【必填】最大值为20", example= "20")
	private Long size;

	@SerializedName("category_id")
	@OpField(required = false , desc = "【选填】叶子类目ID", example= "31860")
	private Long categoryId;

	@SerializedName("properties")
	@OpField(required = false , desc = "【选填】属性", example= "")
	private Properties properties;

	@SerializedName("status")
	@OpField(required = false , desc = "【选填】SPU状态：1-上线，2-下线，3-审核中，4-审核不通过", example= "[1,2]")
	private List<Integer> status;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
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

	
	public void setCategoryId(Long categoryId){
		this.categoryId = categoryId;
	}

	
	public Long getCategoryId(){
		return this.categoryId;
	}

	
	public void setProperties(Properties properties){
		this.properties = properties;
	}

	
	public Properties getProperties(){
		return this.properties;
	}

	
	public void setStatus(List<Integer> status){
		this.status = status;
	}

	
	public List<Integer> getStatus(){
		return this.status;
	}

}