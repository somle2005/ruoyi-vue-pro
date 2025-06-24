package com.doudian.open.api.product_listChannelProduct.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductListChannelProductParam {


	@SerializedName("main_product_id")
	@OpField(required = true , desc = "主商品ID。不需要此查询条件可传0", example= "3232323232323232")
	private Long mainProductId;

	@SerializedName("channel_id")
	@OpField(required = false , desc = "渠道ID", example= "1771739938745351")
	private List<Long> channelId;

	@SerializedName("channel_type")
	@OpField(required = false , desc = "渠道类型：3商家自卖，4达人带货", example= "3")
	private List<Long> channelType;

	@SerializedName("kol_id")
	@OpField(required = false , desc = "绑定的达人ID", example= "1111")
	private List<Long> kolId;

	@SerializedName("status")
	@OpField(required = false , desc = "渠道品状态：0下架，2上架，3封禁", example= "2")
	private Long status;

	@SerializedName("start_time")
	@OpField(required = false , desc = "有效期开始时间", example= "2023-07-01 00:00:00")
	private String startTime;

	@SerializedName("end_time")
	@OpField(required = false , desc = "有效期结束时间", example= "2023-07-21 00:00:00")
	private String endTime;

	@SerializedName("page")
	@OpField(required = true , desc = "第几页，从1开始", example= "1")
	private Long page;

	@SerializedName("size")
	@OpField(required = true , desc = "每页数量，默认20，最多50", example= "10")
	private Long size;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setMainProductId(Long mainProductId){
		this.mainProductId = mainProductId;
	}

	
	public Long getMainProductId(){
		return this.mainProductId;
	}

	
	public void setChannelId(List<Long> channelId){
		this.channelId = channelId;
	}

	
	public List<Long> getChannelId(){
		return this.channelId;
	}

	
	public void setChannelType(List<Long> channelType){
		this.channelType = channelType;
	}

	
	public List<Long> getChannelType(){
		return this.channelType;
	}

	
	public void setKolId(List<Long> kolId){
		this.kolId = kolId;
	}

	
	public List<Long> getKolId(){
		return this.kolId;
	}

	
	public void setStatus(Long status){
		this.status = status;
	}

	
	public Long getStatus(){
		return this.status;
	}

	
	public void setStartTime(String startTime){
		this.startTime = startTime;
	}

	
	public String getStartTime(){
		return this.startTime;
	}

	
	public void setEndTime(String endTime){
		this.endTime = endTime;
	}

	
	public String getEndTime(){
		return this.endTime;
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