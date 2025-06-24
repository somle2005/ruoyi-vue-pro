package com.doudian.open.api.topup_accountTemplateList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class TopupAccountTemplateListData {


	@SerializedName("template_list")
	@OpField(desc = "模板列表", example = "")
	private List<TemplateListItem> templateList;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTemplateList(List<TemplateListItem> templateList){
		this.templateList = templateList;
	}

	
	public List<TemplateListItem> getTemplateList(){
		return this.templateList;
	}

}