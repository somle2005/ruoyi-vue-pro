package com.doudian.open.msg.trade_TradeMemoModify.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class TradeTradeMemoModifyParam {


	@SerializedName("p_id")
	@OpField(required = false , desc = "父订单ID", example= "4836807416444607671")
	private Long pId;

	@SerializedName("remark")
	@OpField(required = false , desc = "备注内容，最大不得超过60个字符", example= "备注")
	private String remark;

	@SerializedName("star")
	@OpField(required = false , desc = "标星等级，范围0～5，0为灰色旗标，5为红色旗标，数字越大颜色越深 0灰 1紫 2青 3绿 4橙 5红", example= "3")
	private Long star;

	@SerializedName("update_time")
	@OpField(required = false , desc = "时间戳，秒", example= "1630269363")
	private Long updateTime;

	@SerializedName("shop_id")
	@OpField(required = false , desc = "店铺ID，即时零售店铺该字段为即时零售总部id", example= "11808642")
	private Long shopId;

	@SerializedName("store_id")
	@OpField(required = false , desc = "门店ID", example= "8794053")
	private Long storeId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPId(Long pId){
		this.pId = pId;
	}

	
	public Long getPId(){
		return this.pId;
	}

	
	public void setRemark(String remark){
		this.remark = remark;
	}

	
	public String getRemark(){
		return this.remark;
	}

	
	public void setStar(Long star){
		this.star = star;
	}

	
	public Long getStar(){
		return this.star;
	}

	
	public void setUpdateTime(Long updateTime){
		this.updateTime = updateTime;
	}

	
	public Long getUpdateTime(){
		return this.updateTime;
	}

	
	public void setShopId(Long shopId){
		this.shopId = shopId;
	}

	
	public Long getShopId(){
		return this.shopId;
	}

	
	public void setStoreId(Long storeId){
		this.storeId = storeId;
	}

	
	public Long getStoreId(){
		return this.storeId;
	}

}