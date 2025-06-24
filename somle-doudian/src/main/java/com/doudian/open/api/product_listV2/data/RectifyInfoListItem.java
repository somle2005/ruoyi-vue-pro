package com.doudian.open.api.product_listV2.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class RectifyInfoListItem {


	@SerializedName("rectification_info")
	@OpField(desc = "自动整改信息", example = "")
	private RectificationInfo rectificationInfo;

	@SerializedName("rectify_action")
	@OpField(desc = "整改动作", example = "略")
	private String rectifyAction;

	@SerializedName("reject_reason")
	@OpField(desc = "驳回原因", example = "略")
	private String rejectReason;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setRectificationInfo(RectificationInfo rectificationInfo){
		this.rectificationInfo = rectificationInfo;
	}

	
	public RectificationInfo getRectificationInfo(){
		return this.rectificationInfo;
	}

	
	public void setRectifyAction(String rectifyAction){
		this.rectifyAction = rectifyAction;
	}

	
	public String getRectifyAction(){
		return this.rectifyAction;
	}

	
	public void setRejectReason(String rejectReason){
		this.rejectReason = rejectReason;
	}

	
	public String getRejectReason(){
		return this.rejectReason;
	}

}