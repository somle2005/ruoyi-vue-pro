package com.doudian.open.api.sms_sign_apply_list.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class SmsSignApplyListData {


	@SerializedName("total")
	@OpField(desc = "总数", example = "100")
	private Long total;

	@SerializedName("apply_list")
	@OpField(desc = "短信签名申请单列表", example = "")
	private List<ApplyListItem> applyList;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTotal(Long total){
		this.total = total;
	}

	
	public Long getTotal(){
		return this.total;
	}

	
	public void setApplyList(List<ApplyListItem> applyList){
		this.applyList = applyList;
	}

	
	public List<ApplyListItem> getApplyList(){
		return this.applyList;
	}

}