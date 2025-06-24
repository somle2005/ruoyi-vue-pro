package com.doudian.open.api.afterSale_applyLogisticsIntercept.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class AfterSaleApplyLogisticsInterceptParam {


	@SerializedName("after_sale_id")
	@OpField(required = true , desc = "售后单ID", example= "12345")
	private Long afterSaleId;

	@SerializedName("op_from")
	@OpField(required = true , desc = "操作来源（1:商家  3:客服）", example= "1")
	private Integer opFrom;

	@SerializedName("intercept_targets")
	@OpField(required = true , desc = "要拦截的包裹", example= "")
	private List<InterceptTargetsItem> interceptTargets;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAfterSaleId(Long afterSaleId){
		this.afterSaleId = afterSaleId;
	}

	
	public Long getAfterSaleId(){
		return this.afterSaleId;
	}

	
	public void setOpFrom(Integer opFrom){
		this.opFrom = opFrom;
	}

	
	public Integer getOpFrom(){
		return this.opFrom;
	}

	
	public void setInterceptTargets(List<InterceptTargetsItem> interceptTargets){
		this.interceptTargets = interceptTargets;
	}

	
	public List<InterceptTargetsItem> getInterceptTargets(){
		return this.interceptTargets;
	}

}