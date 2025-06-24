package com.doudian.open.api.product_auditList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class AuditReasonDetailsItem {


	@SerializedName("reject_reason_list")
	@OpField(desc = "详细的驳回明细原因", example = "")
	private List<RejectReasonListItem> rejectReasonList;

	@SerializedName("title")
	@OpField(desc = "驳回模块名称", example = "驳回模块名称")
	private String title;

	@SerializedName("type")
	@OpField(desc = "驳回模块类型", example = "驳回模块类型")
	private String type;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setRejectReasonList(List<RejectReasonListItem> rejectReasonList){
		this.rejectReasonList = rejectReasonList;
	}

	
	public List<RejectReasonListItem> getRejectReasonList(){
		return this.rejectReasonList;
	}

	
	public void setTitle(String title){
		this.title = title;
	}

	
	public String getTitle(){
		return this.title;
	}

	
	public void setType(String type){
		this.type = type;
	}

	
	public String getType(){
		return this.type;
	}

}