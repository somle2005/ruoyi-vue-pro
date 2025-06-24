package com.doudian.open.api.order_searchList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class CardVoucher {


	@SerializedName("valid_days")
	@OpField(desc = "自领取之日起有效天数(如果有值优先使用该字段)", example = "15")
	private Long validDays;

	@SerializedName("valid_start")
	@OpField(desc = "卡券开始时间", example = "1646063000")
	private Long validStart;

	@SerializedName("valid_end")
	@OpField(desc = "卡券截止日期", example = "1646063999")
	private Long validEnd;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setValidDays(Long validDays){
		this.validDays = validDays;
	}

	
	public Long getValidDays(){
		return this.validDays;
	}

	
	public void setValidStart(Long validStart){
		this.validStart = validStart;
	}

	
	public Long getValidStart(){
		return this.validStart;
	}

	
	public void setValidEnd(Long validEnd){
		this.validEnd = validEnd;
	}

	
	public Long getValidEnd(){
		return this.validEnd;
	}

}