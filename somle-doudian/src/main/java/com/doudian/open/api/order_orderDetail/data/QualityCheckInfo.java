package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class QualityCheckInfo {


	@SerializedName("check_result_code")
	@OpField(desc = "质检结果  WATI_CHECT:待质检, CHECK_PASS:质检通过, CHECK_FAIL:质检不通过", example = "CHECK_FAIL")
	private String checkResultCode;

	@SerializedName("check_fail_msg")
	@OpField(desc = "质检异常信息描述文案", example = "贵金属不符")
	private String checkFailMsg;

	@SerializedName("resend_check_time")
	@OpField(desc = "重新送检截止时间", example = "1664350911")
	private Long resendCheckTime;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCheckResultCode(String checkResultCode){
		this.checkResultCode = checkResultCode;
	}

	
	public String getCheckResultCode(){
		return this.checkResultCode;
	}

	
	public void setCheckFailMsg(String checkFailMsg){
		this.checkFailMsg = checkFailMsg;
	}

	
	public String getCheckFailMsg(){
		return this.checkFailMsg;
	}

	
	public void setResendCheckTime(Long resendCheckTime){
		this.resendCheckTime = resendCheckTime;
	}

	
	public Long getResendCheckTime(){
		return this.resendCheckTime;
	}

}