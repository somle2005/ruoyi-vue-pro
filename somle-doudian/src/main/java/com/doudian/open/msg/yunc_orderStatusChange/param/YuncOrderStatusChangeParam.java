package com.doudian.open.msg.yunc_orderStatusChange.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class YuncOrderStatusChangeParam {


	@SerializedName("update_time")
	@OpField(required = false , desc = "更新时间（秒级时间戳）", example= "1667463019")
	private Long updateTime;

	@SerializedName("sub_order_list")
	@OpField(required = false , desc = "子订单列表", example= "")
	private List<SubOrderListItem> subOrderList;

	@SerializedName("owner_code")
	@OpField(required = false , desc = "货主编码", example= "BD1000029")
	private String ownerCode;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setUpdateTime(Long updateTime){
		this.updateTime = updateTime;
	}

	
	public Long getUpdateTime(){
		return this.updateTime;
	}

	
	public void setSubOrderList(List<SubOrderListItem> subOrderList){
		this.subOrderList = subOrderList;
	}

	
	public List<SubOrderListItem> getSubOrderList(){
		return this.subOrderList;
	}

	
	public void setOwnerCode(String ownerCode){
		this.ownerCode = ownerCode;
	}

	
	public String getOwnerCode(){
		return this.ownerCode;
	}

}