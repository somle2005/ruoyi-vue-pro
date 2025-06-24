package com.doudian.open.api.afterSale_List.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SellerLogsItem {


	@SerializedName("content")
	@OpField(desc = "插旗日志内容", example = "买家觉得小兔子太可爱了，不想要了")
	private String content;

	@SerializedName("op_name")
	@OpField(desc = "插旗操作人", example = "兔子店铺CEO")
	private String opName;

	@SerializedName("create_time")
	@OpField(desc = "插旗时间（字符串格式）", example = "2001-01-01 03:04:05")
	private String createTime;

	@SerializedName("star")
	@OpField(desc = "插旗信息；0：灰 1：紫 2: 青 3：绿 4： 橙 5： 红", example = "0")
	private Long star;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setContent(String content){
		this.content = content;
	}

	
	public String getContent(){
		return this.content;
	}

	
	public void setOpName(String opName){
		this.opName = opName;
	}

	
	public String getOpName(){
		return this.opName;
	}

	
	public void setCreateTime(String createTime){
		this.createTime = createTime;
	}

	
	public String getCreateTime(){
		return this.createTime;
	}

	
	public void setStar(Long star){
		this.star = star;
	}

	
	public Long getStar(){
		return this.star;
	}

}