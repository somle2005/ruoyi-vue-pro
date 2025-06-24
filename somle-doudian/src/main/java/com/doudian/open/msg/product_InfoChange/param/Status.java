package com.doudian.open.msg.product_InfoChange.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class Status {


	@SerializedName("status")
	@OpField(required = false , desc = "商品上下架状态", example= "0")
	private String status;

	@SerializedName("check_status")
	@OpField(required = false , desc = "商品审核状态", example= "3")
	private String checkStatus;

	@SerializedName("draft_status")
	@OpField(required = false , desc = "商品草稿状态", example= "3")
	private String draftStatus;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setStatus(String status){
		this.status = status;
	}

	
	public String getStatus(){
		return this.status;
	}

	
	public void setCheckStatus(String checkStatus){
		this.checkStatus = checkStatus;
	}

	
	public String getCheckStatus(){
		return this.checkStatus;
	}

	
	public void setDraftStatus(String draftStatus){
		this.draftStatus = draftStatus;
	}

	
	public String getDraftStatus(){
		return this.draftStatus;
	}

}