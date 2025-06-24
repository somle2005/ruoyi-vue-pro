package com.doudian.open.api.sms_template_apply_list.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class SmsTemplateApplyListData {


	@SerializedName("template_apply_list")
	@OpField(desc = "短信模板申请单列表", example = "")
	private List<TemplateApplyListItem> templateApplyList;

	@SerializedName("total")
	@OpField(desc = "总数", example = "100")
	private Long total;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTemplateApplyList(List<TemplateApplyListItem> templateApplyList){
		this.templateApplyList = templateApplyList;
	}

	
	public List<TemplateApplyListItem> getTemplateApplyList(){
		return this.templateApplyList;
	}

	
	public void setTotal(Long total){
		this.total = total;
	}

	
	public Long getTotal(){
		return this.total;
	}

}