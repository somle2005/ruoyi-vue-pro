package com.doudian.open.api.order_addOrderRemark.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderAddOrderRemarkParam {


	@SerializedName("order_id")
	@OpField(required = true , desc = "店铺订单ID。", example= "6496679971677798670")
	private String orderId;

	@SerializedName("remark")
	@OpField(required = true , desc = "备注内容，必填选项。如果不填会导致订单的备注被空值覆盖，最大不得超过500个字符。", example= "这是具体的备注内容")
	private String remark;

	@SerializedName("is_add_star")
	@OpField(required = false , desc = "是否加旗标，不填则默认为false，不会修改旗帜颜色。 is_add_star=true，需要加旗帜或者覆盖原来的旗帜颜色；is_add_star=false，不添加旗帜，不会覆盖原来的旗帜颜色。", example= "true")
	private String isAddStar;

	@SerializedName("star")
	@OpField(required = false , desc = "标星等级，范围0～5 0为灰色旗标，5为红色旗标，数字越大颜色越深 0灰 1紫 2青 3绿 4橙 5红", example= "2")
	private String star;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setOrderId(String orderId){
		this.orderId = orderId;
	}

	
	public String getOrderId(){
		return this.orderId;
	}

	
	public void setRemark(String remark){
		this.remark = remark;
	}

	
	public String getRemark(){
		return this.remark;
	}

	
	public void setIsAddStar(String isAddStar){
		this.isAddStar = isAddStar;
	}

	
	public String getIsAddStar(){
		return this.isAddStar;
	}

	
	public void setStar(String star){
		this.star = star;
	}

	
	public String getStar(){
		return this.star;
	}

}