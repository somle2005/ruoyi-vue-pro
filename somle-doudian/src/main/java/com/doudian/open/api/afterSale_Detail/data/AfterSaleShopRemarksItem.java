package com.doudian.open.api.afterSale_Detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AfterSaleShopRemarksItem {


	@SerializedName("order_id")
	@OpField(desc = "备注关联的订单ID", example = "12345")
	private Long orderId;

	@SerializedName("after_sale_id")
	@OpField(desc = "备注关联的售后ID", example = "54321")
	private Long afterSaleId;

	@SerializedName("remark")
	@OpField(desc = "备注内容", example = "你好")
	private String remark;

	@SerializedName("create_time")
	@OpField(desc = "创建时间", example = "173566080")
	private Long createTime;

	@SerializedName("operator")
	@OpField(desc = "操作人", example = "小亮")
	private String operator;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setOrderId(Long orderId){
		this.orderId = orderId;
	}

	
	public Long getOrderId(){
		return this.orderId;
	}

	
	public void setAfterSaleId(Long afterSaleId){
		this.afterSaleId = afterSaleId;
	}

	
	public Long getAfterSaleId(){
		return this.afterSaleId;
	}

	
	public void setRemark(String remark){
		this.remark = remark;
	}

	
	public String getRemark(){
		return this.remark;
	}

	
	public void setCreateTime(Long createTime){
		this.createTime = createTime;
	}

	
	public Long getCreateTime(){
		return this.createTime;
	}

	
	public void setOperator(String operator){
		this.operator = operator;
	}

	
	public String getOperator(){
		return this.operator;
	}

}