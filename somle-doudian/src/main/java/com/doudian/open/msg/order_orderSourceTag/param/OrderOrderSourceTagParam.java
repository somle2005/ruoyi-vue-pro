package com.doudian.open.msg.order_orderSourceTag.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class OrderOrderSourceTagParam {


	@SerializedName("p_id")
	@OpField(required = false , desc = "父订单号", example= "5039743694055923503")
	private String pId;

	@SerializedName("s_ids")
	@OpField(required = false , desc = "子订单列表", example= "[5039743693955923503]")
	private List<String> sIds;

	@SerializedName("shop_id")
	@OpField(required = false , desc = "店铺id", example= "94956")
	private Long shopId;

	@SerializedName("event_time")
	@OpField(required = false , desc = "描述来源打标时间，Unix时间戳单位：秒", example= "1677504074")
	private Long eventTime;

	@SerializedName("create_time")
	@OpField(required = false , desc = "订单创建时间，Unix时间戳单位：秒", example= "1677503094")
	private Long createTime;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPId(String pId){
		this.pId = pId;
	}

	
	public String getPId(){
		return this.pId;
	}

	
	public void setSIds(List<String> sIds){
		this.sIds = sIds;
	}

	
	public List<String> getSIds(){
		return this.sIds;
	}

	
	public void setShopId(Long shopId){
		this.shopId = shopId;
	}

	
	public Long getShopId(){
		return this.shopId;
	}

	
	public void setEventTime(Long eventTime){
		this.eventTime = eventTime;
	}

	
	public Long getEventTime(){
		return this.eventTime;
	}

	
	public void setCreateTime(Long createTime){
		this.createTime = createTime;
	}

	
	public Long getCreateTime(){
		return this.createTime;
	}

}