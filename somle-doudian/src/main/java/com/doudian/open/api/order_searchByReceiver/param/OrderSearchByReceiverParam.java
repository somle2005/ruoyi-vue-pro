package com.doudian.open.api.order_searchByReceiver.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderSearchByReceiverParam {


	@SerializedName("post_type")
	@OpField(required = true , desc = "查询类型：0-收货人手机号，1-收货人姓名", example= "1")
	private Long postType;

	@SerializedName("post_receiver")
	@OpField(required = true , desc = "收货人手机号或收货人姓名", example= "张三")
	private String postReceiver;

	@SerializedName("create_time_start")
	@OpField(required = false , desc = "下单时间：开始，秒级时间戳。只允许查最近90天的订单，不传默认按90天前处理", example= "1617355413")
	private Long createTimeStart;

	@SerializedName("create_time_end")
	@OpField(required = false , desc = "下单时间：截止，秒级时间戳。不传默认按现在处理", example= "1617355414")
	private Long createTimeEnd;

	@SerializedName("size")
	@OpField(required = true , desc = "单页大小，限制100以内", example= "10")
	private Long size;

	@SerializedName("page")
	@OpField(required = true , desc = "页码，0页开始", example= "0")
	private Long page;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPostType(Long postType){
		this.postType = postType;
	}

	
	public Long getPostType(){
		return this.postType;
	}

	
	public void setPostReceiver(String postReceiver){
		this.postReceiver = postReceiver;
	}

	
	public String getPostReceiver(){
		return this.postReceiver;
	}

	
	public void setCreateTimeStart(Long createTimeStart){
		this.createTimeStart = createTimeStart;
	}

	
	public Long getCreateTimeStart(){
		return this.createTimeStart;
	}

	
	public void setCreateTimeEnd(Long createTimeEnd){
		this.createTimeEnd = createTimeEnd;
	}

	
	public Long getCreateTimeEnd(){
		return this.createTimeEnd;
	}

	
	public void setSize(Long size){
		this.size = size;
	}

	
	public Long getSize(){
		return this.size;
	}

	
	public void setPage(Long page){
		this.page = page;
	}

	
	public Long getPage(){
		return this.page;
	}

}