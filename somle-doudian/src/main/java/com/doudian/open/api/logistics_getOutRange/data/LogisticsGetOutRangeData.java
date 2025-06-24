package com.doudian.open.api.logistics_getOutRange.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class LogisticsGetOutRangeData {


	@SerializedName("is_out_range")
	@OpField(desc = "是否超区响应结果（超区-true；未超区-fasle）", example = "false")
	private Boolean isOutRange;

	@SerializedName("out_range_reason")
	@OpField(desc = "超区原因，1、疫情管控 2、洪涝台风等自然灾害 3、特殊会议管控 4、网点经营问题 5、其他原因", example = "地址未覆盖")
	private String outRangeReason;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setIsOutRange(Boolean isOutRange){
		this.isOutRange = isOutRange;
	}

	
	public Boolean getIsOutRange(){
		return this.isOutRange;
	}

	
	public void setOutRangeReason(String outRangeReason){
		this.outRangeReason = outRangeReason;
	}

	
	public String getOutRangeReason(){
		return this.outRangeReason;
	}

}