package com.doudian.open.api.order_getShopAccountItemFile.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderGetShopAccountItemFileParam {


	@SerializedName("start_date")
	@OpField(required = false , desc = "开始账单日期(闭区间)", example= "2021-10-01")
	private String startDate;

	@SerializedName("end_date")
	@OpField(required = false , desc = "结束账单日期(闭区间)", example= "2021-10-01")
	private String endDate;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setStartDate(String startDate){
		this.startDate = startDate;
	}

	
	public String getStartDate(){
		return this.startDate;
	}

	
	public void setEndDate(String endDate){
		this.endDate = endDate;
	}

	
	public String getEndDate(){
		return this.endDate;
	}

}